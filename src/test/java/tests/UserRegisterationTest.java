package tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import data.JsonReader;
import pages.HomePage;
import pages.UserLoginPage;
import pages.UserRegisterationPage;

public class UserRegisterationTest  extends TestBase {

	
	
	JsonReader jsonObject ;
	HomePage homeOBbject ;
	UserRegisterationPage registerObject ;
	UserLoginPage loginObject ;

	
	
	@Test(priority=1)
	public void registerSucessfuly () throws FileNotFoundException, IOException, ParseException
	{
		jsonObject = new JsonReader() ;
		jsonObject.jsonReader() ;
		
		homeOBbject = new HomePage(driver) ;
		homeOBbject.openRegisterLink();
		
		registerObject =new UserRegisterationPage(driver) ;
		registerObject.userRegisteration(jsonObject.fName, jsonObject.lName, jsonObject.Email, jsonObject.company, jsonObject.password);
		
		Assert.assertTrue(registerObject.successfly_massage.getText().contains("completed"));
		
	}
	
	@Test(priority=2)
	public void logoutSucessfuly()
	{
		homeOBbject.userlogout();
		
	}
	@Test(priority=3)
	public void loginSucessfuly()
	{
		
		loginObject =new UserLoginPage(driver) ;
		homeOBbject.openLoginLink() ;
		loginObject.userlogin(jsonObject.Email, jsonObject.password);
		
	}
	
}


