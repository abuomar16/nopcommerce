
package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChartPage extends Base {

	public ChartPage(WebDriver driver) {
		super(driver);
	} 
	 
	 public void addToCart() throws InterruptedException 
	 {
		WebElement chart_btn = driver.findElement(By.id("add-to-cart-button-4")) ;
		chart_btn.click();
	  
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    //Thread.sleep(2000);
	   
	    WebElement shoppingCart_link = driver.findElement(By.linkText("shopping cart")) ;
	    shoppingCart_link.click();
	    
	 }
	 
	 public void CheckOUT()
	 {
		WebElement terms_check = driver.findElement(By.id("termsofservice")) ;
		terms_check.click();
		
		
		WebElement checkout_btn = driver.findElement(By.id("checkout")) ;
		checkout_btn.click();
		
	 }
}
