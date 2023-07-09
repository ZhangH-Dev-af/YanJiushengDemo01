package BookStudy;
//封装
 class EncupsulationBank{
    private String name;
    public int money;
    private int rate=30;                //两个private为封装，main方法里面不能直接访问
    private double charge=0.01;

    public EncupsulationBank(String nam){
        this.name=nam;
        this.money=0;       //初始余额为0
    }
    public void addMoney(int dollar){       //充钱
        this.money+=dollar;
    }
    public void subtraction(int dollar){    //扣钱
        this.money-=dollar;
    }
    public double rateBool(int purse){
        if(this.money>=10000){
            this.charge=0.008;
        }
        return calRate(purse);
    }
    private double calRate(int purse){          //封装的一个案例，在main方法不能访问该方法
        double result=purse*rate*(1-charge);    //汇率计算
        return result;
    }

    public void displayMoney(){
        System.out.println("账户名称："+name+"余额："+money);
    }
    public double lookCharge(){
        return this.charge;
    }

}

public class ObjectEncapsulation0123 {
    public static void main(String[] args) {
        EncupsulationBank me=new EncupsulationBank("草上飞");
        me.addMoney(5000);
        System.out.println(me.money+"美金可以兑换："+me.rateBool(me.money)+"台币"+"，此时汇率为："+me.lookCharge());

        me.addMoney(15000);
        System.out.println(me.money+"美金可以兑换："+me.rateBool(me.money)+"台币"+"，此时汇率为："+me.lookCharge());

    }
}
