package BookStudyYasuo04;
/*
lamba方法参照
    1、静态方法参考
    2、实例方法参考
    3、构造方法参考
 */
interface MessageStatic{            // 001  002
    void msg1();
}
interface  messgae2{                // 003
    void msg(String str);
}
class test{

    public static void staticlook(){
        System.out.println("这是静态static方法");
    }
    public void  shiliMethod(){
        System.out.println("这是实例方法 ");
    }
    test(String str){
        System.out.println("构造方法 。输出一段字符串："+str);
    }

}


public class lamba020903 {
    public static void main(String[] args) {
        MessageStatic obj1=(test::staticlook);                  // 静态方法参考   001
        obj1.msg1();

        test ts=new test("55");
        MessageStatic obj2=ts::shiliMethod;
        obj2.msg1();                                            //实例方法参考    002

        messgae2 obj3=test::new;                                //构造方法参考    003
        obj3.msg("一段参数字符串！");
    }
}
