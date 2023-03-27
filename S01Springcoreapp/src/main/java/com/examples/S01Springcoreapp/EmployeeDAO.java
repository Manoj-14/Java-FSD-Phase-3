package com.examples.S01Springcoreapp;

public class EmployeeDAO {
	private String dbserver;
	private String dbport;
	private String dbuser;
	private String dbpassword;

	public EmployeeDAO(String dbserver, String dbport, String dbuser, String dbpassword) {
		this.dbserver = dbserver;
		this.dbport = dbport;
		this.dbuser = dbuser;
		this.dbpassword = dbpassword;
	}

	@Override
	public String toString() {
		return "EmpoloyeeDAO [dbserver=" + dbserver + ", dbport=" + dbport + ", dbuser=" + dbuser + ", dbpassword="
				+ dbpassword + "]";
	}

}
