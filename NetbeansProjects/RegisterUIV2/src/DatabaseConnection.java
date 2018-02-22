

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Name of the User
 */
import com.mysql.jdbc.exceptions.jdbc4.CommunicationsException;
import java.sql.*;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.WARNING_MESSAGE;

public class DatabaseConnection {
    private Connection con;
    
    private String DBUser;
    private String DBPass;
    private String DBName;
    private String DBUrl;
    
    private void initDBCon() {
        this.DBName = "testdb";
        this.DBUser = "warren";
        this.DBPass = "warren";
    }
    
    public DatabaseConnection(String ip) throws ClassNotFoundException {
        initDBCon();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://" + ip + ":3306/" + this.DBName + "?useSSL=true", this.DBUser, this.DBPass);
        } catch (CommunicationsException e) {
            JOptionPane.showMessageDialog(null, "Server communication failure. ", "View Responses", WARNING_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "The Server is Offline. ", "View Responses", WARNING_MESSAGE);
        }
    }
    
    public Connection getConnection(){
        return this.con;
    }
}