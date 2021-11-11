package vtigertestscripts;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test3 {
	@Test
	public void Test3() throws InterruptedException   {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Bala Venkat Reddy\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[text()='Contacts'])[1]")).click();
		driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
		WebElement dropdown = driver.findElement(By.name("salutationtype"));
		
		Select s=new Select(dropdown);
		s.selectByVisibleText("Mr.");
		driver.findElement(By.name("firstname")).sendKeys("abc");
		driver.findElement(By.name("lastname")).sendKeys("xyz");
		//driver.findElement(By.xpath("(//img[@language='javascript'])[1]")).click();
		driver.findElement(By.xpath("(//img[@title='Select'])[1]")).click();
		Thread.sleep(3000);

	String parent = driver.getWindowHandle();

	Set<String> child = driver.getWindowHandles();
	child.remove(parent);
	for(String b:child)
	{
		driver.switchTo().window(b);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Wipro']")).click();
	}

	driver.switchTo().window(parent);
	driver.findElement(By.name("button")).click();

	String title=driver.getTitle();
	SoftAssert st=new SoftAssert();
	st.assertEquals(title,"Administrator - Contacts - vtiger CRM 5 - Commercial Open Source CRM");
	st.assertAll();
	 driver.navigate().refresh();
		WebElement element = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();
		driver.findElement(By.linkText("Sign Out")).click();
	driver.close();


	}
	
}
