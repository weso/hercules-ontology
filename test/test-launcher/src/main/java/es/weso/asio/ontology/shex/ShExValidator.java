package es.weso.asio.ontology.shex;

import java.io.FileWriter;
import java.io.IOException;

import cats.effect.IO;
import es.weso.asio.ontology.test.TestCase;
import es.weso.shapeMaps.ResultShapeMap;
import es.weso.shexsjava.ArgsParser;
import es.weso.shexsjava.Validate;

/**
 * 
 * @author Pablo Menéndez
 *
 */
public class ShExValidator {

	/**
	 * Receives an array with the necessary arguments and performs the validation
	 * 
	 * @param arguments needed for the validation: - String dataFormat - String
	 *                  dataFile - String schemaFormat - String schemaFile - String
	 *                  shapeMapFormat - String shapeMapFile
	 * 
	 */
	public void validate(TestCase t) {

		ArgsParser options = new ArgsParser(t.getValidateArgs());
		Validate validator = new Validate();

		IO<ResultShapeMap> validate = validator.validate(options.data, options.dataFormat, options.schema,
				options.schemaFormat, options.shapeMap, options.shapeMapFormat);

		try {
			
			ResultShapeMap result = validate.unsafeRunSync();
			System.out.println(result.toJson().spaces2());
			writeResult(t,result.toJson().spaces2());

		}catch (IOException e) {
			System.out.println("Error when trying to write the result file");
			System.out.println("Exception: " + e.getMessage());
		}catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}

	}

	private void writeResult(TestCase t, String result) throws IOException {
		
		FileWriter file = new FileWriter(t.getExpectedShapeMapFilePath());
		file.write(result);
		file.close();
		
	}

}
