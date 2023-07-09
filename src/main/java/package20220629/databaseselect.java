package package20220629;

import java.sql.*;
import java.util.ArrayList;

public class databaseselect {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
    //我要查询患中风的群体
    //第一步连接
        String jdbcDriver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/c2c?useUnicode=true&characterEncoding=utf8&useSSL=true&serverTimezone=UTC";
        String user = "root";
        String pwd = "123456";
        Class.forName(jdbcDriver);
        Connection con= DriverManager.getConnection(url,user,pwd);

        Statement stmt=con.createStatement();

        int i=1;
        ArrayList<schoolmathgame> list=new ArrayList<>();
        String sql="select id , gender , age , ever_married , stroke from `school-mathgame` where stroke="+i;

        ResultSet rs=stmt.executeQuery(sql);
        while (rs.next()){
            schoolmathgame school=new schoolmathgame();
            school.setId(rs.getString("id"));
            school.setGender(rs.getString("gender"));
            school.setAge(rs.getInt("age"));
            school.setEver_married(rs.getString("ever_married"));
            school.setStroke(rs.getInt("stroke"));
            list.add(school);
        }
        stmt.close();
        con.close();

        for(schoolmathgame game:list){
            System.out.println(game.toString());
        }

    }
}
