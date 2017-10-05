/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Dao;

import Controller.Conexao;
import Model.Bean.Projeto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Matheus
 */
public class Projetodao {
    public void criar_projeto(Projeto p){
        
       Conexao con = new Conexao();
       
       PreparedStatement stmt = null; 
       
        try {
            stmt = Conexao.getConnection().prepareStatement("Insert INTO projeto (nome) VALUES(?) ");
            stmt.setString(1,p.getNome());
           
            
            stmt.executeUpdate();
            
            System.out.println("Projeto registrado com sucesso");
            
            
                        
        } catch (SQLException ex) {
          System.out.println("Erro no registro "+ ex);
            
        
        } finally{
       
              Conexao.closeConnection(Conexao.getConnection(), stmt);
              
              
            
        }
    
    }

 public void select_projeto(Projeto p){
       Conexao con = new Conexao();
       
       PreparedStatement stmt = null; 
       
        try {
            stmt = Conexao.getConnection().prepareStatement("Select * FROM projeto WHERE nome = ?");
            stmt.setString(1,p.getNome());
           
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

public void delete_projeto(Projeto p){
      
         Conexao con = new Conexao();
         PreparedStatement stmt = null; 
       
        try {
            stmt = Conexao.getConnection().prepareStatement("DELETE FROM projeto WHERE id_projeto = ?");
            stmt.setInt(1,p.getId_projeto());
     
            stmt.executeUpdate();
            
            
                        
        } catch (SQLException ex) {
          System.out.println("Erro no registro "+ ex);
            
        
        } finally{
       
              Conexao.closeConnection(Conexao.getConnection(), stmt);
        }
     }


}