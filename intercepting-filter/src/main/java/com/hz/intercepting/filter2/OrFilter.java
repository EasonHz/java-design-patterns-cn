package com.hz.intercepting.filter2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hz
 * @since 2022/10/12
 */
public class OrFilter implements Filter {

    private final Filter filter;
    private final Filter anotherFilter;

    public OrFilter(Filter filter, Filter anotherFilter) {
        this.filter = filter;
        this.anotherFilter = anotherFilter;
    }

    @Override
    public List<Employee> apply(List<Employee> employees) {
        List<Employee> firstFilteredEmployees = filter.apply(employees);
        List<Employee> secondFilterEmployees = anotherFilter.apply(firstFilteredEmployees);
        // now lets make or Filter.
        // first copy all first Filter filtered employees.
        // now add all second Filter filtered employees which are NOT already in the list
        // via first Filter employees.
        List<Employee> orFilteredEmployees = new ArrayList<>(firstFilteredEmployees);
        secondFilterEmployees.removeAll(firstFilteredEmployees);
        orFilteredEmployees.addAll(secondFilterEmployees);
        return orFilteredEmployees;
    }
}

