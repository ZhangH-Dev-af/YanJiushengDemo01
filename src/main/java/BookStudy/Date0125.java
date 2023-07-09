package BookStudy;

import java.time.*;
import java.util.Scanner;

public class Date0125 {
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();                                 //localDate类   001
        System.out.println("现在日期："+date);
        System.out.println("现在日期年份："+date.getYear());
        System.out.println("现在日期月份："+date.getMonthValue());
        System.out.println("现在的英文对应星期："+date.getDayOfWeek());
        System.out.println("现在月份的日期对应天数："+date.getDayOfMonth());
        System.out.println("现在年份的日期对应天数："+date.getDayOfYear());
        LocalDate shoudong=LocalDate.of(2021,1,14);
        System.out.println("手动设置日期："+shoudong);
        System.out.println("********************");

        LocalTime time=LocalTime.now();                                 //localtime    002
        System.out.println("现在时间："+time);
        System.out.println(" 时："+time.getHour());
        System.out.println(" 分："+time.getMinute());
        System.out.println(" 秒："+time.getSecond());
        LocalTime shou=LocalTime.of(12,36,8);
        System.out.println("手动设置时间："+shou);

        LocalDateTime dt=LocalDateTime.now();                           //localdatetime  003
        System.out.println("当前日期："+dt);
        System.out.println("当前年份："+dt.getYear());
        System.out.println("当前月份："+dt.getMonthValue());
        System.out.println("当前天数："+dt.getDayOfMonth());
        System.out.println("当前小时："+dt.getHour());
        System.out.println("当前分钟："+dt.getMinute());
        System.out.println("当前秒数："+dt.getSecond());

        Instant  from,to;                           //计算时间戳，可以将instant换成localdatetime  004
        final  int pwd=75;      //设置正确结果
        Scanner sc=new Scanner(System.in);
        from=Instant.now();
        for(;;){    //无限循环
            System.out.printf("请输入0-99的数字");
          int  number=sc.nextInt();
          if(number==pwd){
              to=Instant.now();
              System.out.println("答对了");
              break;
          }else {
              System.out.println("猜错了在答一次");
          }

        }
        Duration dura=Duration.between(from,to);        //计算时间戳         005
        System.out.println("答对花费的时间为："+dura);
        System.out.println("答对花费的时间为："+dura.toDays());
        System.out.println("答对花费的时间为："+dura.toHours());
        System.out.println("答对花费的时间为："+dura.toMinutes());
//        System.out.println("答对花费的时间为："+dura.toSeconds());    1.9使用


    }
}
