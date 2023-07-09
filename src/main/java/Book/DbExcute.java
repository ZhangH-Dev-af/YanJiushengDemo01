package Book;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DbExcute {
    static final String jdbcDriver = "com.mysql.cj.jdbc.Driver";
    static final String url = "jdbc:mysql://localhost:3306/c2c?useUnicode=true&characterEncoding=utf8&useSSL=true&serverTimezone=UTC";
    static final String user = "root";
    static final String pwd = "123456";

    public static void main(String[] args) throws Exception{
        Class.forName(jdbcDriver);
        Connection con = DriverManager.getConnection(url,user,pwd);
        Statement stmt=con.createStatement();
        //执行查询，返回结果集
        String sql="select * from democlass";
        //executeQuery只用于执行select语句

        ResultSet rs=stmt.executeQuery(sql);
        ArrayList<democlass> demo = new ArrayList<>();
        //判断结果集中有没有下一条数据，有数据返回true，没有false
        while (rs.next()){
            democlass cla=new democlass();
            cla.setId(rs.getInt("id"));
            cla.setName(rs.getString("姓名"));
            cla.setAge(rs.getInt("年龄"));
            cla.setClasses(rs.getString("班级"));
            cla.setComments(rs.getString("备注"));
            demo.add(cla);

        }
        stmt.close();
        con.close();

        for(democlass s:demo){
            System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getAge()+"\t"+s.getClasses()+"\t"+s.getComments());
        }
    }
}
