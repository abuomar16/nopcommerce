package tests;



import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import data.JsonReader;
import pages.HomePage;
import pages.MyAccountPage;
import pages.UserLoginPage;

public class UserChangePasswordTest  extends TestBase {
	
	JsonReader jsonObject ;
	HomePage homeOBbject ;
	UserLoginPage loginobject ;
	MyAccountPage changePassObject ;

	@Test
	public void changePassSuccessfuly() throws FileNotFoundException, IOException, ParseException
	{
		jsonObject = new JsonReader() ;
		jsonObject.jsonReader() ;
		
		homeOBbject = new HomePage(driver) ;
		homeOBbject.openLoginLink() ;
		
		loginobject = new UserLoginPage(driver)  ;
		loginobject.userlogin(jsonObject.Email2, jsonObject.password);
		
		changePassObject = new MyAccountPage(driver)  ;
		changePassObject.changePassword(jsonObject.password,jsonObject.new_password );
		
		Assert.assertTrue(changePassObject.successfly_massage.getText().contains("Password was changed"));
	}
	
}
