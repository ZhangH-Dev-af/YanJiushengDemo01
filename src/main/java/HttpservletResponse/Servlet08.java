package HttpservletResponse;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;

/**
 * 响应数据
 *  getWriter() 字符输出流。输出字符串
 *  getOutputStream()   字节输出流，输出一切数据
 */
@WebServlet(name = "Servlet08", value = "/Servlet08")
public class Servlet08 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setCharacterEncoding("UTF-8");
//        resp.setHeader("content-type","text/html; Charset=UTF-8");
            resp.setContentType("text/html;charset=UTF-8");     //此行功能相当于前面两行加起来

        //getWriter() 字符输出流，输出字符串

        //获取字符输出流
        PrintWriter writer=resp.getWriter();
        //输出数据
        writer.write("你好 Java 我有回来了");

        //getOutputStream() 字节输出流，输出一切数据
//        //得到字节输出流
//        ServletOutputStream out=resp.getOutputStream();
//        //输出数据
//        out.write("Hello".getBytes());

    }
}
