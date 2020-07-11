package com.Servlet.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * cookie：数据存储在客户端
 * 1.创建ccokie对象
 * 2.发送cookie,就是响应在客户端
 * 3.获取cookie
 *
 * 这里只是获取打印，，访问别的也带有cookie信息
 */
@WebServlet("/cookie/demo011")
public class demo01入门02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取cookie
        Cookie[] cookies = req.getCookies();
        for (Cookie cookie:cookies){
            String name = cookie.getName();
            String value = cookie.getValue();
            System.out.println(name+":"+value);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
