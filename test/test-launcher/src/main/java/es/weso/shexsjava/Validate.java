package es.weso.shexsjava;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Logger;

import cats.effect.IO;
import es.weso.asio.ontology.validate.ResultValidation;
import es.weso.rdf.RDFReader;
import es.weso.rdf.jena.RDFAsJenaModel;
import es.weso.rdf.nodes.IRI;
import es.weso.shapeMaps.ShapeMap;
import es.weso.shex.ResolvedSchema;
import es.weso.shex.Schema;
import es.weso.shex.validator.Validator;
import es.weso.utils.eitherios.EitherIOUtils;
import scala.Option;

/**
 *
 * @author Jose Emilio Labra Gayo
 *
 */
public class Validate {

	Logger log = Logger.getLogger(Validate.class.getName());

	// none object is required to pass no base
	Option<IRI> none = Option.empty();
	Option<RDFReader> noneRDF = Option.empty();

	public IO<ResultValidation> validate(String dataFile, String ontologyFile, String schemaFile, String shapeMapFile,
			String expectedShapeMapFile) {
		return readRDF(dataFile, "TURTLE").flatMap(rdfData -> readRDF(ontologyFile, "TURTLE")
				.flatMap(ontologyData -> rdfData.merge(ontologyData).flatMap(merged -> getContents(schemaFile)
						.flatMap(schemaStr -> Schema.fromString(schemaStr, "SHEXC", none, noneRDF).flatMap(
								schema -> getShapeMap(shapeMapFile, merged, schema).flatMap(shapeMap -> ShapeMap
										.fixShapeMap(shapeMap, merged, merged.getPrefixMap(), schema.prefixMap())
										.flatMap(fixedShapeMap -> ResolvedSchema.resolve(schema, none).flatMap(
												resolvedSchema -> getShapeMap(expectedShapeMapFile, merged, schema)
														.flatMap(expectedShapeMap -> Validator
																.validate(resolvedSchema, fixedShapeMap, merged)
																.flatMap(result -> result.toResultShapeMap()
																		.flatMap(resultShapeMap -> IO.pure(
																				new ResultValidation(resultShapeMap,
																						expectedShapeMap)))))))))))));
	}

	public IO<ShapeMap> getShapeMap(String shapeMapFile, RDFReader rdf, Schema schema) {
		return getContents(shapeMapFile)
				.flatMap(shapeMapStr -> EitherIOUtils.eitherStr2IO(
						ShapeMap.fromString(shapeMapStr, "Compact", none, rdf.getPrefixMap(), schema.prefixMap())))
				.handleErrorWith(e -> IO.raiseError(new RuntimeException(
						"Cannot parse shapeMap from file: " + shapeMapFile + ": " + e.getMessage())));
	}

	public IO<RDFAsJenaModel> readRDF(String fileName, String format) {
		return RDFAsJenaModel.fromFile(Paths.get(fileName).toFile(), format, none).handleErrorWith(e -> IO
				.raiseError(new RuntimeException("Cannot parse RDF from file: " + fileName + ":" + e.getMessage())));
	}

	public IO<String> getContents(String fileName) {
		try {
			Path path = Paths.get(fileName);
			List<String> lines = Files.readAllLines(path);
			String str = String.join("\n", lines);
			return IO.apply(() -> str);
		} catch (IOException e) {
			return IO.raiseError(e);
		}
	}

}