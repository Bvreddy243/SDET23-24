package com.drivermethods;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;


public class Android_keyAction {
	@Test
	public void AndroidkeyAction() throws MalformedURLException, Throwable{
		
		
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
		
		System.out.println(AndroidKeyCode.KEYCODE_VOLUME_UP);
		Thread.sleep(3000);
		System.out.println(AndroidKeyCode.KEYCODE_VOLUME_MUTE);
		Thread.sleep(3000);
		System.out.println(AndroidKeyCode.KEYCODE_VOLUME_DOWN);
		Thread.sleep(3000);
		
		System.out.println(AndroidKeyCode.BACK);
		Thread.sleep(3000);
		System.out.println(AndroidKeyCode.ENTER);
		Thread.sleep(3000);
		System.out.println(AndroidKeyCode.KEYCODE_BRIGHTNESS_UP);
		Thread.sleep(3000);
		System.out.println(AndroidKeyCode.KEYCODE_BRIGHTNESS_DOWN);
		Thread.sleep(3000);
		
		System.out.println(AndroidKeyCode.KEYCODE_CAMERA);
		Thread.sleep(3000);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_CAMERA);
		//Send a key event to the device.
		Thread.sleep(3000);
		
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_UP);
		Thread.sleep(3000);
		
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_DOWN);
		
		Thread.sleep(3000);
		driver.pressKeyCode(AndroidKeyCode.BACK);
		Thread.sleep(3000);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_BRIGHTNESS_UP);
		Thread.sleep(3000);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_BRIGHTNESS_DOWN);
		Thread.sleep(3000);
		
		driver.closeApp();
		
		}
	}
