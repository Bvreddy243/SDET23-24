package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage 

{

	WebDriver driver;
	
	@FindBy(xpath="//input[@name='user_name']")
	private WebElement usernameTF;
	
	@FindBy(xpath="//input[@name='user_password']")
	private WebElement passwordTF;
	
	@FindBy(id="submitButton")
	private WebElement submitbtn;
	

	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}


	public WebElement getUsername() {
		return usernameTF;
	}


	public WebElement getPassword() {
		return passwordTF;
	}


	public WebElement getSubmitbtn() {
		return submitbtn;
	}
	
	public HomePage login(String username,String password)
	{
		
		usernameTF.sendKeys(username);
		passwordTF.sendKeys(password);
		submitbtn.click();
		return new HomePage(driver);
	}
	
	
}
