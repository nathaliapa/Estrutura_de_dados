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
public class TesteLista {
    
    public static void main (String[] arg){
        
        Lista minhalista = new Lista();
        
        minhalista.inserir();
        
        // ** pasagem com parametro
        Scanner ler= new Scanner(System.in);
               
        System.out.println("Informe o numero de pessoas a inserir");
        int quantidade = ler.nextInt();
        minhalista.InserirComParametro(quantidade);
        
        
        minhalista.remover();

        // ** remover com retorno
        int pegaRetorno;
         
        pegaRetorno= minhalista.RemoverComRetorno();
        System.out.println("o indice é: " + pegaRetorno);
        
        
        
    }
    
}
