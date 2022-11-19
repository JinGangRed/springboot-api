package com.lover.service.Impl;

import com.lover.entity.OperationLog;
import com.lover.mapper.OperationLogMapper;
import com.lover.service.IOperationLogService;
import com.lover.infrastructures.service.BaseService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 操作日志表 服务实现类
 * </p>
 *
 * @author Keen
 * @since 2022-11-19
 */
@Service
public class OperationLogServiceImpl extends BaseService<OperationLogMapper, OperationLog> implements IOperationLogService {

}
