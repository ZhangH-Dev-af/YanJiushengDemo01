package Book;

import java.util.HashMap;
import java.util.Map;

public class hashMap {
    public static void main(String[] args) {
        //键值是唯一的，没有维持插入次序，每个元素包含键和对应的值，运行有null键和值
        HashMap<String,String> map=new HashMap<>();
        map.put("101","江苏共青团");
        map.put("102","河南共青团");
        map.put("103","湖北共青团");

        System.out.println("hashmap内容："+map);
        System.out.println("hashMap个数："+map.size());
        System.out.println("hashMap是否包含键103？："+map.containsKey("103"));
        System.out.println("hashMap是否包含值：河南共青团？："+map.containsValue("河南共青团"));
        System.out.println("依据键获取值："+map.get("103"));
        map.put("104","中共青年");
        map.remove("103");
        System.out.println("map当前数据为："+map);
        map.clear();
        System.out.println("当前map数据是否为空？"+map.isEmpty());
    }


}
