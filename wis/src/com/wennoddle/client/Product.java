package com.wennoddle.client;

public class Product {
	private String name;
	private String price;
	private String unit;
	private String remark;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Product(String name, String price, String unit, String remark) {
		super();
		this.name = name;
		this.price = price;
		this.unit = unit;
		this.remark = remark;
	}
	
	
	
}
