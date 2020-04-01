package es.weso.asio.ci

import es.weso.rdf.rdf4j.RDFAsRDF4jModel

/**
 * The ontology processor reads the files located in the ontology directory by means of the IO object, merges them and
 * creates a single model with all of them.
 */
trait OntologyProcessor {

  /**
   * By means of the IO object this method will get all the files in the ontology directory with turtle extension and
   * create a single model that contains all the information from the files. In order to do the merge we strongly
   * recommend using the method merge from the class RDFAsRDF4jModel located in the es.weso.rdf.rdf4j package.
   *
   * If the directory is not found will throw an appropriate exception. If no turtle file is found in the directory an
   * empty model will be generated and returned. PLease notice that Right(...) return value represents a success and a
   * Left(...) return value represents an error.
   *
   * @return a right object with the model if no errors. A left value with the corresponding exception otherwise.
   */
  def getOntologyModel: Either[Exception, RDFAsRDF4jModel]
}
