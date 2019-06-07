/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturadedados;

import java.util.Scanner;

/**
 *
 * @author nathalia
 */
public class Lista {

    Scanner ler = new Scanner(System.in);
    String[] vetor = new String[100];

 
    
    
    
   // ** a quantidade vai ser informado no metodo (main)  *********************************** 
    
     public void InserirComParametro(int quantidade ) {
     
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Informe o nome ser inserido:");
            vetor[i] = ler.next();
        }
        
     
     }
    
    //**************************************************************************************
    
    public void inserir() {

        System.out.println("Informe qauntos nomes serão inseridos: ");
        int quantidade = ler.nextInt();

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Informe o nome ser inserido:");
            vetor[i] = ler.next();
        }
       

    }

    public void remover() {
        String nome;
        System.out.println("Informe o nome da pessoa a ser removida:");
        nome = ler.next();
        for (int i = 0; i < 100; i++) {
            if (vetor[i].equals(nome)) {
                vetor[i] = null;
            }
        }
    }
    
    // **  remover com retorno no main *********************************************
  
    public int RemoverComRetorno() {
        int retorno = 0 ;
        String nome;
        System.out.println("Informe o nome da pessoa a ser removida:");
        nome = ler.next();
        for (int i = 0; i < 100; i++) {
            if (vetor[i].equals(nome)) {
                System.out.println("Pessoa removida: " + vetor[i]);
                vetor[i] = null;
                retorno = i;
            }
        }
        return retorno;
    }
    //***************************************************************************************

   public void alterar(){

        String nome;
        System.out.println("Informe o nome da pessoa a ser alterado:");
        nome = ler.next();
        for (int i = 0; i < 100; i++) {
            if (vetor[i].equals(nome)) {
                System.out.println("Informe o novo nome:");
                nome = ler.next();
                vetor[i] = nome ;
            }
        }	
	}

    public void exibir() {
         String nome;
        System.out.println("Informe o nome da pessoa a ser alterado:");
        nome = ler.next();
        for (int i = 0; i < 100; i++) {
            if (vetor[i].equals(nome)) {
                System.out.println("O nome é :" + vetor[i]);
                
            }
        }   
        
        
        }



}
            

