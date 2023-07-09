package com.example.YanJiushengDemo01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet04", value = "/Servlet04")
public class Servlet04 extends HttpServlet {
    /**
     * 请求转发跳转
     *  可以让请求从服务端跳转到客户端，或跳转到指定servlet
     *  服务端行为
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
    }
}
