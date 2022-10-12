package com.hz.intercepting.filter3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hz
 * @since 2022/10/12
 */
public class FilterChain {
    private final List<Filter> filters = new ArrayList<>();
    private Target target;

    public void addFilter(Filter filter){
        filters.add(filter);
    }

    public void execute(String request){
        for (Filter filter : filters) {
            filter.execute(request);
        }
        target.execute(request);
    }

    public void setTarget(Target target){
        this.target = target;
    }
}
