package br.com.fiap.tests;

import br.com.fiap.enums.TipoCapaEnum;
import br.com.fiap.models.Editora;
import br.com.fiap.models.Livro;

import java.util.Scanner;

public class TesteLivro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner leitorNumerico = new Scanner(System.in);;


        //Criando um objeto do tipo br.com.fiap.models.Editora chamado rocco
        Editora rocco = new Editora();
        rocco.setNome("Rocco");
        rocco.setSite("www.rocco.com");
        rocco.setTelefone("11948939520");

        //Criar um objeto -> Instanciar um objeto
        //Sintaxe: Tipo nomeObjeto = new Tipo();
        //Tipo nomeObjeto = new Tipo();
        Livro meuLivro = new Livro();
        meuLivro.setTitulo("A hora da estrela");
        meuLivro.setAutor("Clarice Lispector");
        meuLivro.setEditora(rocco);
        meuLivro.setPreco(30);
        meuLivro.setPaginas(88);
        //meuLivro.tipoCapa = br.com.fiap.enums.TipoCapaEnum.DURA;
        meuLivro.setResumo("Macabéa, uma jovem nordestina ingenua, vive uma vida simples e miserável no Rio de Janeiro. " +
                "Sem perceber sua própria condição, enfrenta rejeições e dificuldades até que uma cartomante lhe promete" +
                "um futuro brilhante-mas o destino lhe reserva um fim trágico ");

        meuLivro.exibirLivro();
        //---------------------------
        Livro livro = new Livro(rocco);
        System.out.println("Informe o titulo do livro");
        meuLivro.setTitulo(entrada.nextLine());

        System.out.println("Tipo de capa:  \n1  -  Comum\n2  -  Dura\n3  - Personalizada"  + "\nEscolha o tipo de capa desejada: ");
        int opcao = leitorNumerico.nextInt();
        if (opcao ==1)
            meuLivro.setTipoCapa(TipoCapaEnum.COMUM);
        else if (opcao==2)
            meuLivro.setTipoCapa(TipoCapaEnum.DURA);
        else
            meuLivro.setTipoCapa(TipoCapaEnum.PERSONALIZADA);
    }
}
