package BookStudy02;
//前面学习的继承和抽象类概念，都是父子继承关系IS-A，老鹰继承鸟类等等
//但是比如飞行，鸟和飞机是平级的关系，不能说飞机属于鸟，这时候可以用接口（即同类的行为）
interface MyInterface{
    int x=10;           //其实就是public static final int x=10,省略了而已
    void fly();         //其实就是public abstract void fly()
}
class bird implements MyInterface{

    @Override
    public void fly() {
        System.out.println("鸟儿在飞！");
    }
}
class airPlane implements MyInterface{

    @Override
    public void fly(){
        System.out.println("飞机在飞！");
    }
}
public class InterfaceStudy0203 {
    public static void main(String[] args) {
        MyInterface eagle=new bird();
        eagle.fly();
        airPlane airplane = new airPlane();
        airplane.fly();
        System.out.println("接口成员变量："+airplane.x);
        System.out.println("接口成员变量："+MyInterface.x);        //接口成员变量访问，但不可更改   001
    }
}
