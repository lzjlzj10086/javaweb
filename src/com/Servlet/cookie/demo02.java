package com.Servlet.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * cookie：数据存储在客户端。基于响应头set-cookie和请求头cookie实现
 * 1.创建ccokie对象
 * 2.发送cookie
 * 3.获取cookie
 *  可以发多个cookie
 *  cookie的存活时间：默认情况是当客户端关闭，cookie销毁
 *  设置存活时间的方法setMaxAge(),正数表示存活多少秒，负数是默认情况，0是删除cookie数据
 */
@WebServlet("/cookie/demo02")
public class demo02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建cookie对象
        Cookie cookie = new Cookie("msg","helloCookie");
        Cookie cookie1 = new Cookie("msg1","helloCookie1");
        //发送cookie
        resp.addCookie(cookie);
        resp.addCookie(cookie1);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
