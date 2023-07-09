package BookStudy;
//多态？  编译多态和运行多态
//编译多态常见为方法重载，设计很多相同名称的方法，然后根据方法内的参数类型、参数数量、参数顺序的区别决定调用哪个方法
//运行多态如 方法重写    执行时多态存在的三个必要条件如下： 1.有继承关系  2.子类有重写方法   3.父类变量对象参考到子类对象
import java.time.LocalDateTime;
class Yzu{
    Yzu(){
        System.out.print("这里是扬州大学，父类方法");
    }
    public void major(){
        LocalDateTime ldt=LocalDateTime.of(1912,1,26,12,0,36);
        System.out.printf("\t建校时间为:%s\n",ldt);
    }
}
class students extends Yzu{
    String name;
    int id;
    students(int id,String name){
        this.id=id;
        this.name=name;
        System.out.println("这里是学生信息，子类方法");
    }
    private void output(String nam,int id){
        major();
        System.out.printf("扬州大学内包含学生：%s,\t学号为：%d",nam,id);
        LocalDateTime lt=LocalDateTime.now();
        System.out.printf("\t当前时间为：%s",lt);
    }
    public void medium(){
        output(name,id);
    }
}

public class Extends0126 {
    public static void main(String[] args) {
       students stu=new students(1001,"张宏鑫");
       stu.medium();
    }
}
