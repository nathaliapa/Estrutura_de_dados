
import java.util.Scanner;


public class FilaInt1 {
    
    public static void main(String[] arg){
        
        Scanner ler = new Scanner(System.in);
        FilaInt fila1= new FilaInt();
        FilaInt fila2 = new FilaInt();
        int qtde;
        int[] aux = new int[100];
        
        
        System.out.println("Informe a qauntidade de valores:");
        qtde=ler.nextInt();
        
        //inseri valores
        
        for(int i=0;i<qtde;i++){
            System.out.println("Informe o valor inserido:");
            int valor = ler.nextInt();
            fila1.inserir(ler.nextInt());
            fila2.inserir(valor);
        }
        // valor que remove da fila 1 para a fila 2
        for(int i=0;i<qtde;i++){
            int valor= fila1.remover();
            fila2.inserir(valor);
        }
        
        
        
        
        
        //-----------------outra forma de remover----------------------------------------//
        
        for(int i=0;i<qtde;i++){
            System.out.println("Informe o valor inserido:");
            int valor = ler.nextInt();
            fila1.inserir(ler.nextInt());
            
        }
        // valor que remove da fila 1 para a fila 2
        for(int i=0;i<qtde;i++){
            int valor = fila1.remover();
            aux[i]=valor;            
            fila2.inserir(valor);
        }
        
        for(int i =0;i<qtde;i++){
            int valor = aux[i];
            fila2.inserir(valor);
            
        }
        
        //////--------------atividade 1--------------///////////
        
         for(int i=0;i<qtde;i++){
            System.out.println("Informe o valor inserido:");
            int valor = ler.nextInt();
            fila1.inserir(ler.nextInt());
            
        }
        // valor que remove da fila 1 para a fila 2
        for(int i=0;i<qtde;i++){
            int valor = fila1.remover();
            aux[i]=valor;            
            fila2.inserir(valor);
        }
        
    }
    
}
