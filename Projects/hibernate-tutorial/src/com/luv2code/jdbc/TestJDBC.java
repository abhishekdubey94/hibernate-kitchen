package com.luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {

	public static void main(String[] args) {
		try {
			String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false&serverTimezone=UTC";
			String user = "hbstudent";
			String pass = "hbstudent";

			System.out.println("Connecting to database:" + jdbcUrl);
			Connection myConnection = DriverManager.getConnection(jdbcUrl, user, pass);
			System.out.println("Connection is successful!!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
