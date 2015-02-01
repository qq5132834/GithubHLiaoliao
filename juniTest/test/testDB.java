package test;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

import com.hl.databaseJDBC.JDBCConnectMySQL;

/**
 * 测试jdbc数据库连接方式
 * */
public class testDB {
	
	@Test
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
