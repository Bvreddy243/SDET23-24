package vtigertestscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ecom.appium.Genericutils.FileUtility;
import com.ecom.appium.Genericutils.WebDriverUtilites;
public class Test1 {
	@Test
	public void Test1() throws Throwable {
		WebDriverUtilites wd=new WebDriverUtilites();
		FileUtility fu=new FileUtility();
		String BROWSER=fu.getPropertykeyValue("browser");
		WebDriver driver=null;
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("firefox")) 
		{
			driver=new FirefoxDriver();
			}
		else if(BROWSER.equalsIgnoreCase("IE")) {
			driver=new InternetExplorerDriver();
			}
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("accountname")).sendKeys("IMM");
		driver.findElement(By.xpath("//input[@size='27']")).sendKeys("www.ibm.com");
		driver.findElement(By.id("phone")).sendKeys("12345678");
		Thread.sleep(2000);
		driver.findElement(By.id("fax")).sendKeys("1234@efaxsend.com ");
		Thread.sleep(2000);
		driver.findElement(By.id("email1")).sendKeys("ibm123@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("button")).click();
		driver.findElement(By.xpath("//body[@class='small']")).click();
		
		
		  
	String title=driver.getTitle();
	String expectedtitle="Administrator - Organizations - vtiger CRM 5 - Commercial Open Source CRM";
	SoftAssert s=new SoftAssert();
	s.assertEquals(title,expectedtitle);
		  s.assertAll();
		  
		  driver.navigate().refresh();
			WebElement element = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
			Actions action=new Actions(driver);
			action.moveToElement(element).perform();
			driver.findElement(By.linkText("Sign Out")).click();
			driver.close();
			 }
}

