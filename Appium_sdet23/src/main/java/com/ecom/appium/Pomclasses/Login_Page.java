    package com.ecom.appium.Pomclasses;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.PageFactory;

	import com.gargoylesoftware.htmlunit.javascript.host.media.webkitAudioContext;

	import io.appium.java_client.android.AndroidDriver;
	import io.appium.java_client.android.AndroidKeyCode;
	import io.appium.java_client.pagefactory.AndroidFindBy;
	import io.appium.java_client.pagefactory.AppiumFieldDecorator;

	public class Login_Page 
	{
		
		AndroidDriver driver;
		//@AndroidFindBy(xpath = "//android.widget.TetView[@resource-id='android:1d/text1']")
		@AndroidFindBy(id ="com.androidsample.generalstore:id/spinnerCountry")
		private WebElement countryDD;
		
		@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='com.androidsample.generalstore:id/nameField']")
		private WebElement nameTF;
		
		@AndroidFindBy(xpath="//android.widget.RadioButton[@resource-id='com.androidsample.generalstore:id/radioMale']")
		private WebElement maleRB;
		
		@AndroidFindBy( id= "com.androidsample.generalstore:id/radioFemale")
		private WebElement femaleRB;
		
//		@AndroidFindBy (xpath="//android.widget.Button[@resource-id='com.androidsample.generalstore:id/btnLetsShop']")
//		private WebElement loginBtn;
		
		@AndroidFindBy (id="com.androidsample.generalstore:id/btnLetsShop")
		private WebElement loginBtn;
		
		public void LoginPage(AndroidDriver driver) 
		{
			PageFactory.initElements(new AppiumFieldDecorator(driver),this);		
	      //initElements(driver,this);
		}

		public void LoginPage(WebDriver driver2) {
			// TODO Auto-generated constructor stub
		}

		public WebElement getCountryDD() {
			return countryDD;
		}

		public void setCountryDD(WebElement countryDD) {
			this.countryDD = countryDD;
		}

		public AndroidDriver getDriver() {
			return driver;
		}

		public WebElement getNameTF() {
			return nameTF;
		}

		public WebElement getMaleRB() {
			return maleRB;
		}

		public WebElement getFemaleRB() {
			return femaleRB;
		}

		public WebElement getLoginBtn() {
			return loginBtn;
		}
		
	      public void login() 
		{
			maleRB.click();
			nameTF.sendKeys("name");
			loginBtn.click();
			
		}
		
		public void clickDD() 
		{
			countryDD.click();
		}
		
		public void loginSendValue(String name) 
		{
			femaleRB.click();
			nameTF.sendKeys(name);
			loginBtn.click();
			
		}
		
		public static void scrollToElement(AndroidDriver driver, String an,String av)
		{
			driver.findElementsByAndroidUIAutomator("new UiScrollable (new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))");
		}
		
	}

