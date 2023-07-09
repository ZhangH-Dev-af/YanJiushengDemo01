package com.example.YanJiushengDemo01;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Servlet01", value = "/Servlet01")
public class Servlet01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求完整路径
        String url=req.getRequestURL().toString();
        System.out.println("获取请求时的完整路径："+url);
        //获取请求时的部分路径，从项目站点开始，到？前结束
        String rui=req.getRequestURI();
        System.out.println("获取请求时的部分路径："+rui);
        //获取请求时的参数字符串，从？开始，到最后的字符串
        String queryString= req.getQueryString();
        System.out.println("获取请求时的参数字符串："+queryString);
        //获取请求方式。get post
        String method=req.getMethod();
        System.out.println("获取请求方式："+method);
        //获取当前协议版本 HTTP/1.1
        String protocol=req.getProtocol();
        System.out.println("获取当前协议版本："+protocol);
        //获取项目的站点名（项目对外访问路径）
        String webapp=req.getContextPath(); //上下文路径
        System.out.println("获取项目的站点名："+webapp);

        //获取请求的参数
        //获取指定名称的参数值，返回字符串，重点
        String name=req.getParameter("uname");
        String pwd=req.getParameter("upwd");
        System.out.println("uname的值为："+name+"upwd值为："+pwd);

        //获取指定名称的参数的所有参数值，返回字符串数组（用于复选框传值）
        String[] hobbys=req.getParameterValues("uhobby");
        //判断数组是否为空
        if(hobbys!=null &&hobbys.length>0){
            for(String  hobby:hobbys){
                System.out.println("爱好是什么："+hobby);
            }
        }
    }


}
