package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.baobaotao.Boss;

public class autowired {

	@Test
	public void testAutowired(){
		System.out.println("------");
		ApplicationContext ctx =   new ClassPathXmlApplicationContext("com/hl/resources/applicationContext-jdbcTemplate.xml");
		ApplicationContext ctx1 =   new ClassPathXmlApplicationContext("com/hl/resources/applicationContext-beans.xml");
		//Boss boss = (Boss) ctx.getBean("boss");     
		//System.out.println(boss); 
 
	}
}
