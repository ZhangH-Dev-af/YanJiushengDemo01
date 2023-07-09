package BookStudyIO03;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileExample0206008 {
    public static void main(String[] args) {
        try {
            FileReader fr =new FileReader("FileWriter06.txt");
            FileWriter fw=new FileWriter("FileExample08.txt");
            int i;

            while ((i= fr.read())!=-1){                 // 读取      001
                char ch=(char) i;                       //化为字符    002
                System.out.print(i+"\t");
                fw.write(i);                            //写入       003
            }

            fr.close();
            fw.close();
            System.out.println("文件复制成功！");


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
