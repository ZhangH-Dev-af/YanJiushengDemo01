package com.example.YanJiushengDemo01;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Servlet03", value = "/Servlet03")
public class Servlet03 extends HttpServlet {
    /**
     * 请求转发跳转   req.getRequestDispatcher("url").forward(req,resp);
     *  可以让请求从服务端跳转到客户端，或跳转到指定servlet
     *              特点：1.地址栏不发生改变
     *                  2.服务端行为
     *                  3.从始至终只有一个请求
     *                  4.req数据可以共享
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("uname");
        System.out.println("传过来值为："+name);

        //请求转发跳转到servlet04
//        req.getRequestDispatcher("Servlet04").forward(req,resp);
        //请求转发跳转到jsp页面，注意上面得注释，因为只能跳转一次
        req.getRequestDispatcher("login.jsp").forward(req,resp);

    }
}
