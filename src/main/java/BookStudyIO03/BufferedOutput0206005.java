package BookStudyIO03;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutput0206005 {
    public static void main(String[] args) {
        try {
            FileOutputStream obj=new FileOutputStream("Buffer0206005.txt");
            BufferedOutputStream Bobj=new BufferedOutputStream(obj);

            String str="Welcome to our bed and living with me";
            byte[] ch=str.getBytes();                           // 001
            obj.write(ch);
            obj.flush();
            obj.close();
            System.out.println("写入成功");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
