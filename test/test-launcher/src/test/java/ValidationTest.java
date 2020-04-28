import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import com.google.gson.Gson;

import es.weso.asio.ontology.ResultCase;
import es.weso.asio.ontology.test.TestCase;
import es.weso.asio.ontology.test.manifest.ManifestParser;
import es.weso.asio.ontology.test.manifest.impl.ManifestParserImpl;
import es.weso.asio.ontology.validate.ResultValidation;
import es.weso.asio.ontology.validate.TestCaseValidator;

class ValidationTest {

	@ParameterizedTest
	@MethodSource("testProvider")
	void test(TestCase t) {
		TestCaseValidator v = new TestCaseValidator();
		ResultValidation result = v.validate(t);
		Gson gson = new Gson();
		List<ResultCase> results = Arrays
				.asList(gson.fromJson(result.getResultShapeMap().toJson().spaces2(), ResultCase[].class));
		List<ResultCase> expecteds = Arrays
				.asList(gson.fromJson(result.getExpectedShapeMap().toJson().spaces2(), ResultCase[].class));

		expecteds.stream()
				.forEach(e -> assertTrue(e.equals(results.stream().filter(r -> e.compareNode(r)).findFirst().get())));

	}

	static Stream<TestCase> testProvider() throws FileNotFoundException {
		Stream<TestCase> stream = Stream
				.of(new ManifestParserImpl(ManifestParser.DEFAULT_MANIFEST_FILE_PATH).getTestCases());
		return stream;
	}

}