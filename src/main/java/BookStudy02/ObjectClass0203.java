package BookStudy02;
class mysch{
    static String mysch="扬州大学";
    String name="张宏鑫";
    int age=22;
    //重写tostring方法，这也输出对象就不再是返回对象的地址和名称                             001

    @Override
    public String toString() {
        return "俺的学校是："+mysch+"\t我叫："+this.name+"\t我的年龄是："+this.age;
    }
}

// hashcode 两个相等对象用equal会返回true,用hashcode会返回相同的哈希码值
//如果两个对象哈希码值相同，对象不一定相同    例如哈希规则是计算10的余数时，17和27的时一样的       002
public class ObjectClass0203 {
    public static void main(String[] args) {
        String msg="我日内对";
        int hsd=msg.hashCode();
        System.out.println("我日内对msg 的hashcode为："+hsd);
        String msg1=msg;
        System.out.println("我日内对msg1 的hashcode为："+hsd);
        String msg2="我日内对";
        System.out.println("我日内对msg2 的hashcode为："+hsd);

//在字符串里面，只要字符串内容相同，equals即返回true  切必须是同一对象才行
//        object里面的equals由于是被继承，所以设计为需要参照相同才tue                     003
        mysch Mysch1=new mysch();
        mysch Mysch2=new mysch();
        mysch Mysch3=Mysch2;
        System.out.println("Mysch1=Mysch2:"+Mysch1.equals(Mysch2));
        System.out.println("Mysch1=Mysch3:"+Mysch1.equals(Mysch3));
        System.out.println("Mysch2=Mysch3:"+Mysch2.equals(Mysch3));

        System.out.println("列出对象："+Mysch1);
    }
}
