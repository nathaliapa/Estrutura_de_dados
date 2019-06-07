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
public class TesteFila {
    
    public static void main(String[] arg){
        
        FilaInt minhafila = new FilaInt();
        FilaInt filaInical = new FilaInt();
        FilaInt filaResultante = new FilaInt();
        int aux[];
        
        
        int valor, qtde;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe os valores a ser inseridos:" );
        qtde=ler.nextInt();
        
        for(int i =0;i<10;i++){
         
          System.out.println("Informe o valor a ser inserido: ");
          valor = ler.nextInt();
          minhafila.inserir(valor);
        }
        
        //testar a remoção
       
        for(int i=0;i<10;i++){
       
        int valorRemovido = minhafila.remover();
        System.out.println("o valor removido é: " + valorRemovido);
       
        System.out.println("Informe o valor a ser exibido");
        int posicao = ler.nextInt();
        int valorposicao = minhafila.retornaValor(posicao);
        System.out.println("O valor presente na posição: " + posicao + "é: " + valorposicao);
        
        }
        
       boolean testeVazia = minhafila.vazia();
        System.out.println("Fila vazia"+ testeVazia);
    }
        
}
