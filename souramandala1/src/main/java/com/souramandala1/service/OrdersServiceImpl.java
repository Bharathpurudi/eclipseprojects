package com.souramandala1.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import com.souramandala1.config.OrderConfig;
import com.souramandala1.dao.SqlConnection;
import com.souramandala1.exception.OrderException;
import com.souramandala1.model.OrderModel;
@Service
public class OrdersServiceImpl implements OrdersInterface{
	
	PreparedStatement preparedStatement =null;
	ResultSet resultSet=null;
	Connection connection = SqlConnection.dbConnection();
	ApplicationContext applicationContext = new AnnotationConfigApplicationContext(OrderConfig.class);
	

	@Override
	public String createOrder(OrderModel order) throws OrderException {
		String temp = "";
		String insertQuery = "INSERT INTO order_table VALUES(?,?,?,?,?,?,?,?,? )";
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
			temp = "Order Details Inserted Successfully";
		} catch (SQLException e) {
			e.getMessage();
			temp = "Error while inserting the data into table";
		}

		return temp;
	}

	@Override
	public OrderModel readOrderByOrderId(String orderId) throws OrderException {
		String readOrderQuery="SELECT * FROM order_table WHERE order_id=?";
		OrderModel orderModel = applicationContext.getBean(OrderModel.class);
		try {
			preparedStatement = connection.prepareStatement(readOrderQuery);
			preparedStatement.setString(1, orderId);
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				orderModel.setOrderId(resultSet.getString(1));
				orderModel.setSystemSize(resultSet.getString(2));
				orderModel.setCustomerId(resultSet.getInt(3));
				orderModel.setPrice(resultSet.getInt(4));
				orderModel.setAdvancePaid(resultSet.getInt(5));
				orderModel.setBalanceAmount(resultSet.getInt(6));
				orderModel.setEligibleToSubsidy(resultSet.getBoolean(7));
				orderModel.setDateOfOrder(resultSet.getString(8));
				orderModel.setDateOfDelivery(resultSet.getString(9));
			}
			
		}catch (SQLException e) {
			e.getMessage();
		}
		
		return orderModel;
	}

	@Override
	public String updateOrder(String orderId, OrderModel orderModel) throws OrderException {
		String temp = "";
		String updateQuery = "UPDATE order_table SET system_size= ? , price_of_system = ? , advance_paid = ? , balance_amount = ? , date_of_order = ? ,date_of_delivery=? WHERE order_id = ?";
		try {
			preparedStatement = connection.prepareStatement(updateQuery);
			preparedStatement.setString(1, orderModel.getSystemSize());
			preparedStatement.setInt(2, orderModel.getPrice());
			preparedStatement.setInt(3, orderModel.getAdvancePaid());
			preparedStatement.setInt(4, orderModel.getBalanceAmount());
			preparedStatement.setString(5, orderModel.getDateOfOrder());
			preparedStatement.setString(6, orderModel.getDateOfDelivery());
			preparedStatement.setString(7, orderId);
			preparedStatement.executeUpdate();
			temp = "Order Details Updated Successfully";
		} catch (SQLException e) {
			e.getMessage();
			temp = "There is an error while updating";
		}

		return temp;
	}

	

}
