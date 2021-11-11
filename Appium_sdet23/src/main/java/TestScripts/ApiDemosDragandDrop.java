package TestScripts;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class ApiDemosDragandDrop {
	static AndroidDriver driver;
	@Test
	public void AppDemo() throws MalformedURLException, InterruptedException {
		 DesiredCapabilities dc=new DesiredCapabilities();
		  
		  //Common Dc Android or Ios
		  
		  dc.setCapability("deviceName","motorola one fusion+" );
		  dc.setCapability("automationName","appium");
		  dc.setCapability("platformName","Android");
		  dc.setCapability("platformVersion","10");
		  dc.setCapability("UDID","ZF6226M8G8");
		 
		  
		  //DC for Android
		  
		  dc.setCapability("appPackage","io.appium.android.apis");
		  dc.setCapability("appActivity",".ApiDemos");
		 
		  //Android server port no
		  
		URL url=new URL("http://localhost:4723/wd/hub");
		
		 driver = new AndroidDriver(url,dc);
		driver.findElement(By.id("com.android.permissioncontroller:id/continue_button")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("android:id/button1")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Drag and Drop\"]")).click();
		WebElement ele = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
		WebElement ele1 = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_2"));
		
		
		TouchAction action = new TouchAction(driver);
		
		action.longPress(ele).moveTo(ele1).release().perform();
	}
	public static void TapOnElement(WebElement ele) 
	{
	
		driver.tap(1,ele,1000);
	}
}
