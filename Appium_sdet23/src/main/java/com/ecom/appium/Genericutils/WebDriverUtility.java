package com.ecom.appium.Genericutils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class WebDriverUtility {
	static AndroidDriver driver=new AndroidDriver(null);
public static void TapOnElement(AndroidElement element) {
	driver.tap(1,element,1000);
}
public void scrollToElement(AndroidDriver driver, String an, String av) 
{
	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))");
	
}
}
