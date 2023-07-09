package BookStudyYasuo04;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class decompression0207004 {
    public static void main(String[] args) throws IOException {
        File directory =new File("D:\\TanJiuShengCode\\压缩实例\\解压缩目录0207003");//建立存放解压缩文件的文件夹
        if(directory.mkdir()){
            System.out.println(directory.getName()+" 文件夹建立成功");
        }else {
            System.out.println("失败，文件夹以存在！");
        }

        byte[] buffer=new byte[1024];                                   //每次处理数组空间大小设置
        FileInputStream in =new FileInputStream("D:\\TanJiuShengCode\\压缩实例\\0207003.zip");
        ZipInputStream zipin=new ZipInputStream(in);

        ZipEntry name=zipin.getNextEntry();                             //读取文件名称
        while (name!=null){
            String filename=name.getName();                             //获取文件名称
            File fname=new File(directory+"/"+filename);       //设置解压缩结果的路径和文件名
            FileOutputStream out=new FileOutputStream(fname);
            int length;
            while ((length=zipin.read(buffer))>0){
                out.write(buffer,0,length);
            }
            out.close();
            name=zipin.getNextEntry();
        }
        zipin.close();
        System.out.println("解压缩成功");
    }
}
