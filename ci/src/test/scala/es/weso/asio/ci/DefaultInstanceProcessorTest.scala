package es.weso.asio.ci

import es.weso.asio.ci.IO._
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.{BeforeAndAfter, Inside}

import scala.io.Source

class DefaultInstanceProcessorTest extends AnyFunSuite with BeforeAndAfter with Inside {

  var instanceProcessor: InstancesProcessor = null

  before {
    instanceProcessor = DefaultInstancesProcessor(instanceSources, TEST_FILES_PATH)
  }

  test("Throwing exception when there's an non-existent directory") {
    val instancesProcessorNoDirectory = DefaultInstancesProcessor(instanceSources, "../other")
    val model = instancesProcessorNoDirectory.getInstancesModel
    //asserting that there was no exception
    assert(model.isLeft)
    inside(model) { case Left(e) =>
      assert(e.getMessage.equals("The instances directory is not found"))
    }
  }

  test("Empty instances source and non existent directory should throw an exception") {
    val emptyList = List[Source]()
    val instancesProcessorEmptyList = DefaultInstancesProcessor(emptyList, "../other")
    val model = instancesProcessorEmptyList.getInstancesModel
    //asserting that there was no exception
    assert(model.isLeft)
    inside(model) { case Left(e) =>
      assert(e.getMessage.equals("The instances directory is not found"))
    }
  }

  test("Empty instances source and should return empty model") {
    val emptyList = List[Source]()
    val instancesProcessorEmptyList = DefaultInstancesProcessor(emptyList, TEST_FILES_PATH)
    val model = instancesProcessorEmptyList.getInstancesModel
    //asserting that there was no exception and returning an empty model
    assert(model.isRight)
    inside(model) { case Right(rightModel) =>
      //model does not contain anything
      assert(rightModel.serialize().unsafeRunSync().isBlank)
    }
  }

  test("Correct instances directory and only one existing ttl file in said directory") {
    val model = instanceProcessor.getInstancesModel
    //asserting that there was no exception and returning an empty model
    assert(model.isRight)
    inside(model) { case Right(rightModel) =>
      //merging complete
      assert(rightModel.serialize().unsafeRunSync().contains("alice"))
      assert(rightModel.serialize().unsafeRunSync().contains("bob"))
      assert(rightModel.serialize().unsafeRunSync().contains("carol"))
      assert(rightModel.serialize().unsafeRunSync().contains("dave"))
      assert(rightModel.serialize().unsafeRunSync().contains("emily"))
      assert(rightModel.serialize().unsafeRunSync().contains("frank"))
      assert(rightModel.serialize().unsafeRunSync().contains("grace"))
    }
  }

}
