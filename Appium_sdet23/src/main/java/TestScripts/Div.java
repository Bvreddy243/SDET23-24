package TestScripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Div {
	@Test
	  public void  Calculator() throws MalformedURLException
	  {
		  DesiredCapabilities dc=new DesiredCapabilities();
		  
		  //Common Dc Android or Ios
		  
		  dc.setCapability("deviceName","motorola one fusion+" );
		  dc.setCapability("automationName","appium");
		  dc.setCapability("platformName","Android");
		  dc.setCapability("platformVersion","10");
		  dc.setCapability("UDID","ZF6226M8G8");
		 
		  
		  //DC for Android
		  
		  dc.setCapability("appPackage","com.google.android.calculator");
		  dc.setCapability("appActivity","com.android.calculator2.Calculator");
		 
		  //Android server port no
		  
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,dc);
		driver.findElement(By.id("com.google.android.calculator:id/digit_8")).click();
		driver.findElement(By.id("com.google.android.calculator:id/op_div")).click();
		driver.findElement(By.id("com.google.android.calculator:id/digit_5")).click();
		driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
		String text= driver.findElement(By.id("com.google.android.calculator:id/result_final")).getText();
	   System.out.println(text);
	    
		
	}
}
