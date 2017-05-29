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

    static int opcoesPrimeiraVez() {

        System.out.println("Escolha um dos personagens abaixo: ");

        System.out.println("Personagens: ");

        Bartolomeu.basicInfo();

        Darwin.basicInfo();

        Henry.basicInfo();

        Lala.basicInfo();

        System.out.println("Selecione um personagem: ");
        int numPersonagem = AlgumasFuncoes.entradaDeDadosINT();

        return numPersonagem;
    }

    static int[] jaJogados(int numPersonagem) {

        int jaJogados[] = new int[3];

        switch (numPersonagem) {
            case 1:
                jaJogados[0] = 1;
                break;
            case 2:
                jaJogados[1] = 1;
                break;
            case 3:
                jaJogados[2] = 1;
                break;
            case 4:
                jaJogados[3] = 1;
                break;
        }
        
        return jaJogados;
    }

    static int opcoesOutrasVezes(int jaJogados[]) {

        int personagensJogados[] = jaJogados;

        for (int i = 0; i < personagensJogados.length; i++) {

        }

        Cores.reset();
        System.out.println("Selecione um personagem: ");
        int numPersonagem = AlgumasFuncoes.entradaDeDadosINT();

        return numPersonagem;
    }
}
