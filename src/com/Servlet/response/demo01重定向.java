package com.Servlet.response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 重定向：
 *      1,地址栏发生变化
 *      2,重定向是两次请求，可以访问其他站点的资源
 * 重定向后不能用request域获取数据
 * 路径：
 *      绝对路径;
 *          给服务器调用不需要加虚拟目录，给客户端调用需要加虚拟目录
 *      相对路径：找到当前路径和目标路径的相对位置
 */
@WebServlet("/response/demo01MIME类型")
public class demo01重定向 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //重定向
        resp.sendRedirect(req.getContextPath()+"/login.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
