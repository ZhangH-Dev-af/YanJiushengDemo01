package Book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Dbupdate {
    static final String jdbcDriver = "com.mysql.cj.jdbc.Driver";
    static final String url = "jdbc:mysql://localhost:3306/c2c?useUnicode=true&characterEncoding=utf8&useSSL=true&serverTimezone=UTC";
    static final String user = "root";
    static final String pwd = "123456";

    public static void main(String[] args) throws Exception{
        Class.forName(jdbcDriver);

        Connection con= DriverManager.getConnection(url,user,pwd);

        Statement stmt=con.createStatement();

        String sql ="update democlass set 年龄 = 99 where id = 3";

        int row =stmt.executeUpdate(sql);
        if(row>0){
            System.out.println("修改成了！");
        }else {
            System.out.println("失败");
        }
        stmt.close();
        con.close();
    }
}
