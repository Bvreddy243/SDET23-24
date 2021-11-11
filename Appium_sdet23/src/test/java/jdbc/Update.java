package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class Update {
	@Test
public void Update() throws SQLException  {
	Connection con=null;
	
	try {
	//step1:Register the data bsae
		Driver driverref=new Driver();
		DriverManager.registerDriver(driverref);
		//step2:establish connection with database
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customers","root","root");
		//step3:issue create statement
		Statement stat=con.createStatement();
		int result=stat.executeUpdate("insert into customer values('6','RGV','HS','india');");
		if(result==1) {
			System.out.println("customer is created sucessfully");
		}
		else {
			System.out.println("qurey failed");
		}
        }
catch(Exception e)
{
	
		
}
finally {
	con.close();
}
}
}