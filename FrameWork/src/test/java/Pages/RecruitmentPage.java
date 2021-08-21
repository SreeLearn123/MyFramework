package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecruitmentPage {
	WebDriver driver = null;
	
	

	@FindBy(linkText="Recruitment")
	WebElement Recruitment;
	@FindBy(linkText="Vacancies")
	WebElement Vacancies;
	@FindBy(id="btnAdd")
	WebElement btnAdd;
	@FindBy(id="addJobVacancy_name")
	WebElement jobName;
	
	public RecruitmentPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	public void clickonRecruitmentlink() {
		//driver.findElement(btnLogin).click();
		Recruitment.click();
	}
	public void clickonVacancies() {
		//driver.findElement(btnLogin).click();
		 Vacancies.click();
	}
	public void clickonAdd() {
		//driver.findElement(btnLogin).click();
		btnAdd.click();
	}
	public void enterjobName(String jobname) {
		//driver.findElement(txtusername ).sendKeys(UN);
		jobName.sendKeys(jobname);
	}

}





