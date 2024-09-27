/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Suyash Pardhiye
 */
public class ConnectionProvider {
    public static Connection main() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
           // Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy?useSSL=false","root","Shreyas@134");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy","root","Shreyas@134");
           System.out.println(con);
            return con;
        }
       /* catch(Exception e){
            System.out.println(e);
            return null;
        }*/
       catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConnectionProvider.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}