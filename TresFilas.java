import java.util.Scanner;

public class TresFilas {

    public static void main(String[] arg) {

        FilaInt fila = new FilaInt();
        FilaInt fila_Impares = new FilaInt();
        FilaInt fila_Pares = new FilaInt();

        int valor, qtde;
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe quantos numeros sera inserido:");
        qtde = ler.nextInt();

        for (int i = 0; i < qtde; i++) {
            System.out.println("Informe o valor a ser inserido: ");
            fila.inserir(ler.nextInt());
        }

        for (int i = 0; i < qtde; i++) {
            
            if(fila.retornaValor(i)%2==0){
                fila_Pares.inserir(fila.retornaValor(i));
            }else{
                fila_Impares.inserir(fila.retornaValor(i));
            }
            
        }
        
        for(int i=0;i<0;i++){
            
            System.out.println("Pares:" + fila_Pares.retornaValor(i) + "Impares:" + fila_Impares.retornaValor(i));
            
        }
        
    }

}
