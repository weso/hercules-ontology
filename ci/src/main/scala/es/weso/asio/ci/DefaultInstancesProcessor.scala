package es.weso.asio.ci

import java.nio.file.{Files, Paths}

import es.weso.rdf.rdf4j.RDFAsRDF4jModel
import es.weso.utils.IOException._

import scala.io.Source

case class DefaultInstancesProcessor(instancesSources: List[Source], instancesSourcesPath: String) extends InstancesProcessor {

  private val emptyInstancesModel = RDFAsRDF4jModel.apply()

  /**
   * By means of the IO object this method will get all the files in the tests directory from the root with turtle
   * extension and create a single model that contains all the information from the files. In order to do the merge
   * we strongly recommend using the method merge from the class RDFAsRDF4jModel located in the es.weso.rdf.rdf4j
   * package.
   *
   * If the directory is not found will throw an appropriate exception. If no turtle file is found in the directory an
   * empty model will be generated and returned. PLease notice that Right(...) return value represents a success and a
   * Left(...) return value represents an error.
   *
   * @return a right object with the model if no errors. A left value with the corresponding exception otherwise.
   */
  override def getInstancesModel: Either[Exception, RDFAsRDF4jModel] = {
    // If the instances directory does not exist
    if (!Files.exists(Paths.get(instancesSourcesPath))) {
      // throwing IOException
      Left(fromString("The instances directory is not found"))
    } else {
      //the list of ttl files in the instances folder is empty, so we return an empty model
      if (instancesSources.isEmpty) {
        Right(emptyInstancesModel.unsafeRunSync())
      } else {
        //creating the instances model
        val finalInstanceModel = RDFAsRDF4jModel.fromChars(instancesSources.head.getLines().mkString, "TURTLE").unsafeRunSync()
        //looping through the ttl files in tests directory and merging with the finalInstanceModel
        for (fileSource <- instancesSources.tail) {
          finalInstanceModel.merge(RDFAsRDF4jModel.fromChars(fileSource.getLines().mkString, "TURTLE").unsafeRunSync())
        }
        Right(finalInstanceModel)
      }
    }
  }
}
