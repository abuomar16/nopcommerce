package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReviewPage  extends Base {

	public ReviewPage(WebDriver driver) {
		super(driver);
	}

	
	

	public WebElement sucessfully_masseage;
	



	public void addReview( String title_text ,String review_text )
	{
		WebElement review_link = driver.findElement(By.linkText("Add your review")) ;
		review_link.click();
		
		
		WebElement title = driver.findElement(By.id("AddProductReview_Title")) ;
		title.sendKeys(title_text);
		
		
		WebElement review = driver.findElement(By.id("AddProductReview_ReviewText")) ;
		review.sendKeys(review_text);

		WebElement options = driver.findElement(By.id("addproductrating_4")) ;
		options.click();
	
		
		WebElement submitReview_btn = driver.findElement(By.name("add-review")) ;
		submitReview_btn.click();
	
		
		sucessfully_masseage = driver.findElement(By.cssSelector("div.result")) ;

	}

}
