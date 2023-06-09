package com.manyTomany;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Employee {
	@Id
	private int eid;
	private String ename;

	@ManyToMany
	private List<Project> project;

	public Employee() {

	}

	public Employee(int eid, String ename, List<Project> project) {
		this.eid = eid;
		this.ename = ename;
		this.project = project;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public void setProject(List<Project> project) {
		this.project = project;
	}

	public int getEid() {
		return eid;
	}

	public String getEname() {
		return ename;
	}

	public List<Project> getProject() {
		return project;
	}
}
