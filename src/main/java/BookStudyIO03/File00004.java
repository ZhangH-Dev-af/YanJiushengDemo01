package BookStudyIO03;

import java.io.File;
import java.io.IOException;

public class File00004 {
    public static void main(String[] args) throws IOException {
        File f=new File("DemoDelete.txt");
        if(f.createNewFile()){
            System.out.println("文件创建成功！");
        }else {
            System.out.println("文件创建失败！");
        }
        System.out.println("文件是否存在："+f.exists()+"\t名称为："+f.getName());
        boolean bool=f.delete();
        System.out.println("文件是否已经删除："+bool);
    }
}
