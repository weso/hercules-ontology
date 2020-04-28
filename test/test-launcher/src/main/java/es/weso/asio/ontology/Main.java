package es.weso.asio.ontology;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import com.google.gson.Gson;

import es.weso.asio.ontology.test.ResultCase;
import es.weso.asio.ontology.test.TestCase;
import es.weso.asio.ontology.test.manifest.ManifestParser;
import es.weso.asio.ontology.test.manifest.impl.ManifestParserImpl;
import es.weso.asio.ontology.validate.ResultValidation;
import es.weso.asio.ontology.validate.TestCaseValidator;

/**
 * Just a mock class to test the implemented classes.
 */
public class Main {

	public static void main(String[] args) throws IOException {
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

				System.out.println(e.equals(res));

			}

		}

	}

}
