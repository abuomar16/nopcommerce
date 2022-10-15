package tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import data.JsonReader;
import pages.SearchPage;
import pages.WishListPage;

public class AddProductToWishListTest  extends TestBase {

	JsonReader jsonObject ;
	SearchPage searchObject ;
	WishListPage wishlistObject ;
	
	@Test
	public void addToWishlistSucessfully () throws InterruptedException, FileNotFoundException, IOException, ParseException 
	{
		jsonObject = new JsonReader() ;
		jsonObject.jsonReader() ;
	
		searchObject = new SearchPage(driver);
		wishlistObject =  new WishListPage(driver);
		
		searchObject.searchText(jsonObject.product_name1);
		wishlistObject.addProduct();
		
		Assert.assertTrue(wishlistObject.sucessfully_masseage.getText().contains("The wishlist is empty!"));
			
	}
}
