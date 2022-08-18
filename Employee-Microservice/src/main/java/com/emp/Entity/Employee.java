package com.emp.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;

@Entity
public class Employee {
	
	private Long eId;
	private String name;
	private String email;
	List<Records> records=new ArrayList<>();
	
	public Long geteId() {
		return eId;
	}
	public void seteId(Long eId) {
		this.eId = eId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Records> getRecords() {
		return records;
	}
	public void setRecords(List<Records> records) {
		this.records = records;
	}
	public Employee(Long eId, String name, String email, List<Records> records) {
		super();
		this.eId = eId;
		this.name = name;
		this.email = email;
		this.records = records;
	}
	public Employee() {
		super();
	}
	public Employee(Long eId, String name, String email) {
		super();
		this.eId = eId;
		this.name = name;
		this.email = email;
	}

}
