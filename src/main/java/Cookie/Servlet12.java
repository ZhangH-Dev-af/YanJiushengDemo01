package Cookie;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * cookie的获取
 *
 */
@WebServlet(name = "Servlet12", value = "/Servlet12")
public class Servlet12 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取cookie数组
        Cookie[] cookies=req.getCookies();
        //判断cooki是否为空
        if(cookies !=null && cookies.length>0){
            //遍历cookie数组
            for(Cookie cookie:cookies){
                //获取cookie的名称和值
                String name=cookie.getName();
                String value=cookie.getValue();
                System.out.println("名称："+name+" 值为："+value);
            }
        }
    }
}
