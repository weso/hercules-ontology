package es.weso.asio.ci.utils

import java.nio.file.{Files, Paths}

import es.weso.shex.Schema
import es.weso.rdf.rdf4j.RDFAsRDF4jModel
import es.weso.shex.shexR.ShEx2RDF
import es.weso.shex.shexR.RDF2ShEx
import es.weso.utils.IOException.fromString

import scala.io.Source

/**
 * Util class that is in charge of merging SHEX files of a certain extension and format
 * */
class MergeShExUtil {

  private val emptySchema = Schema.empty

  /**
   * Merges ShEx models
   *
   * @param sourceFiles : List[Source] list of source files that we want to merge
   * @param sourcePath : String the source list path directory
   * @param exceptionMessage : String the message that we want to send in case of an exception
   *
   * @return a right object with the model if no errors. A left value with the corresponding exception otherwise.
   */
  def mergeShExModels(sourceFiles: List[Source], sourcePath: String,
                      exceptionMessage : String): Either[Exception, Schema] = {
    // If the source directory does not exist
    if (!Files.exists(Paths.get(sourcePath))) {
      // throwing IOException
      Left(fromString(exceptionMessage))
    } else {
      //the list of shex files in the sources folder is empty, so we return an empty model
      if (sourceFiles.isEmpty) {
        Right(emptySchema)
      } else {
        val builder = RDFAsRDF4jModel.empty.unsafeRunSync()
        //transforming shex file to rdf in order to do the merge
        val finalModel = ShEx2RDF.apply(Schema.fromString(sourceFiles.head.getLines().mkString).unsafeRunSync(),
                                        None, builder).unsafeRunSync()
        //looping through the files in the directory and merging with the finalModel
        if (sourceFiles.size > 1) {
          for (fileSource <- sourceFiles.tail) {
            val schemaAsModel = ShEx2RDF.apply(Schema.fromString(fileSource.getLines().mkString).unsafeRunSync()
                                              , None, builder)
            finalModel.merge(schemaAsModel.unsafeRunSync())
          }
        }
        //rdf model to schema
        val finalSchema = RDF2ShEx.rdf2Schema(finalModel).value.unsafeRunSync()
        Right(finalSchema.getOrElse(emptySchema))
      }
    }
  }
}
