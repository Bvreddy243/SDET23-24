package TestScripts;


import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class RunAppBackGround {
@Test
public void RunAppBackGround() throws Throwable{
	
	DesiredCapabilities dc=new DesiredCapabilities();
	  
	  //Common Dc Android or Ios
	  
	  dc.setCapability("deviceName","motorola one fusion+");
	  dc.setCapability("automationName","appium");
	  dc.setCapability("platformName","Android");
	  dc.setCapability("platformVersion","10");
	  dc.setCapability("UDID","ZF6226M8G8");
	 
	  
	  //DC for Android
	  
	  dc.setCapability("appPackage","io.appium.android.apis");
	  dc.setCapability("appActivity",".ApiDemos");
	 
	  //Android server port no
	  
	URL url=new URL("http://localhost:4723/wd/hub");
	AndroidDriver driver=new AndroidDriver(url,dc);
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 Thread.sleep(3000);
	driver.findElement(By.id("com.android.permissioncontroller:id/continue_button")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("android:id/button1")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
	 Thread.sleep(3000);
	driver.runAppInBackground(20);

}
}
