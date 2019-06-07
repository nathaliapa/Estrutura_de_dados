package estruturadedados;

import java.util.Scanner;

public class PilhaChar {

    String[] vetor = new String[100];
    int topo = 0;

    public int getTopo() {
        return topo;
    }

    public void push(String caracter) {
        vetor[topo] = caracter;
        topo++;
    }

    public String pop() {
        String caracter = vetor[topo - 1];
        vetor[topo] = null;
        topo--;
        return caracter;
    }

    public boolean vazia() {
        if (topo == 0 && vetor[topo] == null) {
            return true;
        } else {
            return false;
        }
    }

    public void gerarPilha() {
        Scanner ler = new Scanner(System.in);
        int tamanhoPilha = 0;
        String valor;
        System.out.println("Informe o tamanho da pilha: ");
        tamanhoPilha = ler.nextInt();
        for (int i = 0; i < tamanhoPilha; i++) {
            System.out.println("Informe o valor a ser inserido na pilha");
            valor =ler.next();
            push(valor);
        }
    }

}
