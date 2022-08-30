package com.souramandala.main;

import com.souramandala.exception.OrderException;
import com.souramandala.model.OrderModel;
import com.souramandala.service.OrdersServiceImpl;

public class OrderMain {

	public static void main(String[] args) throws OrderException {
		OrderModel model = new OrderModel();
		OrdersServiceImpl orderImpl = new OrdersServiceImpl();
		orderImpl.createOrder(model);

	}

}
