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
public class Gerente implements java.io.Serializable{


    private int id_gerente;
    private String nome;
 
  
    public Gerente (){
    }
    
    public Gerente(int id_gerente, String nome){
        this.id_gerente = id_gerente;
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }
 
    public void SetNome(String nome){
        this.nome = nome;
}

   public int getId_gerente(){
       return id_gerente;
   }

   public void SetId_gerente(int id_gerente){
       this.id_gerente = id_gerente;
   }

}