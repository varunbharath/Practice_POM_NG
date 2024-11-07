package execution;

import org.testng.annotations.Test;

import basic_setup.Browser_Setup;
import webpage.Logoutpage;
import webpage.Orange_HRM_Login;

import org.testng.annotations.BeforeMethod;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class TestCase_Execution {
	public static WebDriver driver;
	public static Properties prop;
	//object creation for Browser_Setup class
	Browser_Setup setup=new Browser_Setup();
	
	Actions act=new Actions(driver);
	
  @Test
  public void OrangeHRM_Login() {
	 
	  String url=prop.getProperty("urls");
	  String HRM_username=prop.getProperty("HRMUser");
	  String HRMPassword=prop.getProperty("HRM_Pass");
	   driver.get(url);
	 Orange_HRM_Login obj=new Orange_HRM_Login(driver);
	// obj. driver.get(url);
	 
	 driver.get(url);
	 
	 obj.Username.sendKeys(HRM_username);
	 obj.Password.sendKeys(HRMPassword);
	 obj.login.click();
	 
	 
	
  }
  
//  @Test
//  public void loginandlogout()
//  {
//	  String url=prop.getProperty("urls");
//	  String HRM_username=prop.getProperty("HRMUser");
//	  String HRMPassword=prop.getProperty("HRM_Pass");
//	 
//	 Orange_HRM_Login obj=new Orange_HRM_Login();
//	 Logoutpage obj1=new Logoutpage();
//	 driver.get(url);
//	 
//	 obj.Username.sendKeys(HRM_username);
//	 obj.Password.sendKeys(HRMPassword);
//	 obj.login.click();
//	 obj1.Profile.click();
//	 obj1.logut.click();
//	  
//	  
//  }
  @BeforeMethod
  public void beforeMethod() {
	  this.driver=setup.driver;
	  this.prop=setup.prop;
	  
  }

  @AfterMethod
  public void afterMethod() {
	//  driver.close();
  }

}
