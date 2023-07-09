package ServletContext;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * 获取servletContext对象
 */
@WebServlet(name = "Servlet31", value = "/Servlet31")
public class Servlet31 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //四种获取方法，第一种，通过request对获取
        ServletContext servletContext1=req.getServletContext();

        //通过session对象获取
        ServletContext servletContext2=req.getSession().getServletContext();

        //通过ServletConfig对象获取
        ServletContext servletContext3=getServletConfig().getServletContext();

        //直接获取，最简单，也只能在servlet里面用
        ServletContext servletContext4=getServletContext();

        //常用方法
        //1.获取当前服务器的版本信息
        String serverinfo=req.getServletContext().getServerInfo();
        System.out.println("获取当前服务器的版本信息："+serverinfo);
        //2.获取项目的真实路径
        String realPath=req.getServletContext().getRealPath("/");
        System.out.println("获取项目的真实路径："+realPath);

    }
}
