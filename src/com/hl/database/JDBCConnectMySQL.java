package com.hl.database;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class JDBCConnectMySQL {
	public static Connection  getConnection(){
		String fileName="/com/hl/resources/database.properties";//properties文件放在是class类目录下。
		Connection conn = null;
		try {
			Properties p = new Properties();
			InputStream io = JDBCConnectMySQL.class.getResourceAsStream(fileName);
			p.load(io);
			io.close();
			String driver = p.getProperty("driver");
			String url = p.getProperty("url");
			String username = p.getProperty("username");
			String password = p.getProperty("password");
			
			Class.forName(driver);     
	        System.out.println("Success loading Mysql Driver!");
	        conn = DriverManager.getConnection(url,username,password);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("JDBC方式连接MySQL数据库失败");
			conn = null;
		}
		return conn;
	}
}
