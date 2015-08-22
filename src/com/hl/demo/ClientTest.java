package com.hl.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ClientTest {

	public static void main(String[] args) {
		/*
		Human human = null;
		human = new Factory().getHuman(Factory.CHINESE);
		human.eat();
		human.walk();
		human = new Factory().getHuman(Factory.AMERICAN);
		human.eat();
		human.walk();
		*/
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/bean.xml");
		Chinese chinese = (Chinese) ctx.getBean("CHINESE");
		American american = (American) ctx.getBean("AMERICAN");
		chinese.eat();
		chinese.walk();
	}

}
