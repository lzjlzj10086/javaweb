package com.Servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * Servlet创建对象有两种：1.第一次访问是创建 2.服务器启动是创建
 *       <!--默认访问时创建，如果是负数，是第一次访问创建。如果是0或正数，是服务器启动是创建-->
 *         <load-on-startup>-1</load-on-startup>
 * init方法只执行一次
 * service方法可执行多次
 * 服务器正常关闭才会执行销毁方法destroy，释放资源
 */
public class demo02生命周期 implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init.......");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service.......");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("destroy.......");
    }
}
