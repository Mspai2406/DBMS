/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author HP
 */
public class MySqlConnect {
    Connection conn=null;
    public static Connection ConnectDB(){
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/test1", "root", "Kayu@1999");
            JOptionPane.showMessageDialog(null,"connected to databasa");
            return conn;
            
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
    
}
