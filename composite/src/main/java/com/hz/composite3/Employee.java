package com.hz.composite3;

import java.util.ArrayList;
import java.util.List;

/**
 * 该类被当作组合模型类。{@link CompositePatternDemo }使用 {@link Employee} 类来添加部门层次结构，并打印所有员工。
 *
 * @author hz
 * @since 2022/10/13
 */
public class Employee {
    private final String name;
    private final String dept;
    private final int salary;
    private final List<Employee> subordinates;

    /**
     * 构造函数
     */
    public Employee(String name, String dept, int sal) {
        this.name = name;
        this.dept = dept;
        this.salary = sal;
        subordinates = new ArrayList<>();
    }

    /**
     * 添加下属
     *
     * @param e 员工
     */
    public void add(Employee e) {
        subordinates.add(e);
    }

    /**
     * 删除下属
     *
     * @param e 员工
     */
    public void remove(Employee e) {
        subordinates.remove(e);
    }

    /**
     * 获取下属
     */
    public List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public String toString() {
        return ("Employee :[ Name : " + name
                + ", dept : " + dept + ", salary :"
                + salary + " ]");
    }
}