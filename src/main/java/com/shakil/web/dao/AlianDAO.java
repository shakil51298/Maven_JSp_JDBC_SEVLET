package com.shakil.web.dao;

import java.sql.*;
import com.shakil.web.model.AlianData;

// Data Access Object
public class AlianDAO {
	
	
	
	public AlianData getAlian(int id) {
		AlianData alian = new AlianData() ;
		
			
		// mySql connect method ; 
		
		try {
			String url = "jdbc:mysql://localhost:3306/login";
			String db_uname = "root";
			String db_password = "";
			
			Class.forName("com.mysql.jdbc.Driver") ;
			Connection conn = DriverManager.getConnection(url, db_uname ,db_password ) ; 
			Statement st = conn.createStatement() ; 
			ResultSet rs = st.executeQuery("select * from dumydata where id=" + id) ; 
			if (rs.next()) {
				alian.setId(rs.getInt("id"));
				alian.setAname(rs.getString("aname"));
				alian.setCompany(rs.getString("company"));
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return alian ; 
	}
}
