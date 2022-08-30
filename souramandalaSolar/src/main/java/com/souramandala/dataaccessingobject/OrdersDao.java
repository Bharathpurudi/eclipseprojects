package com.souramandala.dataaccessingobject;



import com.souramandala.exception.OrderException;
import com.souramandala.model.OrderModel;

public interface OrdersDao {

	public abstract String createOrder(OrderModel order)throws OrderException;
	public abstract OrderModel readOrderByOrderId(String orderId)throws OrderException;
	public abstract String updateOrder(String orderId, OrderModel orderModel)throws OrderException;
	public abstract OrderModel getAllOrdersOfCustomer(int customerId)throws OrderException;

}
