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
public class Lala {
    
    public static int vidaLala(int perdasGanhos) {
        int hp = 100;
        hp = +perdasGanhos;
        return hp;
    }
    
    public static void background() {
        System.out.println("- - - Background - - -");
        String inicio = "Lala foi uma grande guerreira na batalha de 1890\nque resultou em pilhas imensas de corpos humanos.\n"
                + "Mas foi necessário para que o mundo muda-se e o progresso ocorresse. Acreditam que ela veio de uma pequena vila\n"
                + "oprimida pelo império Pariciotum. Lala se transformou em uma grande guerreira\nque luta pela justiça e equilíbrio de todas as nações.\n"
                + "Começou sua luta como mercenária do império que ela odiava, os Pariciotum.\nEra apenas um meio de descobrir as fraquezas do império e fazer justiça."
                + "Ao descobrir grandes falhas no império Lala as envia para os inimígos, os Reriquié.\nÉ ai que surger a grande batalha.\n";
        //Letras aparecem a cada 50ms.
        for (int i = 0; i < inicio.length(); i++) {
            AlgumasFuncoes.delay(50);
            System.out.print(inicio.charAt(i));
        }

    }
    
}
