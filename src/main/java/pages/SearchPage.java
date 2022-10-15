package pages;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class SearchPage extends Base {

	public SearchPage(WebDriver driver) {
		super(driver);

	}

	

	
	public   WebElement  sucessfully_massage ;
	
	
	public void searchText( String text ) throws InterruptedException 
	{

	
		WebElement search_text = driver.findElement(By.id("small-searchterms")) ;
		search_text.sendKeys(text);
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Thread.sleep(3000);
	
		List <WebElement>  product_list  = driver.findElements(By.id("ui-id-1")) ;
		product_list.get(0).click();;
		
		sucessfully_massage = driver.findElement(By.cssSelector("div.product-name")) ;
	}

	
	

}
