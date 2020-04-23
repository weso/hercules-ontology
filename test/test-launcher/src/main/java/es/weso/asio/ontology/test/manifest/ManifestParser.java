package es.weso.asio.ontology.test.manifest;

import es.weso.asio.ontology.test.TestCase;

/**
 * The manifest parser reads a manifest file and extracts the array of test cases that it defines. It is composed by a
 * default constructor that takes the path to the manifest file and a getTestCases method that parses the given file and
 * returns an array of test cases.
 *
 * @author Guillermo Facundo Colunga
 */
public interface ManifestParser {

    /**
     * Public static field that defines the path of the default manifest file.
     */
    String DEFAULT_MANIFEST_FILE_PATH = "../manifest.json";

    /**
     * Gets an array containing all the test cases that are defined in the manifest file.
     *
     * @return an array containing all the test cases that are defined in the manifest file.
     */
    TestCase[] getTestCases();
}
