package com.Servlet.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * request response对象都是由服务器·创建的
 */
@WebServlet("/request/demo01MIME类型")
public class demo01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doget...");
        String contextPath = req.getContextPath();
        System.out.println(contextPath);
        //请求头
        String referer = req.getHeader("referer");//从哪里来访问的地址,,可以防盗链操作
        System.out.println(referer);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost....");
    }
}
