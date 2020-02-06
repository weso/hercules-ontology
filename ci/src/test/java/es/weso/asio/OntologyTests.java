package es.weso.asio;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class OntologyTests {

    private final static String ONTOLOGY_DIR = "../ontology/";
    private final static String TESTS_DIR = "../tests/";

    private Pipeline pipeline = new Pipeline(ONTOLOGY_DIR, TESTS_DIR, TESTS_DIR, TESTS_DIR);

    @BeforeAll
    public static void setUp() {

    }

    @TestFactory
    public Collection<DynamicTest> generateTest() {
        List<DynamicTest> tests = new ArrayList();

        for(TestCaseResult testResult : pipeline.execute()) {
            tests.add(DynamicTest.dynamicTest(testResult.getName(), () -> assertEquals(testResult.getResult(),
                    true)));
            System.out.println(testResult);
        }

        return tests;
    }
}