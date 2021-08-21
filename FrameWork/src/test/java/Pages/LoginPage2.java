package Pages;

import org.apache.logging.log4j.spi.LoggerRegistry.MapFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {

	WebDriver driver = null;
	//Locators and methods

	@FindBy(name="txtUsername")
	WebElement userName;
	@FindBy(id="txtPassword")
	WebElement password;
	@FindBy(name="Submit")
	WebElement btnLogin;


	public LoginPage2(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//methods
	public void enterUN(String UN) {
		//driver.findElement(txtusername ).sendKeys(UN);
		userName.sendKeys(UN);
	}
	public void enterpwd(String pwd) {
		//driver.findElement(txtPassword).sendKeys(pwd);
		password.sendKeys(pwd);
	}

	public void clickonlogin() {
		//driver.findElement(btnLogin).click();
		btnLogin.click();
	}


}




