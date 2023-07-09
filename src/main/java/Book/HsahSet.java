package Book;

import java.util.HashMap;
import java.util.HashSet;

public class HsahSet {
    public static void main(String[] args) {
        //与List相比，这里面所有元素是唯一的，不重复
        HashSet<String> set = new HashSet<>();
        set.add("北京");
        set.add("上海");
        set.add("香港");
        set.add("澳门");
        System.out.println("hashset内容："+set);
        System.out.println("hashset元素个数："+set.size());
        System.out.println("hsahset是否为空？"+set.isEmpty());
        set.remove("北京");
        System.out.println("hashset是否包含香港？"+set.contains("香港"));


    }
}
