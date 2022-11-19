package com.lover.infrastructures.service.exception;

/**
 * @Description: TODO
 * @Author: Keen
 * @Date: 2022/11/13
 * @Version: 1.0
 */
public class EntityAlreadyExistException extends ServiceException{
    public EntityAlreadyExistException(String message) {
        super(message);
    }
}
