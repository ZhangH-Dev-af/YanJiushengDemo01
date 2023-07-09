package BookStudyYasuo04;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

//压缩单个文件
public class compression020701 {
    public static void main(String[] args) throws IOException {
        //建立要压缩的文件file对象
        File filezip=new File("D:\\TanJiuShengCode\\压缩实例\\Demo0207001.txt");       //获取文件
        FileInputStream src =new FileInputStream(filezip);

        //建立压缩目的位置对象
        FileOutputStream zipfile=new FileOutputStream("D:\\TanJiuShengCode\\207.zip");  //存入指定目录
        ZipOutputStream zipOut=new ZipOutputStream(zipfile);

        //在压缩文件内建立压缩项目
        ZipEntry ziptry=new ZipEntry(filezip.getName());
        zipOut.putNextEntry(ziptry);

        //byte方式读出未压缩文件src对象，然后以zip格式写入输出串流zipOut对象
        byte[] bytes=new byte[1024];                    //设置的byte数组空间
        int length;                                     //记录读取byte数
        while ((length=src.read(bytes))>=0){
            zipOut.write(bytes,0,length);           //以zip格式写入输出串流
        }
        System.out.println("压缩成功");
        zipOut.close();
        src.close();
    }
}
