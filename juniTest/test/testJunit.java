package test;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hl.demo.Chinese;


public class testJunit {
	
	@Autowired
	private Chinese CHINESE;
	
	@Test
	public void aa(){
		
		if(CHINESE!=null){
			CHINESE.eat();
		}else{
			System.out.println("CHINESE == null...");
		}
	}
	
	//@Test
	public void ss() throws IOException{
		
		Properties prop = new Properties();
		InputStream in = ClassLoader.getSystemResourceAsStream("properties.properties");
		prop.load(in);
		in.close();
		String name = (String) prop.get("name");
		System.out.println(name);
	}
	
 
}
