package com.lover.service;

import com.lover.entity.SecurityUser;
import com.lover.entity.User;
import com.lover.infrastructures.service.IBaseService;
import com.lover.infrastructures.service.exception.auth.AuthenticationException;

/**
 * <p>
 * 用户信息表 服务类
 * </p>
 *
 * @author Keen
 * @since 2022-11-09
 */
public interface IUserService extends IBaseService<User> {

    SecurityUser loginByAccount(String account,String password) throws AuthenticationException;

    SecurityUser loginByCode(String code) throws AuthenticationException;

}
