package com.lover.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.lover.infrastructures.mybatis.BaseEntity;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 角色信息表
 * </p>
 *
 * @author Keen
 * @since 2022-11-19
 */
@Getter
@Setter
public class Role extends BaseEntity {

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 角色权限字符串
     */
    private String roleKey;

    /**
     * 显示顺序
     */
    private Integer roleOrder;

    /**
     * 状态: 0停用, 1 正常
     */
    private String status;

    /**
     * 删除标记: 0 正常; 1 删除
     */
    private String delFlag;

    /**
     * 备注
     */
    private String remark;


}
