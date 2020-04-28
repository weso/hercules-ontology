package es.weso.asio.ontology.validate;

import cats.effect.IO;
import es.weso.asio.ontology.test.TestCase;
import es.weso.shexsjava.Validate;

public class TestCaseValidator {

	private Validate validator;

	public TestCaseValidator() {
		this.validator = new Validate();
	}

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
