package TestScripts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import com.ecom.appium.Genericutils.WebDriverUtilites;

public class HomePage extends WebDriverUtilites
{

	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(linkText="Organizations")
	private WebElement orgranizationLink;
	
	@FindBy(linkText="Contacts")
	private WebElement conatctLink;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement adminstratorIMG;
	
	@FindBy(xpath= "//a[text()='Sign Out']")
	private WebElement signOutLink;
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getOrgranizationLink() {
		return orgranizationLink;
	}

	public WebElement getConatctLink() {
		return conatctLink;
	}

	public WebElement getAdminstratorIMG() {
		return adminstratorIMG;
	}

	public WebElement getSignOutLink() {
		return signOutLink;
	}

	public void signOut() 
	{
		// TODO Auto-generated method stub
	
		mouseHover(driver,adminstratorIMG);
	}
}

	
	



