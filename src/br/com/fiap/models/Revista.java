package br.com.fiap.models;

import br.com.fiap.interfaces.Exemplar;

public class Revista implements Exemplar {
    private String nome;
    private String descricao;
    private String preco;
    private Editora editora;

    public String getNome(){
        return nome;
    }

    public String getPreco(){
        return preco;
    }
    public void exibirLivro(){
        System.out.println("Revista: " + nome);
        System.out.println("Editora: " + editora.getNome());
        System.out.println("Preço:" = preco);
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setDescricao(String descricao) {
         this.descricao = descricao;
    }
    public void setPreco(String preco) {
        this.preco = preco;
    }
}