package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject1 {
	public WebDriver driver;
	By userN=(By.xpath("//input[@id=\"username\"]"));
	By passW=(By.xpath("//input[@id=\"password\"]"));
	By loginC=(By.xpath("//input[@id=\"Login\"]"));
	 
	public LoginPageObject1(WebDriver driver2) {
		this.driver=driver2;
	}
	public WebElement EnterUN() {
		return driver.findElement(userN);
		}
	public WebElement pass() {
		return driver.findElement(passW);
		}
	public WebElement loginClick() {
		return driver.findElement(loginC);
		
	}
	/*public WebElement EnterUserName() {
	 return	driver.findElement( Username);
		
	}*/
}
	
	
	
	
	
	
	




