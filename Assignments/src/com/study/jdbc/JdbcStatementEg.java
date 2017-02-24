package com.study.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcStatementEg {

	public static void main(String[] args) {
		Connection connection = null;
		
		System.out.println("connecting to database");
		connection = JdbcConnection.getJdbcConnection();
		
		//statementEg(connection);
		
		preparedStatementEg(connection);

		System.out.println("End of the program");
	}

	public static void statementEg(Connection connection) {
		//executing query
		Statement statement = null;
		String sqlQuery = null;
		sqlQuery = "select * from ci";
		try {
			System.out.println("creating sql statement");
			statement = connection.createStatement();
			ResultSet dataFromDb = statement.executeQuery(sqlQuery);
			//iterate the data from result set information
			while (dataFromDb.next()) {
				int ci_id = dataFromDb.getInt("ci_id");
				int ci_type_id = dataFromDb.getInt("ci_type_id");
				String ci_name = dataFromDb.getString("name");
				System.out.println("ci id is : " + ci_id);
				System.out.println("ci type id is : " + ci_type_id);
				System.out.println("ci name is : " + ci_name);
			}
			dataFromDb.close();
			statement.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (statement != null) {
					statement.close();
				}
			} catch (SQLException e2) {
			}
			try {
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void preparedStatementEg(Connection connection) {
		PreparedStatement preparedStatement = null;
		String sqlQuery = null;
		sqlQuery = "select * from ci where ci_type_id=?";
		try {
			preparedStatement = connection.prepareStatement(sqlQuery);
			preparedStatement.setInt(1, 71);
			ResultSet dataFromDb = preparedStatement.executeQuery(sqlQuery);
			while (dataFromDb.next()) {
				int ci_id = dataFromDb.getInt("ci_id");
				int ci_type_id = dataFromDb.getInt("ci_type_id");
				String ci_name = dataFromDb.getString("name");
				
				System.out.println("ci id is : " + ci_id);
				System.out.println("ci type id is : " + ci_type_id);
				System.out.println("ci name is : " + ci_name);
			}
			dataFromDb.close();
			preparedStatement.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
			} catch (SQLException e2) {
			}
			try {
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
