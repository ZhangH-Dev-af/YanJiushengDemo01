package Session;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * session对象
 *      session的获取
 *      req.getSession()
 *常用方法：
 *      获取session的标识符           getId();
 *      获取session的创建时间          getCreationTime()
 *      获取最后一次访问时间              getLastAccessedTime()
 *      判断是否为新的session对象            isNew()
 */
@WebServlet(name = "Servlet21", value = "/Servlet21")
public class Servlet21 extends HttpServlet {
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

        //获取session的会话标识符
        String id=session.getId();
        System.out.println(id);
        //获取session创建时间
        System.out.println("session创建时间为："+session.getCreationTime());
        //获取最后一次访问时间
        System.out.println("session最后访问时间："+session.getLastAccessedTime());
        //判断是否为新的session对象
        System.out.println(session.isNew());
    }
}
