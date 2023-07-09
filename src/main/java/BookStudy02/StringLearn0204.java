package BookStudy02;

import java.util.Locale;

public class StringLearn0204 {
    public static void main(String[] args) {
        String str1="我在淮北过大年";
        String str2="   ";
        String str3=new String();
        System.out.println("str1的长度："+str1.length());
        System.out.println("str2是否为空:"+str2.isEmpty()); //false 因为包含空格
        System.out.println("str3是否为空:"+str3.isEmpty()); //true
        System.out.println("长度相关*******************************************\n");


        String str4="Ming Ming YOU gan JUe";
        System.out.println("str4转为大写："+str4.toUpperCase());
        System.out.println("str4转为小写："+str4.toLowerCase());
        System.out.println("大小写转换*****************************************\n");


        String str5="我叫张宏鑫，专业还有何鑫，小弟张宏鑫，陈欣欣之鑫，金价宏鑫嗷嗷嗷5869";
        System.out.println("宏鑫 最先出现的位置："+str5.indexOf("宏鑫"));
        System.out.println("宏鑫 最后出现的位置："+str5.lastIndexOf("宏鑫"));
        System.out.println("宏鑫 在index=5开始 最先出现的位置："+str5.indexOf("宏鑫",5));
        System.out.println("宏鑫 在index=5开始 最后出现的位置："+str5.lastIndexOf("宏鑫",5));
        System.out.println("str5是否包含 ：小弟张宏鑫  "+str5.contains("小弟张宏鑫"));                         //*********             001
        System.out.println("查找*************************");


        String str6="张宏鑫2022顺风顺水的开始";
        System.out.println("str6索引2的字符："+str6.charAt(2));                                           //************
        System.out.println("str6取新字符串：从第四个字符开始："+str6.substring(4));
        System.out.println("str6取新字符串：从第四个字符开始，到第12字符结束："+str6.substring(4,13));  //注意，索引是包含开头不包含结尾的 002
        char[] ch1= str6.toCharArray();                                                        //将字符串转换为字符数组
        System.out.println("完整字符串为："+ch1+"\t部分字符串为"+ch1[1]);
        char[] ch2= new char[15];
        str6.getChars(7,11,ch2,3);                                     //截取字符串索引7-11位置，存入数组ch2的索引3位置贮存
        System.out.println(ch2+"\n截取字符串的子字符串或字符（还是靠索引为主）***************************");

        String str7="张宏鑫 真鸡儿怪 日后肯定要身份有身份 要地位有地位";
        String str8="   去掉开头和结尾空格符,包括制表符\\t \\n等  用 trim   吧 ";
        String str7Replace=str7.replace("宏鑫","某某");                       //注意前面为被替换内容 后面为新内容
        String str8Tirm=str8.trim();
        System.out.println("str7替换字符串后内容:"+str7Replace);
        System.out.printf("str8去掉开头结尾空白前内容：/%s/\n",str8);
        System.out.printf("str8去掉开头结尾空白后内容：/%s/\n",str8Tirm);

        System.out.println(str4.concat(str6));
        System.out.println("字符串拼接两种方法："+str4+str6);


        String str9="Yang Zhou DA xue";
        String str11="yang zhou da xue";
        String str10=new String(str9);
        System.out.println("str9与str10是否equals?"+str9.equals(str10));                             //true
        System.out.println("str9与str11在 不区分大小写情况下 是否equals?"+str9.equalsIgnoreCase(str11)); //true
        System.out.println("后缀以xue结尾："+str9.endsWith("xue"));
        System.out.println("开头以Yang结尾："+str9.startsWith("Yang"));
        System.out.println("在index=5开头以Zhou结尾："+str9.startsWith("Zhou",5));


        System.out.println("将数组转为字符串******************在下面");
        char[] charray={'中','华','人','民','共','和','国'};
        System.out.println("charray字符数组转化为字符串："+String.copyValueOf(charray));
        System.out.println("charray字符数组转化为字符串："+String.copyValueOf(charray,2,5)); //以2为索引取5个
        System.out.println("valueof包含double、int及字符数组："+String.valueOf(charray));
        System.out.println("valueof数组，取三个，索引1开始："+String.valueOf(charray,1,3));
        //浮点数等转为字符串
        float a=5.698f;
        String aStr=String.valueOf(a);
        System.out.println(aStr);

        System.out.println("字符串拆分************************下面");
        String strr="I Love China";
        String[] words=strr.split("\\s");
        System.out.printf("strr一共有%d个字\n",words.length);
        for(String s:words){
            System.out.printf("%s\t",s);
        }


    }
}
