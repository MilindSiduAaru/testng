package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjectModel.LoginPageObject1;
import pageObjectModel.SignUpObject;
import resources.BaseClass1;

public class VerifyLogin1_page extends BaseClass1 {
	@Test
	public void LaunchBrowser1() throws IOException, InterruptedException {
		driver=invokeBrowser();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize(); 
		LoginPageObject1 Lp1= new LoginPageObject1(driver);
		Thread.sleep(2000);
		Lp1.EnterUN().sendKeys("Test1");
		Lp1.pass().sendKeys("pass1");
		Lp1.loginClick().click();
		driver.close();
		}
		
		@Test
	
	public void LaunchBrowser2() throws IOException, InterruptedException {
			driver=invokeBrowser();
			driver.get("https://login.salesforce.com/?locale=in");
			driver.manage().window().maximize();
			SignUpObject S1=new SignUpObject(driver);
			S1.OpenLink().click();
			Thread.sleep(2000);
			S1. EnterUnme().sendKeys("Milind");
		
		}

}
