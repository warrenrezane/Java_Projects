package Connection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Name of the User
 */

public class DatabaseConnection {
    private Connection con;
    
    private String DBUser;
    private String DBPass;
    private String DBName;
    private String DBUrl;
    
    private String error;
    
    private void initDBCon() {
        this.DBName = "testdb";
        this.DBUser = "root";
        this.DBPass = "dragons132";
        this.DBUrl = "jdbc:mysql://127.0.0.1:3306/" + this.DBName + "?useSSL=true";
    }
    
    public DatabaseConnection(){
        initDBCon();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(this.DBUrl, this.DBUser, this.DBPass);
        } catch (Exception e) {
            setError(error);
        }
    }
    
    public String getError() {
        return this.error;
    }
    
    public void setError(String error) {
        this.error = error;
    }
    
    public Connection getConnection() {
        return this.con;
    }
}