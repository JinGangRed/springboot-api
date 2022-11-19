package com.lover.infrastructures.mybatis;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @Description: TODO
 * @Author: Keen
 * @Date: 2022/11/8
 * @Version: 1.0
 */
@Getter
@Setter
public abstract class BaseEntity implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField( value = "createdBy",fill = FieldFill.INSERT)
    private String createdBy;

    @TableField( value = "updatedBy",fill = FieldFill.INSERT_UPDATE)
    private String updatedBy;

    @TableField( value = "createdTime",fill = FieldFill.INSERT)
    private Timestamp createdTime;

    @TableField(value = "updatedTime",fill = FieldFill.INSERT_UPDATE)
    private Timestamp updatedTime;

}
