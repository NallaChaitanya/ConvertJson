package com.sel.json;

import java.util.List;

public class User {

	private String name;
	private int age;
	private Employee employee;
	private List<String> messages;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<String> getMessages() {
		return messages;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public void setMessages(List<String> messages) {
		this.messages = messages;
	}
	
	
}
