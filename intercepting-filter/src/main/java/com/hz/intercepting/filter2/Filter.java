package com.hz.intercepting.filter2;

import java.util.List;

/**
 * @author hz
 * @since 2022/10/12
 */
public interface Filter {
    List<Employee> apply(List<Employee> employees);
}
