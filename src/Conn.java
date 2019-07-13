
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Conn {
    public static Connection con=null;
    public static  Connection getConnection()
    {
        try {
            //String dbDriver="com.mysql.jdbc.Driver";
            String dbDriver="com.mysql.cj.jdbc.Driver";
            Class.forName(dbDriver);
            System.out.println("Driver Suceess");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found");
            e.printStackTrace();
        }
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Test?characterEncoding=utf-8&serverTimezone=GMT%2B8","root","chen2299");
            System.out.println("Connection Suceess");
        } catch (SQLException e) {
            System.out.println("Connetion failure");
            e.printStackTrace();
        }
        return con;
    }
    public static void closeConnection()
    {
        if(con!=null) {
            try {
                con.close();
                System.out.println("database close success");
            } catch (SQLException e) {
                System.out.println("close failure");
                e.printStackTrace();
            }
        }
    }
    public static void getinfo()
    {
        try {
            Statement stm = con.createStatement();
            String sql = "select * from a";
            System.out.println(sql);
            ResultSet rs = stm.executeQuery(sql);

            while (rs.next()) {
                int a=rs.getInt(1);
                String s1=	rs.getString(3);
                System.out.println(a);
                System.out.println(s1);
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String args[])
    {
        Conn x=new Conn();
        Conn.getConnection();
        try {
            Statement stm = con.createStatement();
            String sql = "select * from a";
            System.out.println(sql);
            ResultSet rs = stm.executeQuery(sql);

            while (rs.next()) {
                int a=rs.getInt(1);
                String s1=	rs.getString(3);
                System.out.println(a);
                System.out.println(s1);
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}