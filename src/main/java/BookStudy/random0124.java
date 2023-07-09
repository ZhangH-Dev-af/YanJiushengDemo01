package BookStudy;

import java.util.Scanner;

public class random0124 {
    public static void main(String[] args) {
        //产生随机数
        double[] ran=new double[10];
        for(int i=0;i<10;i++){
            ran[i]=Math.random();
            System.out.printf("%5.2f",ran[i]);  //保留两位小数
        }
        System.out.printf("\n");
        //产生区间内随机数 Math.random()*（区间上限-区间下限+1）+区间下限值
        int[] dice=new int[10];
        for(int i=0;i<10;i++){
            dice[i]= (int) (Math.random()*(6-1+1)+1);   //产生筛子数
            System.out.printf("%d\t",dice[i]);
        }
        System.out.println("**********");

        //产生不重复数字的大乐透彩票
        int[] lottery=new int[100];
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入购买数量：");
        int num=sc.nextInt();

        for (int i=1;i<=num;i++){
            System.out.printf("%d:\t",i);
            for(int j=0;j<=99;j++){
                lottery[j]=j+1;
            }
            int counter=1;
            while (counter<=6){
                int number=(int) (Math.random()*(99-1+1)+1);
                if(lottery[number]==0){
                    continue;
                }else{
                    System.out.printf("%d\t",lottery[number]);
                    counter++;
                    lottery[number]=0;
                }
            }
            System.out.printf("\n");
        }
    }
}
