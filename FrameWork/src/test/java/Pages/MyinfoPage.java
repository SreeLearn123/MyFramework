package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MyinfoPage {
	WebDriver driver = null;
	@FindBy(linkText="My Info")
	WebElement Myinfo;
	@FindBy(linkText="Dependents")
	WebElement Dependents;
	@FindBy(xpath="//input[@value='Add']")
	WebElement btnAdd;
	@FindBy(id="dependent_name")
	WebElement depname;
	@FindBy(id="dependent_relationshipType")
	WebElement relationship;
	@FindBy(xpath="//input[@value='Save']")
	WebElement btnSave;
	public MyinfoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickonMyinfolink() {
		//driver.findElement(btnLogin).click();
		Myinfo.click();
	}
	
	public void clickondependants() {
		//driver.findElement(btnLogin).click();
		Dependents.click();
	}
	
	public void clickonAdd() {
		//driver.findElement(btnLogin).click();
		btnAdd.click();
	}
	
	public void enterdepname(String Name) {
		//driver.findElement(txtusername ).sendKeys(UN);
		depname.sendKeys(Name);
	}
	
	public void selectRelationship(String Rel) {
		Select dropdown= new Select(relationship);
		dropdown.selectByVisibleText(Rel);
	}
	public void clickonSave() {
		//driver.findElement(btnLogin).click();
		btnSave.click();
	}
	
}





