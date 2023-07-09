package package20220629;

import java.util.Scanner;

public class fuimaDemo01 {

    private int calc(int L, int B, int l, int b) {
        System.out.println("调用方法");
        int m, n, o, p, q, r, s, t;

        m = (L / l);
        n = (B / b);
        System.out.println("第一个块的最大数量为：" + n * m);

        for (int mm = 0; mm <= m; mm++) {
            o = (L - mm * l) / b;
            p = (B / l);
            System.out.println("第二块的放置数量为：" + (mm * n + o * p));

            for (int pp = 0; pp <= p; pp++) {
                r = (B - pp * l) / b;
                q = n * b > pp * l ? (L - mm * l) / l : (L / l);
                System.out.println("第三个块的放置数量为："+(mm*n+o*pp+q*r));

            }
        }

        return 1;
    }

    public static void main(String[] args) {
        int length, width, len, wid;
        System.out.println("请输入托盘的长：");
        Scanner sc1 = new Scanner(System.in);
        length = sc1.nextInt();
        System.out.println("请输入托盘的宽：");
        Scanner sc2 = new Scanner(System.in);
        width = sc2.nextInt();
        System.out.println("请输入物品的长：");
        Scanner sc3 = new Scanner(System.in);
        len = sc3.nextInt();
        System.out.println("请输入托盘的宽：");
        Scanner sc4 = new Scanner(System.in);
        wid = sc4.nextInt();
        System.out.println("托盘的长：" + length + "\t托盘的宽：" + width + "\t物品的长：" + len + "\t物品的宽：" + wid);
        sc1.close();
        sc2.close();
        sc3.close();
        sc4.close();


        fuimaDemo01 obj = new fuimaDemo01();
        int res = obj.calc(length, width, len, wid);
        System.out.println(res);

    }

}
