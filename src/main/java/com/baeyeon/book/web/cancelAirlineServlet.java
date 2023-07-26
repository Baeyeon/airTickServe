package com.baeyeon.book.web;

import com.baeyeon.book.service.AirlineService;
import com.baeyeon.book.service.impl.AirlineServiceImpl;
import com.baeyeon.book.utils.JsonChange;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class cancelAirlineServlet extends HttpServlet {
    private AirlineService airlineService = new AirlineServiceImpl();

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
//        PrintWriter out=resp.getWriter();
        String id = body.toString();
        String real_id = id.substring(7,13);
        PrintWriter out=resp.getWriter();
        airlineService.cancelAirline(real_id);
    }
}