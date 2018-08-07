/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Mellar
 */
public class connecting {
Connection conn;
ResultSet rs;
Statement stmt;


   Connection SveRecords() throws SQLException
    {
  try{       
       String username = "root";
         String password = "";
         String url = "jdbc:mysql://localhost:3306/soscv";
         conn = DriverManager.getConnection(url, username, password);
         stmt= conn.createStatement();

 Class.forName("com.mysql.jdbc.Driver");
      JOptionPane.showMessageDialog(null, "You are now Online!");
         return conn;
     }catch(Exception e){
         JOptionPane.showMessageDialog(null, e);
         return null;
     }
        
}
    public static void main(String [] args) throws SQLException
    {
 connecting  lm = new connecting();
 lm.SveRecords();
    
    }
}