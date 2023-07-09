package BookStudyYasuo04;
/*
正则表达式的主要功能就是执行模式的对比与比较
 */
public class zhengze0209001 {
    public static boolean whetherpHONE(String str){
            if(str.length()!=12){               //长度不是12，则不是电话号
                return false;
            }
            for (int i=0;i<4;i++){              //前四位有非数组，不是电话号
                if(Character.isDigit(str.charAt(i))==false){
                    return false;
                }
            }
            if(str.charAt(4) !='-'){            //第五位不是 - ，返回false
                return false;
            }
            for(int i=5;i<8;i++){               //第6-9位不是数字，返回false
                if(Character.isDigit(str.charAt(i))==false){
                    return false;
                }
            }
        if (str.charAt(8) != '-') {
            return false;
        }
        for (int i=9;i<12;i++){                 //第10-12位不是数字，返回false
            if(Character.isDigit(str.charAt(i))==false){
                return false;
            }
        }

        return true;
    }
    public static void phoneSearch(String str){
        boolean notFindSingal=true;
        for(int i=0;i<str.length()-11;i++){
            String partStr=new String();
            partStr=str.substring(i,i+12);
           if(whetherpHONE(partStr)) {
               System.out.println("字符串中存在号码，号码是："+partStr);
               notFindSingal=false;
           }
        }
        if(notFindSingal){
            System.out.println("字符串不含号码");
        }
    }

    public static void main(String[] args) {
        String str1="dsbfjshhk5486565dwe56d56";
        String str2="svfhmsf555sjhed55 0123-456-789";
        phoneSearch(str1);
        phoneSearch(str2);

    }
}
