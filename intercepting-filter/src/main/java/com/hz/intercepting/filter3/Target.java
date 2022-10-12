package com.hz.intercepting.filter3;

/**
 * @author hz
 * @since 2022/10/12
 */
public class Target {
    public void execute(String request){
        System.out.println("Executing request: " + request);
    }
}