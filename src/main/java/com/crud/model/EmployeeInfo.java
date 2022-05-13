package com.crud.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;



@Entity
public class EmployeeInfo
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int empid;
private String name;
private String address;

	
	public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}


}
