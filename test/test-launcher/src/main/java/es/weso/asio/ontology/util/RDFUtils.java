package es.weso.asio.ontology.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import cats.effect.IO;
import es.weso.rdf.RDFBuilder;
import es.weso.rdf.rdf4j.RDFAsRDF4jModel;

public class RDFUtils {

	/**
	 * 
	 * @param ontologyPath
	 * @param dataPath
	 * @return
	 */
	public static String merge(String ontologyPath, String dataPath) {
		RDFAsRDF4jModel finalModel = RDFAsRDF4jModel.fromChars(getData(ontologyPath), "TURTLE", null).unsafeRunSync();
		finalModel.merge(RDFAsRDF4jModel.fromChars(getData(dataPath), "TURTLE", null).unsafeRunSync());
		System.out.println(finalModel);
		return "";
	}

	/**
	 * Gets the content data from a file. 
	 * @param path of the file
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
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		return data;
	}

}
