package com.souramandala1.model;



import org.springframework.stereotype.Component;

@Component
public class OrderModel {
	private String orderId;
	private String systemSize;
	private int customerId;
	private int price;
	private int advancePaid;
	private int balanceAmount;
	private boolean isEligibleToSubsidy;
	private String dateOfOrder;
	private String dateOfDelivery;
	public OrderModel() {
		super();
	}
	public OrderModel(String orderId, String systemSize, int customerId, int price, int advancePaid, int balanceAmount,
			boolean isEligibleToSubsidy, String dateOfOrder, String dateOfDelivery) {
		super();
		this.orderId = orderId;
		this.systemSize = systemSize;
		this.customerId = customerId;
		this.price = price;
		this.advancePaid = advancePaid;
		this.balanceAmount = balanceAmount;
		this.isEligibleToSubsidy = isEligibleToSubsidy;
		this.dateOfOrder = dateOfOrder;
		this.dateOfDelivery = dateOfDelivery;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getSystemSize() {
		return systemSize;
	}
	public void setSystemSize(String systemSize) {
		this.systemSize = systemSize;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAdvancePaid() {
		return advancePaid;
	}
	public void setAdvancePaid(int advancePaid) {
		this.advancePaid = advancePaid;
	}
	public int getBalanceAmount() {
		return balanceAmount;
	}
	public void setBalanceAmount(int balanceAmount) {
		this.balanceAmount = balanceAmount;
	}
	public boolean isEligibleToSubsidy() {
		return isEligibleToSubsidy;
	}
	public void setEligibleToSubsidy(boolean isEligibleToSubsidy) {
		this.isEligibleToSubsidy = isEligibleToSubsidy;
	}
	public String getDateOfOrder() {
		return dateOfOrder;
	}
	public void setDateOfOrder(String dateOfOrder) {
		this.dateOfOrder = dateOfOrder;
	}
	public String getDateOfDelivery() {
		return dateOfDelivery;
	}
	public void setDateOfDelivery(String dateOfDelivery) {
		this.dateOfDelivery = dateOfDelivery;
	}
	

}
