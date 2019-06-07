package estruturadedados;

import java.util.Scanner;

public class PilhaTest {

    public void main(String arg[]) {

        // 1)
        Pilha minhapilha = new Pilha();

        minhapilha.gerarPilha();

        //2)
        //Pilha minhapilha = new Pilha();
        Scanner ler = new Scanner(System.in);
        int qtde;

        System.out.println("Informe o tamnaho da pilha");
        qtde = ler.nextInt();
        for (int i = 0; i < qtde; i++) {
            System.out.println("Informe o valor a ser inserido na pilha");
            int valor = ler.nextInt();
            minhapilha.push(valor);
        }
        for (int i = 0; i < qtde; i++) {

            minhapilha.pop();

        }

        System.out.println(minhapilha.getTopo());

    }

}
