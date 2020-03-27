package es.weso.ontoci

trait TestPipeline {

  /**
   *
   * @param graph
   */
  def addKnowLedgeGraph(graph: Graph): Unit

  /**
   *
   * @param schema
   */
  def addSchema(schema: Schema): Unit

  /**
   *
   * @param tests
   */
  def addTestCases(tests: List[TestCase])

  /**
   *
   * @return
   */
  def execute(): TestPipelineResult

  /**
   *
   * @return
   */
  def hasFinished():Boolean
}
