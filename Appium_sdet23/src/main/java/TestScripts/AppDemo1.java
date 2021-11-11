package TestScripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class AppDemo1 {
	@Test
	public void AppDemo1() throws MalformedURLException, InterruptedException {
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
		driver.findElement(By.id("com.android.permissioncontroller:id/continue_button")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("android:id/button1")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Controls\"]")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"2. Dark Theme\"]")).click();
		driver.findElement(By.id("io.appium.android.apis:id/edit")).sendKeys("manager");
		driver.hideKeyboard();
		driver.findElement(By.id("io.appium.android.apis:id/check1")).click();
		driver.findElement(By.id("io.appium.android.apis:id/check2")).click();
		driver.findElement(By.id("io.appium.android.apis:id/radio1")).click();
		driver.findElement(By.id("io.appium.android.apis:id/radio2")).click();
		driver.findElement(By.id("io.appium.android.apis:id/star")).click();
		driver.findElement(By.id("io.appium.android.apis:id/spinner1")).click();
		
		List<WebElement> options = driver.findElements(By.xpath("//android.widget.CheckedTextView[@resource-id='android:id/text1']"));
		for(WebElement element:options)
		{
			System.out.println(element.getText());
		}
		for(int i=1;i<options.size();i++)
		{
			System.out.println(((WebElement) options.get(i)).getText());
		}
		
		
		
		
			
	}
}
