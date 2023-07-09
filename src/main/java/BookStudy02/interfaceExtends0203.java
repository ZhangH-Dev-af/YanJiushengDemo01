package BookStudy02;
/*
接口也可以多个，单个继承，然后在接口实现类
 */
interface birds{
    void birdfly();
    int age=5;
}
interface airplanes{
    int age=6;
    void planefly();
}
interface FlyFly extends birds,airplanes{                   // 001 多重继承
    void flyFly();
}
class Info implements FlyFly{

    @Override
    public void birdfly() {
        System.out.println("鸟用翅膀飞,鸟的年龄是："+birds.age);   // 002 出现两个接口成员变量重名，用接口名称.变量名 存取

    }

    @Override
    public void planefly() {
        System.out.println("飞机用机翼飞,飞机的年龄是："+airplanes.age);
    }

    @Override
    public void flyFly() {
        System.out.println("两者都是飞嘛，我继承这两个接口");
    }
}

public class interfaceExtends0203 {
    public static void main(String[] args) {
        FlyFly fl =new Info() ;
        fl.birdfly();
        fl.planefly();
        fl.flyFly();
    }
}
