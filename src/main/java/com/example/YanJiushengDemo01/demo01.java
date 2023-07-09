package com.example.YanJiushengDemo01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 实现servlet:
 *      1.创建普通Dao类、
 *      2.实现servlet的规范，继承HttpServlet类
 *      3.重写service方法，处理请求
 *      4.设置注解，指定访问路径
 *
 */
//@WebServlet("/ser01")   //默认是value值，也就是路径
    @WebServlet(name = "mingzi",value = {"/ser01","/ser02"})
//    @WebServlet(name = "mingzi",urlPatterns = {"/ser01","/ser02"}) 和上面效果一样

public class demo01 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("helli servlet");
        //通过流输出数据到浏览器
        resp.getWriter().write("你好啊 servlet");
    }
}
