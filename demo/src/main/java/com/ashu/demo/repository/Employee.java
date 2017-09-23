package com.ashu.demo.repository;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
@Id
private String id;
private String name;
private String mobile;
public Employee() {
	super();
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
}
