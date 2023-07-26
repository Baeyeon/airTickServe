package com.baeyeon.book.dao;

import com.baeyeon.book.pojo.User;

public interface UserDao {

    //注册
    /**
     * 根据用户名查询用户信息
     * @param username 用户名
     * @return 如果返回null，说明没有这个用户
     */
    public User queryUserByUsername(String username);

    /**
     *  保存用户信息
     * @param user
     * @return 返回-1表示操作失败，其他则为sql语句影响的行数
     */
    public int saveUser(User user);

    //登录
    /**
     * 根据用户名和密码查询用户信息
     * @param username
     * @param password
     * @return 返回null表示用户名或密码错误
     */
    public User queryUserByUsernameAndPassword(String username,String password);

}
