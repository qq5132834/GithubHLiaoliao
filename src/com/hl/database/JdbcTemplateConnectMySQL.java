package com.hl.database;

import javax.servlet.ServletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class JdbcTemplateConnectMySQL {
	/**
	 * 寻找上下文.xml文件的3个路径：
	 * 1：(常用)类路径ClassPathXmlApplicationContext；
	 * 2：（极少用）FileSystemXmlApplicationContext：利用文件系统中的XMl文件来载入Bean
	 * 3: (极少用)XmlWebApplicationContext：从Web系统中的XML文件来载入Bean定义的信息
	 * 4: （常用）在jsp中直接调用此方法时可以使用此WebApplicationContextUtils.getWebApplicationContext()的方法
	 * */
	public static JdbcTemplate getJdbcTemplate(){
		ApplicationContext  ctx = new ClassPathXmlApplicationContext("  ");
		JdbcTemplate jdbcTemp = (JdbcTemplate) ctx.getBean("jdbcTemplate");
		return jdbcTemp;
	} 
	
	/**
	 * jsp web use this method
	 * */
	public static JdbcTemplate getJdbcTemplateWeb(){
		ApplicationContext  ctx = new ClassPathXmlApplicationContext("com/hl/resources/applicationContext-jdbcTemplate.xml");
		JdbcTemplate jdbcTemp = (JdbcTemplate) ctx.getBean("jdbcTemplate");
		return jdbcTemp;
	}
	
	/**
	 * jsp web use this method
	 * */
	public static JdbcTemplate getJdbcTemplateWeb2(ServletContext application){
		ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(application);
		JdbcTemplate jdbcTemp = (JdbcTemplate) ctx.getBean("jdbcTemplate");
		return jdbcTemp;
	}
}
