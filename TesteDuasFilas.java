import java.util.Scanner;

public class TesteDuasFilas {

    public static void main(String[] arg) {

        FilaInt filaA = new FilaInt();
        FilaInt filaB = new FilaInt();
        FilaInt filaResultante = new FilaInt();

        int valor, aux[] = null;
        Scanner ler = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o valor a ser inserido na Fila A: ");
            filaA.inserir(ler.nextInt());
        }

        for (int i = 5; i < 10; i++) {
            System.out.println("Informe o valor a ser inserido na Fila B: ");
            filaB.inserir(ler.nextInt());
        }

        for (int i = 0; i < 10; i++) {
            filaResultante.inserir(filaA.retornaValor(i));
                      
            filaResultante.inserir(filaB.retornaValor(i));
            
        }

        System.out.print("Fila Resultante ");
        for (int i = 0; i < 10; i++) {
            
            System.out.print(filaResultante.retornaValor(i));
        }

    }

}
