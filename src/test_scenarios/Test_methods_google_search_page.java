package test_scenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import objects.Facebook_page;
import objects.Google_search_page;

public class Test_methods_google_search_page {
	WebDriver driver;
	Google_search_page object_report;
	
	@BeforeTest
	public void beforetest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(0,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	}
	
	
	@Test
	public void searchoperation() throws InterruptedException {
		Google_search_page page = new Google_search_page(driver);
		page.searchgoogle("facebook");	
	}
	
	
	@Test
	public void verifyandaccessfacebook() {
		object_report = new Google_search_page(driver);
		object_report.ClickFacebook();
	}
	
	@Test
	public void verifylogin() {
		Facebook_page page = new Facebook_page(driver);
		page.EnterUsername();
		page.Enterpassword();
		page.verifylogin();
	}
	
	
	@AfterTest
	public void aftertest() {
		driver.quit();
	}
	
	

}
