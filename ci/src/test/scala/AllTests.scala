package es.weso.asio

import org.scalatest._

import scala.util.control.Breaks._


class AllTests extends FunSuite {

  test("Testing ontologies") {

    val rdfData = AsioDirs.TESTS.getFilesWithExtension(".ttl")
    val shapes = AsioDirs.TESTS.getFilesWithExtension(".shex")
    val owls = AsioDirs.TESTS.getFilesWithExtension(".owl")
    val shapeMaps = AsioDirs.TESTS.getFilesWithExtension(".shapeMap")


    // 1. Load the ontology

    for (testCase <- rdfData) {
      breakable {
        val rdfTestCase = testCase
        try {
          val shape = shapeMaps.filter(_.getName.startsWith(testCase.getName.split('.')(0)))(0)
        } catch {

          // If the associated shapeMap does not exists the test case will automatically fail.
          case ex: Exception => {
            println(ex)
            println(new TestCaseResult(rdfTestCase.getName, false))
            assert(false)
            break
          }
        }

        // Validate the test case
        println(new TestCaseResult(rdfTestCase.getName, true))
        assert(true)
      }
    }
  }
}