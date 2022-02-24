package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class LoginPageObject  {
	public WebDriver driver;
	By Username=(By.xpath("//input[@id=\"username\"]"));
	By Password=(By.xpath("//input[@id=\"password\"]"));
	By Login=(By.xpath("//input[@id=\"Login\"]"));
	
	
	
	
	
	public LoginPageObject(WebDriver driver2) {
		this.driver=driver2;
	}
	public WebElement EnterUserName() {
	 return	driver.findElement( Username);
		
	}
	public WebElement EnterPassword() {
		 return	driver.findElement(Password);
			
		}
	public WebElement ClickLogin() {
		 return	driver.findElement(Login);
			
		}

}
