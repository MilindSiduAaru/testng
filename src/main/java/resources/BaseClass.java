package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public WebDriver driver;
	public WebDriver InitialiseDriver() throws IOException {
		FileInputStream f1= new FileInputStream("E:\\Selenium Demo\\EndToEndDemo\\src\\main\\java\\resources\\Data.properties");
		Properties prop=new Properties();
		prop.load(f1);
		String BrowserName=prop.getProperty("Browser");
		//System.out.println(BrowserName);
		if(BrowserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\Chrome98\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(BrowserName.equals("Firefox")) {
			//firefox code
		} 
		else if(BrowserName.equals("IE")){
			//IE
		}
		return driver;
		
	
	}


}
