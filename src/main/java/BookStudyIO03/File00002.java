package BookStudyIO03;
//增加
import java.io.File;
import java.io.IOException;

public class File00002 {
    public static void main(String[] args) throws IOException {
        File f=new File("D:\\TanJiuShengCode\\YanJiushengDemo01\\File11.txt");
        System.out.println("文件是否存在："+f.exists());                   //      是否存在        001
        if(f.createNewFile()){                                          //     创建文件         002
            System.out.println("文件创建成功");
            System.out.println("文件是否存在："+f.exists());
            System.out.println("父路径："+f.getParent());
            System.out.println("绝对路径："+f.getAbsolutePath());
            System.out.println("是文件？"+f.isFile());
            System.out.println("是目录？"+f.isDirectory());
            System.out.println("是否是绝对路径？"+f.isAbsolute());
            System.out.println("可读？"+f.canRead());
            System.out.println("可写？"+f.canWrite());
            System.out.println("设置只读不可写文件："+f.setReadOnly());
            System.out.println("   可写？"+f.canWrite());
            System.out.println("设可写："+f.setWritable(true));
            System.out.println("       可写？"+f.canWrite());
        }else {
            System.out.println("文件创建失败");
        }
    }
}
