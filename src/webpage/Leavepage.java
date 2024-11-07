package webpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Leavepage {
public static WebDriver driver;
 public Leavepage(){
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
//leave
	@FindBy(xpath = "//span[text()='Leave']")
	
	public WebElement leave;
}
