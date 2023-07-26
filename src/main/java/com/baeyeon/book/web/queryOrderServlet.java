package com.baeyeon.book.web;

import com.baeyeon.book.pojo.Order;
import com.baeyeon.book.service.OrderService;
import com.baeyeon.book.service.impl.OrderServiceImpl;
import com.baeyeon.book.utils.JsonChange;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class queryOrderServlet extends HttpServlet {
    private OrderService orderService = new OrderServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // 响应参数格式设置
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        //读取前端请求流的消息
        InputStreamReader insr = new InputStreamReader(req.getInputStream(), StandardCharsets.UTF_8);
        StringBuilder body = new StringBuilder();
        int respInt = insr.read();
        // 读取请求数据
        while(respInt!=-1) {
            //将读取的字节流中的每一个字节转化为字符，然后添加到StringBuilder类型的对象中
            body.append((char) respInt);
            respInt = insr.read();
        }
        insr.close();
        JsonChange jsonChange = new JsonChange();
        //将已经转化的字符流（json格式）转化为Java对象
        //将StringBuilder类型的对象的对象通过toString方法转化为String类型，然后用fastjson的json包进行转化
        Order order = jsonChange.JsonChangeJavaObjectOrder(body.toString());
        PrintWriter out=resp.getWriter();
        //用户订单查询
        if(order.getPass_id().equals("")){
            out.print(orderService.queryOrderByUserid(order));  //所有订单
        } else {
            out.print(orderService.queryOrderByInfo(order));
        }
    }
}
