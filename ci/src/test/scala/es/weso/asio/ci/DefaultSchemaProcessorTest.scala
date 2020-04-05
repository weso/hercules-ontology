package es.weso.asio.ci

import es.weso.asio.ci.IO._
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.{BeforeAndAfter, Inside}

import scala.io.Source

class DefaultSchemaProcessorTest extends AnyFunSuite with BeforeAndAfter with Inside {

  var shapeProcessor: SchemaProcessor = null

  before {
    shapeProcessor = DefaultSchemaProcessor(shapeExpSources, TEST_FILES_PATH)
  }

  test("Throwing exception when there's an non-existent directory") {
    val shapesProcessorNoDirectory = DefaultSchemaProcessor(shapeExpSources, "../other")
    val model = shapesProcessorNoDirectory.getSchema
    //asserting that there was no exception
    assert(model.isLeft)
    inside(model) { case Left(e) =>
      assert(e.getMessage.equals("The schema directory is not found"))
    }
  }

  test("Empty shex source and non existent directory should throw an exception") {
    val emptyList = List[Source]()
    val shapesProcessorEmptyList = DefaultSchemaProcessor(emptyList, "../other")
    val model = shapesProcessorEmptyList.getSchema
    //asserting that there was no exception
    assert(model.isLeft)
    inside(model) { case Left(e) =>
      assert(e.getMessage.equals("The schema directory is not found"))
    }
  }

  test("Empty shapes source and should return empty model") {
    val emptyList = List[Source]()
    val shapesProcessorEmptyList = DefaultSchemaProcessor(emptyList, TEST_FILES_PATH)
    val model = shapesProcessorEmptyList.getSchema
    //asserting that there was no exception and returning an empty model
    assert(model.isRight)
    inside(model) { case Right(rightModel) =>
      //model does not contain anything
      //TODO:
    }
  }

  test("Correct shapes directory and only one existing ttl file in said directory") {
    val model = shapeProcessor.getSchema
    //asserting that there was no exception and returning an empty model
    assert(model.isRight)
    inside(model) { case Right(rightModel) =>
      //merging complete
      //TODO:
    }
  }
}
