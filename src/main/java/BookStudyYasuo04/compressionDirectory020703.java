package BookStudyYasuo04;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class compressionDirectory020703 {
    //递归函数
    public static void  zipFile(File file,String filename,ZipOutputStream zipout) throws IOException {
        //如果是隐藏文件不压缩
        if(file.isHidden()){
            return;
        }
        //如果是文件夹则处理
        if(file.isDirectory()){
            File[] filess=file.listFiles();
            for(File filesss:filess){
                zipFile(filesss,filename+"/"+filesss.getName(),zipout);
            }
            return;
        }
        //如果file既不是隐藏文件也不是目录则进行压缩
        FileInputStream in =new FileInputStream(file);
        //获取文件名称
        ZipEntry zipin=new ZipEntry(file.getName());
        zipout.putNextEntry(zipin);

        //byte方式读取
        byte[] bytes=new byte[1024];
        int length;
        while ((length=in.read(bytes))>=0){
            zipout.write(bytes,0,length);
        }
        in.close();


    }

    public static void main(String[] args) throws IOException {
        //建立压缩对象，输入的路径及文件名
        File directory=new File("D:\\TanJiuShengCode\\压缩实例\\目录");

        //建立输出的压缩对象，输出的压缩路径和名称
        FileOutputStream out =new FileOutputStream("D:\\TanJiuShengCode\\压缩实例\\0207003.zip");
        ZipOutputStream zipOut=new ZipOutputStream(out);

        zipFile(directory, directory.getName(), zipOut);
        zipOut.close();
        System.out.println("压缩成功！");
    }
}
