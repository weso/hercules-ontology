package es.weso.asio.ci

import org.scalatest.flatspec.{AnyFlatSpec}
import scala.io.Source
import java.io.File

/**
 * This class is the one that is executed from travis-ci. Its aim is to dynamically create test cases. The main algorithm
 * followed by this class is the next one:
 *
 *  1. Create a list containing all the `.ttl` files in the directory of the ontology. The ontology is stored in the src
 * directory that can be found in the root of the repository. (Do not confuse with the src folder of this project).
 *
 *  2. Create another list containing all the `.ttl` files in the tests directory. This is directory can be found from
 * the root of the repo ci > tests.
 *
 *  3. Create another list containing all the `.shex` files in the tests directory. This is directory can be found from
 * the root of the repo ci > tests.
 *
 *  4. Create another list containing all the `.shapeMap` files in the tests directory. This is directory can be found
 * from the root of the repo ci > tests.
 *
 *  5. Create another list containing all the `.resultShapeMap` files in the tests directory. This is directory can be found
 * from the root of the repo ci > tests.
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
  private final val ONTOLOGY_FILES = List[Source]()
  private final val INSTANCE_FILES = List[Source]()
  private final val SHAPE_EX_FILES = List[Source]()
  private final val SHAPE_MAP_FILES = List[Source]()
  private final val RES_SHAPE_MAP_FILES = List[Source]()

  /**
   * appending ONTOLOGY_FILES list with `.ttl` files in the directory
   * of the ontology based in '/src' of the root of the current repository
   *
   */
  def populateOntologyFiles(): Unit = {
    val files = getListOfFiles("../src", ".ttl")
    appendList(ONTOLOGY_FILES, files)
  }

  /**
   * appending INSTANCE_FILES list with `.ttl` files
   * in the tests folder of this project
   *
   */
  def populateInstanceFiles(): Unit = {
    val files = getListOfFiles("tests", ".ttl")
    appendList(INSTANCE_FILES, files)
  }

  /**
   * appending SHAPE_EX_FILES list with `.shex` files
   * in the tests folder of this project
   */
  def populateShapeExFiles(): Unit = {
    val files = getListOfFiles("tests", ".shex")
    appendList(SHAPE_EX_FILES, files)
  }

  /**
   * appending SHAPE_MAP_FILES list with `.shapeMap` files
   * in the tests folder of this project
   */
  def populateShapeMapFiles(): Unit = {
    val files = getListOfFiles("tests", ".shapeMap")
    appendList(SHAPE_MAP_FILES, files)
  }

  /**
   * appending RES_SHAPE_MAP_FILES list with `.resultShapeMap` files
   * in the tests folder of this project
   */
  def populateResShapeMapFiles(): Unit = {
    val files = getListOfFiles("tests", ".resultShapeMap")
    appendList(RES_SHAPE_MAP_FILES, files)
  }

  /**
   * gets the list of files in a specific directory with a specific extension
   *
   * @param directory     : a string with the directory with the files that we want to get
   * @param fileExtension : a string with the extension of the files that we want to get
   * @return List[String] of the files' path
   */
  private def getListOfFiles(directory: String, fileExtension: String): List[String] = {
    val directoryChosen = new File(directory)
    //listing the files in the directory folder
    directoryChosen.listFiles.
      //applying the extension filter
      filter { file => file.isFile && (file.getName.endsWith(fileExtension)) }.
      //transforming the file paths to list
      map(_.getPath).toList
  }

  /**
   * appending the listChosen with the files passed in the parameters
   *
   * @param listChosen : the Source list that we want to append
   * @param files      : the String List with the files that we want the listChosen to have
   *
   */
  private def appendList(listChosen: List[Source], files: List[String]): Unit = {
    //looping through the files
    for (file <- files) {
      //appending the list
      listChosen appended Source.fromFile(file)
    }
  }

}
