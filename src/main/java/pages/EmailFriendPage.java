package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class EmailFriendPage extends Base {

	public EmailFriendPage(WebDriver driver) {
		super(driver);
	
	}
	
	
	

	
	public WebElement sucessfully_masseage ;
	
	
	public void sendEmail( String email ,String massage )
	{
		WebElement EmailFriend_link = driver.findElement(By.cssSelector("button.button-2.email-a-friend-button")) ;
		EmailFriend_link.click();
		
		
		WebElement friend_Email = driver.findElement(By.id("FriendEmail")) ;
		friend_Email.sendKeys(email);
	
		
		WebElement My_massage = driver.findElement(By.id("PersonalMessage")) ;
		My_massage.sendKeys(massage);
		
		
		WebElement SendEmail_btn = driver.findElement(By.cssSelector("button.button-1.send-email-a-friend-button")) ;
		SendEmail_btn.click();
	
		
		sucessfully_masseage = driver.findElement(By.cssSelector("div.result")) ;
		
		
		
	}
	
	
	
	
	
	
}

