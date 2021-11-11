package TestScripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class GenralMarket {
	@Test
	public void AppDemo() throws MalformedURLException, InterruptedException {
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
		driver.findElement(By.id("com.androidsample.generalstore:id/splashscreen")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("android:id/text1")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[10]")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("BVREDDY");
		driver.findElement(By.id("com.androidsample.generalstore:id/radioMale")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		
		
}
}
