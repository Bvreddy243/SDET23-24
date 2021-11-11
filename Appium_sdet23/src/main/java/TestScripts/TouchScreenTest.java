package TestScripts;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class TouchScreenTest {

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
		driver.swipe(66,240,830,1467,500);
		driver.swipe(908,195, 53, 1773,500);
		driver.swipe(473,157,488,1601,500);
		driver.swipe(51,921,959,918,500);
		Dimension size=driver.manage().window().getSize();
		int ht = size.getHeight();
		int wd = size.getWidth();
		System.out.println("height of the phone is"+ht);
		System.out.println("width of the phone is"+wd);
		//vertical swipe
		driver.swipe(wd/2,(int)(ht*0.25),wd/2,(int)(ht*0.80),1000);
		//horizontal swipe
		driver.swipe((int)(wd*0.25),ht/2,(int)(wd*0.80),ht/2,1000);
		
}
}
