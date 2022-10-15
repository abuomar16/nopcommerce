package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UserRegisterationPage extends Base {


	public UserRegisterationPage(WebDriver driver) 
	{
		super(driver);
	}





	public WebElement successfly_massage  ;

	public void userRegisteration( String firstName ,String lastName ,String EmailName ,String companyName ,String password)
	{


		WebElement GenderBtn = driver.findElement(By.id("gender")) ;
		GenderBtn.click();
		
		WebElement FnameTxt = driver.findElement(By.id("FirstName")) ;
		FnameTxt.sendKeys(firstName);
		
		WebElement LnameTxt = driver.findElement(By.id("LastName")) ;
		LnameTxt.sendKeys(lastName);

		WebElement day = driver.findElement(By.name("DateOfBirthDay")) ;
		Select  option1 = new Select (day) ;
		option1.selectByIndex(1);

		WebElement month = driver.findElement(By.name("DateOfBirthMonth")) ;
		Select  option2 = new Select (month) ;
		option2.selectByIndex(1);

		WebElement year = driver.findElement(By.name("DateOfBirthYear")) ;
		Select  option3 = new Select (year) ;
		option3.selectByIndex(1);

		WebElement EmailTxt = driver.findElement(By.id("Email")) ;
		EmailTxt.sendKeys(EmailName);
		
		WebElement CompanyNmeTxt = driver.findElement(By.id("Company")) ;
		CompanyNmeTxt.sendKeys(companyName);
		
		WebElement checkBox = driver.findElement(By.id("Newsletter")) ;
		checkBox.click();
		
		WebElement passTxt = driver.findElement(By.id("Password")) ;
		passTxt.sendKeys(password);
		
		WebElement confirmpassTxt = driver.findElement(By.id("ConfirmPassword")) ;
		confirmpassTxt.sendKeys(password);
		
		WebElement registerBtn = driver.findElement(By.id("register-button")) ;
		registerBtn.click();
		
		successfly_massage = driver.findElement(By.cssSelector("div.result")) ;
		




	}


}
