package tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import data.JsonReader;
import pages.ComparePage;
import pages.SearchPage;


public class compereProductTest extends TestBase {
	
	
	JsonReader jsonObject ;
	SearchPage searchObject ;
	ComparePage compereObject ;
	
	@Test
	public void compereSucessfully () throws InterruptedException, FileNotFoundException, IOException, ParseException
	{
		jsonObject = new JsonReader() ;
		jsonObject.jsonReader() ;
	
		searchObject = new SearchPage(driver);
		compereObject = new ComparePage(driver) ;
		
		searchObject.searchText(jsonObject.product_name1);
		compereObject.AddProductToCompere();

		searchObject.searchText(jsonObject.product_name2);
		compereObject.AddProductToCompere();
		
		Assert.assertFalse(compereObject.sucessfully_masseage.getText().contains("The wishlist is empty!"));
			
	}

}
