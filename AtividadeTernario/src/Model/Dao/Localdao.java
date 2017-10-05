/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Dao;

import Controller.Conexao;
import Model.Bean.Local;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Matheus
 */
public class Localdao {
    public void criar_local(Local l){
        
       Conexao con = new Conexao();
       
       PreparedStatement stmt = null; 
       
        try {
            stmt = Conexao.getConnection().prepareStatement("Insert INTO local (nome) VALUES(?) ");
            stmt.setString(1,l.getNome());
           
            
            stmt.executeUpdate();
            
            System.out.println("Local registrado com sucesso");
            
            
                        
        } catch (SQLException ex) {
          System.out.println("Erro no registro "+ ex);
            
        
        } finally{
       
              Conexao.closeConnection(Conexao.getConnection(), stmt);
              
              
            
        }
    }
 
        public void select_local(Local l){
       Conexao con = new Conexao();
       
       PreparedStatement stmt = null; 
       
        try {
            stmt = Conexao.getConnection().prepareStatement("Select * FROM local WHERE nome = ?");
            stmt.setString(1,l.getNome());
           
            ResultSet rs = stmt.executeQuery();
            
           if(rs.next()){
               System.out.println("Exito");
           } 
            else{
               System.out.println("Não existe no banco de dados");
           }  
           
            
            
                        
        } catch (SQLException ex) {
          System.out.println("Erro no registro "+ ex);
            
        
        } finally{
       
              Conexao.closeConnection(Conexao.getConnection(), stmt);
              
              
            
        }
    
    }

public void delete_local(Local l){
      
         Conexao con = new Conexao();
         PreparedStatement stmt = null; 
       
        try {
            stmt = Conexao.getConnection().prepareStatement("DELETE FROM local WHERE id_local = ?");
            stmt.setInt(1,l.getId_local());
     
            stmt.executeUpdate();
            
            
                        
        } catch (SQLException ex) {
          System.out.println("Erro no registro "+ ex);
            
        
        } finally{
       
              Conexao.closeConnection(Conexao.getConnection(), stmt);
        }
     }

}
