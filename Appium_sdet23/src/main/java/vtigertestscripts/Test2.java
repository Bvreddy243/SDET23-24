package vtigertestscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.ecom.appium.Genericutils.FileUtility;
import com.ecom.appium.Genericutils.WebDriverUtilites;

public class Test2 {
	@Test
	public void Test2() throws InterruptedException
	{
		WebDriverUtilites wd=new WebDriverUtilites();
		FileUtility fu=new FileUtility();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Bala Venkat Reddy\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
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
		driver.findElement(By.name("accountname")).sendKeys("SSR");
		Thread.sleep(2000);
		WebElement dropdown = driver.findElement(By.name("industry"));
		
		Select s=new Select(dropdown);
		s.selectByVisibleText("Engineering");
		Thread.sleep(2000);
	
		
		driver.findElement(By.xpath("//input[@value='T']")).click();
		Thread.sleep(2000);

		
		
		WebElement dropdown1 = driver.findElement(By.name("assigned_group_id"));
		
		Thread.sleep(2000);
		
		Select s1=new Select(dropdown1);
		s1.selectByVisibleText("Support Group");
		Thread.sleep(3000);
		
		driver.findElement(By.name("button")).click();
		
		 driver.navigate().refresh();
			WebElement element = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
			Actions action=new Actions(driver);
			action.moveToElement(element).perform();
			driver.findElement(By.linkText("Sign Out")).click();
driver.close();		
		
	}
}
