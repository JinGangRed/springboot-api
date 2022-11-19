package com.lover.infrastructures.web;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description: TODO
 * @Author: Keen
 * @Date: 2022/11/8
 * @Version: 1.0
 */
@Data
public class Result<T> implements Serializable {
    private int code;

    private String message;

    private T data;

    public static <T> Result<T> result(int code, String message, T data){
        Result<T> result = new Result<>();
        result.setCode(code);
        result.setMessage(message);
        result.setData(data);
        return result;
    }
    public static <T> Result<T> result(ResultCode resultCode){
        return result(resultCode.getCode(),resultCode.getMessage(),null);
    }
    public static <T> Result<T> result(ResultCode resultCode,T data){
        return result(resultCode.getCode(),resultCode.getMessage(),data);
    }
    public static <T> Result<T> result(ResultCode resultCode,String message,T data){
        return result(resultCode.getCode(),message,data);
    }
}
