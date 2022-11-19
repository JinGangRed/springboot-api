package com.lover.infrastructures.service.exception.auth;

import com.lover.infrastructures.service.exception.EntityNotFoundException;

/**
 * @Description: TODO
 * @Author: Keen
 * @Date: 2022/11/13
 * @Version: 1.0
 */
public class UserNotFoundException extends AuthenticationException {

    public UserNotFoundException(String userName, String message) {
        super(userName, message);
    }
}
