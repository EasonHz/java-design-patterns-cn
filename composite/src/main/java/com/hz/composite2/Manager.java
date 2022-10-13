package com.hz.composite2;

import java.util.ArrayList;
import java.util.List;

/**
 * 经理，一个经理有多个下属
 *
 * @author hz
 */
public class Manager extends Employee {

    /**
     * 下属
     */
    List<Employee> subordinates = new ArrayList<>();

    public Manager(long employeeId, String employeeName, String designation, Department department) {
        super(employeeId, employeeName, designation, department);
    }

    /**
     * 添加下属
     *
     * @param employee 员工
     * @return 是否添加成功
     */
    public boolean addSubordinates(Employee employee) {
        return subordinates.add(employee);
    }

    /**
     * 将员工移除团队
     *
     * @param employee 员工
     * @return 是否成功
     */
    public boolean removeSubordinates(Employee employee) {
        return subordinates.remove(employee);
    }

    @Override
    public int teamSize() {
        return subordinates.stream().mapToInt(Employee::teamSize).sum();
    }

    @Override
    public void assignWork(Employee manager, Work work) {
        System.out.println(this + " has assigned work of '" + work + "' by manager " + manager);
        System.out.println();
        System.out.println(this + " distributing work '" + work + "' to managing-employees..");
        int fromIndex = 0;
        int toIndex = 0;
        int totalWork = work.getWork().size();
        List<String> assignWork;
        while (toIndex < totalWork) {
            for (Employee employee : subordinates) {
                System.out.println("Assigning to " + employee);
                int size = employee.teamSize();
                toIndex = fromIndex + size;
                assignWork = work.getWork().subList(fromIndex, toIndex);
                if (assignWork.isEmpty()) {
                    return;
                }
                employee.assignWork(this, new Work(work.getWorkType(), assignWork));
                fromIndex = toIndex;
            }
            break;
        }
    }

    @Override
    public void performWork() {
        System.out.println(this + " is asking his managing employees to perform assigned work");
        System.out.println();
        subordinates.forEach(Worker::performWork);
        System.out.println();
        System.out.println(this + " has completed assigned work with the help of his managing employees");
        System.out.println();
    }

}
