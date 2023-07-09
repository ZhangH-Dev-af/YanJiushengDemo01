package BookStudy;

import java.sql.PreparedStatement;

//静态变量static学习


class information{
    final static int fin = 998;
    static String grade="管理科学与工程";
    String name;
    int age;

    public static void output(){
        System.out.println("测试static方法");
    }

   public void information(){
       System.out.println("姓名："+name+"\t年龄"+age+"\t专业："+grade);

   }

}
public class ObjectStatic0123 {
    public static void main(String[] args) {
        information info=new information();
        info.name="张三";
        info.information();

        information info2=new information();
        info2.name="李四";
        info2.grade="电子信息";                 //静态变量作为一个独立的贮存。一个更改，其它所有对象的对应静态变量都更改
        info.information();
        info2.information();
        info2.output();                     //类对象名称调用static方法

        System.out.println("静态变量："+information.grade);      //可以由类名直接访问静态变量和方法
        information.output();

        System.out.println("final变量："+information.fin);


    }
}
