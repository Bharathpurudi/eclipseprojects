package com.souramandala1.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import com.souramandala1.config.CustomerConfig;
import com.souramandala1.dao.SqlConnection;
import com.souramandala1.model.Customer;
import com.souramandala1.model.OrderModel;

@Service
public class CustomerServiceImpl implements CustomerInterface {
	Connection connection = SqlConnection.dbConnection();
	ApplicationContext applicationContext2 = new AnnotationConfigApplicationContext(CustomerConfig.class);
	ResultSet resultSet = null;
	PreparedStatement preparedStatement = null;
	Statement statement = null;

	@Override
	public String createCustomer(Customer customer) {
		String temp = "";
		String insertQuery = "INSERT INTO user_table VALUES(?,?,?,?,?,? )";
		try {
			preparedStatement = connection.prepareStatement(insertQuery);
			preparedStatement.setInt(1, customer.getUserId());
			preparedStatement.setString(2, customer.getUserName());
			preparedStatement.setString(3, customer.getPassword());
			preparedStatement.setString(4, customer.getLocation());
			preparedStatement.setString(5, customer.getMobileNum());
			preparedStatement.setString(6, customer.getMailId());
			preparedStatement.executeUpdate();
			temp = "User Details Inserted Successfully";
		} catch (SQLException e) {
			e.getMessage();
			temp = "Error while inserting the data into table";
		}

		return temp;
	}

	@Override
	public Customer readCustomerById(int userId) {
		String readQuery = "SELECT * FROM user_table WHERE user_id = ?";
		Customer customer = applicationContext2.getBean(Customer.class);
		try {
			preparedStatement = connection.prepareStatement(readQuery);
			preparedStatement.setInt(1, userId);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				customer.setUserId(resultSet.getInt(1));
				customer.setUserName(resultSet.getString(2));
				customer.setPassword(resultSet.getString(3));
				customer.setLocation(resultSet.getString(4));
				customer.setMobileNum(resultSet.getString(5));
				customer.setMailId(resultSet.getString(6));
			}
		} catch (Exception e) {
			e.getMessage();
		}
		return customer;
	}

	@Override
	public Customer readCustomerByName(String userName) {
		String readQuery = "SELECT * FROM user_table WHERE user_name= ?";
		Customer customer = new Customer();
		try {
			preparedStatement = connection.prepareStatement(readQuery);
			preparedStatement.setString(1, userName);
			;
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				customer.setUserId(resultSet.getInt(1));
				customer.setUserName(resultSet.getString(2));
				customer.setPassword(resultSet.getString(3));
				customer.setLocation(resultSet.getString(4));
				customer.setMobileNum(resultSet.getString(5));
				customer.setMailId(resultSet.getString(6));
			}

		} catch (Exception e) {
			e.getMessage();
		}

		return customer;
	}

	@Override
	public String updateCustomer(int userId, Customer customer) {
		String temp = "";
		String updateQuery = "UPDATE user_table SET user_id= ? , user_name = ? , password = ? , location = ? , mobile_num = ? , mail_id=? WHERE user_id = ?";
		try {
			preparedStatement = connection.prepareStatement(updateQuery);
			preparedStatement.setInt(1, customer.getUserId());
			preparedStatement.setString(2, customer.getUserName());
			preparedStatement.setString(3, customer.getPassword());
			preparedStatement.setString(4, customer.getLocation());
			preparedStatement.setString(5, customer.getMobileNum());
			preparedStatement.setString(6, customer.getMailId());
			preparedStatement.setInt(7, userId);
			preparedStatement.executeUpdate();
			temp = "User Details Updated Successfully";
		} catch (SQLException e) {
			e.getMessage();
			temp = "There is an error while updating";
		}

		return temp;

	}

	@Override
	public String deleteCustomer(int userId) {
		String deleteQuery = "DELETE FROM user_table WHERE user_id = ?";
		try {
			preparedStatement = connection.prepareStatement(deleteQuery);
			preparedStatement.setInt(1, userId);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return "Row Deleted Successfully";

	}

	@Override
	public List<OrderModel> getUserOrdersById(int userId) {
		List<OrderModel> ordersList = new ArrayList<OrderModel>();
		String getOrdersQuery = "SELECT * FROM order_table WHERE customer_id=?";
		try {
			preparedStatement = connection.prepareStatement(getOrdersQuery);
			preparedStatement.setInt(1, userId);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				ordersList.add(new OrderModel(resultSet.getString(1), resultSet.getString(2), resultSet.getInt(3),
						resultSet.getInt(4), resultSet.getInt(5), resultSet.getInt(6), resultSet.getBoolean(7),
						resultSet.getString(8), resultSet.getString(9)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ordersList;
	}

}
