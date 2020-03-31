package es.weso.asio.ci

import org.scalatest.flatspec.{AnyFlatSpec}
import scala.io.Source
import java.io.File

/**
 * This class is the one that is executed from travis-ci. Its aim is to dynamically create test cases. The main algorithm
 * followed by this class is the next one:
 *
 *  1. Create a list containing all the `.ttl` files in the directory of the ontology. The ontology is stored in the src
 *     directory that can be found in the root of the repository. (Do not confuse with the src folder of this project).
 *
 *  2. Create another list containing all the `.ttl` files in the tests directory. This is directory can be found from
 *     the root of the repo ci > tests.
 *
 *  3. Create another list containing all the `.shex` files in the tests directory. This is directory can be found from
 *     the root of the repo ci > tests.
 *
 *  4. Create another list containing all the `.shapeMap` files in the tests directory. This is directory can be found
 *     from the root of the repo ci > tests.
 *
 *  5. Create another list containing all the `.resultShapeMap` files in the tests directory. This is directory can be found
 *     from the root of the repo ci > tests.
 *
 *  6. Join all the files from the list created at (1) in to a single model. This will be our ontology graph.
 *
 *  7. To the graph created in (6) add all the information from all the files in the list created in (2).
 *
 *  8. Join all the files from the list in (3) in to a single schema. This will be our schema graph.
 *
 *  9. For every file in (4) create an empty test case. [This will be filled later...]
 */
class ContinuousIntegrationLauncher extends AnyFlatSpec {

  // Lists of files that will be needed during the execution of the tests.
  private final var ONTOLOGY_FILES      =   List[Source]()
  private final var INSTANCE_FILES      =   List[Source]()
  private final var SHAPE_EX_FILES      =   List[Source]()
  private final var SHAPE_MAP_FILES     =   List[Source]()
  private final var RES_SHAPE_MAP_FILES =   List[Source]()

  /**
   * adding files to list from ../src
   */
  def populateOntologyFiles(): Unit = {
    val files = getListOfFiles("../src", ".ttl")
    var list = List[Source]()
    for (dir <- files){
      println(dir)
      list=list:+Source.fromFile(dir)
    }
    ONTOLOGY_FILES = list
  }

  /**
   * adding files from /tests with .ttl extension
   */
  def populateInstanceFiles(): Unit = {
    val files = getListOfFiles("tests", ".ttl")
    var list = List[Source]()
    for (dir <- files){
      println(dir)
      list=list:+Source.fromFile(dir)
    }
    INSTANCE_FILES = list
  }

  /**
   * adding files from /tests with .shex extension
   */
  def populateShapeExFiles(): Unit = {
    val files = getListOfFiles("tests", ".shex")
    var list = List[Source]()
    for (dir <- files){
      println(dir)
      list=list:+Source.fromFile(dir)
    }
    SHAPE_EX_FILES = list
  }

  /**
   * adding files from /tests with .shapeMap extension
   */
  def populateShapeMapFiles(): Unit = {
    val files = getListOfFiles("tests", ".shapeMap")
    var list = List[Source]()
    for (dir <- files){
      println(dir)
      list=list:+Source.fromFile(dir)
    }
    SHAPE_MAP_FILES = list
  }

  /**
   * adding files from /tests with .resultShapeMap extension
   */
  def populateResShapeMapFiles(): Unit = {
    val files = getListOfFiles("tests", ".resultShapeMap")
    var list = List[Source]()
    for (dir <- files){
      println(dir)
      list=list:+Source.fromFile(dir)
    }
    RES_SHAPE_MAP_FILES = list
  }

  /**
   * return list of paths of files in a specific directory and a specific extension
   */
  def getListOfFiles(dir: String, ext: String):List[String] = {
    val d = new File(dir)
    d.listFiles.
    filter { f => f.isFile && (f.getName.endsWith(ext)) }.
    map(_.getPath).toList
  }

}
