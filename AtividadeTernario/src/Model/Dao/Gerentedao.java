/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Dao;

import Controller.Conexao;
import Model.Bean.Gerente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author aluno
 */
public class Gerentedao {
     public void criar_gerente(Gerente g){
        
       Conexao con = new Conexao();
       
       PreparedStatement stmt = null; 
       
        try {
            stmt = Conexao.getConnection().prepareStatement("Insert INTO gerente (nome) VALUES(?) ");
            stmt.setString(1,g.getNome());
           
            
            stmt.executeUpdate();
            
            System.out.println("Gerente registrado com sucesso");
            
            
                        
        } catch (SQLException ex) {
          System.out.println("Erro no registro "+ ex);
            
        
        } finally{
       
              Conexao.closeConnection(Conexao.getConnection(), stmt);
              
              
            
        }
    
    }

 
     public void select_gerente(Gerente g){
        
       Conexao con = new Conexao();
       
       PreparedStatement stmt = null; 
       
        try {
            stmt = Conexao.getConnection().prepareStatement("Select * FROM gerente WHERE nome = ?");
            stmt.setString(1,g.getNome());
           
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

     public void update_gerente(Gerente g){
       
         Conexao con = new Conexao();
         PreparedStatement stmt = null; 
       
        try {
            stmt = Conexao.getConnection().prepareStatement("UPDATE gerente SET (nome) VALUES (?) ");
            stmt.setString(1,g.getNome());
            
     
            stmt.executeUpdate();
            
          
            
                        
        } catch (SQLException ex) {
          System.out.println("Erro no registro "+ ex);
            
        
        } finally{
       
              Conexao.closeConnection(Conexao.getConnection(), stmt);
        }
     }

    public void delete_gerente(Gerente g){
      
         Conexao con = new Conexao();
         PreparedStatement stmt = null; 
       
        try {
            stmt = Conexao.getConnection().prepareStatement("DELETE FROM gerente WHERE id_gerente = ?");
            stmt.setInt(1,g.getId_gerente());
     
            stmt.executeUpdate();
            
            
                        
        } catch (SQLException ex) {
          System.out.println("Erro no registro "+ ex);
            
        
        } finally{
       
              Conexao.closeConnection(Conexao.getConnection(), stmt);
        }
     }

}