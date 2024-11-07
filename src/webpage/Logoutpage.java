package webpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logoutpage {
	public static WebDriver driver;
	
 public	Logoutpage(){
	
	this.driver=driver;
	PageFactory.initElements(driver, this);
		
	}
//logout
	@FindBy(xpath = "(//img[@alt='profile picture'])[1]")
	public WebElement Profile;
	@FindBy(xpath = "//a[text()='Logout']")
	public WebElement logut;
	
	//leave
	@FindBy(xpath = "//span[text()='Leave']")
	public WebElement leave;

}
