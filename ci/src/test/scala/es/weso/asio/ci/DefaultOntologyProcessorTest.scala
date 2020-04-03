package es.weso.asio.ci

import es.weso.asio.ci.IO._
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.{BeforeAndAfter, Ignore, Inside}

import scala.io.Source

class DefaultOntologyProcessorTest extends AnyFunSuite with BeforeAndAfter with Inside {

  var ontologyProcessor: OntologyProcessor = null

  before {
    ontologyProcessor = DefaultOntologyProcessor(ontologySources, ONTOLOGY_FILES_PATH)
  }

  test("Throwing exception when there's an non-existent directory") {
    val ontologyProcessorNoDirectory = DefaultOntologyProcessor(ontologySources, "../other")
    val model = ontologyProcessorNoDirectory.getOntologyModel
    //asserting that there was no exception
    assert(model.isLeft)
    inside(model) { case Left(e) =>
      assert(e.getMessage.equals("The ontology directory is not found"))
    }
  }

  test("Empty ontology sources and non existent directory should throw an exception") {
    val emptyList = List[Source]()
    val ontologyProcessorEmptyList = DefaultOntologyProcessor(emptyList, "../other")
    val model = ontologyProcessorEmptyList.getOntologyModel
    //asserting that there was no exception
    assert(model.isLeft)
    inside(model) { case Left(e) =>
      assert(e.getMessage.equals("The ontology directory is not found"))
    }
  }

  test("Empty ontology sources and should return empty model") {
    val emptyList = List[Source]()
    val ontologyProcessorEmptyList = DefaultOntologyProcessor(emptyList, ONTOLOGY_FILES_PATH)
    val model = ontologyProcessorEmptyList.getOntologyModel
    //asserting that there was no exception and returning an empty model
    assert(model.isRight)
    inside(model) { case Right(rightModel) =>
      //model does not contain anything
      assert(rightModel.serialize().unsafeRunSync().isBlank)
    }
  }

  ignore("Correct ontology directory and existing ttl files in said directory") {
    val model = ontologyProcessor.getOntologyModel
    //asserting that there was no exception and returning an empty model
    assert(model.isRight)
    inside(model) { case Right(rightModel) =>
      //merging complete
      assert(rightModel.serialize().unsafeRunSync().contains("ASIO core ontology"))
      assert(rightModel.serialize().unsafeRunSync().contains("asioontologies"))
      assert(rightModel.serialize().unsafeRunSync().contains("dct"))
      assert(rightModel.serialize().unsafeRunSync().contains("owl"))
      assert(rightModel.serialize().unsafeRunSync().contains("rdf"))
      assert(rightModel.serialize().unsafeRunSync().contains("xsd"))
      assert(rightModel.serialize().unsafeRunSync().contains("@prefix"))
    }
  }

}
