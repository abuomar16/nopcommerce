package tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import data.JsonReader;
import pages.ConectUsPage;
import pages.HomePage;

public class ConnectUsTest extends TestBase {
	
	JsonReader jsonObject ;
	HomePage homeObject  ;
	ConectUsPage connectObject ;
	
	@Test
	public void connectUsSucessfully() throws FileNotFoundException, IOException, ParseException
	{
		jsonObject = new JsonReader() ;
		jsonObject.jsonReader() ;
		
		homeObject =new  HomePage (driver) ;
		homeObject.openConectUslink();
		connectObject = new  ConectUsPage (driver) ;
		connectObject.connectUS(jsonObject.fName, jsonObject.Email, jsonObject.massage );
	}

}
