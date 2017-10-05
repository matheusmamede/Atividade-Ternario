/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Bean;

/**
 *
 * @author aluno
 */
public class Projeto implements java.io.Serializable{
   
    private int id_projeto;
    private String nome;
    
    public Projeto (){
    }
    
    public Projeto(int id_projeto, String nome){
        this.id_projeto = id_projeto;
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }
 
    public void SetNome(String nome){
        this.nome = nome;
}

   public int getId_projeto(){
       return id_projeto;
   }

   public void SetId_projeto(int id_projeto){
       this.id_projeto = id_projeto;
   }
}
