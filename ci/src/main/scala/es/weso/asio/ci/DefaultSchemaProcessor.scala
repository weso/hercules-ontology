package es.weso.asio.ci

import es.weso.asio.ci.utils.{MergeRDF4JUtil, MergeShExUtil}
import es.weso.rdf.rdf4j.RDFAsRDF4jModel
import es.weso.shex.Schema

import scala.io.Source
import scala.util.Either

case class DefaultSchemaProcessor(schemaSources: List[Source], schemaSourcesPath: String) extends SchemaProcessor {

  private val modelUtil: MergeShExUtil = new MergeShExUtil()


  /**
   * By means of the IO object this method will get all the files in the test directory with shape expression extension and
   * will create a single schema that contains all the information from the files.
   *
   * If the directory is not found will throw an appropriate exception. If no shex file is found in the directory an
   * empty model will be generated and returned. PLease notice that Right(...) return value represents a success and a
   * Left(...) return value represents an error.
   *
   * @return a right object with the schema if no errors. A left value with the corresponding exception otherwise.
   */
  def getSchema: Either[Exception, Schema]= {
    modelUtil.mergeShExModels(schemaSources, schemaSourcesPath
      , "The schema directory is not found")
  }
}
