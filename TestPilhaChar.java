package estruturadedados;

import java.util.Scanner;

public class TestPilhaChar {

    public static void main(String[] args) {

        /*
         //exercicio expresao matematica
         PilhaChar minhapilha = new PilhaChar();
         Scanner ler = new Scanner(System.in);
         int qtde;
         int abre = 0;
         int fecha = 0;
        

         minhapilha.gerarPilha();
        
         for (int i = 0; i < minhapilha.getTopo(); i++) {

         String valor = minhapilha.pop();
            
            
         if(valor.equals("(")){
         System.out.println("Valor valido ");
                
                 
                 
                 
         if (valor.equals("(")) {
         abre++;
         } else {
         fecha++;

         }

         if(abre==fecha){

         System.out.println("A qauntidade abre e fecha igual");

         }else{

         System.out.println("a qauntidade de abre e fecha esta diferente");

         }
                
                
                
                
         }else{
         System.out.println("Valor invalido");
         }      

         }
         }
         
         */
        
        //exercico 2
        
        PilhaChar minhapilha2 = new PilhaChar();
        Scanner ler = new Scanner(System.in);
        
        
        minhapilha2.gerarPilha();

        int meio = minhapilha2.getTopo() / 2;
        
        String aux[] = new String[meio];
        
        for (int i = 0; i < meio; i++) {
           
            aux[i] = minhapilha2.pop();
        
        }
          /*     
        for(int i = aux.length - 1; i > 0; i--){
            
            if (aux[i].equals(minhapilha2.pop())) {
                System.out.println("letras corespondentes é palindrome");
            } else{
                System.out.println("Letra nao corespondentes não é palindrome");
            }
            break;
        }
        */
        
       
        int i = aux.length - 1;
         while(i>0){
          
             if (aux[i].equals(minhapilha2.pop())) {
                System.out.println("letras corespondentes é palindrome");
            } else{
                System.out.println("Letra nao corespondentes não é palindrome");
            }
           i--;
           break;
           
        }
         
         
    
   }
    
}
