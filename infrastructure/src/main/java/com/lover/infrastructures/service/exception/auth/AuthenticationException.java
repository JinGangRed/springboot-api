package com.lover.infrastructures.service.exception.auth;

import com.lover.infrastructures.service.exception.ServiceException;
import com.lover.infrastructures.web.ResultCode;
import lombok.Getter;

/**
 * @Description: TODO
 * @Author: Keen
 * @Date: 2022/11/13
 * @Version: 1.0
 */
@Getter
public class AuthenticationException extends ServiceException {

    private final String userName;

    public AuthenticationException(String userName,String message) {
        super(message);
        this.userName = userName;
    }
}
