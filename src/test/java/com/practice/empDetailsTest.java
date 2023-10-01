package com.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class empDetailsTest {
	
public static void main(String[] args) throws Throwable {
	
	Driver driver=new Driver();
	DriverManager.registerDriver(driver);
	 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank1", "root", "root");
	Statement state = con.createStatement();
	String query="select * from emp;";
	ResultSet result = state.executeQuery(query);
	System.out.println("Enter the name to search in database");
	Scanner sc=new Scanner(System.in);
String empname=sc.next();
 while(result.next())
{
	int i=1;
	if(result.getString(2).equalsIgnoreCase(empname))
	{
		System.out.println(empname+"is already exists");
		break;
	}
	else
	{
		System.out.println(empname+" is not present in database, hence entering the details");
		String query2="insert into emp values("+i+","+empname+");";
		int rslt = state.executeUpdate(query2);
		if(rslt==2)
		{
			System.out.println("details are updated");
		}
		else
		{
			System.out.println("details are not updated");
		}
         i++;
	}
}
con.close();
}
}