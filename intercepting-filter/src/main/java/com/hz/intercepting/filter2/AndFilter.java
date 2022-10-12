package com.hz.intercepting.filter2;

import java.util.List;

/**
 * @author hz
 * @since 2022/10/12
 */
public class AndFilter implements Filter {

    private final Filter filter;
    private final Filter anotherFilter;

    public AndFilter(Filter filter, Filter anotherFilter) {
        this.filter = filter;
        this.anotherFilter = anotherFilter;
    }

    @Override
    public List<Employee> apply(List<Employee> employees) {
        List<Employee> firstFilteredEmployees = filter.apply(employees);
        List<Employee> secondFilterEmployees = anotherFilter.apply(firstFilteredEmployees);
        return secondFilterEmployees;
    }
}
