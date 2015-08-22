package com.hl.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ClientTest {

	public static void main(String[] args) {
 
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/bean.xml");
		Chinese chinese = (Chinese) ctx.getBean("CHINESE");
		chinese.eat();
		chinese.walk();
		chinese.sleep();
		
		//Person person = (Person) ctx.getBean("PERSON");
		Person person = chinese.getPersonBseInfo();
		System.out.println(person.getName());
		System.out.println(person.getSex());
		System.out.println(person.getAge());
		System.out.println(person.getId());
		System.out.println(person.getAddress());
		System.out.println(person.getTelphone());
		System.out.println(person.getSets());
		System.out.println(person.getProperties());
	 
		
		Constructor constructor = chinese.getConstructor();
		System.out.println(constructor.getI());
		System.out.println(constructor.getStr());
		System.out.println(constructor.getList());
		System.out.println(constructor.getMaps());
		System.out.println(constructor.getSets());
		System.out.println(constructor.getProperties());
		
		
	}

}
