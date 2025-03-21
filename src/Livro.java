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
        System.out.println("Livro:" + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Editora: " + editora.nome);
        System.out.println("Preço " + preço);
        System.out.println("Tipo de capa " +tipoCapa );
        System.out.println("---------------------------------\n");
    }
}
