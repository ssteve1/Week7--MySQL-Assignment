package projects.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import projects.exception.DbException;

public class DbConnection {
	
	private static String HOST = "localhost";
	private static String PASSWORD = "projects";
	private static int PORT = 3306;
	private static String SCHEMA = "projects";
	private static String USER = "projects";
	
	public static Connection getConnection() {
		String uri = String.format("jdbc:mysql://%s:%d/%s",HOST,PORT,SCHEMA);
		try {
			System.out.println("Connected!");
			return DriverManager.getConnection(uri,USER,PASSWORD);
		} catch (SQLException e) {
			String ErrorMessage = "Connection fails!";
			System.out.println(ErrorMessage);
			throw new DbException(ErrorMessage);
			
					
		}
	}
	

}
