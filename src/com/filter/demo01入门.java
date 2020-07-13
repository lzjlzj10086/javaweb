package com.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * web.xml配置
 * <!--配置过滤器-->
 *     <filter>
 *         <filter-name>demo01</filter-name>
 *         <filter-class>com.filter.demo01入门</filter-class>
 *     </filter>
 *     <filter-mapping>
 *         <filter-name>demo01</filter-name>
 *         <url-pattern>/*</url-pattern>拦截路径
 *     </filter-mapping>
 */
//@WebFilter("/*") 注解方式
public class demo01入门 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("dofilter执行了.......");
        //放行
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
