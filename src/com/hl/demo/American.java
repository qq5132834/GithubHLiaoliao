package com.hl.demo;

public class American implements Human{

	@Override
	public void eat() {
		System.out.println("美国人主要以面包为主");
	}

	@Override
	public void walk() {
		System.out.println("美国人以车代步，有四肢退化的趋势");
	}

}
