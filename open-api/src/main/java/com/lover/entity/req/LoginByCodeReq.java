package com.lover.entity.req;

import javax.validation.constraints.NotBlank;

/**
 * @Description: TODO
 * @Author: Keen
 * @Date: 2022/11/13
 * @Version: 1.0
 */
public class LoginByCodeReq {

    @NotBlank(message = "代码不能为空")
    private  String code;

    private boolean rememberMe;
}
