package com.hz.intercepting.filter3;

/**
 * @author hz
 * @since 2022/10/12
 */
public class AuthenticationFilter implements Filter {
    @Override
    public void execute(String request){
        System.out.println("Authenticating request: " + request);
    }
}
