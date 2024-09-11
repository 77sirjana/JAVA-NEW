package com.nist.exception.custom;

import java.sql.PreparedStatement;

public class Test {
	public void saveStudent(String name, String address, long contact , String gender) {
		PreparedStatement ps = null;
		String sql = "INSERT INTO students (name,address,contact,gender) VALUES (?, ?, ?, ?)";
		try {
			ps = DbConnection.getConnection().prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, address);
			ps.setLong(3, contact);
			ps.setString(4, gender);
			ps.executeUpdate();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		Test test = new Test();
		test.saveStudent("Ashish", "Banepa",9848077880L, "Male");
	}
}
