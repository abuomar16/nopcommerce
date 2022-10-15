package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPage extends Base {

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}

	
	
	public WebElement successfly_massage  ;

	public void changePassword(String oldpass  ,String newpass)
	{
		WebElement  Myaccount_link = driver.findElement(By.linkText("My account")) ;
		Myaccount_link.click();

		WebElement  ChangePassword_link = driver.findElement(By.linkText("Change password")) ;
		ChangePassword_link.click();	

		WebElement  Old_Password = driver.findElement(By.id("OldPassword")) ;
		Old_Password.sendKeys(oldpass);

		WebElement  New_Password = driver.findElement(By.id("NewPassword")) ;
		New_Password.sendKeys(newpass);

		WebElement Confirm_NewPassword  = driver.findElement(By.id("ConfirmNewPassword")) ;
		Confirm_NewPassword.sendKeys(newpass);

		WebElement   ChangePass_btn= driver.findElement(By.cssSelector("button.button-1.change-password-button")) ;
		ChangePass_btn.click();
		
		successfly_massage = driver.findElement(By.cssSelector("p.content")) ;

	}




}
