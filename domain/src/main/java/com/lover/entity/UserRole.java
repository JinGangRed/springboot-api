package com.lover.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lover.infrastructures.mybatis.BaseEntity;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 用户和角色关系表
 * </p>
 *
 * @author Keen
 * @since 2022-11-19
 */
@Getter
@Setter
@TableName("user_role")
public class UserRole {

    /**
     * 用户ID
     */
    @TableId(value = "userId", type = IdType.AUTO)
    private Long userId;

    /**
     * 角色ID
     */
    @TableId(value = "roleId", type = IdType.AUTO)
    private String roleId;


}
