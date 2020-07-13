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
 *  1.过滤器的执行流程与生命周期
 *  2.过滤器的配置：
 *        1.拦截路径的配置：/*  /user/*   *.jsp    /index.jsp  四种
 *        2.拦截方式的配置
 *  3.过滤器链（配置多个过滤器）
 *  过滤器1
 *  过滤器2
 *  资源执行
 *  过滤器2
 *  过滤器1
 *  执行顺序：
 *      注释的是根据类名字符串规则比较，
 *      web.xml是谁定义在上面谁执行
 */
@WebFilter("/*")
public class demo02 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

    }

    @Override
    public void destroy() {

    }
}
