package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserLoginPage  extends Base {

	
	
	public UserLoginPage(WebDriver driver) {
		
		super(driver);
	}
	
	
	
	
	
	 
	 
	 public void userlogin( String email ,String password)
	 {
		WebElement Email_Text = driver.findElement(By.id("Email")) ;
		WebElement pass_Text = driver.findElement(By.id("Password")) ;
		WebElement remember_checkbox = driver.findElement(By.id("RememberMe")) ;
		WebElement loginBtn = driver.findElement(By.cssSelector("button.button-1.login-button")) ;
			
		 
		 Email_Text.sendKeys(email);
		 pass_Text.sendKeys(password);
		 remember_checkbox.click();
		 loginBtn.click();
		
	 }
	 

}
