package com.hl.demo;

public class Chinese implements Human{

	private Person personBseInfo = null;
	private Constructor constructor = null;
	
 	public Constructor getConstructor() {
		return constructor;
	}

	public void setConstructor(Constructor constructor) {
		this.constructor = constructor;
	}

	public Person getPersonBseInfo() {
		return personBseInfo;
	}

	public void setPersonBseInfo(Person personBseInfo) {
		this.personBseInfo = personBseInfo;
	} 

	@Override
	public void eat() {
		System.out.println("中国人对吃很有一套");
	}

	@Override
	public void walk() {
		System.out.println("中国人行如飞");
	}

	@Override
	public void sleep() {
		System.out.println("中国人勤于工作极少睡觉...");
	}

}
