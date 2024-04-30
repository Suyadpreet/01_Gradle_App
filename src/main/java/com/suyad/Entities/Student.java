package com.suyad.Entities;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Student 
{
	private Integer Id;
	private String name;
	private String branch;
	/*
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	*/
}
