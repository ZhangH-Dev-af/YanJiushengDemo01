package Book;

public class DuiXiang {
    String name;
    int age;
    String classes;

    public static void main(String[] args) {
        DuiXiang demo01=new DuiXiang();
        demo01.name="张宏鑫";
        demo01.age=20;
        demo01.classes="信研2101";
        System.out.println(demo01.name+","+demo01.age+","+demo01.classes);
        System.out.println(demo01);
    }
}
