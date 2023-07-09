package BookStudyYasuo04;
//lamba是8以后才有
/*
设计接口时，只设计一个抽象方法，lamba用于此功能接口的调用
    语法： (参数列表)-> {lambda表达式主体}
 */
interface shapes{                                               //001  无参数
    public void draw();
}
interface haveArgument{                                         //002  有参数
    public String talking(String name);
}
public class lamba020901 {
    public static void main(String[] args) {
        int r=5;
//        shapes obi=new shapes() {                             //匿名内部类  原始状态
//            @Override
//            public void draw() {
//                System.out.println("圆半径是r = "+r);
//            }
//        };
//        obi.draw();
        shapes obj=()->{                                        //用lambda表达式 无参数        001
            System.out.println("圆半径是r = "+r);
        };
        obj.draw();

        haveArgument arg=(nam)->{
            return  "我日内嘚 "+nam;
        };
        System.out.println(arg.talking("转角度"));
    }



}
