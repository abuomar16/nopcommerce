package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class WishListPage extends Base {

	public WishListPage(WebDriver driver) {
		super(driver);
	}

	


	public WebElement sucessfully_masseage  ;
	


	public void addProduct(  ) throws InterruptedException
	{
		WebElement wishlist_btn = driver.findElement(By.id("add-to-wishlist-button-4")) ;
		wishlist_btn.click();
		
		Thread.sleep(2000);
		
		WebElement wishlist_link = driver.findElement(By.cssSelector("a")) ;
		wishlist_link.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Thread.sleep(2000);
		
		WebElement remove_btn = driver.findElement(By.name("updatecart")) ;
		remove_btn.click();
	
		
		sucessfully_masseage = driver.findElement(By.cssSelector("div.no-data")) ;
		
		

	}


}
