package TestScripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class UninstallAppiumDemos {
	public static void main(String[] args) throws MalformedURLException {
		 DesiredCapabilities dc=new DesiredCapabilities();
		  
		  //Common Dc Android or Ios
		  
		  dc.setCapability("deviceName","motorola one fusion+" );
		  dc.setCapability("automationName","appium");
		  dc.setCapability("platformName","Android");
		  dc.setCapability("platformVersion","10");
		  dc.setCapability("UDID","ZF6226M8G8");
		  
		  URL url=new URL("http://localhost:4723/wd/hub");
			AndroidDriver driver=new AndroidDriver(url,dc); 
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
			
			
			//Uninstall App

			
			System.out.println("App status=" + driver.isAppInstalled("io.appium.android.apis"));
			driver.removeApp("io.appium.android.apis");
}
}
