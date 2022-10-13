package com.hz.composite2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hz
 */
public class Engineer extends Employee {

	private final List<Work> works = new ArrayList<>();

	public Engineer(long employeeId, String employeeName, String designation, Department department) {
		super(employeeId, employeeName, designation, department);
	}

	@Override
	public int teamSize() {
		return 1;
	}

	@Override
	public void assignWork(Employee manager, Work work) {
		this.works.add(work);
		System.out.println(this + " has assigned work of '" + work + "' by manager " + manager);
	}

	@Override
	public void performWork() {
		System.out.println(this + " is performing work of '" + works + "'");
		works.forEach(work -> work.getWork().forEach(value -> {
			Calculator calculator = work.getWorkType();
			System.out.println(this + " has result of work of '" + work + "' as : " + calculator.calculate(value));
		}));
		works.clear();
	}

}
