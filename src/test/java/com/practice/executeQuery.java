package com.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class executeQuery {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		Driver driver=new Driver();

		//step1:Register the database
		DriverManager.registerDriver(driver);
		//step 2:get connection for database
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank1", "root", "root");
		//step 3:create statement
		Statement state = con.createStatement();
String query = "insert into customer values('wer','pune',678),('ert','mysore',789)";
int result = state.executeUpdate(query);
if(result==2)
{
	System.out.println("data is present");
}
else {
	System.out.println("data is not present");

}
con.close();
	}

}
