package tests;


import org.testng.Assert;
import org.testng.annotations.Test;

import pages.SearchPage;

public class UserSearchTest  extends TestBase {


	SearchPage searchObject ;

	@Test
	public void searchSucessfuly () throws InterruptedException
	{

		searchObject = new SearchPage(driver);

		searchObject.searchText("Apple MacBook");

		Assert.assertTrue(searchObject.sucessfully_massage.getText().contains("MacBook"));

	}

}
