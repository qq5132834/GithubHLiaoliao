package com.baobaotao;

public class Office {
	/**
	 *  <bean id="office" class="com.baobaotao.Office">     
	11.        <property name="officeNo" value="002"/>     
	12.    </bean>     
	13.    <bean id="car" class="com.baobaotao.Car" scope="singleton">     
	14.        <property name="brand" value=" 红旗 CA72"/>     
	15.        <property name="price" value="2000"/> 
	 * */
	private String brand = "";
	private String price = "";
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	
}
