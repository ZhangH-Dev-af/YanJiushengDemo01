package com.example.YanJiushengDemo01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Servlet05", value = "/Servlet05")
public class Servlet05 extends HttpServlet {
    /**
     * request作用域
     *  通过该对象可以在一个请求中传递数据，作用范围：在一次请求中有效，及服务器跳转有效
     *
     *  //设置域对象内容   本servlet下面
     *  request.setAttribute(String name,Object value)
     *  //获取域对象内容
     *  request.getArribute(String name);
     *  //删除与对象内容
     *  request.removeAttribute(String name);
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("servlet05执行");
        //设置域对象内容
        req.setAttribute("name","admin");
        req.setAttribute("age",18);
        List<String> list=new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        req.setAttribute("list",list);

        //设置完域对象内容，进行请求转发跳转到Servlet06
//        req.getRequestDispatcher("Servlet06").forward(req,resp);

        //请求转发到jsp,并通过域对象传递数据
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }
}
