package TestCases;


import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjectModel.LoginPageObject;
import resources.BaseClass;
//Adding for git Demo
//Adding again for git demo1111
public class VerifyLogin_Page extends BaseClass{
	@Test(dataProvider="getData")
	public void launchBrowser(String Username, String pass) throws IOException  {
		driver=InitialiseDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		String S=driver.getCurrentUrl();
		System.out.println(S);
		LoginPageObject obj=new LoginPageObject(driver);
		obj.EnterUserName().sendKeys(Username);
		obj.EnterPassword().sendKeys(pass);
		obj.ClickLogin().click();
		//driver.close();
	}
	@DataProvider
	public Object[][] getData(){
		Object[][] a1=new Object[2][2];
		a1[0][0]="test1";
		a1[0][1]="pass1";
		a1[1][0]="test2";
		a1[1][1]="pass2";
		return a1;
	}

}
