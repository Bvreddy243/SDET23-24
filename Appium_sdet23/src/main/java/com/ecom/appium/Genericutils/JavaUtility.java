package com.ecom.appium.Genericutils;

import java.util.Date;
import java.util.Random;

public class JavaUtility {
	/*
	 * author BVReddy
	 */
	/**
	 * This method is generate random number to avoid duplicates
	 * @return
	 */
	
public static String getRandomData()
{
	Random random=new Random();
	int ran=random.nextInt(1000);
	return""+ran;
	
}
/**
 * @BVReddy
 * This method is used generate currentdate
 * @return
 */
public static String getCurrentDate()
{
	Date date=new Date();
	String currentdate=date.toString();
	return currentdate;
}
}
