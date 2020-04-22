package es.weso.asio.ontology;

public class Main {

	public static void main(String[] args)   {
		Parser p = new Parser();
		
		for(TestCase t:p.getTestCases("../manifest.json")) {
			System.out.println(t);
		}
		
	}

}
