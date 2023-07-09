package BookStudyIO03;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter0206006 {
    public static void main(String[] args) {
        try {
            FileWriter fw=new FileWriter("FileWriter06.txt");
            String str="扬州大学0206日 ，开始学编程 YZU university welcome you";
            fw.write(str);
            fw.append('!');
            fw.close();
            System.out.println("写入文件成功！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
