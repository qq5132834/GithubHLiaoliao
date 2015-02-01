package test;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.hl.database.JDBCConnectMySQL;
import com.hl.database.JdbcTemplateConnectMySQL;

/**
 * 测试jdbc数据库连接方式
 * */
public class testDB {
	
	@Test
	public void jdbcTemplate(){
		
		JdbcTemplate jdbcTemp = JdbcTemplateConnectMySQL.getJdbcTemplate();
		List<Map<String, Object>> lists = jdbcTemp.queryForList("select * from userInfo");
		for(Map<String, Object> map : lists){
			System.out.println("------");
			System.out.println((String)map.get("user")+(String)map.get("name"));
		}
		  
	}
	
	
	
	
	
	
	
	//@Test
	public void tst() throws SQLException{
		Connection conn = JDBCConnectMySQL.getConnection();
		Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from userInfo");
        while (rs.next()) {
        	System.out.println(rs.getString("user"));
        	System.out.println(rs.getString("name"));
        }
        if(conn!=null){conn.close();}
	       
	}
	
}
