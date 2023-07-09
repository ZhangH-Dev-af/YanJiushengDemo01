package BookStudy;
//继承之聚合HAS-A
//聚合就是A类的某一属性（成员变量）实际是由另一个类组成

class homeTown{
    protected String city,province,state;
    homeTown(String city,String province,String state){
        this.city=city;
        this.province=province;
        this.state=state;
    }
}
class Employee{
    String name,sex,age;
    homeTown home;
    Employee(String name,String sex,String age,homeTown hom){
        this.name=name;
        this.sex=sex;
        this.age=age;
        this.home=hom;
        System.out.println("员工姓名："+name+"\t性别："+sex+"\t年龄："+age);
        System.out.println("所在国家："+hom.state+"\t所在省份："+hom.province+"\t所在城市："+hom.city);
    }
}

public class ExtendsAggregation0126 {
    public static void main(String[] args) {
        homeTown town=new homeTown("扬州","江苏","中国");
        Employee people=new Employee("张宏鑫","男","22",town);
    }
}
