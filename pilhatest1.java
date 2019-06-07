package estruturadedados;

import java.util.Scanner;

public class TestPilhaChar {

    public static void main(String[] args) {

      PilhaChar minhapilha2 = new PilhaChar();
      Scanner ler = new Scanner(System.in);
      String aux[] = null;

      minhapilha2.gerarPilha();

      int meio = minhapilha2.getTopo()/2;

      for (int i = 0; i < meio; i++) {

          aux[i] = minhapilha2.pop();

      }

      for(int i = vetor.length; i > 0; i--){

        if (!aux[a].equals(minhapilha2.pop())) {
          System.out.println("nao e palindrome");
            }
    }


      System.out.println("é palindrome");

    }


  }
