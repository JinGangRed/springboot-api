package com.lover.entity.req;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

/**
 * @Description: TODO
 * @Author: Keen
 * @Date: 2022/11/13
 * @Version: 1.0
 */
@Getter
@Setter
public class LoginByPasswordReq {

    @NotBlank(message = "用户名不能为空")
    private  String account;

    @NotBlank(message = "密码不能为空")
    private  String password;

    private boolean rememberMe;

}
