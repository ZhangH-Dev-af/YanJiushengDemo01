package com.example.YanJiushengDemo01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/ser03")
public class demo02 extends HttpServlet {
    /**
     * 就绪/服务方法（处理请求数据）
     * 系统方法，服务器自动调用
     * 当有请求到达servlet时，就会调用该方法
     * 方法可以多次调用
     * @param req
     *
     */
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("service执行");
        resp.getWriter().write("hello servlet!i am back");
    }

    /**
     * 销毁方法
     * 系统方法，服务器自动调用
     * 当服务器关闭时候调用
     * 方法只执行一次
     */
    @Override
    public void destroy() {
        System.out.println("destory方法调用");
    }

    /**
     * 初始化方法
     * 系统方法，服务器自动调用
     * 当请求到达servlet容器时，容器会判断该servlet对象是否存在，如果不存在，则创建实例并初始化
     * 方法执行一次
     * @throws ServletException
     */
    @Override
    public void init() throws ServletException {
        System.out.println("init方法调用");
    }
}
