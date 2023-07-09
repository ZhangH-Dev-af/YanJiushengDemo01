package BookStudyIO03;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader0206007 {
    public static void main(String[] args) {
        try {
            FileReader fr=new FileReader("FileWriter06.txt");
            int i;
            while ( (i=fr.read())!=-1 ){                        //读取至末尾                     001
                char ch=(char) i;                               //将读取的int类型转化为char类型    002
                System.out.print(ch);
            }
            fr.close();
            System.out.println("\n输出成功");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
