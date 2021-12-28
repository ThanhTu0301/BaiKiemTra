/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.baitaplon.helpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KimAnh
 */
public class DatabaseHelper {
   public static   Connection openConnection() throws SQLException, ClassNotFoundException{
       Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
       String connectionUrl = "jdbc:sqlserver://localhost:1433;database=BaiTapLon;";
       String dbusername = "sa";
       String password = "123";
       Connection con = DriverManager.getConnection(connectionUrl, dbusername, password);
       return con;  
   } 
}
