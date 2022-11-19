package com.lover.infrastructures.web;

import lombok.Getter;

/**
 * @Description: TODO
 * @Author: Keen
 * @Date: 2022/11/8
 * @Version: 1.0
 */
public enum ResultCode {

    SUCCESS(100,"操作成功"),
    //region 实体
    ENTITY_NOT_FOUND(404,"实体未找到"),

    //region 认证返回码
    AUTH_FAILED(401,"登录失败"),
    AUTH_FAILED_NO_USER(401001,"没有当前用户"),
    AUTH_FAILED_INVALID_CODE(401002,"认证信息不正确"),
    //endregion

    //endregion


    Fail(999,"操作失败");


    @Getter
    private final int code;
    @Getter
    private final String message;

    ResultCode(int code,String message){
        this.code = code;
        this.message = message;
    }
}
