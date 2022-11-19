package com.lover.entity.req;

import com.lover.entity.User;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * @Description: 创建用户信息请求实体
 * @Author: Keen
 * @Date: 2022/11/13
 * @Version: 1.0
 */
@Setter
@Getter
public class CreateUserDetailReq {

    @NotBlank(message = "账户不为空")
    @Size(min = 6,max = 18,message = "账户长度应在6-18个字符")
    private String account;

    @NotBlank(message = "密码不为空")
    @Size(min = 6,max = 18,message = "密码长度应在6-18个字符")
    private String password;

    @NotBlank(message = "名字不为空")
    @Size(max = 45,message = "名字长度应在45个字符之内")
    private String name;

    @Size(max = 45,message = "账户长度应在6-18个字符")
    private String nickName;

    public User toUser(){
        User user = new User();
        BeanUtils.copyProperties(this,user);
        return user;
    }
}
