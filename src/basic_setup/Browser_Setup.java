package basic_setup;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.FileInputStream;

import  java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;


public class Browser_Setup {
	public static WebDriver driver;
	public static Properties prop;
	
	static {
		System.setProperty("webdriver.chrome.driver", "C:\\Qtree_Selenium\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
 
		// System.setProperty("webdriver.chrome.driver", "C:\\Qtree_Selenium\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		//	driver= new ChromeDriver();
		try {
			File f= new File("C:\\Users\\kumar\\eclipse-workspace\\Beta\\inputs.properties");
			FileInputStream fis= new FileInputStream(f);
			
			prop=new Properties();
			prop.load(fis);
		//	System.out.println(prop.getProperty("C:\\Users\\kumar\\eclipse-workspace\\Beta\\inputs.properties"));
			}
			catch (Exception e) {
				// TODO: handle exception
				
			}}}