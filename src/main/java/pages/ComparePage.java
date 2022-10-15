package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ComparePage extends Base {

	public ComparePage(WebDriver driver) {
		super(driver);
	}

	public WebElement compere_btn ;
	
	public WebElement sucessfully_masseage ;
	
	

	
	public void AddProductToCompere() throws InterruptedException
	{
		compere_btn = driver.findElement(By.cssSelector("button.button-2.add-to-compare-list-button")) ;
		compere_btn.click();
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Thread.sleep(3000);
		
		WebElement productCompersion_link = driver.findElement(By.cssSelector("a")) ;
		productCompersion_link.click();


		sucessfully_masseage = driver.findElement(By.cssSelector("h1")) ;
	}


}
