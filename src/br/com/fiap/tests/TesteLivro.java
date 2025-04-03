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
        rocco.nome = "Rocco";
        rocco.site = "www.rocco.com";
        rocco.telefone = "11948939520";

        //Criar um objeto -> Instanciar um objeto
        //Sintaxe: Tipo nomeObjeto = new Tipo();
        //Tipo nomeObjeto = new Tipo();
        Livro meuLivro = new Livro();
        meuLivro.titulo = "A hora da estrela";
        meuLivro.autor = "Clarice Lispector";
        meuLivro.editora = rocco;
        meuLivro.preço = 30;
        meuLivro.paginas = 88;
        //meuLivro.tipoCapa = br.com.fiap.enums.TipoCapaEnum.DURA;
        meuLivro.resumos = "Macabéa, uma jovem nordestina ingenua, vive uma vida simples e miserável no Rio de Janeiro. " +
                "Sem perceber sua própria condição, enfrenta rejeições e dificuldades até que uma cartomante lhe promete" +
                "um futuro brilhante-mas o destino lhe reserva um fim trágico ";

        meuLivro.exibirLivro();
        //---------------------------
        Livro livro = new Livro(rocco);
        System.out.println("Informe o titulo do livro");
        meuLivro.titulo = entrada.nextLine();

        System.out.println("Tipo de capa:  \n1  -  Comum\n2  -  Dura\n3  - Personalizada"  + "\nEscolha o tipo de capa desejada: ");
        int opcao = leitorNumerico.nextInt();
        if (opcao ==1)
            meuLivro.tipoCapa = TipoCapaEnum.COMUM;
        else if (opcao==2)
            meuLivro.tipoCapa = TipoCapaEnum.DURA;
        else
            meuLivro.tipoCapa = TipoCapaEnum.PERSONALIZADA;
    }
}
