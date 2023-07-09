package Cookie;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * cookie路径
 *      有四种情况如下文
 *          总结：当访问的路径包含了cookie的路径时，才能获取到cookie值
 */
@WebServlet(name = "Servlet15", value = "/Servlet15")
public class Servlet15 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //当前服务器下任何项目任意资源都可获取cookie对象
        Cookie cookie001=new Cookie("cookie001","cookie001");
        //设置路径为 / ，表示在当前服务器下任何资源项目都可以访问到
        cookie001.setPath("/");
        resp.addCookie(cookie001);

        //当前项目下资源可获取cookie对象，（默认不设置Cookie的path）
        Cookie cookie002=new Cookie("cookie002","cookie002");
        //默认不设置cookie的path 或者设置当前站名点
        cookie002.setPath("/YanJiushengDemo01");
        resp.addCookie(cookie002);

        //指定项目下资源可获取cookie对象
        Cookie cookie003=new Cookie("cookie003","cookie003");
        //设置指定的项目站点名称
        cookie003.setPath("/sr03");  //sr03为指定的项目名
        resp.addCookie(cookie003);

        //指定目录下资源可共享cookie对象
        Cookie cookie004=new Cookie("cookie004","cookie004");
        //设置指定目录
        cookie004.setPath("/YanJiushengDemo01/Servlet12");    //表示在sr03项目cook文件夹下使用
        resp.addCookie(cookie004);
    }
}
