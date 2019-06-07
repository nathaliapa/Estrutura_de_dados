/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturadedados;

// instanciar uma pessoa

import java.util.Scanner;



public class TesteLPC {
    
    public static void main(String[] arg){
        
        Scanner ler = new Scanner(System.in);

        Pessoa minhaPessoa = new Pessoa();
        ListaPessoa minhaLista = new ListaPessoa();
        Cachorro meuCachorro = new Cachorro();
        ListaCachorro minhaListaCa = new ListaCachorro();
        
        
        int qtde;
        System.out.println("informe a qauntidade de cachorro a ser inseridas:");
        qtde = ler.nextInt();
        
        for(int i=0; i<qtde;i++){
        //inseri 10 pessoas;    
        minhaPessoa = new Pessoa();
        meuCachorro = new Cachorro();
        //--------------pessoa------------------------//
        
        System.out.println("informe o nome de uma pessoa: ");
        minhaPessoa.setNome(ler.next());

        System.out.println("informe a idade:");
        minhaPessoa.setIdade(ler.next());

        System.out.println("informe o sexo:");
        minhaPessoa.setSexo(ler.next());

        System.out.println("informe o cpf:");
        minhaPessoa.setCpf(ler.next());

        System.out.println("informe o endereço é:");
        minhaPessoa.setEndereco(ler.next());

        //inserindo a pessoa instanciada na Lista de Pessoas
       
        minhaLista.inserir(minhaPessoa);
        
        //-------------cachorro--------------------------//
        
        System.out.println("informe o nome do cachorro: ");
        meuCachorro.setNome(ler.next());

        System.out.println("informe a raça:");
        meuCachorro.setRaca(ler.next());

        System.out.println("informe o peso:");
        meuCachorro.setPeso(ler.nextInt());

        System.out.println("informe a cor:");
        meuCachorro.setCor(ler.next());

        System.out.println("informe o Pedigree:");
        meuCachorro.setPedigree(ler.next());

        //inserindo a pessoa instanciada na Lista de Pessoas
       
        minhaListaCa.inserir(meuCachorro);
        }
        
        
        //exibindo o tamanho da lista de pessoas
        minhaLista.retornaTamanhoLista();
        minhaListaCa.retornaTamanhoLista();
        
        
        //pegando o retorno do método retornaTamanhoLista e exibindo na tela
        System.out.println("O retorno do método é: " + minhaLista.retornaTamanhoLista());
        System.out.println("O retorno do método é: " + minhaListaCa.retornaTamanhoLista());
        
         for(int i=0;i<10;i++){
            
             System.out.println("insira o cpf a ser alterado:");
            minhaLista.alterar(ler.next());

            //--------cachorro--------------------//
            System.out.println("insira a raça a ser alterada:");
            minhaListaCa.alterar(ler.next());
            
        }
        
        for(int i=0;i<10;i++){
            
            System.out.println("Informe o cpf da pessoa a ser removido:");
            minhaLista.remover(ler.next());
            //------------------cachorro--------------------------//
            System.out.println("Informe o cpf da pessoa a ser removido:");
            minhaListaCa.remover(ler.next());
            
        }
        
        
        
        
    }
    
}
