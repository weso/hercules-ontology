package es.weso.asio.ci.utils

import java.nio.file.{Files, Paths}

import es.weso.rdf.rdf4j.RDFAsRDF4jModel
import es.weso.utils.IOException.fromString

import scala.io.Source

/**
 * Util class that is in charge of merging RDF files of a certain extension and format
 * */
class MergeRDF4JUtil {

  private val emptyModel = RDFAsRDF4jModel.apply()

  /**
   * Merges RDF4J models
   *
   * @param sourceFiles : List[Source] list of source files that we want to merge
   * @param sourcePath : String the source list path directory
   * @param exceptionMessage : String the message that we want to send in case of an exception
   * @param sourceFormat : String the extension format of the source files that will be merged
   *
   * @return a right object with the model if no errors. A left value with the corresponding exception otherwise.
   */
  def mergeRDF4JModels(sourceFiles: List[Source], sourcePath: String,
                       exceptionMessage : String, sourceFormat : String): Either[Exception, RDFAsRDF4jModel] = {
    // If the instances directory does not exist
    if (!Files.exists(Paths.get(sourcePath))) {
      // throwing IOException
      Left(fromString(exceptionMessage))
    } else {
      //the list of ttl files in the sources folder is empty, so we return an empty model
      if (sourceFiles.isEmpty) {
        Right(emptyModel.unsafeRunSync())
      } else {
        //creating the instances model
        val finalModel = RDFAsRDF4jModel.fromChars(sourceFiles.head.getLines().mkString, sourceFormat).unsafeRunSync()
        //looping through the files in the directory and merging with the finalModel
        if (sourceFiles.size > 1) {
          for (fileSource <- sourceFiles.tail) {
            finalModel.merge(RDFAsRDF4jModel.fromChars(fileSource.getLines().mkString, sourceFormat).unsafeRunSync())
          }
        }
        Right(finalModel)
      }
    }
  }
}
