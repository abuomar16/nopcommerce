package tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import data.JsonReader;
import pages.EmailFriendPage;
import pages.HomePage;
import pages.SearchPage;
import pages.UserLoginPage;

public class SendEmailTest extends TestBase {
	
	JsonReader jsonObject ;
	HomePage homeObject ;
	UserLoginPage loginObject ;
	SearchPage   searchObject ;
	EmailFriendPage emailObject ;
	
	@Test
	public void sendEmilSucssefuly() throws InterruptedException, FileNotFoundException, IOException, ParseException
	
	{
		
		jsonObject = new JsonReader() ;
		jsonObject.jsonReader() ;
		
		homeObject = new HomePage (driver) ;
		homeObject.openLoginLink();
		
		loginObject = new UserLoginPage(driver) ;
		loginObject.userlogin(jsonObject.Email, jsonObject.password);
		
		searchObject = new SearchPage(driver) ;
		searchObject.searchText("Apple MacBook");	
		
		emailObject = new EmailFriendPage(driver) ;
		emailObject.sendEmail(jsonObject.Email2, jsonObject.massage);
		
		Assert.assertTrue(emailObject.sucessfully_masseage.getText().contains("Your message has been sent"));
	}
	
	
	

}
