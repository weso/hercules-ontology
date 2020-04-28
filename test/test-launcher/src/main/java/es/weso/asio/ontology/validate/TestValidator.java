package es.weso.asio.ontology.validate;

import java.io.IOException;

import cats.effect.IO;
import es.weso.asio.ontology.test.TestCase;
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
public class TestValidator {

	private Validate validator;

	/**
	 * Default constructor for the ShExValidator. Creates the Validate instance of
	 * the shexsjava library that will be used later to perform the validation.
	 */
	public TestValidator() {
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

		// System.out.println(t);
		IO<ResultValidation> validate = validator.validate(t.getOntologyFilePath(), t.getDataFilePath(),
				t.getTestSchemaFilePath(), t.getTestShapeMapFilePath(), t.getExpectedShapeMapFilePath());
		try {
			ResultValidation result = validate.unsafeRunSync();
			System.out.println("ResultShapeMap: " + result.getResultShapeMap().toJson().spaces2());
			System.out.println("ExpectedShapeMap: " + result.getExpectedShapeMap().toJson().spaces2());
			// writeResult(t, result.getResultShapeMap().toJson().spaces2());
		} catch (Exception e) {
			System.out.println("Test case: " + t.getName() + "Error from validation: " + e.getMessage());
		}

	}

}
