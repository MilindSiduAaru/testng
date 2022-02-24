package pageObjectModel;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SignUpObject {
	public WebDriver driver;
	By linkOpen=(By.xpath("//a[@id=\"signup_link\"]"));
	By UsName=(By.xpath("//input[@name=\"UserFirstName\"]"));
	By Lname=(By.xpath("//input[@name=\"UserLastName\"]"));
	By start=(By.xpath("//button[@type=\"submit\"]"));
	By select=(By.xpath("//select[@name=\"UserTitle\"]"));
	By email=(By.xpath("//input[@name=\"UserEmail\"]"));
	By employee=(By.xpath("//select[@name=\"CompanyEmployees\"]"));
	By Cname=(By.xpath("//input[@name=\"CompanyName\"]"));
	By Uphone=(By.xpath("//input[@name=\"UserPhone\"]"));
	By cLick=(By.xpath("//div[@class=\"checkbox-ui\"]"));

	
	public SignUpObject(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement OpenLink() {
		return driver.findElement(linkOpen);
				//return driver.findElement(userN);
	}

	public WebElement EnterUnme() {
		return driver.findElement(UsName);
				//return driver.findElement(userN);
	}

	public WebElement EnterLname() {
		return driver.findElement(Lname);
				//return driver.findElement(userN);
	}

	public WebElement StartTrial() {
		return driver.findElement(start);
				//return driver.findElement(userN);
	}
	public WebElement DropDown() {
		 WebElement S= driver.findElement(By.xpath("//select[@name=\"UserTitle\"]"));
		    Select S21=new Select(S);
		    S21.selectByVisibleText("Customer Service Manager");
		return driver.findElement(select);
		
	}
	public WebElement EnterEmailID() {
		return driver.findElement(email);
		
		
	}
	public WebElement SelectEmployee() {
		WebElement E=driver.findElement(By.xpath("//select[@name=\"CompanyEmployees\"]"));
		Select S20=new Select(E);
		S20.selectByVisibleText("15 - 100 employees");
		return driver.findElement(employee);
		}
	public WebElement EnterCompanyName() {
		return driver.findElement(Cname);
	}
	public WebElement EnterPhoneNumber() {
		return driver.findElement(Uphone);
	}
	public WebElement ClickCheckBox() {
		return driver.findElement(cLick);
	}
	
	
	

}
