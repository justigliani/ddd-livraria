package br.com.fiap.tests;

import br.com.fiap.models.Receita;

public class TesteReceita {
    public static void main(String[] args) {
        //Instanciar um objeto = Criar o objeto
        Receita boloFuba = new Receita();
        boloFuba.nomeReceita = "Bolo de fuba";
        boloFuba.cozinheira = "Milaflor24.moura";
        boloFuba.dificuldade = "fácil";
        boloFuba.tempoPreparo = 35;
        boloFuba.porçoes = 8;
        boloFuba.descriçao = "O bolo de fubá simples combina com um cafezinho no lanche da tarde. Fácil de preparar, a receita leva menos de 10 ingredientes.\n" +
                "\n" +
                "Ele é ideal para quem busca um bolo fofinho e muito saboroso. Confira o passo a passo!";
        boloFuba.ingredientes = "1 xícara de chá de óleo\n" +
                "4 ovos\n" +
                "2 xícaras de chá de açúcar\n" +
                "1 xícara de chá de leite morno\n" +
                "2 xícaras de chá de farinha de trigo\n" +
                "1 xícara de chá de fubá\n" +
                "1 colher de sopa de fermento em pó";
        boloFuba.modoPreparo = "1\n" +
                "Bata no liquidificador o óleo, ovos e a açúcar até ficar homogêneo. Depois, adicione leite e bata novamente .\n" +
                "2\n" +
                "Com o liquidificador batendo, adicione farinha de trigo aos poucos.\n" +
                "3\n" +
                "Acrescente o fubá e bata até misturar bem.\n" +
                "4\n" +
                "Sem bater, acrescente o fubá e misture com uma espátula.\n" +
                "5\n" +
                "Despeje em uma forma untada com manteiga. Leve para assar em forno preaquecido a 250 graus Celsius por 35 minutos.";

        //Metodo sem retorno

        System.out.println(boloFuba.tempoPreparo + "endereço" + boloFuba);
        Receita boloFubaJuliana = new Receita();
        boloFubaJuliana.tempoPreparo = 50;
        System.out.println(boloFuba.tempoPreparo + " " + boloFubaJuliana.tempoPreparo + " endereço " + boloFubaJuliana);

        boloFuba.exibirReceita();
        boloFuba.exigirReceita2();


    }


}
