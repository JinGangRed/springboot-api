package com.lover.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lover.entity.UserRole;
import com.lover.mapper.UserRoleMapper;
import com.lover.service.IUserRoleService;
import com.lover.infrastructures.service.BaseService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户和角色关系表 服务实现类
 * </p>
 *
 * @author Keen
 * @since 2022-11-19
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper,UserRole> implements IUserRoleService {

}
