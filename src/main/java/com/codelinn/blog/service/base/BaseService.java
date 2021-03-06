package com.codelinn.blog.service.base;

import com.codelinn.blog.model.base.Entity;

import java.util.List;

/**
 * Class Name : com.codelinn.blog.service
 * Description :
 *
 * @author : cailinfeng
 * Date : 2018/9/6 14:31
 */
public interface BaseService<T extends Entity> {

    T getByObject(T findParam);

    T getById(Long id);

    int count(T countParam);

    List<T> query(T findParam);

    int insert(T object);

    int update(T object);

    void delete(Long id);

}
