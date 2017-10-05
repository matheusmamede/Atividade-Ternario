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
public class Local implements java.io.Serializable{

    
    private int id_local;
    private String nome;
   
    public Local(){
    }
    
    public Local(int id_local, String nome){
        this.id_local = id_local;
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }
 
    public void SetNome(String nome){
        this.nome = nome;
}

   public int getId_local(){
       return id_local;
   }

   public void SetId_local(int id_local){
       this.id_local = id_local;
   }
}
