package org.lynn.springbootstarter.dao;

import org.apache.ibatis.annotations.Mapper;
import org.lynn.springbootstarter.model.User;
import org.lynn.springbootstarter.model.base.BaseDao;
import org.springframework.stereotype.Repository;

/**
 * Class Name : org.lynn.springbootstarter.dao
 * Description :
 *
 * @author : cailinfeng
 * Date : 2018/9/4 15:13
 */
@Mapper
@Repository
public interface UserDao extends BaseDao<User> {

    User getByUserId(Long userId);

}
