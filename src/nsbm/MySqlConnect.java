/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nsbm;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


/**
 *
 * @author Rangoda
 */
public class MySqlConnect {
    
    public static Connection ConnectDB() throws SQLException{
        //Connection conn=null;
        try{
            Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/nsbm","root","1234");
            JOptionPane.showMessageDialog(null, "Connected to the database");
            return conn;
        }catch(SQLException ex){
            Logger.getLogger(MySqlConnect.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
            return null;
    }
}
}