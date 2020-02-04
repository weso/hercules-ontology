package es.weso.asio

import java.io.File

import org.scalatest._

class AllTests extends FunSuite {

  test("Testing ontologies") {

    for(file <- AsioDirs.TESTS.getFiles()) {
      println(file);
    }

    for(file <- AsioDirs.ONTOLOGY.getFiles()) {
      println(file);
    }

    assert(true)
  }
}
