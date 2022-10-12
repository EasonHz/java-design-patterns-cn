package com.hz.intercepting.filter2;

import java.util.ArrayList;
import java.util.List;

/**
 * 筛选出男性员工
 *
 * @author hz
 * @since 2022/10/12
 */
public class MaleFilter implements Filter {

    @Override
    public List<Employee> apply(List<Employee> employees) {
        List<Employee> filteredEmployees = new ArrayList<>();
        if (employees != null) {
            for (Employee employee : employees) {
                if (Gender.MALE.equals(employee.getGender())) {
                    filteredEmployees.add(employee);
                }
            }
        }
        return filteredEmployees;
    }
}
