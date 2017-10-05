/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Dao;

import Model.Bean.Gerente;
import java.util.Scanner;

/**
 *
 * @author Matheus
 */
public class Menuupda {
    public void Menuupda1(){
        Scanner read= new Scanner(System.in);
        
        String nome;
        
       
           Gerente gerentebean = new Gerente();   
        
        System.out.print("Digite o nome do Gerente que deseja alterar: ");
        nome=read.nextLine();
        gerentebean.SetNome(nome);
        
        System.out.println("Digite o novo nome:  ");
        nome=read.nextLine();
        gerentebean.SetNome(nome);
        
        Gerentedao gerentedao= new Gerentedao();
        gerentedao.update_gerente(gerentebean);
        
        
    }
}
