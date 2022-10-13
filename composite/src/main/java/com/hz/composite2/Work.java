package com.hz.composite2;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hz
 */
@Data
public class Work {

	private Calculator workType;
	private List<String> work;

	public Work(Calculator workType, List<String> work) {
		super();
		this.workType = workType;
		this.work = work;
	}


	@Override
	public String toString() {
		return "Work [workType=" + workType + ", work=" + work + "]";
	}

}
