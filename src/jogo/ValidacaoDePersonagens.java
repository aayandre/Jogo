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
                System.out.print("Você escolheu o ");
                Cores.cor("ciano");
                System.out.print("Bartolomeu");
                Cores.reset();
                System.out.println(", certo?");
                AlgumasFuncoes.pressioneParaContinuar();
                break;
            case 2:
                System.out.print("Você escolheu o ");
                Cores.cor("verde");
                System.out.print("Darwin");
                Cores.reset();
                System.out.println(", certo?");
                AlgumasFuncoes.pressioneParaContinuar();
                break;
            case 3:
                System.out.print("Você escolheu o ");
                Cores.cor("azul");
                System.out.print("Henry");
                Cores.reset();
                System.out.println(", certo?");
                AlgumasFuncoes.pressioneParaContinuar();
                break;
            case 4:
                System.out.print("Você escolheu o ");
                Cores.cor("vermelho");
                System.out.print("Lala");
                Cores.reset();
                System.out.println(", certo?");
                AlgumasFuncoes.pressioneParaContinuar();
                break;
            default:
//                SelecaoDePersonagens.opcoesOutrasVezes();
                break;
        }
    }
}
