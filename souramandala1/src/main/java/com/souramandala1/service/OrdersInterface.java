package com.souramandala1.service;

import org.springframework.stereotype.Service;

import com.souramandala1.exception.OrderException;
import com.souramandala1.model.OrderModel;

@Service
public interface OrdersInterface {

	public abstract String createOrder(OrderModel order) throws OrderException;

	public abstract OrderModel readOrderByOrderId(String orderId) throws OrderException;

	public abstract String updateOrder(String orderId, OrderModel orderModel) throws OrderException;


}
