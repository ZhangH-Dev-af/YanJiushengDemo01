package BookStudy02;
/*
java9新增接口内容：
Private methods 私有方法
Private Static methods 私有静态方法
 */



import java.security.PrivateKey;

//输入一串数字，计算其中奇数之和，偶数之和
//interface Mathed{
//    default int addEven(int...nums){
//        method001();                                                //调用私有静态方法 001
//        return add(true,nums);
//    }
//    default int addOdd(int...nums){
//        method001();
//        return add(false,nums);
//    }
////    private static void method001(){                                       //私有静态方法   001
////         System.out.println("这是私有静态方法调用！！！");
////    }
////    private int add(boolean falg,int...num){                        //私有方法      002
////        int sumodd=0,sumeven=0;
////        for(int i:num){
////            if((i%2)==1){
////                sumodd+=i;
////            }else {
////                sumeven+=i;
////            }
////        }
////        if(falg){
////            return sumeven;
////        }else {
////            return sumodd;
////        }
////
////    }
//}
//public class InterfaceMethodJava90203 implements Mathed {
//    public static void main(String[] args) {
//        Mathed obj =new InterfaceMethodJava90203();
//        int ouShu=obj.addEven(1,2,3,4,5,6,7,8,9,10);
//        int jiShu=obj.addOdd(1,2,3,4,5,6,7,8,9,10);
//        System.out.println("1-10偶数和为："+ouShu+"\t奇数和为："+jiShu);
//    }
//}
