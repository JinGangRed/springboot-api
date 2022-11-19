package com.lover.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.lover.entity.SecurityUser;
import com.lover.entity.User;
import com.lover.infrastructures.service.exception.auth.AuthenticationException;
import com.lover.infrastructures.service.exception.auth.BadCredentialsException;
import com.lover.infrastructures.service.exception.auth.UserNotFoundException;
import com.lover.mapper.UserMapper;
import com.lover.service.IUserService;
import com.lover.infrastructures.service.BaseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author Keen
 * @since 2022-11-09
 */
@Service
public class UserServiceImpl extends BaseService<UserMapper, User> implements IUserService {

    @Autowired
    UserMapper mapper;

    /**
     * @param account 登录账户
     * @param password 登录密码
     * @return 登陆的用户信息
     * @throws AuthenticationException 认证异常
     */
    @Override
    public SecurityUser loginByAccount(String account, String password) throws AuthenticationException {
        LambdaQueryWrapper<User> queryWrapper = Wrappers.lambdaQuery(new User())
                .or(qw -> qw.eq(User::getAccount,account));
        User user = mapper.selectOne(queryWrapper);

        if (Objects.isNull(user)){
            throw new UserNotFoundException(account,"用户名未找到");
        }

        if (!StringUtils.equals(user.getPassword(),password)){
            throw new BadCredentialsException(account,"密码不正确");
        }

        SecurityUser securityUser = new SecurityUser();
        BeanUtils.copyProperties(user,securityUser);
        return securityUser;
    }

    /**
     * @param code 登录码
     * @return 登录的用户信息
     * @throws AuthenticationException 认证异常
     */
    @Override
    public SecurityUser loginByCode(String code) throws AuthenticationException {
        return null;
    }
}
