package TestScripts;


import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.html5.Location;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;



import io.appium.java_client.android.AndroidDriver;
 
public class GetLocation {
	@Test
	public void Location() throws Throwable {
		
	DesiredCapabilities dc=new DesiredCapabilities();
	  
	  //Common Dc Android or Ios
	  
	  dc.setCapability("deviceName","motorola one fusion+" );
	  dc.setCapability("automationName","appium");
	  dc.setCapability("platformName","Android");
	  dc.setCapability("platformVersion","10");
	  dc.setCapability("UDID","ZF6226M8G8");
	 
	  
	  //DC for Android
	  
	 // dc.setCapability("appPackage","io.appium.android.apis");
	 // dc.setCapability("appActivity",".ApiDemos");
	 
	URL url=new URL("http://localhost:4723/wd/hub");
	AndroidDriver driver=new AndroidDriver(url,dc);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	System.out.println(driver.executeScript("mobile:batteryInfo"));
	driver.setLocation(new Location(49, 123, 10));
	Location loc = driver.location();
	System.out.println(loc);
}
}
