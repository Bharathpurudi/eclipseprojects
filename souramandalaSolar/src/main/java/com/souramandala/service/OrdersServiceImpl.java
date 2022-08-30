package com.souramandala.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.souramandala.dataaccessingobject.OrdersDao;
import com.souramandala.exception.OrderException;
import com.souramandala.model.OrderModel;

public class OrdersServiceImpl implements OrdersDao{
	
	PreparedStatement preparedStatement =null;
	Connection connection = null;

	@Override
	public String createOrder(OrderModel order) throws OrderException {
		String temp = "";
		String insertQuery = "INSERT INTO user_table VALUES(?,?,?,?,?,?,?,?,? )";
		try {
			preparedStatement = connection.prepareStatement(insertQuery);
			preparedStatement.setString(1, order.getOrderId());
			preparedStatement.setString(2, order.getSystemSize());
			preparedStatement.setInt(3, order.getCustomerId());
			preparedStatement.setInt(4, order.getPrice());
			preparedStatement.setInt(5, order.getAdvancePaid());
			preparedStatement.setInt(6, order.getBalanceAmount());
			preparedStatement.setBoolean(7, order.isEligibleToSubsidy());
			preparedStatement.setString(8, order.getDateOfOrder());
			preparedStatement.setString(9, order.getDateOfDelivery());
			
			preparedStatement.executeUpdate();
			temp = "User Details Inserted Successfully";
		} catch (SQLException e) {
			e.getMessage();
			temp = "Error while inserting the data into table";
		}

		return temp;
	}

	@Override
	public OrderModel readOrderByOrderId(String orderId) throws OrderException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateOrder(String orderId, OrderModel orderModel) throws OrderException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderModel getAllOrdersOfCustomer(int customerId) throws OrderException {
		// TODO Auto-generated method stub
		return null;
	}

}
