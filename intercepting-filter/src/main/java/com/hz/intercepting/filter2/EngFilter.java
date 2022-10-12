package com.hz.intercepting.filter2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 筛选出工程师
 *
 * @author hz
 * @since 2022/10/12
 */
public class EngFilter implements Filter {

    @Override
    public List<Employee> apply(List<Employee> employees) {
        List<Employee> filteredEmployees = new ArrayList<>();
        if (employees != null) {
            filteredEmployees.addAll(employees.stream().filter(employee -> Deptt.ENG.equals(employee.getDepttName()))
                    .collect(Collectors.toList()));
        }
        return filteredEmployees;
    }
}