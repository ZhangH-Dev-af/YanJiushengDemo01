package BookStudyIO03;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInput0206004 {
    public static void main(String[] args) {
        try {
            FileInputStream obj=new FileInputStream("0206First.txt");
            BufferedInputStream bObj=new BufferedInputStream(obj);
            int b=bObj.read();
//            System.out.println(b);
            while ((b=bObj.read())!=-1){
                System.out.print((char) b);
            }
            bObj.close();
            obj.close();
            System.out.println("读取完毕");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
