package BookStudyYasuo04;

import java.util.ArrayList;
import java.util.List;

/*
无return的lambdq
    lambda表达式如果只有一行也可以没有return,同时也可以省略大括号
 */
interface add{
    int jiafa(int x,int y);
}
public class lamba020902 {
    public static void main(String[] args) {
        add addMehtod=(a,b)->(a+b);                                     // 无return的lambda     001
        System.out.println("10+20= "+addMehtod.jiafa(10,20));

        ArrayList<String> array=new ArrayList<>();
        array.add("张三");
        array.add("李四");
        array.add("王五");

        array.forEach(info -> System.out.println("列表值为："+info));     // list的foreach方法    002
    }
}
