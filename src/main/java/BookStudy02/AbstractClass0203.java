package BookStudy02;
//  抽象类与抽象方法：可以想象成一个模板，然后由子类依自己的情况对此模板进行扩展和改造，然后由子类对象执行，所以抽象类不能建立对象

//定义：   1.抽象方法没有实体内容
//        2.抽象方法声明需用;结尾
//        3.抽象方法必须被子类重写
//        4.如果类内有抽象方法，这个类必须被声明为抽象类
//        5.抽象类可以有抽象方法和普通方法
abstract class Shape{
    Shape(){
        System.out.println("抽象方法被调用！");
    }
    abstract int add(int n1,int n2);    //加法
    abstract int mul(int n1,int n2);    //乘法
    public void output(){                       //普通方法，前面为抽象方法
        System.out.println("这是我的计算器");
    }
}
class Mytest extends Shape{

    @Override
    int add(int n1, int n2) {
        return n1+n2;
    }

    @Override
    int mul(int n1, int n2) {
        return n1*n2;
    }
}


public class AbstractClass0203 {
    public static void main(String[] args) {
        Shape obj =new Mytest();        //向上转型，也可以定义 Mytest对象
        obj.output();

        System.out.println("5 + 9 等于："+obj.add(5,9));
        System.out.println("5 * 9 等于："+obj.mul(5,9));
    }
}
