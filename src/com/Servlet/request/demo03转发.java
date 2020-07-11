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
@WebServlet("/request/demo03")
public class demo03转发 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.print("完成转发");
        /**
         *特点：1.地址栏地址不发生改变
         *     2.只能转发到服务器内部的资源
         *     3.转发是一次请求
         */
        req.setAttribute("msg","hello request域对象");
        req.getRequestDispatcher("request/demo03and01").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
