package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class TestBase {

	public static WebDriver driver  ;
	

	@BeforeSuite
	public void startup()
	{
		
		
		String path = System.getProperty("user.dir")+ "/driver/chromedriver.exe" ;
		System.setProperty("webdriver.chrome.driver", path) ;

	    driver = new ChromeDriver() ;
		
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.nopcommerce.com/");
	}

	
	
	@AfterSuite
	public void stop ()
	{
		driver.quit();	
	}
    


}
