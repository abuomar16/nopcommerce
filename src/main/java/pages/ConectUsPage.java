package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConectUsPage  extends Base{

	
	public ConectUsPage(WebDriver driver) {
		super(driver);
	}
	
	WebElement name = driver.findElement(By.id("FullName")) ;
	
	
	WebElement Email_text = driver.findElement(By.id("Email")) ;
	
	
	WebElement Enquiry_text = driver.findElement(By.id("Enquiry")) ;
	
	
	WebElement submit = driver.findElement(By.cssSelector("button.button-1.contact-us-button")) ;

	
	
	public void connectUS(String fullname  , String Email ,String Enquiry )
	{
		name.sendKeys(fullname);
	
		
		Email_text.sendKeys(Email);
	
		
		Enquiry_text.sendKeys(Enquiry);

		
		submit.click();

		
		
	}
	
	
	
	
}
