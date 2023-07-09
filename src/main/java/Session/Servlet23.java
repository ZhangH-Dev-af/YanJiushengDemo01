package Session;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * session对象的销毁
 *      1.默认到期时间
 *          tomcat中默认存活30分钟，即你不操作界面的时间，一旦有操作，sesssion会重新计时
 *          可以在tomcat中conf目录下web.xml文件中进行更改
 *      2.手动更改到期时间
 *
 *      3.立即销毁,每次都重新创建一个，使用的最多
 *
 *      4.关闭浏览器，（默认）
 *          session底层依赖cookie,cookie对象默认只在浏览器中存货，关闭浏览器即失效
 *
 *      5.关闭服务器失效
 *          关闭服务器，session销毁
 *
 */
@WebServlet(name = "Servlet23", value = "/Servlet23")
public class Servlet23 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session=req.getSession();
        session.setAttribute("uname","admin");

        //session对象的最大不活动时间
        System.out.println("session对象最大不活动时间："+session.getMaxInactiveInterval());
        //修改最大不活动时间
//        session.setMaxInactiveInterval(15); //15秒失效

        //立即销毁 通过session.invalidate() 方法让session立刻失效
        session.invalidate();

    }
}
