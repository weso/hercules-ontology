package es.weso.asio;

public class TestCase {

    private final String name;
    /*private final Shape shapeExpresion;
    private final ShapeMap shapeMap;
    private final RDF data;*/


    public TestCase(String name /*Shape shapeExpresion, ShapeMap shapeMap, RDF data*/) {
        this.name = name;
        /*this.shapeExpresion = shapeExpresion;
        this.shapeMap = shapeMap;
        this.data = data;*/
    }

    public TestCaseResult execute() {
        return new TestCaseResult("", false, "");
    }
}
