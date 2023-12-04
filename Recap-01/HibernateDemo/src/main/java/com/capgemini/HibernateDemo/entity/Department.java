package com.capgemini.HibernateDemo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {
	
	@Id
	private int depId;
	
	private String depName, depLoc;

	public Department() {
		super();
	}

	public Department(int depId, String depName, String depLoc) {
		super();
		this.depId = depId;
		this.depName = depName;
		this.depLoc = depLoc;
	}

	public int getDepId() {
		return depId;
	}

	public void setDepId(int depId) {
		this.depId = depId;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public String getDepLoc() {
		return depLoc;
	}

	public void setDepLoc(String depLoc) {
		this.depLoc = depLoc;
	}

	@Override
	public String toString() {
		return "Department [depId=" + depId + ", depName=" + depName + ", depLoc=" + depLoc + "]";
	}
	
	
	
}
