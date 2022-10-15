package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


public class Base {
	
	
    protected static  WebDriver driver ;
	public  Actions action  ;
	
	
	
	//constructor
	public Base( WebDriver driver)
	{
		Base.driver = driver ;
		
	}
	

}
