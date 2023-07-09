package BookStudy;
//多层次继承，就是A是爷爷，B是爸爸，C是孙子，C继承了A,B
class aircraft{
    protected String name;
    aircraft(String nam){
        this.name=nam;
    }
    public void fly(){
        System.out.println("爷爷类的方法:"+name+"飞行器会飞！");
    }
}
class Plant extends aircraft{
    protected String vary;
    Plant(String nam,String var) {
        super(nam);
        this.vary=var;
    }
    public void craftvary(){
        System.out.println("爸爸级别的方法："+name+"的飞行器类别是："+vary);
    }
}

class size extends Plant{
    protected String sizing;
    size(String nam, String var,String sizing) {
        super(nam, var);
        this.sizing=sizing;
    }
    public void setSizing(){
        System.out.println("孙子级别的方法："+name+"\t的飞行器类别是："+vary+"\t规格大小为："+sizing);
    }
}

public class ExtendsDuoceng0126 {
    public static void main(String[] args) {
        size ufo=new size("UFO001","不明种类","超大无法识别规格");
        ufo.fly();
        ufo.craftvary();
        ufo.setSizing();
    }
}
