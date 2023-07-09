package BookStudyYasuo04;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

//压缩多个文件
public class compressionMany020702 {
    public static void main(String[] args) throws IOException {
        String[] str={"D:\\TanJiuShengCode\\压缩实例\\Demo0207002.txt","D:\\TanJiuShengCode\\压缩实例\\Demo0207003.txt"};

        //建立压缩目的位置对象，输出
        FileOutputStream out=new FileOutputStream("D:\\TanJiuShengCode\\zip020702.zip");
        ZipOutputStream zipOut=new ZipOutputStream(out);

        for(String file:str){
            //建立要压缩的文件对象
            File  f=new File(file);
            FileInputStream in=new FileInputStream(f);

            //在压缩文件内建立压缩项目
            ZipEntry name=new ZipEntry(f.getName());
            zipOut.putNextEntry(name);

            //byte方式读取未压缩文件in对象，以zip格式输出zipOut对象
            byte[] byt=new byte[1024];
            int length;
            while ((length=in.read(byt))>=0){
                zipOut.write(byt,0,length);
            }
            in.close();

        }
        zipOut.close();
        System.out.println("多个文件压缩成功！");

    }
}
