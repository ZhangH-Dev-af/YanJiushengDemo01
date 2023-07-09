package Cookie;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * cookie的创建和发送
 *
 */
@WebServlet(name = "Servlet11", value = "/Servlet11")
public class Servlet11 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //cookie创建
        Cookie cookie=new Cookie("name","zhangsan");
        //发送（响应）cookie对象
        resp.addCookie(cookie);
    }
}
