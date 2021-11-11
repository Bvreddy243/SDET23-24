package TestScripts;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Swipe {
	@Test
	public void touchscreentest() throws Throwable   {
		 DesiredCapabilities dc=new DesiredCapabilities();
		  
		  //Common Dc Android or Ios
		  
		  dc.setCapability("deviceName","motorola one fusion+");
		  dc.setCapability("automationName","appium");
		  dc.setCapability("platformName","Android");
		  dc.setCapability("platformVersion","10");
		  dc.setCapability("UDID","ZF6226M8G8");
		 
		  
		  //DC for Android
		  
		  dc.setCapability("appPackage","jp.rallwell.siriuth.touchscreentest");
		  dc.setCapability("appActivity",".TouchScreenTestActivity");
		 
		  //Android server port no
		  
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,dc);
		driver.findElement(By.id("jp.rallwell.siriuth.touchscreentest:id/surfaceView")).click();
		Dimension size=driver.manage().window().getSize();
		int ht = size.getHeight();
		int wd = size.getWidth();
		System.out.println("height of the phone is"+ht);
		System.out.println("width of the phone is"+wd);
		//vertical swipe
		driver.swipe(wd/2,(int)(ht*0.25),wd/2,(int)(ht*0.80),1000);
		driver.swipe((int)(wd*0.1),(int)(ht*0.2),(int)(wd*0.1),(int)(ht*0.8),5000);
		driver.swipe((int)(wd*0.5),(int)(ht*0.2),(int)(wd*0.5),(int)(ht*0.8),5000);
		driver.swipe((int)(wd*0.9),(int)(ht*0.2),(int)(wd*0.9),(int)(ht*0.8),5000);
		//horizontal swipe
		driver.swipe((int)(wd*0.25),ht/2,(int)(wd*0.80),ht/2,1000);
		driver.swipe((int)(wd*0.1),(int)(ht*0.8),(int)(wd*0.9),(int)(ht*0.8),5000);
		driver.swipe((int)(wd*0.1),(int)(ht*0.2),(int)(wd*0.9),(int)(ht*0.2),5000);
		driver.swipe((int)(wd*0.),(int)(ht*0.5),(int)(wd*0.9),(int)(ht*0.5),5000);
		
		
}
}
