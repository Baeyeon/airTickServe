package com.baeyeon.book.test;

import com.baeyeon.book.dao.UserDao;
import com.baeyeon.book.dao.impl.UserDaoImpl;
import com.baeyeon.book.pojo.User;
import org.junit.Test;

public class UserDaoTest {
    UserDao userDao = new UserDaoImpl();

    @Test
    public void queryUserByUsername(){
        if(userDao.queryUserByUsername("admin") == null){
            System.out.println("用户名可用！");
        }else {
            System.out.println("用户名已存在！");
        }
    }

    @Test
    public void queryUserByUsernameAndPassword(){
        if(userDao.queryUserByUsernameAndPassword("admin","admin") == null){
            System.out.println("用户名或密码错误，登录失败");
        }else{
            System.out.println("查询成功");
        }
    }

    @Test
    public void saveUser(){
        System.out.println(userDao.saveUser(new User(null,"wzg168","123456","wz168@qq.com")));
    }
}
