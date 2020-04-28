import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.google.gson.Gson;

import es.weso.asio.ontology.ResultCase;
import es.weso.asio.ontology.test.TestCase;
import es.weso.asio.ontology.test.manifest.ManifestParser;
import es.weso.asio.ontology.test.manifest.impl.ManifestParserImpl;
import es.weso.asio.ontology.validate.ResultValidation;
import es.weso.asio.ontology.validate.TestCaseValidator;

class ValidationTest {

	@Test
	void test() throws FileNotFoundException {
		ManifestParser p = new ManifestParserImpl(ManifestParser.DEFAULT_MANIFEST_FILE_PATH);
		TestCaseValidator v = new TestCaseValidator();

		for (TestCase t : p.getTestCases()) {
			ResultValidation result = v.validate(t);

			Gson gson = new Gson();
			List<ResultCase> results = Arrays
					.asList(gson.fromJson(result.getResultShapeMap().toJson().spaces2(), ResultCase[].class));
			List<ResultCase> expecteds = Arrays
					.asList(gson.fromJson(result.getExpectedShapeMap().toJson().spaces2(), ResultCase[].class));

			for (ResultCase e : expecteds) {
				ResultCase res = results.stream().filter(r -> e.compareNode(r)).findFirst().get();

				assertTrue(e.equals(res));

			}
		}
	}

}
