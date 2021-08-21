package Pages;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import CommonFunc.CommonLib;

public class BaseClass {
	
	public WebDriver driver = null;
	public CommonLib cl;
	public ExtentReports reports;
	public ExtentTest test;
	
	
	@BeforeSuite
	public void bsuite() {
		reports = new ExtentReports("./Results/Reports.html");
	}
	
	
	@BeforeMethod
	public void Launch(Method method) throws IOException {
		
		test = reports.startTest(method.getName());
		cl = new CommonLib();
		cl.LoadPropertyFile();
		System.setProperty("webdriver.chrome.driver",cl.readPropertyValue("driverpath"));
		 driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(cl.readPropertyValue("url"));

	}
	@AfterMethod
	public void aMethod() {
		driver.quit();
		reports.endTest(test);
	}
	@AfterSuite
	public void amethod() {
		reports.flush();
	}
	

}
