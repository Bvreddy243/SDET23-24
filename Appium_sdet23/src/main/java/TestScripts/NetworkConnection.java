package TestScripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.Connection;

public class NetworkConnection {
	@Test
	public void NetworkConnection() throws MalformedURLException, InterruptedException {
		 DesiredCapabilities dc=new DesiredCapabilities();
		  
		  //Common Dc Android or Ios
		  
		  dc.setCapability("deviceName","motorola one fusion+" );
		  dc.setCapability("automationName","appium");
		  dc.setCapability("platformName","Android");
		  dc.setCapability("platformVersion","10");
		  dc.setCapability("UDID","ZF6226M8G8");
		 
		  
		  //DC for Android
		  
		  dc.setCapability("appPackage","com.androidsample.generalstore");
		  dc.setCapability("appActivity",".SplashActivity");
		 
		  //Android server port no
		  
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,dc);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("com.androidsample.generalstore:id/splashscreen")).click();
		Thread.sleep(3000);
		
		
		Connection currentstate=driver.getConnection();
		System.out.println(currentstate);
		
		
		driver.setConnection(Connection.WIFI);
		System.out.println(driver.getConnection());
		Thread.sleep(3000);
		driver.setConnection(Connection.DATA);
		System.out.println(driver.getConnection());
		Thread.sleep(3000);
		driver.setConnection(Connection.AIRPLANE);
		System.out.println(driver.getConnection());
		
		
}
	}

