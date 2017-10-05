/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Dao;

import Model.Bean.Relacionamentoglp;
import java.util.Scanner;

/**
 *
 * @author Matheus
 */
public class Menur {
    public void menur(){
    
         int id1;
         int id2;
         int id3;
         
        Scanner read = new Scanner(System.in);
        
        Relacionamentoglp relbean = new Relacionamentoglp();   
        
        System.out.print("Informe o id do gerente:  ");
        id1 = read.nextInt();
        relbean.SetId_gerente(id1);
        System.out.print("Informe o id do local:  ");
        id2 = read.nextInt();
        relbean.SetId_local(id2);
        System.out.print("Informe o id do projeto:  ");
        id3 = read.nextInt();
        relbean.SetId_projeto(id3);
        
        
        Relacionamentoglpdao reldao= new Relacionamentoglpdao();
        reldao.criar_relacionamento(relbean);
}
}
