package BookStudy;

//分层继承，即一个父类，多个子类，引入protected,使得父类成员变量可以被子类访问
class Animal {
    protected String name;

    Animal() {
        System.out.println("父类方法调用！");
    }

    protected void eat() {
        System.out.println(name + "会吃饭！");
    }

    protected void sleep() {
        System.out.println(name + "会睡觉！");
    }
}

class Dog extends Animal {
    Dog(String name) {
        this.name = name;
        System.out.println("子类：" + name + "被调用");
    }

    public void bark() {
        System.out.printf("\t%s 正在叫\n", name);
    }
}

class Bird extends Animal {
    Bird(String name) {
        this.name = name;
        System.out.println("子类：" + name + "被调用");
    }

    public void fly() {
        System.out.printf("\t%s 正在飞\n", name);
    }
}

public class ExtendsFenceng0126 {
    public static void main(String[] args) {
        Dog dog = new Dog("金毛");
        dog.eat();
        dog.sleep();
        dog.bark();

        Bird bird = new Bird("苍鹰");
        bird.eat();
        bird.sleep();
        bird.fly();
    }
}
