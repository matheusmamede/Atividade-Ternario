/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Bean;


/**
 *
 * @author Matheus
 */
public class Relacionamentoglp implements java.io.Serializable{
   
    private int id_gerente;
    private int id_local;
    private int id_projeto;

   public Relacionamentoglp (){
    }
    
    public Relacionamentoglp(int id_gerente, int id_local, int id_projeto){
        this.id_gerente = id_gerente;
        this.id_local = id_local;
        this.id_projeto = id_projeto;
    }

    public int getId_gerente(){
        return id_gerente;
    }
 
    public void SetId_gerente(int id_gerente){
        this.id_gerente = id_gerente;
}

   public int getId_local(){
       return id_local;
   }

   public void SetId_local(int id_local){
       this.id_local = id_local;
   
   }
    public int getId_projeto(){
       return id_projeto;
   }

   public void SetId_projeto(int id_projeto){
       this.id_projeto = id_projeto;
   
   }
}
