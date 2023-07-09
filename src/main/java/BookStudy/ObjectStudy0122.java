package BookStudy;
//类与对象
class Me{
    String name;
    int age;
    String grade="研究生";
    String[] data;
    public String judge(String a,int b,String[] c){
        String Output="姓名："+a+"\t年龄:"+b+"\t信息为："+c[0]+c[1];
        return Output;
    }
    public String judge(String a,int b,String grade,String[] c){
        String Output="姓名："+a+"\t年龄:"+b+"\t"+grade+"\t信息为："+c[0]+c[1];
        System.out.println("姓名："+a+"\t年龄:"+b+"\t"+this.grade+"\t信息为："+c[0]+c[1]+"此行为对象方法");
        return Output;
    }
}


public class ObjectStudy0122 {
    public static void main(String[] args) {
        Me my=new Me();
        my.name="张宏鑫";
        my.age=22;
        String information= my.judge(my.name, my.age, new String[] {"健康码绿色","正常"});
        System.out.println(information);
        String[] hai={"健康码黄色","有点小问题"};
        String informationTwo=my.judge("海明威",86,"小学生",hai);
        System.out.println(informationTwo);
    }
}
