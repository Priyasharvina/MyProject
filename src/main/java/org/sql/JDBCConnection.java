package org.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCConnection {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "Priyariya@27");
		 String query = "Select * from Employees";
		 PreparedStatement prepareStatement = connection.prepareStatement(query);
		 ResultSet executeQuery = prepareStatement.executeQuery();
		while(executeQuery.next()) {
			String string = executeQuery.getString("first_name");
			System.out.println(string);	
			
			String string1 = executeQuery.getString("Salary");
			System.out.println(string1);	
		}
		
		
		
		connection.close();
		
	}

}
