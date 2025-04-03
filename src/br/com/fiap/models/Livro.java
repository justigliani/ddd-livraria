package br.com.fiap.models;

import br.com.fiap.enums.TipoCapaEnum;

public class Livro {
    //Atributo tipo nomeAtributo;
    String titulo;
    String autor;
    double preço;
    Editora editora;
    int paginas;
    String resumos;
    TipoCapaEnum tipoCapa; //COMUM, DURA, PERSONALIZADA

    //Construtor
    public Livro(){
        tipoCapa = TipoCapaEnum.COMUM;
    }
    public  Livro(Editora editora){
        this.editora = editora;
        tipoCapa = TipoCapaEnum.COMUM;
    }


    public void exibirLivro(){
        System.out.println("br.com.fiap.models.Livro:" + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("br.com.fiap.models.Editora: " + editora.nome);
        System.out.println("Preço " + preço);
        System.out.println("Tipo de capa " +tipoCapa );
        System.out.println("---------------------------------\n");
    }
}
