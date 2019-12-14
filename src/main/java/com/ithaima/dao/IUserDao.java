package com.ithaima.dao;/*
@outhor shkstart
@date 2019/12/11-11:22
用户的持久层借口
*/

import com.ithaima.domain.QueryVo;
import com.ithaima.domain.User;
import java.util.List;

public interface IUserDao {
//@Select("select * from user")
    /**
     * 查询所有用户
     * @return
     */
    List<User> findAll();
    /**
     * 根据id查询用户信息
     * @param userId
     * @return
     */
    User findById(Integer userId);
    /**
     * 根据用户名称模糊查询用户信息
     * @param username
     * @return
     */
    List<User> findByName(String username);
    /**
     * 根据queryVo中的条件查询用户
     * @param vo
     * @return
     */
    List<User> findUserByVo(QueryVo vo);

    /**
     * 根据传入参数条件
     * @param  user 查询的条件 有可能：用户名，性别，地址或所有或都没有
     * @return
     */
    List<User> findUserByCondition(User user);


    /**
     * 根据queryVo中提供的id集合，查询用户信息
     * @param vo
     * @return
     */
    List<User> findUserInIds(QueryVo vo);


}
