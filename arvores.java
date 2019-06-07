package Arvore;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import static java.lang.System.in;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author nathalia
 */
public class arvores {
    
    public static void main(String arg[]){
     
    
    HashMap<Integer,String> minhaHash = new HashMap<Integer,String>();
    Scanner ler = new Scanner(in);   
   
    for(int i=0;i<10;i++){
    
    System.out.println("Informa um nome:");
        
    minhaHash.put( i , ler.next() ); 
           
    }
    
    for(int i=0;i<10;i++){
        
     System.out.println(minhaHash.get(i));
    }

    System.out.println( minhaHash);

           
        
   // Scanner ler = new Scanner(in);
    HashMap<String,ArrayList<String>> Hash2 = new HashMap <> ();
        
    for(int i=0;i<10;i++){
        
        ArrayList<String>lista = new ArrayList();
        
        System.out.println("Informe a Inicial do nome:");
        String inicial = ler.next();
        System.out.println("Informe quantos nomes serão inseridos");       
            for(int a=0;a<ler.nextInt();a++){
            System.out.println("Informa um nome:");
            lista.add(ler.next());
        }
          Hash2.put(  inicial , lista ); 
    }
    
        System.out.println(Hash2);
      
}
    
    
}
