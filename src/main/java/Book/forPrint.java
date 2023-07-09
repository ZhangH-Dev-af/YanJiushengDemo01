package Book;

import java.util.ArrayList;

public class forPrint {
    int id;
    String gameName;
    String gameType;
    public forPrint(int i, String name, String type) {
        this.id=i;
        this.gameName=name;
        this.gameType=type;

    }

    public static void main(String[] args) {
        ArrayList<forPrint> list = new ArrayList<>();
        forPrint Steam=new forPrint(1001,"吃鸡","枪战");
        forPrint Tencent=new forPrint(1002,"王者荣耀","mobile占");
        list.add(Steam);
        list.add(Tencent);
        //遍历输出
        for(forPrint s:list){
            System.out.println(s.id+"\t"+s.gameType+"\t"+s.gameName);
        }

    }
}
