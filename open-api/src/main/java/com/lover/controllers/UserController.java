package com.lover.controllers;

import com.lover.entity.SecurityUser;
import com.lover.entity.User;
import com.lover.entity.req.CreateUserDetailReq;
import com.lover.entity.req.LoginByCodeReq;
import com.lover.entity.req.LoginByPasswordReq;
import com.lover.infrastructures.service.exception.EntityNotFoundException;
import com.lover.infrastructures.service.exception.ServiceException;
import com.lover.infrastructures.service.exception.auth.AuthenticationException;
import com.lover.service.IUserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Description: 用户接口
 * @Author: Keen
 * @Date: 2022/11/8
 * @Version: 1.0
 */
@Tag(name = "用户信息",description = "用户信息管理")
@RestController
@RequestMapping("/api/open-api/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("/{id}")
    public User get(@PathVariable("id") int userId) throws EntityNotFoundException {
        return userService.get(userId);
    }

    @PostMapping("/login/account")
    public SecurityUser get(@RequestBody LoginByPasswordReq req) throws AuthenticationException {
        return userService.loginByAccount(req.getAccount(),req.getPassword());
    }

    @PostMapping("/login/code")
    public boolean get(@RequestBody LoginByCodeReq req){
        return true;
    }



    @PostMapping("/")
    public SecurityUser create(@RequestBody CreateUserDetailReq req) throws ServiceException{
        User user = userService.create(req.toUser());
        SecurityUser securityUser = new SecurityUser();
        BeanUtils.copyProperties(user,securityUser);
        return securityUser;
    }


}
 