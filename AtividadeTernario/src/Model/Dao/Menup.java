/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Dao;

import Model.Bean.*;
import java.util.Scanner;


/**
 *
 * @author Matheus
 */
public class Menup {
    public void Menup1(){
       
        String nome;
        Scanner read = new Scanner(System.in);
        
        Gerente gerentebean = new Gerente();   
        
        System.out.print("Informe o nome do gerente:  ");
        nome = read.nextLine();
        
        gerentebean.SetNome(nome);
        
        Gerentedao gerentedao= new Gerentedao();
        gerentedao.select_gerente(gerentebean);
           
          
}
    
    public void Menup2(){
        String nome;
        Scanner read = new Scanner(System.in);
        
        Local localbean = new Local();   
        
        System.out.print("Informe o nome do local:  ");
        nome = read.nextLine();
        
        localbean.SetNome(nome);
        
        Localdao localdao= new Localdao();
        localdao.select_local(localbean);
    }

  public void Menup3(){
        String nome;
        Scanner read = new Scanner(System.in);
        
        Projeto projetobean = new Projeto();   
        
        System.out.print("Informe o nome do projeto:  ");
        nome = read.nextLine();
        
        projetobean.SetNome(nome);
        
        Projetodao projetodao= new Projetodao();
        projetodao.select_projeto(projetobean);
    }

}