package es.weso.asio

import java.io.File

case class Directory(val directory: String) {

  /**
   * Gets the files stored at the given directory
   * @return
   */
  def getFiles():List[File] = {
    val d = new File(directory)
    if (d.exists && d.isDirectory) {
      d.listFiles.filter(_.isFile).toList
    } else {
      List[File]()
    }
  }

  /**
   *
   * @param extension
   * @return
   */
  def getFilesWithExtension(extension: String):List[File] = {
    getFiles().filter(_.getName.endsWith(extension))
  }
}

object AsioDirs {
  val ONTOLOGY = Directory("../ontology")
  val TESTS = Directory("../tests")
}
