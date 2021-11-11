package webapps;


import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class LoginPage {
@Test
public void TestLoginpage() throws Throwable {
	 DesiredCapabilities dc=new DesiredCapabilities();
	  
	  //Common Dc Android or Ios
	  
	  dc.setCapability("deviceName","motorola one fusion+" );
	  dc.setCapability("automationName","appium");
	  dc.setCapability("platformName","Android");
	  dc.setCapability("platformVersion","10");
	  dc.setCapability("UDID","ZF6226M8G8");
	  dc.setCapability("noReset",true);
	  
	  //Launch browser
	  
	  dc.setCapability("browserName","Chrome");
	  
	 
	  //Android server port no
	  
	URL url=new URL("http://localhost:4723/wd/hub");
	AndroidDriver driver=new AndroidDriver(url,dc);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://m.facebook.com/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@data-sigil='m_login_email']")).sendKeys("manager@facebook.com");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@data-sigil='password-plain-text-toggle-input']")).sendKeys("iidgcidbcil");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@type='button']")).click();
	
}
}
