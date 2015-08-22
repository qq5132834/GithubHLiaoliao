package com.hl.demo;

public class Chinese implements Human{

	@Override
	public void eat() {
		System.out.println("中国人对吃很有一套");
	}

	@Override
	public void walk() {
		System.out.println("中国人行如飞");
	}

}
