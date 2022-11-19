package com.lover.service.Impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lover.entity.RoleMenu;
import com.lover.mapper.RoleMenuMapper;
import com.lover.service.IRoleMenuService;
import com.lover.infrastructures.service.BaseService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色和菜单关系表 服务实现类
 * </p>
 *
 * @author Keen
 * @since 2022-11-19
 */
@Service
public class RoleMenuServiceImpl extends ServiceImpl<RoleMenuMapper,RoleMenu> implements IRoleMenuService {

}
