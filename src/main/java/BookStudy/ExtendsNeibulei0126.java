package BookStudy;
    class school{
        private class grade{                                //内部类    001
            String name;
            public grade() {
                System.out.println("我是一个内部类！");
            }
        }

        protected void lookGrade(){
            grade gra=new grade();
            System.out.println("外面类方法执行！");

        }
        protected void college(){                   //方法内部类        002
            String Str ="这是个不知名的错误！";
            class Mis{
                public String output(){
                    return Str;
                }
            }
            Mis mis=new Mis();      //方法调用自己创建的方法
            System.out.println(mis.output());
        }
    }

public class ExtendsNeibulei0126 {
    public static void main(String[] args) {
        school sc= new school();
        sc.lookGrade();             //内部类调用
        System.out.println("****************");
          sc.college();                          //方法内部类调用

        System.out.println("*****************");
                                                        //匿名内部类  003
        school ovride=new school(){
            protected void lookGrade(){
                System.out.println("匿名内部类！！！");
            }
        };
        ovride.lookGrade();
    }

}
