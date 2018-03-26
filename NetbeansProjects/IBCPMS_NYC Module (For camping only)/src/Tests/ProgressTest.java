/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import Connection.DatabaseConnection;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.sql.Connection;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.SwingWorker;

/**
 *
 * @author Name of the User
 */
public class ProgressTest {
    static Connection con;
    static DatabaseConnection dbcon;
    
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Connecting.....");
        jFrame.setUndecorated(true);
        jFrame.setSize(263, 30);
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        jFrame.setLocation(dim.width/2 - jFrame.getSize().width/2, dim.height/2 - jFrame.getSize().height);
        
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(new BorderLayout());
        jFrame.setLocationRelativeTo(null);
        
        
        final JProgressBar prog_connect = new JProgressBar();
        prog_connect.setMinimumSize(new Dimension(10, 14));
        prog_connect.setPreferredSize(new Dimension(146, 14));
        prog_connect.setMaximumSize(new Dimension(32767, 14));
        jFrame.add(prog_connect);
        jFrame.setVisible(true);
    
        SwingWorker sw = new SwingWorker() {
            @Override
            protected Void doInBackground() {
                prog_connect.setIndeterminate(true);
                try {
                    dbcon = new DatabaseConnection();
                    con = dbcon.getConnection();
                } catch (Exception e) {
                    dbcon.getError();
                    System.out.println(dbcon.getError());
                }
                
                return null;
            }
            
            @Override
            protected void done() {
                
                prog_connect.setIndeterminate(false);
                System.out.println("Successfully Connected! ");
                System.exit(0);
            }
        };
        sw.execute();
    }
}
