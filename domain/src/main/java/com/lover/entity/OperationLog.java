package com.lover.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lover.infrastructures.mybatis.BaseEntity;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 操作日志表
 * </p>
 *
 * @author Keen
 * @since 2022-11-19
 */
@Getter
@Setter
@TableName("operation_log")
public class OperationLog extends BaseEntity {

    /**
     * 模块
     */
    private String module;

    /**
     * 业务类型（0其它 1新增 2修改 3删除）
     */
    private String businessType;

    /**
     * 请求方法
     */
    private String method;

    /**
     * 请求方式
     */
    private String requestMethod;

    /**
     * 操作员类别（0其它 1后台用户 2手机端用户）
     */
    private String operatorType;

    /**
     * 操作人员
     */
    private String operator;

    /**
     * 请求URL
     */
    private String requestUrl;

    /**
     * 请求地址
     */
    private String requestIp;

    /**
     * 操作地址信息
     */
    private String requestLocation;

    /**
     * 请求参数
     */
    private String requestParameter;

    /**
     * 请求结果
     */
    private String result;

    /**
     * 请求结果状态:1 正常，0异常
     */
    private String status;

    /**
     * 操作时间
     */
    private LocalDateTime operateTime;

    /**
     * 错误信息
     */
    private String errorMsg;


}
