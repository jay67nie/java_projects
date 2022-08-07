package JExercise;

import javax.swing.*;
import java.sql.*;

public class MysqlCon {
    public static void postDetails(String name, String password){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","");
            Statement stmt = con.createStatement();
            String sql = "INSERT INTO details VALUES('"+name+"', '"+password+"')";
            stmt.executeUpdate(sql);
            con.close();

        }

        catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void getDetails(String name, String password, JLabel Jname,JLabel Jpassword){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","");
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM details WHERE Name = '"+name+"' AND Password = '"+password+"'";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String name_got = rs.getString("Name");
                String pass_got = rs.getString("Password");
                Jname.setText("Found! "+ name_got);
                Jpassword.setText(pass_got);
            }
            con.close();

        }

        catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

