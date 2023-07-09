package com.example.YanJiushengDemo01;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@WebServlet(name = "Servlet02", value = "/Servlet02")
public class Servlet02 extends HttpServlet {
    /**
     * 请求乱码问题
     *
     * 乱码原因
     *
     *  由于在解析过程默认使用的编码方式为 ISO-8859-1(此编码不支持中文)，所以解析一定会乱码
     *
     * tomcat 8以上版本 get请求不会乱码
     *                  post请求会乱码，通过设置服务器解析编码的格式
     *
     *                  request.setCharacterEncoding("utf-8")   此行只针对post请求
     *                  new String(req.getParameter("uname").getBytes("ISO-8859-1"),"UTF-8");
     *                  上面一行针对任何请求方式，但如果数据本身不乱吗，还依然使用new string转换，那么会乱码
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //设置请求的编码格式
        req.setCharacterEncoding("UTF-8");

        //获取客户端传递的参数
        String uname=req.getParameter("uname");
        String upwd=req.getParameter("upwd");
        System.out.println("姓名："+uname+" 密码："+upwd);

        //解决tomcat7以下版本的get请求乱码
        String name=new String(req.getParameter("uname").getBytes("ISO-8859-1"),"UTF-8");
        System.out.println("name值："+name);
    }
}
