package BookStudyIO03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// 字节流 一般传输图片、视频、音频文件    中文会报错，因为中文16字节，英文8字节。字节流是按照8字节传输的(txt好像输出可以，但别的格式就不行)
public class InputOutStream0206001 {
    public static void main(String[] args) {
        try {
            FileOutputStream obj=new FileOutputStream("0206First.txt");
            String str="扬州大学555开始学编程 YZU university welcome you";
            byte[] bArray=str.getBytes();                               //字符数组改为byte数组     001
            obj.write(bArray);
            obj.close();
            System.out.println("输出成功");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
