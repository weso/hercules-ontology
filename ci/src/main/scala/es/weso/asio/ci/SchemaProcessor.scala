package es.weso.asio.ci

import scala.util.Either
import es.weso.shex.Schema

/**
 * The schema processor reads the files located in the root > ci> tests directory with `.shex` extension by means of
 * the IO object, merges them and creates a single schema with all of them.
 */
trait SchemaProcessor {

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
  def getSchema: Either[Exception, Schema]
}
