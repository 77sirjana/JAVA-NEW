package com.nist.exception.custom;

import java.sql.Connection;
import java.sql.DriverManager;


public class DbConnection {
	public static Connection getConnection() throws Exception {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 return DriverManager.getConnection("jdbc:mysql://localhost/db_java","root","");
	}
}
