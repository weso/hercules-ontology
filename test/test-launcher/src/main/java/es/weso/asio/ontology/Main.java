package es.weso.asio.ontology;

import java.io.FileNotFoundException;
import java.io.IOException;

import es.weso.asio.ontology.test.TestCase;
import es.weso.asio.ontology.test.manifest.ManifestParser;
import es.weso.asio.ontology.test.manifest.impl.ManifestParserImpl;
import es.weso.asio.ontology.validate.ShExValidator;

/**
 * Just a mock class to test the implemented classes.
 */
public class Main {

	public static void main(String[] args) throws IOException {
		ManifestParser p = new ManifestParserImpl(ManifestParser.DEFAULT_MANIFEST_FILE_PATH);
		ShExValidator v = new ShExValidator();
		
		for (TestCase t : p.getTestCases()) {
			v.validate(t);
		}
		
		
	}

}
