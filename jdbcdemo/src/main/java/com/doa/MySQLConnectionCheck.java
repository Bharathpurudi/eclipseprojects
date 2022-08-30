package com.doa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.model.User;

public class MySQLConnectionCheck {

	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		PreparedStatement preparedStatement = null;
		Scanner input = new Scanner(System.in);
		try {
			String driverName = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/db1";
			Class.forName(driverName);
			connection = DriverManager.getConnection(url, "root", "Reset123");
			System.out.println(connection != null ? "connection established" : "connection failed");
			String readQuery = "SELECT * FROM jdbc_table WHERE user_id=?";
			String readQuery1 = "INSERT INTO jdbc_table VALUES('JASON','daniel@239')";

			/*
			 * statement = connection.createStatement(); resultSet =
			 * statement.executeQuery(readQuery);
			 * 
			 * 
			 * while(resultSet.next()) { System.out.print("Data stored");
			 * 
			 * System.out.print(resultSet.getString("user_name")+" ");
			 * System.out.print(resultSet.getString("password")+" "); System.out.println();
			 * 
			 * }
			 */

			preparedStatement = connection.prepareStatement(readQuery);
			System.out.println("Enter the user id: ");
			int user_input = input.nextInt();
			preparedStatement.setInt(1, user_input);
			resultSet = preparedStatement.executeQuery();
			User user = new User(); // Instantiated new user object
			while (resultSet.next()) {
				user.setUser_id(resultSet.getInt(1)); // converted resultset data to java object
				user.setUser_name(resultSet.getString("user_name"));
				user.setPassword(resultSet.getString("password"));
				/*
				 * System.out.print(resultSet.getInt(1) + " ");
				 * System.out.print(resultSet.getString("user_name") + " ");
				 * System.out.print(resultSet.getString("password") + " ");
				 */
			}
			if (user != null) {
				System.out.println(user.getUser_id());
				System.out.println(user.getUser_name());
				System.out.println(user.getPassword());
			}

		} catch (

		ClassNotFoundException cnfe) {
			System.out.println("There is no respective jars : " + cnfe.getMessage());
		} catch (SQLException se) {// Catching SQL Exception
			System.out.println("SQL Exception :" + se.getMessage());
		} catch (Exception e) {
			System.out.println(e);
		}

		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
