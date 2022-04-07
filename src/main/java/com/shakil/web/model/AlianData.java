package com.shakil.web.model;

public class AlianData {
	private int id ;
	private String aname ; 
	private String company ;
	// getters and setter 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	// convert to toString
	@Override
	public String toString() {
		return "AlianData [id=" + id + ", aname=" + aname + ", company=" + company + "]";
	}
	
}
