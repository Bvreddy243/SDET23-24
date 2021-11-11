package TestScripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class ApiDemosScrollbar {
	@Test
	public void AppDemo1() throws Throwable   {
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
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
	    Thread.sleep(3000);
	    scrollToElement(driver,"text","Lists");
	    driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Lists\"]")).click();
	    Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"08. Photos\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"New photo\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.ImageView")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Clear photos\"]")).click();
		
}

	private void scrollToElement(AndroidDriver driver, String an, String av) {
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))");
		
	}

	}