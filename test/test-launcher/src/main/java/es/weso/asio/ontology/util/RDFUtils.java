package es.weso.asio.ontology.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import es.weso.rdf.rdf4j.RDFAsRDF4jModel;

/**
 * The RDFUtils defines a static class offering the merge method that allows to
 * merge two different models in turtle into a single one. It also contains a
 * private method called getData that extracts the content of a file.
 * 
 * @author Pablo Menéndez
 *
 */
public class RDFUtils {

	/**
	 * INCOMPLETE
	 * 
	 * @param ontologyPath
	 * @param dataPath
	 * @return
	 */
	public static String merge(String ontologyPath, String dataPath) {
		RDFAsRDF4jModel finalModel = RDFAsRDF4jModel.fromChars(getData(ontologyPath), "TURTLE", null).unsafeRunSync();
		finalModel.merge(RDFAsRDF4jModel.fromChars(getData(dataPath), "TURTLE", null).unsafeRunSync());
		System.out.println(finalModel);

		// Throws a nullpointer...

		// INCOMPLETE
		return "";
	}

	/**
	 * Gets the content from a file. Receives a String that indicates the path of
	 * the file.
	 * 
	 * @param path of the file as a String
	 * @return Data as a String
	 */
	private static String getData(String path) {
		String data = "";
		try {
			File file = new File(path);
			Scanner myReader = new Scanner(file);
			while (myReader.hasNextLine()) {
				data += myReader.nextLine();
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found at " + path);
			e.printStackTrace();
		}
		return data;
	}

}
