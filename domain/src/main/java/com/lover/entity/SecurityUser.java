package com.lover.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @Description: 认证用户实体
 * @Author: Keen
 * @Date: 2022/11/13
 * @Version: 1.0
 */
@Setter
@Getter
public class SecurityUser implements Serializable {
    private Long uid;

    private String name;

    private String nickName;
}
