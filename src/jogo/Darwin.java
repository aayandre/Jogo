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
public class Darwin {
    
    public static int vidaDarwin(int perdasGanhos) {
        int hp = 100;
        hp = +perdasGanhos;
        return hp;
    }
    
    public static void background() {
        System.out.println("- - - Background - - -");
        String inicio = "Darwin é um alquimista do império Viekiere.\n"
                + "E foi um dos grandes estudantes do colégio de Hawkins.\nMas sem muito reconhecimento.\n"
                + "Esta falta de reconhecimento o incentivou a mergulhar mais nos estudos.\n"
                + "Foi quando Darwin conheceu Elisa. Que conquistou pouco a pouco seu coração.\n"
                + "Elisa e sua família estavam envolvidos em alguns problemas\n com o castelo. Cabia a Darwin agora ajuda-la ou continuar com seu objetivo principal o conhecimento.\n";
        //Letras aparecem a cada 50ms.
        for (int i = 0; i < inicio.length(); i++) {
            AlgumasFuncoes.delay(50);
            System.out.print(inicio.charAt(i));
        }

    }
    
}
