package com.lover.service.Impl;

import com.lover.entity.Menu;
import com.lover.mapper.MenuMapper;
import com.lover.service.IMenuService;
import com.lover.infrastructures.service.BaseService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 菜单权限表 服务实现类
 * </p>
 *
 * @author Keen
 * @since 2022-11-19
 */
@Service
public class MenuServiceImpl extends BaseService<MenuMapper, Menu> implements IMenuService {

}
