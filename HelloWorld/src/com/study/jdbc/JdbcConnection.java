package com.study.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcConnection {
	
	static Connection connection = null;
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	private static String JDBC_URL = "jdbc:mysql://localhost/IPcmdb";
	private static String DB_USERNAME = "root";
	private static String DB_PASSWORD = "";

	public static Connection getJdbcConnection() {
		try {
			Class.forName(JDBC_DRIVER);
			connection = DriverManager.getConnection(JDBC_URL, DB_USERNAME, DB_PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}

}
