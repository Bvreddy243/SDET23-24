package TestScripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.ecom.appium.Genericutils.FileUtility;

import io.appium.java_client.android.AndroidDriver;

public class LaunchApp {
 
	 @Test
	 public void LaunchApp() throws Throwable {
	 FileUtility file=new FileUtility();
	 String platformName=file.getPropertykeyValue("platformName");
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
 }
}
