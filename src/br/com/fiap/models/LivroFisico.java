package br.com.fiap.models;

public class LivroFisico extends Livro {
    private String endereço;
    private double taxaEntrega;

    @Override
    public void exibirLivro() {

    }

    public LivroFisico(String endereço) {
        this.endereço = endereço;
    }
}
