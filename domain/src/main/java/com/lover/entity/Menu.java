package com.lover.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.lover.infrastructures.mybatis.BaseEntity;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 菜单权限表
 * </p>
 *
 * @author Keen
 * @since 2022-11-19
 */
@Getter
@Setter
public class Menu extends BaseEntity {

    /**
     * 菜单名称
     */
    private String menuName;

    /**
     * 父菜单ID
     */
    private Long parentId;

    /**
     * 显示顺序
     */
    private Integer orderNum;

    /**
     * 请求地址
     */
    private String url;

    /**
     * 打开方式（menuItem页签 menuBlank新窗口）
     */
    private String target;

    /**
     * 菜单类型菜单类型（M目录 C菜单 B按钮）
     */
    private String menuType;

    /**
     * 菜单状态（1显示 0隐藏）
     */
    private String visible;

    /**
     * 菜单标识
     */
    private String menuKey;

    /**
     * 菜单图标
     */
    private String icon;

    /**
     * 备注
     */
    private String remark;


}
