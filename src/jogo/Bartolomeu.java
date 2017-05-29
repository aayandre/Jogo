/*
 * André de Amorim Yamamoto
 * aay.andre@outlook.com
 * Turma A
 */
package jogo;

/**
 *
 * @author andré.yamamoto <aayandre94@gmail.com>
 */
public class Bartolomeu {

    public static void basicInfo() {
        Cores.cor("ciano");
        System.out.println("1 - Bartolomeu:");
        System.out.println("(Características)\n");
        Cores.reset();
    }

    public static int vidaBartolomeu(int perdasGanhos) {
        int hp = 100;
        hp += perdasGanhos;
        return hp;
    }

    public static void background() {
        System.out.println("- - - Background - - -");
        String inicio = "Bartolomeu era um mercador que viajava entre os impérios de\nAstroi, Pariciotum, Reriquié e Viekiere.\n"
                + "Ele era bem conhecido nas feiras das capitais de cada império,\npois conseguia trazer armamentos com muita qualidade.\n"
                + "O material e a tecnologia das armas eram desconhecidas.\nAté que um dia ele descobriu que seu fornecedor foi raptado.\n"
                + "Porque as armas que Bartolomeu comerciava eram pontos chave para a vitória de guerras e grandes batalhas.\n";
        //Letras aparecem a cada 50ms.
        for (int i = 0; i < inicio.length(); i++) {
            AlgumasFuncoes.delay(50);
            System.out.print(inicio.charAt(i));
        }

    }

}
