package BookStudyIO03;
//********************** 复制文件啥的
//总结： 输入时候有一个int b=obj.read())!=-1 作为读取结束收尾
//      输出时候   如果是将字符串写入文件 byte[] ch=str.getBytes()   write写入ch
//                如果是图片          byte[] ch=new byte[in.available()]  write方法写入ch
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputExample0206003 {
    public static void main(String[] args) {
        try {
            FileInputStream in =new FileInputStream("C:\\Users\\Administrator\\Desktop\\本科\\寸.png");
            FileOutputStream out = new FileOutputStream("一寸照片.jpg");

            System.out.println("文件大小："+in.available());                 //文件大小   001
            byte[] pic=new byte[in.available()];

            in.read(pic);                   //从输入流读取图文件数据存入pic数组
            out.write(pic);                 //将pic数组数据写入到输出流

            in.close();
            out.close();

            System.out.println("图片复制成功！");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
