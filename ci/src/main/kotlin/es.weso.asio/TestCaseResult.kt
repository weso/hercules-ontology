package es.weso.asio

/**
 * Test case result POJO, it contains the name of the test and the result as a boolean.
 *
 * @author Guillermo Facundo Colunga
 * @since 20200204
 */
class TestCaseResult
/**
 * A test case result abstracts the concept of a test result to the point that it is represented by:
 *
 * @param name of the test.
 * @param result of the executed test attached to this name.
 */
(
        // NON-STATIC FIELDS

        // The name of the test.
        val name: String, // The result of the test.
        val result: Boolean, // The error message.
        val errorMsg: String = "") {

    override
            /**
             * @return an string containing the appropriate message for printing the test result.
             */
    fun toString(): String {
        return if (result)
            TEST_CASE_OK + TEST_CASE_MESSAGE + name
        else
            TEST_CASE_NOT_OK + TEST_CASE_MESSAGE + name +
                    " :: " + errorMsg
    }

    companion object {

        // STATIC FIELDS

        // Base test case message.
        private val TEST_CASE_MESSAGE = "Test case: "

        // If the test succeed.
        private val TEST_CASE_OK = "[OK]\t\t"

        // If the test did not succeed.
        private val TEST_CASE_NOT_OK = "[NOT OK]\t"
    }
}
