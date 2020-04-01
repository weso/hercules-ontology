package es.weso.asio.ci

import java.io.File

import scala.io.Source

/**
 * The Input/Output helps to deal with the file system.
 */
object IO {

  // Sources that the system will need to work with.
  val ONTOLOGY_FILES_PATH = "../src"
  val TEST_FILES_PATH = "tests"

  // File extensions that the system will need to work with.
  val TURTLE_FILE_EXTENSION = ".ttl"
  val SHEX_FILE_EXTENSION = ".shex"
  val SHAPE_MAP_FILE_EXTENSION = ".shapeMap"
  val RESULT_SHAPE_MAP_FILE_EXTENSION = ".resultShapeMap"

  // Sources.
  var ontologySources = getSourcesFromDirectoryWithExtension(ONTOLOGY_FILES_PATH, TURTLE_FILE_EXTENSION)
  var instanceSources = getSourcesFromDirectoryWithExtension(TEST_FILES_PATH, TURTLE_FILE_EXTENSION)
  var shapeExpSources = getSourcesFromDirectoryWithExtension(TEST_FILES_PATH, SHEX_FILE_EXTENSION)
  var shapeMapSources = getSourcesFromDirectoryWithExtension(TEST_FILES_PATH, SHAPE_MAP_FILE_EXTENSION)
  var resultSMSources = getSourcesFromDirectoryWithExtension(TEST_FILES_PATH, RESULT_SHAPE_MAP_FILE_EXTENSION)

  /**
   * Updates the sources.
   */
  def update():Unit = {
    ontologySources = getSourcesFromDirectoryWithExtension(ONTOLOGY_FILES_PATH, TURTLE_FILE_EXTENSION)
    instanceSources = getSourcesFromDirectoryWithExtension(TEST_FILES_PATH, TURTLE_FILE_EXTENSION)
    shapeExpSources = getSourcesFromDirectoryWithExtension(TEST_FILES_PATH, SHEX_FILE_EXTENSION)
    shapeMapSources = getSourcesFromDirectoryWithExtension(TEST_FILES_PATH, SHAPE_MAP_FILE_EXTENSION)
    resultSMSources = getSourcesFromDirectoryWithExtension(TEST_FILES_PATH, RESULT_SHAPE_MAP_FILE_EXTENSION)
  }

  // Functional private methods.

  /**
   * Gets a list containing all the sources of a given directory that meet a given file extension.
   *
   * @param directory is an string with the directory where the sources that we want to get are located.
   * @param extension is an string with the extension of the files that we want to get.
   * @return a list of sources that are located in the given directory and meet the given extension.
   */
  private[this] def getSourcesFromDirectoryWithExtension(directory: String, extension: String): List[Source] = {
    val directoryChosen = new File(directory)

    // Listing the files in the directory folder
    directoryChosen.listFiles.

      // Applying the extension filter
      filter { file => file.isFile && file.getName.endsWith(extension) }.

      // Transforming the file paths to list
      map(_.getPath).toList.map(file => Source.fromFile(file))
  }
}
