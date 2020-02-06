package es.weso.asio;

import java.io.File;
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
        this.tests = new ArrayList<>();

        createDirectories();
    }

    public List<TestCaseResult> execute() {
        return tests.parallelStream().map(test -> test.execute()).collect(Collectors.toList());
    }

    private void createDirectories() {
        Directory ontologies = new Directory(this.ontologyPath);
        Directory shapes = new Directory(this.shapesPath);
        Directory shapeMaps = new Directory(this.shapeMapsPath);
        Directory rdfs = new Directory(this.rdfDataPath);

        createTests(
                ontologies.getFilesWithExtension(".owl"),
                shapes.getFilesWithExtension(".shex"),
                shapeMaps.getFilesWithExtension(".shapemap"),
                rdfs.getFilesWithExtension(".ttl")
        );
    }

    private void createTests(scala.collection.immutable.List<File> ontologyFiles,
                             scala.collection.immutable.List<File> shapeFiles,
                             scala.collection.immutable.List<File> shapeMapFiles,
                             scala.collection.immutable.List<File> rdfDataFiles) {

        shapeFiles.foreach( file -> tests.add(new TestCase(file.getName())) );
    }

}
