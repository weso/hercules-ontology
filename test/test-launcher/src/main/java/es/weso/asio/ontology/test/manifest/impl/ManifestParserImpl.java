package es.weso.asio.ontology.test.manifest.impl;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;
import es.weso.asio.ontology.test.TestCase;
import es.weso.asio.ontology.test.manifest.ManifestParser;

/**
 * The manifest parser reads a manifest file and extracts the array of test cases that it defines. It is composed by a
 * default constructor that takes the path to the manifest file and a getTestCases method that parses the given file and
 * returns an array of test cases.
 *
 * @author Pablo Menéndez Suárez
 */
public class ManifestParserImpl implements ManifestParser {

	private final FileReader manifestFileReader;
	private TestCase[] testCases = null; // Lazy initialization for saving memory.

	/**
	 * Default constructor for the manifest parser, from the manifest file path it creates a new file reader that will
	 * be later used to access to the file content. If the given manifest file path points to an existing file the
	 * constructor will throw a file not found exception.
	 *
	 * @param manifestFilePath is the file path to the manifest file.
	 * @throws FileNotFoundException if the manifest file path given does not exists.
	 */
	public ManifestParserImpl(final String manifestFilePath) throws FileNotFoundException {
		this.manifestFileReader = new FileReader(manifestFilePath);
	}

	/**
	 * Gets an array composed by the test cases declared in the manifest file. For that aim it instantiate a Google
	 * JSON object that will parse the file and create the array containing the test cases.
	 *
	 * It is implemented by using laze initialization so that the test cases array is computed only the first time.
	 * Other accesses to the variable will not trigger the execution of the Google JSON parser.
	 *
	 * @return
	 */
	@Override
	public TestCase[] getTestCases() {

		// Lazy initialization.
		if(testCases == null) {
			testCases = new Gson().fromJson(manifestFileReader, TestCase[].class);
		}

		// Default return.
		return testCases;
	}
}
