package com.souramandala1.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.souramandala1.config.OrderConfig;
import com.souramandala1.config.ServiceImplConfig;
import com.souramandala1.exception.OrderException;
import com.souramandala1.model.OrderModel;
import com.souramandala1.service.OrdersServiceImpl;

@RestController
public class OrderController {
	
	ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ServiceImplConfig.class);
	OrdersServiceImpl ordersServiceImpl = applicationContext.getBean(OrdersServiceImpl.class);
	ApplicationContext orderModelContext = new AnnotationConfigApplicationContext(OrderConfig.class);
	
	@PostMapping(value="/createorder")
	public String postOrderDetails(@RequestBody OrderModel model) {
		String temp="";
		try {
			temp =  ordersServiceImpl.createOrder(model);
		} catch (OrderException e) {
			e.printStackTrace();
		}
		return temp;
	}
	
	@GetMapping(value="getorderbyid/{orderId}")
	public OrderModel getOrderDetailsByOrderId(@PathVariable String orderId) {
		OrderModel orderModel = orderModelContext.getBean(OrderModel.class);
		try {
			orderModel= ordersServiceImpl.readOrderByOrderId(orderId);
		} catch (OrderException e) {
			e.printStackTrace();
		}
		return orderModel;
	}
	
	@PutMapping(value="/updateorder/{orderId}")
	public String updateTheOrderDetails(@PathVariable String orderId,@RequestBody OrderModel model) {
		String temp="";
		try {
			temp = ordersServiceImpl.updateOrder(orderId, model);
		} catch (OrderException e) {
			e.printStackTrace();
		}
		return temp;
	}

}
