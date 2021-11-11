package com.ecom.appium.Genericutils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

public class FileUtility {
   /*
    * author @BVReddy
    */
	/**
	 * This method is used to read data from properties file and return value based on key specified
	 * @param Key
	 * @return
	 * @throws Throwable 
	 */
	 
	public String getPropertykeyValue(String Key) throws Throwable {
	FileInputStream file=new FileInputStream(IPathConstant.PROPERTY_FILEPATH);
	Properties prop=new Properties();
	prop.load(file);
	return prop.getProperty(Key);
}
	/**
	 * This method will return jsonvalue based on jsonkey
	 * @param jsonKey
	 * @return
	 * @throws Throwable
	 */
	public String getDataFromJson(String jsonKey) throws Throwable {
		FileReader reader=new FileReader(IPathConstant.JSONFILEPATH);
		JSONParser parser=new JSONParser();
		Object object=parser.parse(reader);
		JSONObject jsonObject =(JSONObject)object;
		String value=jsonObject.get(jsonKey).toString();
		return value;
	}
}
