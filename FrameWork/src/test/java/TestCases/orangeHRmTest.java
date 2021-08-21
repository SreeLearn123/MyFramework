package TestCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Pages.BaseClass;
import Pages.HomePage2;
import Pages.LoginPage2;
import Pages.MyinfoPage;
import Pages.RecruitmentCandidatePage;
import Pages.RecruitmentPage;



public class orangeHRmTest extends BaseClass{


	Logger log = (Logger) LogManager.getLogger(LoginTest.class);

	@Test(priority = 0)
	public void login() {
		LoginPage2 lp = new LoginPage2(driver);
		lp.enterUN(cl.readPropertyValue("userName"));
		lp.enterpwd(cl.readPropertyValue("Password"));
		lp.clickonlogin();

		HomePage2 hp = new HomePage2(driver);
		boolean blnStatus = hp.verifymarketplace();

		if(blnStatus == true ) {
			//log meesage as  user is logged in	
			log.info("User is logged in successfully");
			System.out.println("User is logged in successfully");
			test.log(LogStatus.PASS,"User is logged in successfully");
		}
		else {
			// log message user is not logged in
			log.info("User is not logged in ");
			System.out.println("User is logged in successfully");
			test.log(LogStatus.FAIL,"User is notlogged in successfully");
		}

	}
	//Login End

	@Test(priority = 1)
	public void MyinfoTest() throws InterruptedException {
		LoginPage2 lp = new LoginPage2(driver);
		lp.enterUN(cl.readPropertyValue("userName"));
		lp.enterpwd(cl.readPropertyValue("Password"));
		lp.clickonlogin();

		MyinfoPage mp = new MyinfoPage(driver);

		mp.clickonMyinfolink(); 
		mp.clickondependants();
		mp.clickonAdd();
		mp.enterdepname(cl.readPropertyValue("Name"));
		mp.selectRelationship(cl.readPropertyValue("Relationship"));
		mp.clickonSave();
		Thread.sleep(5000);
		System.out.println("Added dependant successfully");
		test.log(LogStatus.PASS,"Added dependant successfully");
	}//Myinfo end

	@Test(priority = 2)
	public void RecruitmentTest() {
		LoginPage2 lp = new LoginPage2(driver);
		lp.enterUN(cl.readPropertyValue("userName"));
		lp.enterpwd(cl.readPropertyValue("Password"));
		lp.clickonlogin();

		RecruitmentPage rp = new RecruitmentPage(driver);

		rp.clickonRecruitmentlink(); 
		rp.clickonVacancies();
		rp.clickonAdd();
		rp. enterjobName(cl.readPropertyValue("jobname"));
		System.out.println("Added job vacancies successfully");
		test.log(LogStatus.PASS,"Added job vacancies successfully");

	}
	@Test(priority = 3)
	public void addCandidateTest() {
		LoginPage2 lp = new LoginPage2(driver);
		lp.enterUN(cl.readPropertyValue("userName"));
		lp.enterpwd(cl.readPropertyValue("Password"));
		lp.clickonlogin();

		RecruitmentCandidatePage cp = new RecruitmentCandidatePage(driver);
		cp.clkRecruitmentlink();
		cp.clickonCandidates();
		cp.clickonAdd();
		cp.enterFirstName(cl.readPropertyValue("Fname"));
		cp.enterLastName(cl.readPropertyValue("Lname"));
		cp.enteremail(cl.readPropertyValue("emailid"));
		cp.save();
		System.out.println("Added Candidate details successfully");
		test.log(LogStatus.PASS,"Added Candidate details successfully");

	}

}


