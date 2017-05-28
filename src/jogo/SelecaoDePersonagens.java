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
public class SelecaoDePersonagens {

    static int opcoes() {

        System.out.println("Escolha um dos personagens abaixo: ");

        System.out.println("Personagens: ");

        Cores.cor("ciano");
        System.out.println("1 - Bartolomeu:");
        System.out.println("(Características)\n");

        Cores.cor("verde");
        System.out.println("2 - Darwin:");
        System.out.println("(Características)\n");

        Cores.cor("azul");
        System.out.println("3 - Henry:");
        System.out.println("(Características)\n");

        Cores.cor("vermelho");
        System.out.println("4 - Lala:");
        System.out.println("(Características)\n");
        
        Cores.reset();
        System.out.println("Selecione um personagem: ");
        int numPersonagem = AlgumasFuncoes.entradaDeDadosINT();

        return numPersonagem;
    }
}
