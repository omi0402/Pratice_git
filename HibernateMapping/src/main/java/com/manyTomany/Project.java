package com.manyTomany;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Project {
	@Id
	private int pid;
	private String pname;

	@ManyToMany(mappedBy = "project")
	private List<Employee> employee;

	public Project() {
		super();

	}

	public Project(int pid, String pname, List<Employee> employee) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.employee = employee;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	public int getPid() {
		return pid;
	}

	public String getPname() {
		return pname;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

}
