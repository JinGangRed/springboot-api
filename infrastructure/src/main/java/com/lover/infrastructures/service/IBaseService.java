package com.lover.infrastructures.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lover.infrastructures.mybatis.BaseEntity;
import com.lover.infrastructures.service.exception.EntityNotFoundException;
import com.lover.infrastructures.service.exception.ServiceException;

import java.io.Serializable;

/**
 * @Description: TODO
 * @Author: Keen
 * @Date: 2022/11/9
 * @Version: 1.0
 */
public interface IBaseService<T extends BaseEntity> extends IService<T> {

    T create(T entity) throws ServiceException;

    T get(Serializable entityId) throws EntityNotFoundException;

}
