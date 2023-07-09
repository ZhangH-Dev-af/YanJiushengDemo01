package package20220629;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

class duiMa629 {
    private ArrayList<tuoPan630> calc(int L, int B, int l, int b) {
        System.out.println("调用方法");
        int m, n, o, p, q, r, s, t;
        ArrayList<tuoPan630> objs=new ArrayList<>();
        m = (L / l);
        n = (B / b);
        System.out.println("********18第一个块的最大数量为：" + n * m);

        for (int mm = 0; mm <= m; mm++) {
            for (int nn = 0; nn < n; nn++) {
                o = (L - mm * l) / b;
                p = (B / l);
//                System.out.println("第二块的放置数量为：" + (mm * nn + o * p) + "\tm:" + mm + "\tn:" + nn + "\to:" + o + "\tp:" + p);


                for (int pp = 0; pp <= p; pp++) {
                    r = nn*b>pp*l? (B - nn * b) / b:(B - pp * l) / b;
                    q = nn * b > pp * l ? (L - mm * l) / l : (L / l);
//                    System.out.println("*第三个块的放置数量为：" + (mm * nn + o * pp + q * r) + "\tm:" + mm + "\tn:" + nn + "\to:" + o + "\tp:" + pp + "\tq:" + q + "\tr:" + r);

                    for (int qq = 0; qq <= q; qq++) {
                        s = qq * l > o * b ? (L - qq * l) / b : (L - o * b) / b;
//                        t = nn * b > pp * l ? (B - nn * b) / l : (B - pp * l) / l;
                        t = (B - nn * b) / l;
                        int counts = mm * nn + o * pp + qq * r + s * t;
//                        System.out.println("**第四个快的放置数量为：" + counts + "\tm:" + mm + "\tn:" + nn + "\to:" + o + "\tp:" + pp + "\tq:" + qq + "\tr:" + r + "\ts:" + s + "\tt:" + t);
                        tuoPan630 ob=new tuoPan630();
                        ob.setCounts(counts);
                        ob.setM(mm);
                        ob.setN(nn);
                        ob.setO(o);
                        ob.setP(pp);
                        ob.setQ(qq);
                        ob.setR(r);
                        ob.setS(s);
                        ob.setT(t);
                        objs.add(ob);
                    }
                }
            }

        }
        return objs;
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
        duiMa629 obj = new duiMa629();
        ArrayList<tuoPan630> res = obj.calc(length, width, len, wid);
        //降序
        res= (ArrayList<tuoPan630>) res.stream().sorted(Comparator.comparingInt(tuoPan630::getCounts).reversed()).collect(Collectors.toList());
        for(tuoPan630 s:res){

            System.out.println("最大数量："+s.getCounts()+"\tm:"+s.getM()+"\tn:"+s.getN()+"\to:"+s.getO()+"\tp:"+s.getP()+"\tq:"+s.getQ()+"\tr:"+s.getR()+"\ts:"+s.getS()+"\tt:"+s.getT());
        }

    }


}
