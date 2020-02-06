package es.weso.asio;


public class TestCase {

    private final String name;
    /*private final Schema shapeExpresion;
    private final ShapeMap shapeMap;
    private final RDF data;*/

    public TestCase(String name /*Shape shapeExpresion, ShapeMap shapeMap, RDF data*/) {
        this.name = name;
        /*this.shapeExpresion = shapeExpresion;
        this.shapeMap = shapeMap;
        this.data = data;*/
    }

    /**
     * Executes the test case. Here should go labra's codeeeeeeee.
     *
     * @return the test case result after execution.
     */
    public TestCaseResult execute() {
        return new TestCaseResult(this.name, false, "Not implemented yet!");
    }
}
