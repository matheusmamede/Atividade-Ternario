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
public class Menud {
    public void Menud1(){
       
        int id;
        Scanner read = new Scanner(System.in);
        
        Gerente gerentebean = new Gerente();   
        
        System.out.print("Informe o id do gerente que deseja apagar:  ");
        id = read.nextInt();
        
        gerentebean.SetId_gerente(id);
        
        Gerentedao gerentedao= new Gerentedao();
        gerentedao.delete_gerente(gerentebean);
}

    public void Menud2(){
        
        int id;
        Scanner read = new Scanner(System.in);
        
        Local localbean = new Local();   
        
        System.out.print("Informe o id do local que deseja apagar:  ");
        id = read.nextInt();
        
        localbean.SetId_local(id);
        
        Localdao localdao= new Localdao();
        localdao.delete_local(localbean);
    }

    public void Menud3(){
    
        int id;
        Scanner read = new Scanner(System.in);
        
        Projeto projetobean = new Projeto();   
        
        System.out.print("Informe o id do projeto que deseja apagar:  ");
        id = read.nextInt();
        
        projetobean.SetId_projeto(id);
        
        Projetodao projetodao= new Projetodao();
        projetodao.delete_projeto(projetobean);
   
    }

}