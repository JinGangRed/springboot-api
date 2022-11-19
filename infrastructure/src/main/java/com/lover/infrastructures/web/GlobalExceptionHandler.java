package com.lover.infrastructures.web;

import com.lover.infrastructures.service.exception.EntityNotFoundException;
import com.lover.infrastructures.service.exception.ServiceException;
import com.lover.infrastructures.service.exception.auth.AuthenticationException;
import com.lover.infrastructures.service.exception.auth.BadCredentialsException;
import com.lover.infrastructures.service.exception.auth.UserNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Description: TODO
 * @Author: Keen
 * @Date: 2022/11/13
 * @Version: 1.0
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler{

    @ExceptionHandler(EntityNotFoundException.class)
    public Result<Object> entityNotFoundExceptionHandler(EntityNotFoundException e){
        log.error(e.getMessage());
        return Result.result(ResultCode.ENTITY_NOT_FOUND);
    }

    @ExceptionHandler(AuthenticationException.class)
    public Result<Object> authenticationExceptionHandler(AuthenticationException e){
        log.error(e.getMessage());
        if (e instanceof BadCredentialsException){
            return Result.result(ResultCode.AUTH_FAILED_INVALID_CODE,e.getUserName());
        }
        if (e instanceof UserNotFoundException){
            return Result.result(ResultCode.AUTH_FAILED_INVALID_CODE,e.getUserName());
        }
        return Result.result(ResultCode.AUTH_FAILED,e.getUserName());
    }

    @ExceptionHandler(ServiceException.class)
    public Result<Object> exceptionHandler(ServiceException e){
        log.error(e.getMessage());
        return Result.result(ResultCode.ENTITY_NOT_FOUND);
    }
}
