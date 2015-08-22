package com.hl.demo1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJunit {
	
	private static ApplicationContext act ;
	
	static{
		act = new ClassPathXmlApplicationContext("applicatonContext.xml");
		System.out.println("static.aaa");
	}
	
	@Test
	public void ccc(){
		System.out.println("ccc");
		
		Boss boss = (Boss) act.getBean("boss");
		Car car =  boss.getCar();
		if(car!=null){
			String brand = car.getBrand();
			System.out.println(brand);
		}else{
			System.out.println("car is null....");
		}
	}
	
}
