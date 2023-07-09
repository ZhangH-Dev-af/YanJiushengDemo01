package HttpservletResponse;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * 重定向与转发区别
 *      请求转发地址栏不改变，重定向改变
 *      请求转发只有一次请求，重定向是两次
 *      请求转发req可共享，重定向req不共享
 *      请求转发是服务端行为，重定向是客户端行为
 *      请求转发的地址是当前站点下（当前项目）的资源，重定向可以是任何地址，比如访问百度等等等等
 *
 */
@WebServlet(name = "Servlet10", value = "/Servlet10")
public class Servlet10 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("servlet10执行");

        //接收参数
        String name=req.getParameter("uname");
        System.out.println(name);

        //设置request作用域
        req.setAttribute("upwd","123456");

        //请求转发
        req.getRequestDispatcher("differ.jsp").forward(req,resp);
    }
}
