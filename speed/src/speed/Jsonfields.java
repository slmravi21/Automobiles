package speed;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.jayway.jsonpath.*;

public class Jsonfields {

	public static void jaywaytests() throws IOException {

		String jsonfile = "src/inputs/books.json";
		FileReader readjson = new FileReader(jsonfile);

		BufferedReader br = new BufferedReader(readjson);

		String scurrentline;
		while ((scurrentline = br.readLine()) != null) {
			System.out.println(scurrentline);
			
			Configuration conf = Configuration.defaultConfiguration();
			List<String> jsonPaths = JsonPath.using(conf).parse(scurrentline).read("$");
			
			for (String path : jsonPaths) {
			    System.out.println(path);
			}
		}
		br.close();

	}

}
