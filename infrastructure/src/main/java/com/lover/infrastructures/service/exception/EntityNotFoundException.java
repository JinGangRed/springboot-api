package com.lover.infrastructures.service.exception;

/**
 * @Description: TODO
 * @Author: Keen
 * @Date: 2022/11/9
 * @Version: 1.0
 */
public class EntityNotFoundException extends ServiceException {
    public EntityNotFoundException(String message) {
        super(message);
    }

    public EntityNotFoundException(String message, int errorCode) {
        super(message);
    }
}
