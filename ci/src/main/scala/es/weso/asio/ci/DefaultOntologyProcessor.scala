package es.weso.asio.ci


import es.weso.asio.ci.utils.MergeRDF4JUtil
import es.weso.rdf.rdf4j.RDFAsRDF4jModel

import scala.io.Source

case class DefaultOntologyProcessor(ontologySources: List[Source], ontologySourcesPath: String) extends OntologyProcessor {

  private val modelUtil: MergeRDF4JUtil = new MergeRDF4JUtil()

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
    modelUtil.mergeRDF4JModels(ontologySources, ontologySourcesPath
      , "The ontology directory is not found", "TURTLE")
  }
}
