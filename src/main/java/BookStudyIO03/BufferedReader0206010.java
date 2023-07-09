package BookStudyIO03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader0206010 {
    public static void main(String[] args) {
        try {
            FileReader fr=new FileReader("BufferWriter9.txt");
            BufferedReader br=new BufferedReader(fr);

//            int i;                                    读取全部数据
//            while ((i=br.read())!=-1) {
//                System.out.println((char)i);
//            }
            String First=br.readLine();             //读取第一行
            System.out.println("第一行数据为："+First);

            String Second=br.readLine();
            System.out.println("第二行数据为："+Second);
            br.close();
            fr.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
