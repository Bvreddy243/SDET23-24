package com.ecom.appium.Genericutils;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.cj.jdbc.Driver;
public class DataBaseUtilites {
  static Connection con=null;
  static ResultSet result=null;
  
  public void ConnectToDB() throws Throwable {
	  Driver driverRef;
	  driverRef=new Driver();
	  DriverManager.registerDriver(driverRef);
	  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projects","root","root");
	  
  }
  public void closeDB() throws Throwable {
	  con.close();
  }
  public static ResultSet executeQuery(String query) throws Throwable {
	  result=con.createStatement().executeQuery(query);
	  return result;
  }
  public static String executeQureyAndGetData(String query,int columnName,String expectedData) throws Throwable {
	  boolean flag=false;
	  result=con.createStatement().executeQuery(query);
	  while(result.next()) {
		  if(result.getString(columnName).equals(expectedData)) {
			  flag= true;
			  break;
		  }
	  }
	  if(flag) {
		  System.out.println(expectedData +"===>data verfied in database table");
		  return expectedData;
	  }
	  else {
		  System.out.println(columnName + "===> data not verified in data base table");
		  return expectedData;
	  }
	
  }
}
