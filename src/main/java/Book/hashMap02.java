package Book;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class hashMap02 {
    public static void main(String[] args) {
        HashMap<Integer,String > hash = new HashMap<>();
        hash.put(1001,"两双鞋");
        hash.put(1002,"小白鞋清洗剂");
        hash.put(1003,"被子和三件套");
        hash.put(1004,"椅子");
        hash.put(1005,"羽绒服");
        hash.put(1006,"加绒裤子");
        hash.put(1007,"保暖内衣和库");
        hash.put(1008,"厚袜子或薄袜子");
        hash.put(1009,"秋裤一个");
        hash.put(1010,"java编程书");

        //遍历
        for(Map.Entry s:hash.entrySet()){
//            System.out.println("%12s : %s\n",s.getKey(),s.getValue());
            System.out.println(s.getKey()+"\t"+s.getValue());
        }

        //LinkedHashMap
        //特点：1.元素唯一   2.可以保持当初建立map的次序  3.每个元素包含键和对应值   4.允许有null值
        LinkedHashMap<Integer,String> lhash= new LinkedHashMap<>();
        lhash.put(1001,"两双鞋");
        lhash.put(1002,"小白鞋清洗剂");
        lhash.put(1003,"被子和三件套");
        lhash.put(1004,"椅子");
        lhash.put(1005,"羽绒服");
        lhash.put(1006,"加绒裤子");
        lhash.put(1007,"保暖内衣和库");
        lhash.put(1008,"厚袜子或薄袜子");
        lhash.put(1009,"秋裤一个");
        lhash.put(1010,"java编程书");
        lhash.put(1011,"java编程书");
        for (Map.Entry d:lhash.entrySet()){
            System.out.println("键："+d.getKey()+" 值："+d.getValue());
        }

    }
}
