package tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import data.JsonReader;
import pages.HomePage;
import pages.ReviewPage;
import pages.SearchPage;
import pages.UserLoginPage;

public class AddReviewTest extends TestBase{


	JsonReader jsonObject ;
	HomePage homeObject ;
	UserLoginPage loginObject ;
	SearchPage   searchObject ;
	ReviewPage reviewObjet ;

	@Test
	public void addReviewSucessfully() throws InterruptedException, FileNotFoundException, IOException, ParseException
	{
		jsonObject = new JsonReader() ;
		jsonObject.jsonReader() ;

		homeObject = new HomePage (driver) ;
		homeObject.openLoginLink();

		loginObject = new UserLoginPage(driver) ;
		loginObject.userlogin(jsonObject.Email, jsonObject.password);

		searchObject = new SearchPage(driver) ;
		searchObject.searchText(jsonObject.product_name1);	

		reviewObjet = new ReviewPage(driver) ;
		reviewObjet.addReview(jsonObject.Review , jsonObject.comment);

		Assert.assertTrue(reviewObjet.sucessfully_masseage.getText().contains("Product review is successfully "));

	}

}
