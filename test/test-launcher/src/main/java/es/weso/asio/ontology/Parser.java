package es.weso.asio.ontology;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

public class Parser {
	
	private Gson gson;
	
	public Parser() {
		this.gson = new Gson();
	}

	
	public TestCase[] getTestCases(String path) {
		TestCase[] testCases = null;
		
		try {
			
			testCases =  gson.fromJson(new FileReader(path),TestCase[].class);
			
		} catch (JsonSyntaxException e) {
			e.printStackTrace();
		} catch (JsonIOException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return testCases;
	}
	

}
