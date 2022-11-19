package com.lover.infrastructures.service.exception;

import com.lover.infrastructures.web.ResultCode;

/**
 * @Description: TODO
 * @Author: Keen
 * @Date: 2022/11/9
 * @Version: 1.0
 */
public class ServiceException extends Exception {
    public ServiceException(String message) {
        super(message);
    }
}
