package BookStudyIO03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamExample0206002 {
    public static void main(String[] args) {
        try {
            FileInputStream obj=new FileInputStream("0206First.txt");
            int b=obj.read();                                       //读取一个Byte数据
            while ((b= obj.read())!=-1){                            //是否读取到文件末端         001
                System.out.print((char)b);                          //将byte转化为字符输出
            }
            obj.close();
            System.out.println("读取结束！");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
