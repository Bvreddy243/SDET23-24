package TestScripts;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import io.appium.java_client.android.AndroidDriver;

public class SelectValueFromDropDown {
	@Test
	public void AppDemo() throws Throwable {
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
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	    driver.findElement(By.id("com.androidsample.generalstore:id/splashscreen")).click();
	    driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
	    scrollToElement(driver,"text","India");
	    driver.findElement(By.xpath("//android.widget.TextView[@text='India']")).click();
	    takeScrrenshot(driver,"General");
	}
	    public static void scrollToElement(AndroidDriver driver,String an,String av)
	    {
	    	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))");
	    }
	    public static String takeScrrenshot(WebDriver driver,String screenshotName) throws Throwable{
	    	String screenshotPath="./screenshot"+screenshotName+".PNG";
	    	TakesScreenshot ts=(TakesScreenshot)driver;
	    	File src=ts.getScreenshotAs(OutputType.FILE);
	    	File dest=new File(screenshotPath);
	    	Files.copy(src, dest);
	    	return screenshotPath;
	    	}
}

