package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass1 {
	public WebDriver driver;
	public WebDriver invokeBrowser() throws IOException   {
		FileInputStream F2= new FileInputStream("E:\\Selenium Demo\\EndToEndDemo\\src\\main\\java\\resources\\Data1.properties");
		Properties prop1=new Properties();
		prop1.load(F2);
		String BrowName=prop1.getProperty("Browser");
		if(BrowName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver","E:\\Chrome98\\chromedriver.exe");
			 driver=new ChromeDriver();
			
		}
		return driver;
		
	}

}
