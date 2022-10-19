package com.hz.memento2;

import lombok.Data;
import lombok.ToString;

/**
 * @author hz
 */
@Data
@ToString
public class EmployeeMemento {

	protected int empId;
	protected String name;
	protected String designation;
	protected long salary;
	protected String department;
	protected String project;

	public EmployeeMemento(int empId, String name, String designation, long salary, String department, String project) {
		super();
		this.empId = empId;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.department = department;
		this.project = project;
	}

}
