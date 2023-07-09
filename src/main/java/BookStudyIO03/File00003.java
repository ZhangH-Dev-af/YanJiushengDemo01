package BookStudyIO03;

import java.io.File;

//修改
public class File00003 {
    public static void main(String[] args) {
        File f=new File("File12.txt");
        System.out.println("文件是否存在？"+f.exists());
        System.out.println("文件父路径："+f.getParent());     //如果前面为相对路径，绝对路径为null   001

        File fd=new File("Directory00002");
        if(fd.mkdir()){
            System.out.println("文件夹创建成功");
        }else {
            System.out.println("文件夹创建失败");
        }

        //已经创建了一个文件和文件夹，下面修改它门名称
        File newf=new File("File02060012.txt");
        boolean bool=f.renameTo(newf);
        System.out.println("w文件夹改名成功："+bool);
        System.out.println("新文件名称："+newf.getName());

        File newd=new File("Dircetory02060012");
        boolean boo=fd.renameTo(newd);
        System.out.println("更改文件夹名称成功："+boo);
        System.out.println("新文件夹名称："+newd.getName());
    }
}
