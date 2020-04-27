package es.weso.asio.ontology.validate;

import java.io.FileWriter;
import java.io.IOException;

import cats.effect.IO;
import es.weso.asio.ontology.test.TestCase;
import es.weso.shapeMaps.ResultShapeMap;
import es.weso.shexsjava.ArgsParser;
import es.weso.shexsjava.Validate;

/**
 * The ShEx validator validates a TestCase through the shexsjava library and
 * writes the result into the corresponding output file based on the TestCase.
 * It is composed by a default constructor that creates the Validate instance of
 * the shexsjava library, a validate method that performs the validation and a
 * writeResult method that writes the result shapeMap into a file.
 * 
 * @author Pablo Menéndez
 *
 */
public class ShExValidator {

	private Validate validator;

	/**
	 * Default constructor for the ShExValidator. Creates the Validate instance of
	 * the shexsjava library that will be used later to perform the validation.
	 */
	public ShExValidator() {
		this.validator = new Validate();
	}

	/**
	 * Receives an array with the necessary arguments and performs the validation.
	 * After the validation it calls writeReusult method in order to write the
	 * result shape map into the corresponding output file
	 * 
	 * @param necessary arguments for the validation:
	 * @throws IOException if writing is not successful
	 * 
	 */
	public void validate(TestCase t) throws IOException {

		ArgsParser options = new ArgsParser(t.getValidateArgs());

		IO<ResultShapeMap> validate = validator.validate(options.data, options.dataFormat, options.schema,
				options.schemaFormat, options.shapeMap, options.shapeMapFormat);

		ResultShapeMap resultShapeMap = validate.unsafeRunSync();
		writeResult(t, resultShapeMap.toJson().spaces2());

	}

	/**
	 * Receives a concrete TestCase and the result of the validation as a String and
	 * writes the result into the corresponding output file based on the TestCase.
	 * 
	 * @param Testcase
	 * @param Validation result shapeMap
	 * @throws IOException if writing is not successful
	 */
	private void writeResult(TestCase t, String resultShapeMap) throws IOException {

		FileWriter file = new FileWriter(t.getExpectedShapeMapFilePath());
		file.write(resultShapeMap);
		file.close();

	}

}
