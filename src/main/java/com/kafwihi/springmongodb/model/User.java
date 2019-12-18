package com.kafwihi.springmongodb.model;

import org.springframework.data.annotation.Id;
public class User {
	@Id
	private String id;
	private String name;
	private String email;
	private String pwd;
	//getters and setters
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getPwd() {
		return pwd;
	}

		public void setId(String id2) {
		this.id = id2;
	}

	public void setName(String id2) {
		this.name = id2;
	}
	public void setEmail(String id2) {
		this.email = id2;
	}
	public void setPwd(String id2) {
		this.pwd = id2;
	}
}