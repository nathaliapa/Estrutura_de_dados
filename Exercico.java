package Arvore;

import static java.lang.System.in;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Exercico {

    public static void main(String arg[]) {

        Scanner ler = new Scanner(in);
        HashMap<String, ArrayList<String>> Hash2 = new HashMap<>();

        System.out.println("Iforme a qauntidade de Chave");
        int quat = ler.nextInt();
        for (int i = 0; i < quat; i++) {

            ArrayList<String> lista = new ArrayList();

            System.out.println("Informe a Inicial da letra:");
            String inicial = ler.next();

            System.out.println("Informe qauntidade a ser inseridos");
            int b = ler.nextInt();

            for (int a = 0; a < b; a++) {
                System.out.println("Informa a letra:");
                lista.add(ler.next());
            }

            Hash2.put(inicial, lista);

        }
        //mostra todos elementos contido na HashMap
        
        System.out.println(Hash2);
    }

}


/*

for(int i=0;i<hash.size();i++){
 ararrylist resultado = hash.get("a");
    for(int j=0;j<resultado.size();j++){

  system.out.println(" "+resultado.get(1));
 }
}


ele compara o tamanho da hashmap.size  e mostra cada chave


for (int i = 0; i < Hash2.size(); i++) {
           
            System.out.println("Informe a letra");
            System.out.println(Hash2.get(ler.next()));
             
        }

mostra a posicação escolida

 for (int i = 0; i < quat; i++) {
           
            System.out.println("Informe a letra");
            System.out.println(Hash2.get(ler.next()));
             
        }

*/