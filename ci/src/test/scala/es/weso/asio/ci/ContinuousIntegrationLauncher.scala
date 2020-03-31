package es.weso.asio.ci

import org.scalatest.flatspec.{AnyFlatSpec}

import scala.io.Source

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
  private final val ONTOLOGY_FILES      =   List[Source]()
  private final val INSTANCE_FILES      =   List[Source]()
  private final val SHAPE_EX_FILES      =   List[Source]()
  private final val SHAPE_MAP_FILES     =   List[Source]()
  private final val RES_SHAPE_MAP_FILES =   List[Source]()

  /**
   * TO DO...
   */
  def populateOntologyFiles(): Unit = {
    // TO DO...
  }

  /**
   *
   */
  def populateInstanceFiles(): Unit = {
    // TO DO...
  }

  /**
   * TO DO...
   */
  def populateShapeExFiles(): Unit = {
    // TO DO...
  }

  /**
   * TO DO...
   */
  def populateShapeMapFiles(): Unit = {
    // TO DO...
  }

  /**
   * TO DO...
   */
  def populateResShapeMapFiles(): Unit = {
    // TO DO...
  }

}
