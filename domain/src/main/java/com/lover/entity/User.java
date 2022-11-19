package com.lover.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.lover.infrastructures.mybatis.BaseEntity;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 用户信息表
 * </p>
 *
 * @author Keen
 * @since 2022-11-19
 */
@Getter
@Setter
public class User extends BaseEntity {

    /**
     * 账户
     */
    private String account;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 用户类型(00 系统用户 01 注册用户)
     */
    private String userType;

    /**
     * 用户邮箱
     */
    private String email;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 性别: 0 男; 1 女; 2 未知
     */
    private String gender;

    /**
     * 用户头像
     */
    private String avatar;

    /**
     * 密码
     */
    private String password;

    /**
     * 加密盐
     */
    private String salt;

    /**
     * 账号状态: 0停用, 1 正常
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
