package com.baeyeon.book.web;

import com.baeyeon.book.service.UserService;
import com.baeyeon.book.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegistServlet extends HttpServlet {

    //web层只能操作业务层
    private UserService userService = new UserServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 响应参数格式设置
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        //1.获取请求的参数
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");

        userService.existUsername(username);
        req.setAttribute("username",userService.existUsername(username));


        //2.检查用户名是否可用
            //不可用
//        if(userService.existUsername(username)){
//            System.out.println("用户名"+username+"已存在！");
//                //跳回注册页面
////            req.getRequestDispatcher("/pages/user/regist.html").forward(req,resp);
//            //可用
//        }else {
//                //调用service保存到数据库
//            userService.registUser(new User(null,username,password,email));
//                //跳转到注册成功页面regist_success.html
////            req.getRequestDispatcher("/pages/user/regist_success.html").forward(req,resp);
//        }
    }


}
