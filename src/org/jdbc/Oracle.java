package org.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Oracle {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1.Load the driver
		Class.forName("oracle.jdbc.driver.oracleDriver");
		//2.Connection to database
		Connection c=DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1512:Xe", "HR", "HR");
		//3.Write SQL Query
		String s="Select * from employees";
		//4.Prepare the Statement
		PreparedStatement prepareStatement = c.prepareStatement(s);
		//5.Execute Qurey
		ResultSet rs = prepareStatement.executeQuery();
		//6.Iterate the result
		while (rs.next()) {
			String string = rs.getString("First_Name");
			System.out.println(string);
			
		}
	}


}
