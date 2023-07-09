package Cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * cookie的设置时间
 *
 */
@WebServlet(name = "Servlet13", value = "/Servlet13")
public class Servlet13 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //到期时间：负整数（默认值-1，表示只在浏览器中存活，关闭浏览器失效）
        Cookie cookie=new Cookie("uname1","zhangsan");
        cookie.setMaxAge(-1);   //关闭浏览器失效
        resp.addCookie(cookie);

        //到期时间：正整数，表示存活指定秒数，会将数据存在磁盘中
        Cookie cookie1=new Cookie("uname2","lisi");
        cookie1.setMaxAge(30);  //存活三十秒
        resp.addCookie(cookie1);

        //到期时间：0，表示删除cookie
        Cookie cookie2=new Cookie("uname3","wangwu");
        cookie2.setMaxAge(0);
        resp.addCookie(cookie2);
    }
}
