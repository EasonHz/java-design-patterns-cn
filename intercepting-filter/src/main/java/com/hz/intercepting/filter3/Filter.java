package com.hz.intercepting.filter3;

/**
 * @author hz
 * @since 2022/10/12
 */
public interface Filter {
    /**
     * 过滤方法
     *
     * @param request 请求
     */
    void execute(String request);
}