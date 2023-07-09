package BookStudyYasuo04;

import java.util.Scanner;

public class zhengze0209002 {
    public static void main(String[] args) {
        String str=new String();
        String pattern="\\d\\d\\d\\d";                   // 正则表达式  \\d ==string里面的isdigital()

        Scanner sc=new Scanner(System.in);
        System.out.println("请输入四个任意字符串：");
        str=sc.next();
        if(str.matches(pattern)){                       //判定其是否符合正则表达式，符合返回true
            System.out.println("是数字！");
        }else {
            System.out.println("这不是数字！");
        }

        String pattern2="\\d\\d\\d\\d-\\d\\d\\d-\\d\\d\\d";
        System.out.println("******************");
        System.out.println("请输入电话");
        String str2=sc.next();
        if(str2.matches(pattern2)){
            System.out.println("是电话格式：输入电话为："+str2);
        }else {
            System.out.println("这不是电话格式");
        }
    }

}
