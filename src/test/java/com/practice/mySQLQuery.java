package com.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class mySQLQuery {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
Driver driver=new Driver();

//step1:Register the database
DriverManager.registerDriver(driver);
//step 2:get connection for database
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank1", "root", "root");
//step 3:create statement
Statement state = con.createStatement();
String query = "select * from customer;";
//step 4:Execute  query
ResultSet result = state.executeQuery(query);
while(result.next())
{
		System.out.println(result.getString(1)+" "+result.getString(2)+" "+result.getString(3));
}

con.close();
	}
	

}
