package com.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbContext {
		
	public static Connection ConnectDatabase(){
		Connection connection = null;
		
		String url = "jdbc:mysql://localhost:3306/qlsv";
		String user = "root";
		String pass = "";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url,user,pass);
			return connection;
			
		} catch (ClassNotFoundException |SQLException e) {
			System.out.print(e.getMessage());
		}
		return connection;
	}
	
	public static void main(String[] args) {
		if(ConnectDatabase() != null){
			System.out.print("thanh cong");
		}else{
			System.out.print("0 thanh cong");
		}
	}

}
