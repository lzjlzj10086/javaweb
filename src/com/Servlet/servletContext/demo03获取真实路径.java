package com.Servlet.servletContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * servletContext 作用范围是整个web项目
 */
@WebServlet("/ServletContextDemo03")
public class demo03获取真实路径 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext = req.getServletContext();
        //在src目录下的资源
        String realPath = servletContext.getRealPath("/WEB-INF/classes/a.txt");
        System.out.println(realPath);
        //在web目录下的资源
        String realPath1 = servletContext.getRealPath("/b.txt");
        System.out.println(realPath1);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
