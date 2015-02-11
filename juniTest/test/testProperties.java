package test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.junit.Test;

public class testProperties {

	@Test
	public void testProperties() throws IOException{
		String fileName="/com/hl/resources/database.properties";//properties文件放在是class类目录下。
		Properties p = new Properties();  
		InputStream in = testProperties.class.getResourceAsStream(fileName);//
		p.load(in);  
		in.close();  
		if(p.containsKey("driver")){  
			String driver = p.getProperty("driver"); 
			System.out.println(driver);
		}  
		if(p.containsKey("url")){  
			String url = p.getProperty("url");  
			System.out.println(url);
		}  
		if(p.containsKey("username")){  
			String username = p.getProperty("username");  
			System.out.println(username);
		}  
		if(p.containsKey("password")){  
			String password = p.getProperty("password");  
			System.out.println(password);
		}

	}
}
