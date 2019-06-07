import java.util.Scanner;

public class Pilha {
   
    int[] vetor = new int[100];
    int topo = 0; 
    
   
    
    public int getTopo(){
        return topo;
    }    
    
    
    
    public void push(int i) {
        vetor[topo] = i;
        topo++;
    }
   
    
    
    public int pop() {
        int valor = vetor[topo-1];
        vetor[topo] = 0;
        topo--;
        return valor;
    }
   
    
    
    public boolean vazia() {
       if (topo == 0 && vetor[topo] == 0)
           return true;
       else
           return false;
    }
    
    
    
    public void gerarPilha(){
        Scanner ler = new Scanner(System.in);
        int tamanhoPilha = 0;
        int valor;
        System.out.println("Informe o tamanho da pilha: ");
        tamanhoPilha = ler.nextInt();
        for(int i = 0; i < tamanhoPilha; i++){
            System.out.println("Informe o valor a ser inserido na pilha");
            valor = ler.nextInt();
            push(valor);            
        }
    }

}
