/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class Koneksi {
    protected Connection konek;
    protected Statement stmt;
    
    public Koneksi()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                konek = DriverManager.getConnection("jdbc:mysql://localhost:3306/akademik0130", "root", "");
            } catch (SQLException ex) {
                Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Class JDBC tidak ditemukan!");
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Statement createStatement() throws SQLException
    {
        return stmt = konek.createStatement();
    }
}
