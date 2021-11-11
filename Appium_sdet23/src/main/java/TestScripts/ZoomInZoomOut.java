package TestScripts;


import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class ZoomInZoomOut {
@Test
public void ZoomInZoomOut() throws Throwable
{
	
	
	DesiredCapabilities dc=new DesiredCapabilities();
	  
	  //Common Dc Android or Ios
	  
	  dc.setCapability("deviceName","motorola one fusion+");
	  dc.setCapability("automationName","appium");
	  dc.setCapability("platformName","Android");
	  dc.setCapability("platformVersion","10");
	  dc.setCapability("UDID","ZF6226M8G8");
	 
	  
	  //DC for Android
	  
	  dc.setCapability("appPackage","com.davemorrissey.labs.subscaleview.sample");
	  dc.setCapability("appActivity",".MainActivity");
	 
	  //Android server port no
	  
	URL url=new URL("http://localhost:4723/wd/hub");
	AndroidDriver driver=new AndroidDriver(url,dc);
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.findElement(By.id("com.android.permissioncontroller:id/continue_button")).click();
	driver.findElement(By.id("android:id/button1")).click();
	driver.findElement(By.id("com.davemorrissey.labs.subscaleview.sample:id/basicFeatures")).click();
	driver.findElement(By.id("com.davemorrissey.labs.subscaleview.sample:id/imageView")).click();
	WebElement img = driver.findElement(By.id("com.davemorrissey.labs.subscaleview.sample:id/imageView"));
	driver.zoom(img);
	Thread.sleep(1000);
	driver.pinch(img);
	Thread.sleep(1000);

	Thread.sleep(1000);
	driver.closeApp();
	
			
}
}
