package com.ecom.appium.Genericutils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.google.common.io.Files;

public class ListenerImpl  implements ITestListener{

	public void onTestStart(ITestResult result) {
	
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		
		String methodName=result.getMethod().getMethodName();
		
		Object obj = result.getInstance();
		WebDriver driver=null;
		try {
		driver=(WebDriver)result.getTestClass().getRealClass().getSuperclass().getDeclaredField("driver").get(obj);
		}
		catch(IllegalArgumentException e) {
			e.printStackTrace();
		}
		catch(IllegalAccessException e) {
			e.printStackTrace();
		}
		catch(NoSuchFieldException e) {
			e.printStackTrace();
		}
		catch(SecurityException e) {
			e.printStackTrace();
		}
			TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/"+methodName+".PNG");
		try {
		Files.copy(src, dest);
		}
        catch(IOException e) {
        	e.printStackTrace();
        }
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	
}

