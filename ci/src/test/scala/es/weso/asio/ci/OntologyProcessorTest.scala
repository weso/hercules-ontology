package es.weso.asio.ci

import org.scalatest.BeforeAndAfter
import org.scalatest.funsuite.AnyFunSuite
import IO._

class OntologyProcessorTest extends AnyFunSuite with BeforeAndAfter{

  var ontologyProcessor: OntologyProcessor = null

  before {
    ontologyProcessor = OntologyProcessorImpl()
  }

  test("Check that the ontology path value is correct") {
    assert( ONTOLOGY_FILES_PATH equals "../src" )
  }

  test("Check that the number of ontology files are 2") {
    assert( ontologySources.size === 2 )
  }

  test("Checking that the model is correct") {
    val model = ontologyProcessor.getOntologyModel
    //asserting that there was no exception
    assert(model.isRight)
    assert(!model.isLeft)
  }

}
