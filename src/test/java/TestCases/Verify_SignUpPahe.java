package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageObjectModel.SignUpObject;
import resources.BaseClass;

public class Verify_SignUpPahe extends BaseClass {
	@Test
	
	public void LaunchBrowser2() throws IOException, InterruptedException {
			driver=InitialiseDriver();
			driver.get("https://login.salesforce.com/?locale=in");
			driver.manage().window().maximize();
			SignUpObject S1=new SignUpObject(driver);
			S1.OpenLink().click();
			Thread.sleep(2000);
			S1. EnterUnme().sendKeys("Milind");
			Thread.sleep(2000);
			S1.EnterLname().sendKeys("Shirsat");
			Thread.sleep(2000);
			S1.DropDown();
			Thread.sleep(2000);
			S1.EnterEmailID().sendKeys("Milindp0990@gmail.com");
			Thread.sleep(2000);
			S1.SelectEmployee();
			Thread.sleep(2000);
			S1.EnterCompanyName().sendKeys("Zenith Acsdemy");
			Thread.sleep(2000);
			S1.EnterPhoneNumber().sendKeys("8459739594");
			Thread.sleep(2000);
			S1.ClickCheckBox().click();
			Thread.sleep(2000);
			S1.StartTrial().click();
	
			
		
		}

}
