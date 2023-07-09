package fileDownload;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

@WebServlet(name = "Servlet51", value = "/Servlet51")
public class Servlet51 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("文件下载。。");
        //设置请求编码格式
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        //获取参数，得到要下载文件名
        String filename=request.getParameter("filename");
        //参数的非空判断                       trim()去除字符串的前后空格
        if(filename==null||"".equals(filename.trim())){
            response.getWriter().write("请输入要下载的文件名");
            response.getWriter().close();
            return;
        }
        //得到图片的存放路径
        String path=request.getServletContext().getRealPath("/download/");
        //通过路径得到file对象
        File file=new File(path+filename);
        System.out.println("路径为："+file);
        //判断文件对象是否存在并且是一个标准文件
        if(file.exists()&&file.isFile()){
            //设置响应类型，（浏览器无法使用某种方式或激活某个程序来处理的MIME类型）
            response.setContentType("application/x-msdownload");
            //设置响应头
            response.setHeader("Content-Disposition","attachment;filename="+filename);//只需要改最后面filename文件名即可
            //得到文件输入流
            InputStream in =new FileInputStream(file);
            //得到字节输出流
            ServletOutputStream out=response.getOutputStream();
            //定义byte数组
            byte[] bytes=new byte[10240];
            //定义长度
            int len=0;
            //循环输出
            while ((len=in.read(bytes))!=-1){
                //输出
                out.write(bytes,0,len);
            }
            //关闭资源
            out.close();
            in.close();

        }else {
            response.getWriter().write("文件不在此，请重试hi");
            response.getWriter().close();
        }
    }
}
