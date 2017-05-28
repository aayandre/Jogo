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
public class ValidacaoDePersonagens {

    static void selecao(int numPersonagem) {

        switch (numPersonagem) {
            case 1:
                Bartolomeu.background();
                break;
            case 2:
                Darwin.background();
                break;
            case 3:
                Henry.background();
                break;
            case 4:
                Lala.background();
                break;
            default:
                selecao(numPersonagem);
                break;
        }

    }

}
