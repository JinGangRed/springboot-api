package com.lover.infrastructures.service.exception.auth;

/**
 * @Description: TODO
 * @Author: Keen
 * @Date: 2022/11/13
 * @Version: 1.0
 */
public class BadCredentialsException extends AuthenticationException {
    public BadCredentialsException(String userName, String message) {
        super(userName, message);
    }
}
