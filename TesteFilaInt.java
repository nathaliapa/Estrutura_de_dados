
import java.util.Scanner;


public class TesteFilaInt {

    public static void main(String[] arg) {

        FilaInt filaInical = new FilaInt();  //basico para declarar uma variavel
        FilaInt filaResultante = new FilaInt();
        int aux[]=null;

        int valor;
        Scanner ler = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            System.out.println("Informe o valor a ser inserido: ");
            valor = ler.nextInt();
            filaInical.inserir(valor);
        }

        //testar a remoção
        for (int i = 0; i < 5; i++) {
            
            int removerValor=filaInical.remover();
            aux[i]=removerValor;
            filaResultante.inserir(aux[i]);
            
        }
        
        System.out.print("Fila Resultante:" );
        for (int i = 0; i < 5; i++) {
            
            System.out.print(filaResultante.retornaValor(i));
        }

        
    }

}
