package tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import data.JsonReader;
import pages.ChartPage;
import pages.CheckOutPage;
import pages.HomePage;
import pages.SearchPage;
import pages.UserRegisterationPage;

public class CheckOutTest extends TestBase {

	JsonReader jsonObject ;
	HomePage homeObject ;
	UserRegisterationPage registerObject ;
	SearchPage searchObject ;
	ChartPage chartObject ;
	CheckOutPage checkObject ;
	
	
	@Test
	public void addTochareSucessfully() throws InterruptedException, FileNotFoundException, IOException, ParseException 
	{
		
		jsonObject = new JsonReader() ;
		jsonObject.jsonReader() ;
		
		homeObject  =   new HomePage  (driver) ;
		registerObject =   new  UserRegisterationPage (driver) ;
		searchObject = new  SearchPage(driver) ;
		chartObject = new  ChartPage(driver) ;
		checkObject = new  CheckOutPage(driver) ;
		/////////////
		homeObject.openRegisterLink();
		registerObject.userRegisteration(jsonObject.fName, jsonObject.lName,jsonObject.Email2,jsonObject.company,jsonObject.password) ;
		/////////////////////////////
		searchObject.searchText(jsonObject.product_name1);
		//////////////////
		chartObject.addToCart();
		chartObject.CheckOUT();
		
		checkObject.check(jsonObject.city,jsonObject.address, jsonObject.code_phone, jsonObject.phone) ;
		
		Assert.assertTrue(checkObject.successfly_massage.getText().contains("order has been successfully"));
		
	}
	
}
