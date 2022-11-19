package com.lover.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lover.infrastructures.mybatis.BaseEntity;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 角色和菜单关系表
 * </p>
 *
 * @author Keen
 * @since 2022-11-19
 */
@Getter
@Setter
@TableName("role_menu")
public class RoleMenu {

    /**
     * 角色ID
     */
    @TableId(value = "roleId", type = IdType.AUTO)
    private String roleId;

    /**
     * 菜单ID
     */
    @TableId(value = "menuId", type = IdType.AUTO)
    private Long menuId;


}
