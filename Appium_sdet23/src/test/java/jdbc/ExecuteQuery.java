package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class ExecuteQuery {
@Test
public void  ExecuteQuery() throws SQLException {
	//step1:Register the data bsae
	Driver driverref=new Driver();
	DriverManager.registerDriver(driverref);
	//step2:establish connection with database
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customers","root","root");
	//step3:issue create statement
	Statement stat=con.createStatement();
	//step4:Execute the query
	ResultSet result=stat.executeQuery("select * from customer;");
	while(result.next()) {
		System.out.println(result.getString(2));
	}
	
}
}
