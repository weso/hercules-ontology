package es.weso.asio.ci

import java.nio.file.{FileSystem, FileSystems, Files, Path, Paths}

import org.scalatest.BeforeAndAfter
import org.scalatest.funsuite.AnyFunSuite

class IOTest extends AnyFunSuite with BeforeAndAfter {
/*
  var mockOntologyFile: Path = null
  var mockInstanceFile: Path = null
  var mockShapeExpFile: Path = null
  var mockShapeMapFile: Path = null
  var mockResultSMFile: Path = null

  before {
    mockOntologyFile = Paths.get(IO.ONTOLOGY_FILES_PATH + "/smallTestFile" + IO.TURTLE_FILE_EXTENSION)
    Files.createFile(mockOntologyFile);

    mockInstanceFile = Paths.get(IO.TEST_FILES_PATH + "/smallTestFile" + IO.TURTLE_FILE_EXTENSION)
    Files.createFile(mockInstanceFile);

    mockShapeExpFile = Paths.get(IO.TEST_FILES_PATH + "/smallTestFile" + IO.SHEX_FILE_EXTENSION)
    Files.createFile(mockShapeExpFile);

    mockShapeMapFile = Paths.get(IO.TEST_FILES_PATH + "/smallTestFile" + IO.SHAPE_MAP_FILE_EXTENSION)
    Files.createFile(mockShapeMapFile);

    mockResultSMFile = Paths.get(IO.TEST_FILES_PATH + "/smallTestFile" + IO.RESULT_SHAPE_MAP_FILE_EXTENSION)
    Files.createFile(mockResultSMFile)
  }

  after {
    Files.delete(mockOntologyFile)
    Files.delete(mockInstanceFile)
    Files.delete(mockShapeExpFile)
    Files.delete(mockShapeMapFile)
    Files.delete(mockResultSMFile)
  }
*/

  test("Check that the ontology path value is correct") {
    assert( IO.ONTOLOGY_FILES_PATH equals "../src" )
  }

  test("Check that the test path value is correct") {
    assert( IO.TEST_FILES_PATH equals "tests" )
  }

  test("Check that the turtle file extension is correct") {
    assert( IO.TURTLE_FILE_EXTENSION equals ".ttl" )
  }

  test("Check that the shape expression file extension is correct") {
    assert( IO.SHEX_FILE_EXTENSION equals ".shex" )
  }

  test("Check that the shape map file extension is correct") {
    assert( IO.SHAPE_MAP_FILE_EXTENSION equals ".shapeMap" )
  }

  test("Check that the result shape map file extension is correct") {
    assert( IO.RESULT_SHAPE_MAP_FILE_EXTENSION equals ".resultShapeMap" )
  }

  // The following tests are not complete nor reliable.

  test("Check that the ontology files retrieve is correctly") {
    assert( IO.ontologySources.size > 0 )
  }

  test("Check that the instance files retrieve is correctly") {
    assert( IO.instanceSources.size > 0 )
  }

  test("Check that the shape expr. files retrieve is correctly") {
    assert( IO.shapeExpSources.size > 0 )
  }

  test("Check that the shape map files retrieve is correctly") {
    assert( IO.shapeMapSources.size > 0 )
  }

  test("Check that the result shape map files retrieve is correctly") {
    assert( IO.resultSMSources.size > 0 )
  }

}
