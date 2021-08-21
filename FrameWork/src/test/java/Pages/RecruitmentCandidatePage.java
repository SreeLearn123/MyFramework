package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecruitmentCandidatePage {
	WebDriver driver = null;
	@FindBy(linkText="Recruitment")
	WebElement Recruitment;
	@FindBy(linkText="Candidates")
	WebElement candidate;
	@FindBy(name="btnAdd")
	WebElement add;
	@FindBy(name="addCandidate[firstName]")
	WebElement Firstname;
	@FindBy(name="addCandidate[lastName]")
	WebElement Lastname;
	@FindBy(id="addCandidate_email")
	WebElement email;
	@FindBy(id="btnSave")
	WebElement Save;
	
	
	public RecruitmentCandidatePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void clkRecruitmentlink() {
		//driver.findElement(btnLogin).click();
		Recruitment.click();
	}
	public void clickonCandidates() {
		//driver.findElement(btnLogin).click();
		candidate.click();
	}
	public void clickonAdd() {
		//driver.findElement(btnLogin).click();
		add.click();
	}
	public void enterFirstName(String Fname) {
		//driver.findElement(txtusername ).sendKeys(UN);
		 Firstname.sendKeys(Fname);
	}
	public void enterLastName(String Lname) {
		//driver.findElement(txtusername ).sendKeys(UN);
		 Lastname.sendKeys(Lname);
	}
	public void enteremail(String emailid) {
		//driver.findElement(txtusername ).sendKeys(UN);
		 email.sendKeys(emailid);
	}
	public void save() {
		Save.click();
	}
}








