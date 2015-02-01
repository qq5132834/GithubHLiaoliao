package com.hl.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConnectMySQL {
	public static Connection  getConnection(){
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");     
	        System.out.println("Success loading Mysql Driver!");
	        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/githubliaoliaoprojectmysql","root","root");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("JDBC方式连接MySQL数据库失败");
			conn = null;
		}
		return conn;
	}
}
