package com.hl.demo1;

import org.springframework.beans.factory.annotation.Autowired;

public class Boss {
	
	@Autowired
	private Car car;
	
	@Autowired
	private Office office;

	public Car getCar() {
		return car;
	}

	public Office getOffice() {
		return office;
	}
	
	
	
}
