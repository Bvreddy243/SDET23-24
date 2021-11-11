package TestScripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Notifications {
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
		  
		  dc.setCapability("appPackage","io.appium.android.apis");
		  dc.setCapability("appActivity",".ApiDemos");
		 
		  //Android server port no
		  
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,dc);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.id("com.android.permissioncontroller:id/continue_button")).click();
		driver.findElement(By.id("android:id/button1")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"App\"]")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Notification\"]")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"IncomingMessage\"]")).click();
		driver.findElement(By.id("io.appium.android.apis:id/notify_app")).click();
		//open notfication
		driver.openNotifications();
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView")).click();
	
}
}
