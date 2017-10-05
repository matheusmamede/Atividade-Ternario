/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
import Model.Dao.*;

public class Principal {
    
     public static void main(String args[]) {
         Menu menu = new Menu();
         Menup menup = new Menup();
         Menud menud = new Menud();
         Menur menur = new Menur();
         Menuupda menuup =  new Menuupda();
         int valor=0;
         Scanner read= new Scanner(System.in);
         
         
         System.out.println("Digite o menu desejado");
         System.out.println(" ");
         System.out.println("1 - Cadastrar Gerente");
         System.out.println("2 - Pesquisar Gerente");
         System.out.println("3 - Deletar Gerente");
         System.out.println("4 - Cadastrar Local");
         System.out.println("5 - Pesquisar Local");
         System.out.println("6 - Deletar Local");
         System.out.println("7 - Cadastrar Projeto");
         System.out.println("8 - Pesquisar Projeto");
         System.out.println("9 - Deletar Projeto");
         System.out.println("10 - Cadastrar Relacionamento");
         System.out.print("Escolha:  ");
         valor=read.nextInt();
         
        switch(valor){
            case 1: menu.Menu1();
             break;
            case 2: menup.Menup1();
             break;
            case 3: menud.Menud1();
             break;
            case 4: menu.Menu2();
             break;
            case 5: menup.Menup2();
            break;
            case 6: menud.Menud2();
            break;
            case 7: menu.Menu3();
            break;
            case 8: menup.Menup3();
            break;
           case 9: menud.Menud3();
            break;
           case 10: menur.menur();
            break;

        }
       
    }
}
