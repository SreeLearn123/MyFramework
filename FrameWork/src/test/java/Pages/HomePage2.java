package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage2 {
	WebDriver driver = null;
	   @FindBy(id="MP_link")
	   WebElement marketplace;
	   
	   public HomePage2(WebDriver driver) {
	   	this.driver = driver;
	   	PageFactory.initElements(driver , this);
	   }
	
	   public boolean verifymarketplace() {
		   driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);
		   if(marketplace.isDisplayed()){
			
		   return true;
		}
		   else {
			   return false;
		   }
	   }
	   
	}



