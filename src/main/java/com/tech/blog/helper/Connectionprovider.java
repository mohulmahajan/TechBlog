package com.tech.blog.helper;
import java.sql.*;
public class Connectionprovider {
    public static Connection con;
    public static Connection getConnection(){

        try {
            if (con==null){
            Class.forName("com.cj.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/techblog" , "root","1234" );
            }
        }
        catch (Exception e){e.printStackTrace();}
        return con;

    }

}