package BookStudy02;
/*
StringBuffer虽然和String同样是用于处理字符串
    他们差别在于String对象无法更改内容，所以使用String类不会碰上Java编译程序需处理重新分配储存空间问题
    若需要修改字符串内容时，可以用Buffer对象取代，  这个类在建立对象时不会限定长度。 默认会额外分配16个字符的缓冲区对象
 */
public class StringBuffer0205 {
    public static void main(String[] args) {
        String str1="汝州大学";
        StringBuffer str2=new StringBuffer(str1);
        System.out.println("字符串缓冲区对象内容："+str2);
        System.out.println("字符串缓冲区对象长度："+str2.length());
        System.out.println("字符串缓冲区对象容量："+str2.capacity());  //容量为16+4=20

        str2.ensureCapacity(15);                    //小于旧容量，不发生改变
        str2.ensureCapacity(25);                    //大于旧容量，改为旧容量*2+2=42
        System.out.println("旧容量*2+2 =新容量："+str2.capacity());

        str2.setLength(8);
        System.out.printf("改长度为8后  新字符串内容：%s, 长度：%d, 容量：%d\n",str2,str2.length(),str2.capacity());
        str2.setLength(3);
        System.out.printf("改长度为3后  新字符串内容：%s, 长度：%d, 容量：%d\n",str2,str2.length(),str2.capacity());

        String str3="JAVA";char[] ch={'入','门','迈','向','高','手','之','路'};
        StringBuffer str4=new StringBuffer(str3);
        str4.append("王者荣耀");
        System.out.println("将王者荣耀加在字符串后面："+str4);       //apend方法
        str4.append(ch);
        str4.append(ch,0,2);                        //末尾添加索引为0开头，长度为3的ch数组
        System.out.println("将数组加载字符串后面："+str4);

        str4.insert(4,ch);                              //insert方法，在str4的索引4处插入ch数组
        System.out.println("在索引4位置插入ch数组:"+str4);

        str4.delete(12,16);
        System.out.println("删除王者荣耀四个字："+str4);          //delete方法

        str4.replace(0,4,"今天是0205 日");      //replace替换  将索引0-3位置字符串替换成：今天是0205 日
        System.out.println("replace替换字符串后："+str4);
        str4.setCharAt(8,' ');
        System.out.println("sercharAt更换单个索引位置字符："+str4);    //setCharSet单个字符替换

        String str5="java 入门迈向高手之路王者归来";
        StringBuffer str6=new StringBuffer(str5);
        char[] ch2={'入','门','5','5','5','5','之','路'};
        str5.getChars(7,11,ch2,2);      //getChars方法，将str5里面7-10索引字符（迈向高手），复制到ch2数组索引为2里面取
        System.out.print("ch数组：");
        for(char i:ch2){
            System.out.print(i);
        }



    }
}
