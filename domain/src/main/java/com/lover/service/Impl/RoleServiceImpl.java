package com.lover.service.Impl;

import com.lover.entity.Role;
import com.lover.mapper.RoleMapper;
import com.lover.service.IRoleService;
import com.lover.infrastructures.service.BaseService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色信息表 服务实现类
 * </p>
 *
 * @author Keen
 * @since 2022-11-19
 */
@Service
public class RoleServiceImpl extends BaseService<RoleMapper, Role> implements IRoleService {

}
