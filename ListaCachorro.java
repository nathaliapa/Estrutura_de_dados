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
public class ListaCachorro {
    
    Cachorro[] vetor = new Cachorro[100];
     private int tamanhoDaLista = 0;

    Scanner ler = new Scanner(System.in);
    
     public void inserir(Cachorro meuCachorro ) {
        for (int i = 0; i < 100; i++) {
            if (vetor[i] == null) {
                vetor[i] = meuCachorro;
                tamanhoDaLista++;
                break;
            }

        }

    }
    
     public Cachorro remover(String racaCachorro) {

        Cachorro meuCachorro = new Cachorro();
        String raca;

        for (int i = 0; i < 100; i++) {

            meuCachorro = vetor[i];
            raca = meuCachorro.getRaca();

            if (raca.equals(racaCachorro)) {
                vetor[i] = null;
                tamanhoDaLista--;
            }
        }

        return meuCachorro;
    }
    
      public int retornaTamanhoLista() {

        System.out.println("O tamanho da minha lista é : " + tamanhoDaLista);
        return tamanhoDaLista;

    }
      
      public void alterar(String racaCachorro) {
     
        Cachorro meuCachorro = new Cachorro();
        String raca , nome ;

        for (int i = 0; i < 100; i++) {

            raca = meuCachorro.getRaca();

            if (raca.equals(racaCachorro)) {
                System.out.println("Novo nome : ");
                nome=ler.next();
                meuCachorro.setRaca(nome);
                // vetor[i].setCpf(ler.next());
                vetor[i]=meuCachorro;
                
            }
        }
    
    }
      
       public void exibir(String racaCachorro){
       
        Cachorro meuCachorro = new Cachorro();
        String raca , nome ;

        for (int i = 0; i < 100; i++) {

            raca = meuCachorro.getRaca();

            if (raca.equals(racaCachorro)) {
                System.out.println("O nome do cachorro é:" + meuCachorro.getNome());
                System.out.println("A raça é:" + meuCachorro.getRaca());
                System.out.println("O peso é:" + meuCachorro.getPeso());
                System.out.println("A cor é:" + meuCachorro.getCor());
                System.out.println("O pedigree é:" + meuCachorro.getPedigree());
              
            }
            
        }
            
       
    }
      
      
}
