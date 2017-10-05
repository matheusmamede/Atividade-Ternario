/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aluno
 */
public class Conexao {
     public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/empresa";
    public static final String USER = "root";
    public static final String PASS = "";
    
    
    
    public static java.sql.Connection getConnection(){
      
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
           throw new RuntimeException("Erro na conexão", ex);
        }
    
    }
    
    
    
    public static void closeConnection(java.sql.Connection con){
        
        if(con != null){
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }
    
    
    public static void closeConnection(java.sql.Connection con, PreparedStatement stmt){
        
        closeConnection(con);
        
        if(stmt !=null){
            
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }
    
    public static void closeConnection(java.sql.Connection con, PreparedStatement stmt, ResultSet rs){
        
        closeConnection(con, stmt);
        
        if (rs !=null){
            
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
