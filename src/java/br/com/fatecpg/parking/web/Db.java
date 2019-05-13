package br.com.fatecpg.parking.web;

import java.sql.Connection;
import java.sql.DriverManager;


public class Db {
    public static final String DRIVER_CLASS = "org.apache.derby.jdbc.ClientDriver";
    public static final String URL = "jdbc:derby://localhost:1527/parking";
    public static final String USER = "parking";
    public static final String PASS = "parking";
    
    
    public static Connection getConnection()throws Exception{
    Class.forName(Db.DRIVER_CLASS); 
    return DriverManager.getConnection(URL, USER, PASS);
}
    
}
