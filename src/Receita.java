import java.sql.SQLOutput;

public class Receita {
    String nomeReceita;
    String cozinheira;
    String dificuldade;
    int tempoPreparo;
    int porçoes;
    String descriçao;
    String ingredientes;
    String modoPreparo;

    public void exibirReceita(){
        System.out.println("Receita de " + nomeReceita);
        System.out.println("===========================");
        System.out.println("Publicador por: " + cozinheira);
        System.out.println(dificuldade + "\t" + tempoPreparo + "\t" + porçoes);
        System.out.println(descriçao);
        System.out.println("Ingredientes\n" + ingredientes);
        System.out.println("Modo de preparo\n" + modoPreparo);
    }

    //Metodo com retorno
    public String exigirReceita2(){
        String mensagem = "Receita de" + nomeReceita +
                "\n===========================" +
                "\n Publicador por: \" + cozinheira" +
                "\n dificuldade + \"\\t\" + tempoPreparo + \"\\t\" + porçoes" +
                "\n dificuldade + \"\\t\" + tempoPreparo + \"\\t\" + porçoes " +
                "\n descriçao" +
                "\n \"Ingredientes\\n\" + ingredientes" +
                "\n Modo de preparo\\n\" + modoPreparo";


        return mensagem;
    }
}
