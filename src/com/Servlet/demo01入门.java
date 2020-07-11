package com.Servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * Serlvet入门：
 *      1.创建一个类实现Servlet；
 *      2.在web.xml配置Servlet信息
 *          <servlet>
 *              <servlet-name>demo01MIME类型</servlet-name>
 *              <servlet-class>com.Servlet.demo01入门</servlet-class>
 *          </servlet>
 *          <servlet-mapping>
 *              <servlet-name>demo01MIME类型</servlet-name>
 *              <url-pattern>/demo01MIME类型</url-pattern>
 *          </servlet-mapping>
 *
 */
public class demo01入门 implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("hello Servlet");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
