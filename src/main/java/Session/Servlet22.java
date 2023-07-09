package Session;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * session域对象
 *      setAttribute() 设置域对象
 *      getAttribute() 获取域对象
 *      removeAttribute() 移除域对象
 *
 */
@WebServlet(name = "Servlet22", value = "/Servlet22")
public class Servlet22 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取session对象
        HttpSession session=req.getSession();
        //设置域对象
        session.setAttribute("uname","admin");
        session.setAttribute("upwd","123456");

        //移除session对象
        session.removeAttribute("upwd");
        //request域对象
        req.setAttribute("name","zhangsan");

        //请求转发,可以在jsp中获取到值
//        req.getRequestDispatcher("session.jsp").forward(req,resp);
        //重定向，两次请求，依然可以获取到session值，但是request值不能获取
        resp.sendRedirect("session.jsp");
    }
}
