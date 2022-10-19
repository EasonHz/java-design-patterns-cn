package com.hz.memento2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hz
 */
public class EmployeeCaretaker {

	protected Map<Integer, Map<String, EmployeeMemento>> mementoHistory = new HashMap<>();

	public void addMemento(int empId, String mementoMessage, EmployeeMemento memento) {
		if (mementoMessage != null && mementoMessage.trim().length() != 0 && memento != null) {
			Map<String, EmployeeMemento> mementoMessageMap = mementoHistory.computeIfAbsent(empId, k -> new HashMap<>());
			mementoMessageMap.put(mementoMessage, memento);
			System.out.printf("员工 '%s' 的信息快照，存储在消息 '%s' 中.\n", memento.getName(), mementoMessage);
		}
	}

	public EmployeeMemento getMemento(int empId, String mementoMessage) {
		EmployeeMemento memento = null;
		if (mementoMessage != null && mementoMessage.trim().length() != 0) {
			Map<String, EmployeeMemento> mementoMessageMap = mementoHistory.get(empId);
			if (mementoMessageMap != null) {
				memento = mementoMessageMap.get(mementoMessage);
				if (memento != null) {
					System.out.printf("已还原员工 '%s' 的信息快照，其中包含消息 '%s' \n", memento.getName(), mementoMessage);
				} else {
					System.err.println("找不到该条备忘录!");
				}
			}
		}
		return memento;
	}

	public void printStoredMementoObjects() {
		System.out.println("======================================================");
		mementoHistory.forEach((empId, mementoMessageMap) -> {
			mementoMessageMap.forEach((message, memento) -> {
				System.out.printf("EmpId: '%d', Message: '%s', Memento: '%s'\n", empId, message, memento);
			});
		});
		System.out.println("======================================================");
	}

}
