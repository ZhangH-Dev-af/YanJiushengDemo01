package BookStudy;

//组合 特殊的聚合，基本概念引用其它类型对象成员方法或变量达到重复使用程序代码作用
class Car {
    private String speed;
    private String color;

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printinfo() {
        System.out.println("车子最高时速：" + speed + "\t车子颜色：" + color);
    }
}

class Engiee {
    public void start() {
        System.out.println("发动机启动");
    }

    public void run() {
        System.out.println("发动机运转");
    }

    public void stop() {
        System.out.println("发动机停止");
    }
}

class son extends Car {
    public void show(){
        Engiee engiee=new Engiee();         //*******重点
        engiee.start();
        engiee.run();
        engiee.stop();
    }
}


public class ExtendsComposition0126 {
    public static void main(String[] args) {
        son son=new son();
        son.setSpeed("120迈");
        son.setColor("蓝色");
        son.printinfo();            //继承的方法前面三个
        son.show();        //类本身的方法，在本身方法调用另一个类
    }
}
