package com.example.YanJiushengDemo01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Servlet06", value = "/Servlet06")
public class Servlet06 extends HttpServlet {
    /**
     * request作用域
     *  通过该对象可以在一个请求中传递数据，作用范围：在一次请求中有效，及服务器跳转有效
     *
     *      //设置域对象内容
     *      *  request.setAttribute(String name,Object value)
     *      *  //获取域对象内容                本servlet下面
     *      *  request.getArribute(String name);
     *      *  //删除与对象内容
     *      *  request.removeAttribute(String name);
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("servlet06执行");
        //获取域对象内容
        String name06= (String) req.getAttribute("name");
        System.out.println("06name值为：0"+name06);
        Integer age= (Integer) req.getAttribute("age");
        System.out.println("06age值为："+age);

        List<String> list=(List<String>) req.getAttribute("list");
        System.out.println(list.get(0));

    }
}
