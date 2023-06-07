package objects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Facebook_page {
	WebDriver driver;

	public Facebook_page (WebDriver driver) {
		this.driver=driver;
	}
	
	
	By Username_editbox = By.id("email");
	By password_editbox = By.id("pass");
	By Login_btn = By.name("login");
	
	public void EnterUsername() {
		driver.findElement(Username_editbox).clear();
		driver.findElement(Username_editbox).sendKeys("Testuser");
	}
	
	public void Enterpassword() {
		driver.findElement(password_editbox).clear();
		driver.findElement(password_editbox).sendKeys("Tester_password");
	}
	
	public void verifylogin() {
		driver.findElement(Login_btn).click();
		String title = driver.getTitle();
		assertEquals(title,"login_page");
		
	}
	
	
	
}
