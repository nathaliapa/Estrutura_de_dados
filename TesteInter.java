import java.util.Scanner;

public class TesteInter {

    public static void main(String[] arg) {

        FilaInt minhaFila = new FilaInt();  //basico para declarar uma variave
        int valor, qtde;
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe quantos valores serao inseridos");
        qtde = ler.nextInt();

        // exemplo de exclusao
        for (int i = 0; i < 5; i++) {

            System.out.println("Informe o valor a ser inserido: ");
            valor = ler.nextInt();
            minhaFila.inserir(valor);
        }

        // exemplo de remoção
            int removerValor = minhaFila.remover();
            System.out.println("Valor removido é;" + removerValor);

        // exemplo de exibir vaor
            
            System.out.println("informe a posição");
            int posição = ler.nextInt();
            int valorPosição = minhaFila.retornaValor(posição);
            
            
         //    
    
    
    
    }
      
        
    }


