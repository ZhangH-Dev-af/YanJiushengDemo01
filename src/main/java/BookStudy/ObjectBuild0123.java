package BookStudy;
class Constructor{
    int age;
    String name;
    String grade;
    //无参
    Constructor(){
        name="张宏鑫20220123代码";
    }
    //有参
    Constructor(String nam,String grad,int ag){
        this.name=nam;
        age=ag;
        grade=grad;
    }
    //重载
    Constructor(String names,int ages){
        System.out.println("姓名："+names+"\t年龄："+ages);
    }

    public void mation(){
        System.out.println("姓名："+name+"\t年龄："+age+"\t年级："+grade);
    }

}
public class ObjectBuild0123 {
    public static void main(String[] args) {
        Constructor str=new Constructor();
        str.mation(); //无参

        Constructor str2=new Constructor("李四","管科",23);
        str2.mation(); //有参

        Constructor str3=new Constructor("张宏",22);  //自动调用一行打印
                                                                  // 重载是根据方法签名确定的，方法签名=方法名称+参数类型
    }
}
