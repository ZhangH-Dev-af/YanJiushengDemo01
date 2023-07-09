package BookStudy02;
//既有接口实现也有继承
interface dog{
    void who();
    default void running(){
        System.out.println("狗子在狂奔！");
    }
}
interface cat{
    void who();
    default void running(){
        System.out.println("猫子在狂奔！");
    }
}
class horse{
    public void running(){
        System.out.println("马儿在狂奔！");
    }
}
class  pet extends horse implements cat,dog{            //接口继承同步实现                                  001

    @Override
    public void who() {
        System.out.println("我是宠物******");
        dog.super.running();                            //如果继承的类与实现的接口 方法名称冲突，优先执行类方法
        cat.super.running();                            //如果访问接口方法，那么 接口名称.super.Default方法名称  002
    }
}


public class interfaceExtendsImplements0203 {
    public static void main(String[] args) {
        pet hong =new pet();
        hong.running();     //调用父类horse 马儿在狂奔
        hong.who();
    }
}
