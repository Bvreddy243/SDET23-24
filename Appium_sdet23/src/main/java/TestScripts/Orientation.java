package TestScripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class Orientation {
	@Test
	public void OrientationMode() throws MalformedURLException, Throwable {
		DesiredCapabilities dc=new DesiredCapabilities();
		  
		  //Common Dc Android or Ios
		  
		  dc.setCapability("deviceName","motorola one fusion+");
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
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
        ScreenOrientation currentscreenorientation = driver.getOrientation();
        System.out.println(currentscreenorientation);
        Thread.sleep(3000);
        driver.rotate(ScreenOrientation.LANDSCAPE);
        System.out.println(driver.getOrientation());
        driver.rotate(ScreenOrientation.PORTRAIT);
        System.out.println(driver.getOrientation());
        
		
		
		
		
		
	
}
}