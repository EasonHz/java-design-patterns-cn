package com.hz.composite2;

import lombok.Data;

/**
 * @author hz
 */
@Data
public abstract class Employee implements Worker {

	protected long employeeId;
	protected String employeeName;
	protected String designation;
	protected Department department;

	protected Employee(long employeeId, String employeeName, String designation, Department department) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.designation = designation;
		this.department = department;
	}

	public abstract int teamSize();

	public String fullDetails() {
		return "Employee [" + employeeId + ", " + employeeName + ", " +
				designation + ", " + department + ", Team=" + teamSize() + "]";
	}

	public String shortDetails() {
		return "'" + employeeName + "'";
	}

	@Override
	public String toString() {
		return shortDetails();
	}

}
