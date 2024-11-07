package webpage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Applyleave {
	public static WebDriver driver;
	public Applyleave() {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	// Apply
	
		@FindBy (xpath = "//a[text()='Apply']")
		public WebElement Apply;
		
		@FindBy (xpath = "//div[@class='oxd-select-text oxd-select-text--active']")
		public WebElement leavetype;
		
		@FindBy(xpath = "//input[@placeholder='yyyy-dd-mm'][1]")
		public WebElement from;
		@FindBy (xpath = "//div[@class='oxd-calendar-dates-grid']//div")
		public List<WebElement> fromdate;
		@FindBy(xpath = "(//input[@placeholder='yyyy-dd-mm'][1])[2]")
		public WebElement to;
		@FindBy (xpath = "//div[@class='oxd-calendar-dates-grid']//div")
		public List<WebElement> todate;
		@FindBy(xpath = "//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']")
		public WebElement Comments;
		@FindBy (xpath = "//button[@type='submit']")
		public WebElement  Applysubmit;
		
		
}
