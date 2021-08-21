package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver = null;
	//Locators and methods
	By txtusername = By.name("txtUsername");
    By txtPassword = By.id("txtPassword");
    By btnLogin = By.xpath("//input[@value='LOGIN']");
    
    public LoginPage(WebDriver driver) {
    	this.driver = driver;
    }
    
    //methods
    public void enterUN(String UN) {
    	driver.findElement(txtusername ).sendKeys(UN);
    	
    }
    public void enterpwd(String pwd) {
    	driver.findElement(txtPassword).sendKeys(pwd);
    }
    public void clickonlogin() {
    	driver.findElement(btnLogin).click();
    }
}
