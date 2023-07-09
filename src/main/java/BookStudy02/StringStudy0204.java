package BookStudy02;
//字符串学习 之 character字符类学习、string基本声明

public class StringStudy0204 {
    public static void main(String[] args) {
        char ch1='S',ch3='a';
        String str1="YangZhou.University";
        char ch2='8',ch4='\n';

        System.out.println("ch2是否为数字？"+Character.isDigit(ch2));             //true
        System.out.println("ch2是否为字符？"+Character.isLetter(ch2));            //true
        System.out.println("ch4是否为控制字符？"+Character.isISOControl(ch4));     //true
        System.out.println("ch1是否为 大写字母？"+Character.isUpperCase(ch1));
        System.out.println("ch1是否为 小写字母？"+Character.isLowerCase(ch1));
        System.out.println("str1是否为 字母或数字？"+Character.isLetterOrDigit(ch1));

        System.out.println("ch1转换为小写字母："+Character.toLowerCase(ch1));
        System.out.println("ch3转换为大写字母："+Character.toUpperCase(ch3));

        char[] charray={'中','华','人','民','共','和','国'};

        String str3=new String(charray);
        String str4=new String(charray,0,5);                    //取前四个字符
        System.out.println(str3);
        System.out.println(str4);

        String str6="扬州大学";
        String str7="扬州大学";
        String str8=new String(str7);
        String str9=new String("扬州大学");
        System.out.println("str6==str7:"+(str6==str7)); //true
        System.out.println("str6==str8:"+(str6==str8)); //false
        System.out.println("str6==str9:"+(str6==str9)); //false
        System.out.println("str8==str9:"+(str8==str9)); //false   若是equals则trur
                                                        //因为==而言，必须是字符串对象参照相同才算相同 001



    }
}
