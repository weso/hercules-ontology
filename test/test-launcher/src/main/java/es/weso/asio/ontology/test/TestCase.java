package es.weso.asio.ontology.test;

import com.google.gson.annotations.SerializedName;

import es.weso.asio.ontology.util.RDFUtils;

/**
 * This models a test case, which is composed of a name, the ontology that is being tested, the data to test, the schema
 * against the tests will be thrown, the input shape map, which specifies the nodes that will be tested. And the output
 * expected shape map.
 *
 * @author Pablo Menéndez
 */
public class TestCase {

	// All fields have a companion tag @SerializedName to be able to change it in the near future with no propagation
	// consequences.

	@SerializedName("test_name")
	private final String name;

	@SerializedName("ontology")
	private final String ontologyFilePath;

	@SerializedName("data")
	private final String dataFilePath;

	@SerializedName("schema")
	private final String testSchemaFilePath;

	@SerializedName("in_shape_map")
	private final String testShapeMapFilePath;

	@SerializedName("out_shape_map")
	private final String expectedShapeMapFilePath;

	/**
	 * The default constructor is a basic all-args constructor. All the arguments that it takes are paths to the
	 * different files, except the name that is the literal string that will be assigned as test name.
	 *
	 * @param name                     of the test case.
	 * @param ontologyFilePath         is the file path to the ontology file used for testing.
	 * @param dataFilePath             is the file path to the data file used to mock ontology instances.
	 * @param testSchemaFilePath       is the file path to the schema used to validate the ontology.
	 * @param testShapeMapFilePath     is the file path to the shape map that relates each test data node with its
	 *                                    corresponding schema.
	 * @param expectedShapeMapFilePath is the file path to the expected result shape map.
	 */
	public TestCase(final String name, final String ontologyFilePath, final String dataFilePath,
					final String testSchemaFilePath, final String testShapeMapFilePath,
					final String expectedShapeMapFilePath) {
		this.name = name;
		this.ontologyFilePath = ontologyFilePath;
		this.dataFilePath = dataFilePath;
		this.testSchemaFilePath = testSchemaFilePath;
		this.testShapeMapFilePath = testShapeMapFilePath;
		this.expectedShapeMapFilePath = expectedShapeMapFilePath;
	}
	

	/**
	 * Gets name.
	 *
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets ontology file path.
	 *
	 * @return ontology file path
	 */
	public String getOntologyFilePath() {
		return ontologyFilePath;
	}

	/**
	 * Gets data file path.
	 *
	 * @return data file path
	 */
	public String getDataFilePath() {
		return dataFilePath;
	}

	/**
	 * Gets test schema file path.
	 *
	 * @return test schema file path
	 */
	public String getTestSchemaFilePath() {
		return testSchemaFilePath;
	}

	/**
	 * Gets test shape map file path.
	 *
	 * @return test shape map file path
	 */
	public String getTestShapeMapFilePath() {
		return testShapeMapFilePath;
	}

	/**
	 * Gets expected shape map file path.
	 *
	 * @return the expected shape map file path
	 */
	public String getExpectedShapeMapFilePath() {
		return expectedShapeMapFilePath;
	}
	
	
	/**
	 * Gets the necessary arguments for the validation as a String[]
	 * @return validateArgs
	 */
	public String[] getValidateArgs() {
		return new String[]{"-d",RDFUtils.merge(getOntologyFilePath(), getDataFilePath()),"-s",getTestSchemaFilePath(),"-m",getTestShapeMapFilePath()};
	}

	@Override
	public String toString() {
		return "TestCase [test_name=" + name + ", ontology=" + ontologyFilePath + ", data=" + dataFilePath
				+ ", schema=" + testSchemaFilePath + ", in_shape_map=" + testShapeMapFilePath + ", out_shape_map="
				+ expectedShapeMapFilePath + "]";
	}
}
