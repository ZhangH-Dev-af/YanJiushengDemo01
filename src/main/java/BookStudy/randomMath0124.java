package BookStudy;

import java.util.Random;

public class randomMath0124 {
    public static void main(String[] args) {
        Random ran=new Random();
        for(int i=0;i<10;i++){
            System.out.printf("%d\t",ran.nextInt(100)); //返回0-100的均匀分布随机数
            System.out.printf("%d\t",ran.nextInt());            //返回int范围均匀分布随机数
        }


        int x1=30,x2=50,x3=80,maxV,minV,maxxV;                     //max min最大最小值
        maxV=Math.max(x1,x2);
        minV=Math.min(x1,x3);
        maxxV=Math.max(Math.max(x1,x2),x3);
        System.out.printf("\n");
        System.out.printf("x1与x2最大值为：%d,最小值为：%d,x1、x2、x3最大值为：%s",maxV,minV,maxxV);

        double y1= 3.69,y2=4.51,y3=-99.6;
        System.out.println("绝对值为："+Math.abs(y3));
        System.out.println("四舍五入值为："+ Math.round(y1)+" -99.6四设五入："+Math.round(y3));
        System.out.println("4.51向上取整："+Math.ceil(y2)+"向下取整："+ Math.floor(y2));

        double z1=4,z2=8,z3=3.65;
        System.out.println("4开根号："+Math.sqrt(z1));
        System.out.println("8开立方根：");
        System.out.println("z1的z2次方，即4的8次方："+ Math.pow(z1,z2));
        System.out.println("自然对数e的6次方："+ Math.exp(6));
        System.out.println("返回以e为底都6的对数值："+ Math.log(6));
        System.out.println("以10为基底的10的对数值"+ Math.log10(10));

        //三角函数 注意，sin等直接计算的是弧度
        double hudu=0;
        for(int jiaodu=0;jiaodu<=360;jiaodu+=45){
            hudu= Math.toRadians(jiaodu);           //将角度转为弧度    对应弧度转角度是toDegree函数
            System.out.printf("角度%3d\t sin(%5.3f)=%10.8f \t cos(%5.3f)=%10.8f \n",jiaodu,hudu,Math.sin(hudu),hudu, Math.cos(hudu));
        }








    }
}
