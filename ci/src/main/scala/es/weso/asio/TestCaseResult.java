package es.weso.asio;

/**
 * Test case result POJO, it contains the name of the test and the result as a boolean.
 *
 * @author Guillermo Facundo Colunga
 * @since 20200204
 */
public class TestCaseResult {

    // NON-STATIC FIELDS

    // The name of the test.
    private final String name;

    // The result of the test.
    private final boolean result;

    // STATIC FIELDS

    // Base test case message.
    private final static String TEST_CASE_MESSAGE = "Test case: ";

    // If the test succeed.
    private final static String TEST_CASE_OK = "[OK]\t";

    // If the test did not succeed.
    private final static String TEST_CASE_NOT_OK = "[NOT OK]\t";

    /**
     * A test case result abstracts the concept of a test result to the point that it is represented by:
     *
     * @param name of the test.
     * @param result of the executed test attached to this name.
     */
    public TestCaseResult(final String name, final boolean result) {
        this.name = name;
        this.result = result;
    }

    @Override
    /**
     * @return an string containing the appropriate message for printing the test result.
     */
    public String toString() {
        return result ? TEST_CASE_OK + TEST_CASE_MESSAGE + name : TEST_CASE_NOT_OK + TEST_CASE_MESSAGE + name;
    }
}
