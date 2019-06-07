
import java.util.Scanner;

public class FilaInt {

    private int[] vetor = new int[100];
   
    private int tamanhoFila = 0;

    public int getTamanho() {
        return tamanhoFila;
    }

    public void inserir(int valor) {
        vetor[tamanhoFila] = valor;
        tamanhoFila++;
    }

    public boolean vazia() {
        if (tamanhoFila == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int retornaValor(int posicao) {
        return vetor[posicao];
    }

    public int remover() {
        int valor;
        valor = vetor[0];
        for (int i = 0; i < tamanhoFila; i++) {
            vetor[i] = vetor[i + 1];
        }
        vetor[tamanhoFila] = 0;
        tamanhoFila--;
        System.out.println("Valor Removido: " + valor);
        return valor;

    }

    /*
    public void gerarFila(int tamanho) {
        Scanner ler = new Scanner(System.in);
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Informe o valor: ");
            vetor[i] = ler.nextInt();
            tamanhoFila++;
        }
    }
     */
}
