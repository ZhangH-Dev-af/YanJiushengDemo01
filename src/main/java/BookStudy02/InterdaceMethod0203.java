package BookStudy02;
/*
*接口有以下内容：
*   成员变量        Constant variable成员变量
*   抽象方法        Abstract methods 抽象方法
*   默认方法        Defaults methods  8才有
*                                               01可以继承
*                                               02可以重写
*                                               03可以重新将其定义为抽象方法
*   静态方法        Static methods    8才有       使用接口名称.方法名称调用，
*                                               与类里面定义静态方法是一样的
*
*/
interface  vehicle{
    String time="2022-02-03-13:16";
    String getBrand();
    String run();
    default String alarmOn(){                                                   //接口默认方法 001
        return "开启警报灯";
    }
    default void alarmOff(){
        System.out.println("关闭警报灯");
    }
    static String improveSpeed(int speed){                                      //接口静态方法 002
        return "当前速度为："+speed+"\t加速后速度为"+(speed+50)+"\t日期为："+time;      //接口成员变量访问
    }
}
class car implements vehicle{
    private String brand;
    car(String btand){
        this.brand=btand;
    }

    @Override
    public String getBrand() {                                                  //接口抽象方法重写 003
        return brand;
    }

    @Override
    public String run() {
        return "车辆安全驾驶中  抽象方法被重写";
    }

    @Override
    public void alarmOff() {                                                    //接口默认方法重写 004
        System.out.print("\t关闭警报灯  接口默认方法被重写\n");
    }
}
public class InterdaceMethod0203 {
    public static void main(String[] args) {
        vehicle car =new car("宝马七系");
        System.out.println("车辆商标为："+car.getBrand()+"\t此为接口重写方法");
        System.out.println("车辆状态："+car.run()+"\t此为接口重写方法");
        System.out.println("车辆遇到危险："+car.alarmOn()+"\t此为接口默认方法");
        System.out.print("车辆危险解除：");
        car.alarmOff();
        System.out.println("加速行驶："+vehicle.improveSpeed(300));          //接口静态方法调用：接口名称.方法名称




        //看自己买不买鲁班虎年皮肤 2022/02/03输出结果为：买！！！
        double[] purcase=new double[3];
        for(int i=0;i<3;i++){
            purcase[i]= Math.random();
        }
        int num=0;
        for(double j:purcase){
            if(j>=0.5){
                num++;
            }
        }
        if(num>=2) {
            System.out.println("买！");
        }else if(num==1||num==0){
            System.out.println("不买！");
            System.out.println("随机数为："+purcase[0]+"\t"+purcase[1]+"\t"+purcase[2]);
        }

    }
}
