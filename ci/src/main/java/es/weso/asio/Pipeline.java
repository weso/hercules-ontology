package es.weso.asio;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Pipeline {

    private final String ontologyPath;
    private final String shapesPath;
    private final String shapeMapsPath;
    private final String rdfDataPath;

    // The list containing all the test needed to execute.
    private final List<TestCase> tests;

    public Pipeline(String ontologyPath, String shapesPath, String shapeMapsPath, String rdfDataPath) {
        this.ontologyPath = ontologyPath;
        this.shapesPath = shapesPath;
        this.shapeMapsPath = shapeMapsPath;
        this.rdfDataPath = rdfDataPath;
        this.tests = new ArrayList<TestCase>();
    }

    public List<TestCaseResult> execute() {
        return tests.parallelStream().map(test -> test.execute()).collect(Collectors.toList());
    }
}
