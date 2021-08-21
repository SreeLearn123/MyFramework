package TestCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.testng.annotations.Test;
import Pages.BaseClass;
import Pages.HomePage;
import Pages.LoginPage;

public class LoginTest extends BaseClass{

	Logger log = (Logger) LogManager.getLogger(LoginTest.class);
	
	@Test
	public void login() {
		LoginPage lp = new LoginPage(driver);
		lp.enterUN(cl.readPropertyValue("userName"));
		lp.enterpwd(cl.readPropertyValue("Password"));
		lp.clickonlogin();
		
		HomePage hp = new HomePage(driver);
		boolean blnStatus = hp.verifymarketplace();
		
		if(blnStatus == true ) {
		//log meesage as  user is logged in	
			log.info("User is logged in successfully");
			System.out.println("User is logged in successfully");
			
		}
		else {
		// log message user is not logged in
			log.info("User is not logged in ");
			System.out.println("User is logged in successfully");
		}
	}
}