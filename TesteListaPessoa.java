/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturadedados1;

import java.util.Scanner;

/**
 *
 * @author nathalia
 */
public class TesteListaPessoa {
    
    public static void main(String[] arg){
        
        ListaPessoa p1 = new ListaPessoa();
        Scanner ler = new Scanner(System.in);
        
        p1.inserir(p1);
        System.out.println("Informe o nome:");
        p1.setNome(ler.next());
        
        
        
        p1.alterar(p1);
        System.out.println("Nome que desja alterar:");
        p1.setNome(ler.next());
       
        
        }
      
        
    }
    

