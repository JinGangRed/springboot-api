package com.lover.infrastructures.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lover.infrastructures.mybatis.BaseEntity;
import com.lover.infrastructures.mybatis.EntityBaseMapper;
import com.lover.infrastructures.service.exception.EntityAlreadyExistException;
import com.lover.infrastructures.service.exception.EntityNotFoundException;
import com.lover.infrastructures.service.exception.ServiceException;

import java.io.Serializable;
import java.util.Objects;

/**
 * @Description: TODO
 * @Author: Keen
 * @Date: 2022/11/9
 * @Version: 1.0
 */
public class BaseService<M extends EntityBaseMapper<T>, T extends BaseEntity> extends ServiceImpl<M, T> implements IBaseService<T>  {

    /**
     * @param entity 实体
     * @return 创建后的实体
     * @throws ServiceException 异常
     */
    @Override
    public T create(T entity) throws ServiceException {
        beforeCreate(entity);
        int result = baseMapper.insert(entity);
        T newEntity = baseMapper.selectById(entity.getId());
        afterCreate(newEntity);
        return newEntity;
    }

    /**
     * @param entityId 实体编号
     * @return 实体
     * @throws EntityNotFoundException 未发现实体
     */
    @Override
    public T get(Serializable entityId) throws EntityNotFoundException {
        T entity = baseMapper.selectById(entityId);
        if (Objects.isNull(entity)){
            Class<?> clazz = getClass();
            throw new EntityNotFoundException("Entity " + clazz.getSimpleName().toLowerCase() + " can't be found! id=" + entityId);
        }
        return entity;
    }

    protected void beforeCreate(T entity) throws EntityNotFoundException, EntityAlreadyExistException{

    }
    protected void afterCreate(T entity){

    }

}
