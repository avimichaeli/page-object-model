package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Google_search_page {
	
	
	WebDriver driver;

	public Google_search_page(WebDriver driver) {
		this.driver=driver;
	}
	
	By searchbox = By.xpath("//input[@name='q']");
	By search_btn = By.xpath(("(//input[@name='btnk'])[1]"));
	By facebook_link = By.xpath("//a//h3[text()='facebook - Log In or Sign Up']");
	
	
	
	public void searchgoogle( String searchinput ) // throws InterruptedException //
	{
		
		try {
			driver.findElement(searchbox).sendKeys(searchinput);
			driver.findElement(search_btn).click();
		} catch( Exception e ) {
			System.out.println("exeption caught " + e.getMessage());
		}
	}
		
		public void ClickFacebook() {
			try {
				driver.findElement(facebook_link).click();
				Thread.sleep(2000);
			}	catch(Exception e) {
				System.out.println("Excwption caught" + e.getMessage());
			}
			
			
		
		
		
		
		// driver.findElement(searchbox).sendKeys(searchinput); //
      	// 	Thread.sleep(5000); //
		
	}
	
	
	

}
