package BookStudyIO03;

import java.io.File;

//查询目录下文件
public class File00005 {
    public static void main(String[] args) {
        String[] paths;
        File f=new File("D:\\TanJiuShengCode\\YanJiushengDemo01");
        paths=f.list();                                                         //返回该路径下所有文件和目录名称            001
        for(String path:paths){
            System.out.println(path);
        }

        File[] absolutPath;                                                     //返回包含路径的所有文件和目录，注意File[]   002
        File ff=new File("D:\\TanJiuShengCode\\YanJiushengDemo01");
        absolutPath=ff.listFiles();
        for(File pa:absolutPath){
            System.out.println(pa);
        }
    }
}
