package es.weso.asio;

public class TestCaseResult {

    private final boolean result;
    private final String name;

    public TestCaseResult(final String name, final boolean result) {
        this.name = name;
        this.result = result;
    }

    @Override
    public String toString() {
        return result ? "Test case " + name + "\t [OK]" : "Test case " + name + "\t [NOT OK]";
    }
}
