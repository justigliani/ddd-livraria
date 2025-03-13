public class TesteLivro {
    public static void main(String[] args) {
        //Criar um objeto -> Instanciar um objeto
        //Sintaxe: Tipo nomeObjeto = new Tipo();
        Livro meuLivro = new Livro();
        meuLivro.titulo = "A hora da estrela";
        meuLivro.autor = "Clarice Lispector";
        meuLivro.editora = "Rocco";
        meuLivro.preço = 30;
        meuLivro.paginas = 88;
        meuLivro.tipoCapa = "Capa mole";
        meuLivro.resumos = "Macabéa, uma jovem nordestina ingenua, vive uma vida simples e miserável no Rio de Janeiro. " +
                "Sem perceber sua própria condição, enfrenta rejeições e dificuldades até que uma cartomante lhe promete" +
                "um futuro brilhante-mas o destino lhe reserva um fim trágico ";


    }
}
