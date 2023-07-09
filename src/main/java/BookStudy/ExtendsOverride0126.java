package BookStudy;

//方法重写 super调用父类成员变量或方法
class  animal{
    String vary;
    public void setVary(String vary) {
        this.vary = vary;
    }

    public void move(){
        System.out.println("f父类方法：动物可以活动");
    }
}

class cat extends animal{


    @Override                                      //重写定义：方法名称、返回值类型、参数列表不变。
    public void move(){                          //方法重写
        System.out.println("子方法\t这个动物的名字是：");
        super.move();                                       //调用父类方法
    }
}


public class ExtendsOverride0126 {
    public static void main(String[] args) {
        cat c= new cat();
        c.move();
    }
}
