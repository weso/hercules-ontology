package asio.ontology.test;
import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import com.google.gson.Gson;

import es.weso.asio.ontology.test.ResultCase;
import es.weso.asio.ontology.test.TestCase;
import es.weso.asio.ontology.test.manifest.ManifestParser;
import es.weso.asio.ontology.test.manifest.impl.ManifestParserImpl;
import es.weso.asio.ontology.validate.ResultValidation;
import es.weso.asio.ontology.validate.TestCaseValidator;

/**
 * This class is a JUnit test case to test the validation. It is composed by a
 * ParameterizedTest method called testValidate and another method called
 * validateProvider.
 * 
 * TestValidate is called by every element of the stream provided by
 * validateProvider method.
 * 
 * validateProvider returns a stream with all the TestCases defined in the
 * Manifest File.
 * 
 * @author Pablo Menéndez
 *
 */
class ValidationTest {

	/**
	 * Performs the validation of a concrete TestCase. Gets the result validation
	 * and the expected result as Lists using gson library. For each node in the
	 * expected result look for its pair in the result validation and checks if are
	 * the same.
	 * 
	 * @param TestCase to validate
	 */
	@ParameterizedTest
	@MethodSource("validateProvider")
	void testValidate(TestCase t) {
		TestCaseValidator v = new TestCaseValidator();
		ResultValidation resultValidation = v.validate(t);
		Gson gson = new Gson();

		List<ResultCase> result = Arrays
				.asList(gson.fromJson(resultValidation.getResultShapeMap().toJson().spaces2(), ResultCase[].class));
		List<ResultCase> expected = Arrays
				.asList(gson.fromJson(resultValidation.getExpectedShapeMap().toJson().spaces2(), ResultCase[].class));

		expected.stream()
				.forEach(e -> assertTrue(e.equals(result.stream().filter(r -> e.compareNode(r)).findFirst().get())));

	}

	/**
	 * Return a stream with all the TestCases defined in the Manifest File.
	 * 
	 * @return TestCases as a Stream
	 * @throws FileNotFoundException if the ManifestParser doesn´t find the Manifest
	 *                               File.
	 */
	static Stream<TestCase> validateProvider() throws FileNotFoundException {
		Stream<TestCase> stream = Stream
				.of(new ManifestParserImpl(ManifestParser.DEFAULT_MANIFEST_FILE_PATH).getTestCases());
		return stream;
	}

}