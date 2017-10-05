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
 * @author aluno
 */
public class Menu {
    public void Menu1(){
        Scanner read= new Scanner(System.in);
        
        String nome;
       
           Gerente gerentebean = new Gerente();   
        
        System.out.print("Digite o nome do Gerente: ");
        nome=read.nextLine();
        
     
        gerentebean.SetNome(nome);
        
        Gerentedao gerentedao= new Gerentedao();
        gerentedao.criar_gerente(gerentebean);
        
        
    }
      public void Menu2() {
          
          Scanner read= new Scanner(System.in);
        
        String nome;
       
           Local localbean = new Local();
        
        
        System.out.print("Digite o nome do Local: ");
        nome=read.nextLine();
        
     
        localbean.SetNome(nome);
        
        Localdao localdao= new Localdao();
        localdao.criar_local(localbean);
      }
    
      public void Menu3(){
          Scanner read= new Scanner(System.in);
        
        String nome;
       
           Projeto projetobean = new Projeto();
        
        
        System.out.print("Digite o nome do Projeto: ");
        nome=read.nextLine();
        
     
        projetobean.SetNome(nome);
        
        Projetodao projetodao= new Projetodao();
        projetodao.criar_projeto(projetobean);
      }

}

