package data;
import java.io.File ;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReader {
	
	public String fName ,lName ,Email ,company ,password ,
	              new_password  , 
	              product_name1 ,product_name2 , Review , comment ,
	              city ,address ,code_phone ,phone ,
	              Email2 ,massage ;
	

	
	public void jsonReader() throws FileNotFoundException, IOException, ParseException
	{
		
		String path_json  =System.getProperty("user.dir")+ "/src/test/java/data/userdata.json" ;
		
		File source_file = new File(path_json) ;
		
		JSONParser parser = new JSONParser();
		
		JSONArray   arr = (JSONArray)parser.parse(new FileReader(source_file)) ;
		
	
		for(Object jsonOb  :arr)
		{
			
			JSONObject person = (JSONObject) jsonOb ;
			
			fName = (String) person.get("fName") ;
			lName = (String) person.get("lName") ;
			Email = (String) person.get("Email") ;
			company = (String) person.get("company") ;
			password = (String) person.get("password") ;
			
			
			new_password = (String) person.get("new_password") ;
			
			
			product_name1 = (String) person.get("product_name1") ;
			product_name2 = (String) person.get("product_name2") ;
			Review = (String) person.get("Review") ;
			comment = (String) person.get("comment") ;
			
			city = (String) person.get("city") ;
			address = (String) person.get("address") ;
			code_phone = (String) person.get("code_phone") ;
			phone = (String) person.get("phone") ;
			
			Email2 = (String) person.get("Email2") ;
			massage = (String) person.get("massage") ;
		
			
		}
		
		
		
		
		
		
	}
	

}
