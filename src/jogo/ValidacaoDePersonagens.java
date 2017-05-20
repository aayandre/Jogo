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
                //Bartolomeu.historia();
                break;
            case 2:
                //Darwin.historia();
                break;
            case 3:
                //Henry.historia();
                break;
            case 4:
                //Lala.historia();
                break;
            default:
                selecao(numPersonagem);
                break;
        }

    }

}
