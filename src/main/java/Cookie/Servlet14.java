package Cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * cookie的中文问题，尽量不要用，有的话这样编码
 *      1.cookie不能跨电脑
 *      2.cookie不建议存中文，存的话如下,使用URLEncode和URLDecode进行编码解码
 *      3.如果存在同名的cookie,则后面覆盖前面
 *      4.cookie贮存是由上限的，不同浏览器上限不一样
 *      5.cookie存贮上限大概4k左右
 *
 */
@WebServlet(name = "Servlet14", value = "/Servlet14")
public class Servlet14 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //cookie存中文
        String name="姓名";
        String value="张三";
        //通过URLEncoder.encode()进行编码
        name= URLEncoder.encode(name);
        value=URLEncoder.encode(value);
        //创建cookie对象
        Cookie cookie=new Cookie(name,value);
        //响应cookie
        resp.addCookie(cookie);

        //获取cookie，使用URLDecoder进行解码
        Cookie[] cookies=req.getCookies();
        //判断非空
        if(cookies !=null &&cookies.length>0){
            //遍历
            for(Cookie cook:cookies){
                //解码
                System.out.println(URLDecoder.decode(cook.getName()));
                System.out.println(URLDecoder.decode(cook.getValue()));
            }
        }

        //添加同名cookie覆盖前面
        Cookie cookie4=new Cookie("name","iamyeye");
        resp.addCookie(cookie4);
    }
}
