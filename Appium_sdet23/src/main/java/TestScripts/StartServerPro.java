package TestScripts;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class StartServerPro {
	 
	public static void main(String[] args) throws Throwable {
		
		
		AppiumDriverLocalService server=AppiumDriverLocalService.buildDefaultService();
		server.start();
			DesiredCapabilities dc=new DesiredCapabilities();
			  
			  //Common Dc for both Android or Ios
			  
			  dc.setCapability("deviceName","motorola one fusion+");
			  dc.setCapability("automationName","appium");
			  dc.setCapability("platformName","Android");
			  dc.setCapability("platformVersion","10");
			  dc.setCapability("UDID","ZF6226M8G8");
			  dc.setCapability("noreset",true);
			  
			  //DC for Android
			  
			  dc.setCapability("appPackage","com.motorola.camera2");
			  dc.setCapability("appActivity","com.motorola.camera.Camera");
			 
			  //Android server port no
			  
			URL url=new URL("http://localhost:4723/wd/hub");
			AndroidDriver driver=new AndroidDriver(url,dc);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			driver.findElementById("com.android.permissioncontroller:id/permission_allow_foreground_only_button").click();
			Thread.sleep(1000);
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
			driver.pressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_MUTE);
			Thread.sleep(3000);
			driver.pressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_DOWN);
			
			Thread.sleep(3000);
			driver.pressKeyCode(AndroidKeyCode.BACK);
			Thread.sleep(3000);
			driver.pressKeyCode(AndroidKeyCode.ENTER);
			Thread.sleep(3000);
			driver.pressKeyCode(AndroidKeyCode.KEYCODE_BRIGHTNESS_UP);
			Thread.sleep(3000);
			driver.pressKeyCode(AndroidKeyCode.KEYCODE_BRIGHTNESS_DOWN);
			Thread.sleep(3000);
			server.stop();
            driver.closeApp();
	}
}
