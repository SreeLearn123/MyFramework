package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
  
WebDriver driver = null;
   public HomePage(WebDriver driver) {
   	this.driver = driver;
   }
   By marketplace = By.id("MP_link");
   
   public boolean verifymarketplace() {
	   driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);
	   if(driver.findElement(marketplace).isDisplayed()){
		
	   return true;
	}
	   else {
		   return false;
	   }
   }
   
}
