package BookStudyIO03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter0206009 {
    public static void main(String[] args) {
        try {
            FileWriter fw=new FileWriter("BufferWriter9.txt");
            BufferedWriter Bfw=new BufferedWriter(fw);
            String str="中华人民共和国欢迎你们";
            Bfw.write(str,0,7);     //字符串写入前0-6个  在换行 写后面的
            Bfw.newLine();
            Bfw.write(str,6,str.length()-7);
            Bfw.close();
            fw.close();
            System.out.println("写入文件成功");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
