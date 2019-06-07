/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturadedados.FilaGenerica;

import estruturadedados.Pessoa;
import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author nathalia
 */
public class TestFilaGenerica {

    public static void main(String[] arg) {

        FilaGenerica< String> fila2 = new FilaGenerica< String>();
        FilaGenerica< Integer> fila1 = new FilaGenerica< Integer>();
        FilaGenerica< Pessoa> pessoa = new FilaGenerica< Pessoa>();

        //for instanciar pessoa e adicionar pessoas
        Scanner ler = new Scanner(System.in);

        System.out.println("Informa a qauntidade a ser inserido:");
        int tamanho = ler.nextInt();

        for (int i = 0; i < tamanho; i++) {

            Pessoa p1 = new Pessoa();

            System.out.println("Nome:");
            p1.setNome(ler.next());

            System.out.println("CPF:");
            p1.setCpf(ler.next());

            System.out.println("Idade:");
            p1.setIdade(ler.nextInt());

            pessoa.insere(p1);
            

        }
        for (int i = 0; i < tamanho; i++) {

            System.out.println(pessoa.get(i));

        }

    }

}
