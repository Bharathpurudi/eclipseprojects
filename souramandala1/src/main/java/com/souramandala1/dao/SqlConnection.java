package com.souramandala1.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

@Repository
public class SqlConnection {

	public static Connection dbConnection() {
		Connection connection = null;
		try {
			String driverName = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/db2";
			Class.forName(driverName);
			connection = DriverManager.getConnection(url, "root", "Reset123");
			//System.out.println(connection != null ? "connection established" : "connection failed");

		} catch (ClassNotFoundException cnfe) {
			System.out.println("There is no respective jars : " + cnfe.getMessage());
		} catch (SQLException se) {// Catching SQL Exception
			System.out.println("SQL Exception :" + se.getMessage());
		} catch (Exception e) {
			System.out.println(e);
		}

		/*
		 * finally { try { connection.close(); } catch (SQLException e) {
		 * e.printStackTrace(); } }
		 */
		return connection;

	}

}
