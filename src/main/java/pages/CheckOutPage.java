package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CheckOutPage extends Base {

	public CheckOutPage(WebDriver driver) {
		super(driver);
	}


	public WebElement successfly_massage  ;
	


	public void check(String text1 ,String text2 ,String text3 ,String text4) throws InterruptedException
	{
		WebElement Country = driver.findElement(By.id("BillingNewAddress_CountryId")) ;
		Select  option1 = new Select (Country) ;
		option1.selectByIndex(1);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Thread.sleep(2000);

		WebElement state = driver.findElement(By.id("BillingNewAddress_StateProvinceId")) ;
		Select  option2 = new Select (state) ;
		option2.selectByIndex(1);
		

		WebElement city = driver.findElement(By.id("BillingNewAddress_City")) ;
		city.sendKeys(text1);
		

		WebElement Address1 = driver.findElement(By.id("BillingNewAddress_Address1")) ;
		Address1.sendKeys(text2);
		

		WebElement ZipPostalCode = driver.findElement(By.id("BillingNewAddress_ZipPostalCode")) ;
		ZipPostalCode.sendKeys(text3);
	

		WebElement PhoneNumber = driver.findElement(By.id("BillingNewAddress_PhoneNumber")) ;
		PhoneNumber.sendKeys(text4);
		

		WebElement confirm_btn = driver.findElement(By.name("save")) ;
		confirm_btn.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Thread.sleep(2000);

		WebElement option3 = driver.findElement(By.id("shippingoption_1")) ;
		option3.click() ;
		

		WebElement continue_btn1 = driver.findElement(By.cssSelector("button.button-1.shipping-method-next-step-button")) ;
		continue_btn1.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Thread.sleep(2000);

		WebElement pay0 = driver.findElement(By.id("paymentmethod_0")) ;
		pay0.click();
		

		WebElement continue_btn2 = driver.findElement(By.cssSelector("button.button-1.payment-method-next-step-button")) ;
		continue_btn2.click();
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Thread.sleep(2000);

		WebElement continue_btn3 = driver.findElement(By.cssSelector("button.button-1.payment-info-next-step-button")) ;
		continue_btn3.click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Thread.sleep(2000);

		WebElement submit_btn = driver.findElement(By.cssSelector("button.button-1.confirm-order-next-step-button")) ;
		submit_btn.click();
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Thread.sleep(2000);
		
		successfly_massage = driver.findElement(By.cssSelector("div.title")) ;

	}




}
