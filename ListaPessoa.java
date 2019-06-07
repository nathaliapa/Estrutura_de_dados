
package estruturadedados1;

import java.util.Scanner;


public class ListaPessoa {
   
    Scanner ler = new Scanner(System.in);
    ListaPessoa[] vetor = new ListaPessoa[10];
    private String nome;
    private String snome;
    private int tamanhoDaLista = 0;

    
    public String getSnome() {
        return snome;
    }

    public void setSnome(String snome) {
        this.snome = snome;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
    public void inserir(ListaPessoa nome) {
        for (int i = 0; i < 10; i++) {
                vetor[i] = nome;
                tamanhoDaLista++;
              }

    }
    
    public String alterar(ListaPessoa nome){
        
             
     for (int i = 0; i < 10; i++) {
        
         nome=vetor[i];
         
         if(vetor[i] == nome){
            System.out.println("Novo nome : ");
            snome=ler.next();
               
             
         }
     }
        return snome;
        
    }
  
    

}
