package com.wipro.springrest.dto;

public class PassengerDTO {
	private int pid;
	private String pname;
	private String email;
	public PassengerDTO() {
		super();
	}
	public PassengerDTO(int pid, String pname, String email) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.email = email;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "PassengerDTO [pid=" + pid + ", pname=" + pname + ", email=" + email + "]";
	}
	
	

}
