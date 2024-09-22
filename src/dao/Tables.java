/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;
/**
 *
 * @author Suyash Pardhiye
 */
public class Tables {
    public static void main (String[] args) {
        try{
            Connection con=dao.ConnectionProvider.main();
            Statement st=con.createStatement();
         //   st.executeUpdate("create table appuser(appuser_pk int AUTO_INCREMENT primary key,userRole varchar(200),name varchar(200),dob varchar(50),mobileNumber varchar(50),email varchar(200),username varchar(200),password varchar(50),address varchar(200))");
            st.executeUpdate("insert into appuser (userRole,name,dob,mobileNumber,email,username,password,address) values('Admin','Admin','16-12-1992','0000111122','admin@emai.com','admin','admin','India')");
            JOptionPane.showMessageDialog(null, "Table Created Successfully");
        }
        catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
        }
    }
}
