/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Dao;

import Controller.Conexao;
import Model.Bean.Relacionamentoglp;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Matheus
 */
public class Relacionamentoglpdao {
         
    public void criar_relacionamento(Relacionamentoglp r){
        
       Conexao con = new Conexao();
       
       PreparedStatement stmt = null; 
       
        try {
            stmt = Conexao.getConnection().prepareStatement("Insert INTO relacionamento_glp (id_gerente, id_local, id_projeto) VALUES(?,?,?)");
            stmt.setInt(1, r.getId_gerente());
            stmt.setInt(2, r.getId_local());
            stmt.setInt(3, r.getId_projeto());
            
            stmt.executeUpdate();
            
            System.out.println("Relacionamento registrado com sucesso");
            
            
                        
        } catch (SQLException ex) {
          System.out.println("Erro no registro "+ ex);
            
        
        } finally{
       
              Conexao.closeConnection(Conexao.getConnection(), stmt);
              
              
            
        }
    }

}