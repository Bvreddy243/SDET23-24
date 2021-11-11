package com.ecom.appium.Genericutils;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;


/**
 * This method wait for 10sec.
 * @author Bala Venkat Reddy
 *
 */
public class WebDriverUtilites {
public void waitUntilPageLoad(WebDriver driver) {
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}
/**
 * This method wait for the element to be visible.
 * @param driver
 * @param element
 */
public void waitForElementVisibility(WebDriver driver,WebElement element) {
	WebDriverWait wait=new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.visibilityOf(element));
}
/**
 * This method wait for the element to be clicked
 * @param element
 * @throws Throwable
 */
public void waitAndClick(WebElement element) throws Throwable {
	int count=0;
	while(count<40) {
		try {
			element.click();
			break;
		}
		catch(Throwable e)
		{
			Thread.sleep(1000);
			count++;
		}
	}
}
/**
 * this method enables user to handle dropdown using visible text
 * @param element
 * @param option
 */
public void SelectOption(WebElement element,String option) {
	Select select=new Select(element);
	select.selectByVisibleText(option);
	
}
public void SelectOption1(WebElement element,int index) {
	Select select=new Select(element);
	select.selectByIndex(index);
	}
public void SelectOption1(WebElement element,String value) {
	Select select=new Select(element);
	select.selectByValue(value);
}
public void mouseHover(WebDriver driver,WebElement element) {
	Actions act=new Actions(driver);
	act.moveToElement(element).perform();
}
public void doubleClick(WebDriver driver,WebElement element) {
	Actions act=new Actions(driver);
	act.doubleClick(element).perform();;
}
public void rightClick(WebDriver driver,WebElement element) {
	Actions act=new Actions(driver);
	act.contextClick(element).perform();;
}
public void  DragAndDrop(WebDriver driver,WebElement element1,WebElement element2 ) {
	Actions act=new Actions(driver);
act.dragAndDrop(element1, element2).perform();;
}
public void  SwitchToWindow(WebDriver driver,String partialWinTitle) {
	Set<String> window = driver.getWindowHandles();
	Iterator<String> it = window.iterator();
	while(it.hasNext()) {
		String windId=it.next();
		String title=driver.switchTo().window(windId).getTitle();
		if(title.contains(partialWinTitle)) {
			break;
		}
	}
}
public void acceptAlert(WebDriver driver) {
	driver.switchTo().alert().accept();
}
public void dismissAlert(WebDriver driver) {
	driver.switchTo().alert().dismiss();
}
public void DropDown(WebElement element,String text) {
	Select s=new Select(element);
	s.selectByVisibleText(text);
}
public void SwitchFrame(WebDriver driver) {
	driver.switchTo().frame(0);
}
public void BackToFrame(WebDriver driver) {
	driver.switchTo().defaultContent();
}
public void scrollTowebElement(WebDriver driver,WebElement element) {
JavascriptExecutor js=(JavascriptExecutor)driver;
int y=element.getLocation().getY();
js.executeScript("window.scrollBy(0,"+y+")",element);

	
}
public void switchframe(WebDriver driver,int index) {
	driver.switchTo().frame(index);
}
public void switchframe(WebDriver driver,WebElement element) {
	driver.switchTo().frame(element);
}
public void switchframe(WebDriver driver,String idOrName) {
	driver.switchTo().frame(idOrName);
	
}
public String takeScreenshot(WebDriver driver,String screenshotName) throws Throwable {
	String screenshotpath="./screenshot/"+screenshotName+JavaUtility.getCurrentDate()+".PNG";
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File dest=new File(screenshotpath);
	Files.copy(src, dest);
	return screenshotpath;
}
public void pressEnterKey() throws Throwable {
	Robot rc=new Robot();
	rc.keyPress(KeyEvent.VK_ENTER);
	rc.keyPress(KeyEvent.VK_ENTER);
}
}
