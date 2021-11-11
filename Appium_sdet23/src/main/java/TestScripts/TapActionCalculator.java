package TestScripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class TapActionCalculator {
 @Test
 public void TapActionCalculator() throws MalformedURLException
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
	WebElement six = driver.findElement(By.id("com.google.android.calculator:id/digit_6"));
	driver.tap(1, six, 500);
	WebElement plus = driver.findElement(By.id("com.google.android.calculator:id/op_add"));
	driver.tap(1, plus, 500);
	WebElement five = driver.findElement(By.id("com.google.android.calculator:id/digit_5"));
	driver.tap(1, five, 500);
	WebElement equal = driver.findElement(By.id("com.google.android.calculator:id/eq"));
	driver.tap(1, equal, 500);
	String text= driver.findElement(By.id("com.google.android.calculator:id/result_final")).getText();
  System.out.println(text);
   
 }
}
