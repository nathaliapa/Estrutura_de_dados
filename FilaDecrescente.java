import java.util.Scanner;

public class FilaDecrescente {

    
    public static void main(String[] arg) {
    FilaInt filaA = new FilaInt();
    FilaInt filaB = new FilaInt();
    FilaInt filaC = new FilaInt();

    int valor, aux[] = null;
    Scanner ler = new Scanner(System.in);

    for (int i = 0;i< 10; i++) {
            if (i < 5) {
            System.out.println("Informe o valor a ser inserido na Fila A: ");
            filaA.inserir(ler.nextInt());
        } else if (i >= 5 && i < 10) {

            System.out.println("Informe o valor a ser inserido na Fila B: ");
            filaB.inserir(ler.nextInt());
        }

    }

    for (int i = 0;i< 10; i++) {
            if (i < 5) {
            int valorRemovido = filaA.remover();
            aux[i]=valorRemovido;
            filaC.inserir(valorRemovido);
        } else if (i >= 5 && i < 10) {
            int valorRemovido = filaB.remover();
            aux[i]=valorRemovido;
            filaC.inserir(valorRemovido);
            
        }

    }
    
    //fazer a parte descrecente
    for (int i = 0;i< 10; i++) {
            System.out.print("Fila Resultante " + filaC.retornaValor(i));
    }

}

}
