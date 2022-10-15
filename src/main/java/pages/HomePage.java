package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HomePage  extends Base {


	
	public HomePage(WebDriver driver) 
	{
		super(driver);	 
		action = new Actions(driver) ;
	}
	
	

	public void openRegisterLink()
	{
		WebElement registerlink = driver.findElement(By.linkText("Register" )) ;
		registerlink.click();
	}
	
	public void openLoginLink()
	{
		WebElement loginlink =   driver.findElement(By.linkText("Log in")) ;
		loginlink.click();
		
	}
	
	public void userlogout()
	{
		WebElement LogOutlink =  driver.findElement(By.linkText("Log out")) ;
		LogOutlink.click();
	  
	}
	
	public void openMyaccountlink()
	{
		WebElement Myaccountlink = driver.findElement(By.linkText("My account")) ;
		Myaccountlink.click();
		
	}
	
	public void openConectUslink()
	{
		WebElement Contact_us =  driver.findElement(By.linkText("Contact us")) ;
		Contact_us.click();
		
	}
	
	public void checkCurreny()
	{  
		WebElement currency_checkBox = driver.findElement(By.id("customerCurrency")) ;
		Select  object = new Select (currency_checkBox) ;
		object.selectByIndex(1);
		
	}
	

	
}

