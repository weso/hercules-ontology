package es.weso.asio.ontology.validate;

import cats.effect.IO;
import es.weso.asio.ontology.test.TestCase;
import es.weso.shexsjava.Validate;

/**
 * This class is composed by a method called validate that performs the
 * validation for a concrete TestCase.
 * 
 * @author Pablo Menéndez
 *
 */
public class TestCaseValidator {

	private Validate validator;

	/**
	 * Default constructor. Initialize validator.
	 */
	public TestCaseValidator() {
		this.validator = new Validate();
	}

	/**
	 * Performs the validation of a concrete TestCase using shexsjava library.
	 * Receives a Testcase
	 * 
	 * @param t
	 * @return Result of the validation
	 */
	public ResultValidation validate(TestCase t) {

		ResultValidation result = null;

		IO<ResultValidation> validate = validator.validate(t.getOntologyFilePath(), t.getDataFilePath(),
				t.getTestSchemaFilePath(), t.getTestShapeMapFilePath(), t.getExpectedShapeMapFilePath());
		try {
			result = validate.unsafeRunSync();
			System.out.println("ResultShapeMap: " + result.getResultShapeMap().toJson().spaces2());
			System.out.println("ExpectedShapeMap: " + result.getExpectedShapeMap().toJson().spaces2());
		} catch (Exception e) {
			System.out.println("Test case: " + t.getName() + "Error from validation: " + e.getMessage());
		}

		return result;

	}

}
