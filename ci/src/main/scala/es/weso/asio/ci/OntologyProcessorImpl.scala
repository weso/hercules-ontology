package es.weso.asio.ci

import es.weso.rdf.rdf4j.RDFAsRDF4jModel
import IO._
import java.nio.file.{Files, Paths}
import es.weso.utils.IOException._
import es.weso.utils.IOUtils._

class OntologyProcessorImpl extends OntologyProcessor {

  private val emptyModel = RDFAsRDF4jModel.apply()

  /**
   * By means of the IO object this method will get all the files in the ontology directory with turtle extension and
   * create a single model that contains all the information from the files. In order to do the merge we strongly
   * recommend using the method merge from the class RDFAsRDF4jModel located in the es.weso.rdf.rdf4j package.
   *
   * If the directory is not found will throw an appropriate exception. If no turtle file is found in the directory an
   * empty model will be generated and returned.
   * PLease notice that Right(...) return value represents a success and a
   * Left(...) return value represents an error.
   *
   * @return a right object with the model if no errors. A left value with the corresponding exception otherwise.
   */
  override def getOntologyModel: Either[Exception, RDFAsRDF4jModel] = {
    //ontology directory does not exist
    if (!Files.exists(Paths.get(ONTOLOGY_FILES_PATH))) {
      //throwing IOException
      Left(fromString("The ontology directory is not found"))
    }
    else {
      //the list of ttl files are empty, so we return an empty model
      if (ontologySources.isEmpty) {
        Right(emptyModel)
      }
      else {
        //creating the final Model
        val finalModel: RDFAsRDF4jModel = RDFAsRDF4jModel.apply()
        //looping through the ttl files and merging with the finalModel
        for (fileSource <- ontologySources) {
          finalModel.merge(RDFAsRDF4jModel.fromChars(fileSource.getLines().toString(), "TURTLE"))
        }
        Right(finalModel)
      }
    }
  }
}
