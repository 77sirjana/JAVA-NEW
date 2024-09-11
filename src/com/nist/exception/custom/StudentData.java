package com.nist.exception.custom;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentData {
	PreparedStatement ps = null;

	public void deleteData(int id) {
		String sql = "Delete from students where id=?";
		try {
			ps = DbConnection.getConnection().prepareStatement(sql);
		    ps.setInt(1, id);
		    ps.executeUpdate();
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	public void getData() {
		try {
			String sql = "Select * from students";
			ps = DbConnection.getConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				int id = rs.getInt("id");
                String name = rs.getString("name");
                String address = rs.getString("address");
                long contact = rs.getLong("contact");
                String gender = rs.getString("gender");
                System.out.println("Id: " + id + ", Name: " + name + ", Address: " + address + ",contact:" + contact + ",gender:" + gender );
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
	    StudentData studentData = new StudentData();
        studentData.getData();
        studentData.deleteData(1);
        studentData.getData();
	}
}
