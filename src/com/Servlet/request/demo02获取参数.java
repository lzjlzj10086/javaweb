package com.Servlet.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

/**
 * Servlet常用方法：
 *
 */
@WebServlet("/request/demo02")
public class demo02获取参数 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //中文乱码问题,在获取参数前，设置编码
        req.setCharacterEncoding("utf-8");
        //根据name获取请求参数
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println(username+":"+password);
        //如果一个name有多个值
        String[] hobbies = req.getParameterValues("hobby");
        for (String hobby:hobbies){
            System.out.println(hobby);
        }
        //获取所有参数的名称
        Enumeration<String> parameterNames = req.getParameterNames();
        while(parameterNames.hasMoreElements()){
            String s = parameterNames.nextElement();
            System.out.println(s+ "value:"+req.getParameter(s));
        }
        System.out.println("----------");
        //获取所有参数的集合
        Map<String, String[]> parameterMap = req.getParameterMap();
        Set<String> strings = parameterMap.keySet();
        for (String key:strings){
            System.out.print(key+":");
            String[] value = parameterMap.get(key);
            for (String v:value){
                System.out.println(v);
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
