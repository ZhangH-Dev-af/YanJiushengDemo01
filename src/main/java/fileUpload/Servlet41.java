package fileUpload;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Servlet41", value = "/Servlet41")
@MultipartConfig            //如果表单是文件上传，一定要加这个注解
public class Servlet41 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置请求的b编码格式
        request.setCharacterEncoding("UTF-8");
        //获取普通表单项（）文本框
        String name=request.getParameter("uname");
        //通过 getPart()方法获取part对象
        Part part=request.getPart("myfile");    //后面括号里面的就是html里面name属性值
        //通过part对象，获取上传文件名
        String filename=part.getSubmittedFileName();
        System.out.println("上传文件名："+filename);

        //得到文件存放的路径
        String filepath=request.getServletContext().getRealPath("/");
        System.out.println("文件存放的路径："+filepath);
        //上传文件到指定目录
        part.write(filepath+"/"+filename);
    }
}
