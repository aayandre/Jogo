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
public class HistoriaManager {

    //Local para colocar todas as histórias referentes a cada personagem
    static Historia CreateHistoriaBartolomeu() {

        String background = "Bartolomeu era um mercador que viajava entre os impérios de\nAstroi, Pariciotum, Reriquié e Viekiere.\n"
                + "Ele era bem conhecido nas feiras das capitais de cada império,\npois conseguia trazer armamentos com muita qualidade.\n"
                + "O material e a tecnologia das armas eram desconhecidas.\nAté que um dia ele descobriu que seu fornecedor foi raptado.\n"
                + "Porque as armas que Bartolomeu comerciava eram pontos chave para a vitória de guerras e grandes batalhas.\n";

        String primeiraParte = "xxxxx";

        String fim = "lalalal";

        Historia bartolomeu = new Historia(background, primeiraParte, fim);
        return bartolomeu;
    }

    static Historia CreateHistoriaDarwin() {

        String background = "Darwin é um alquimista do império Viekiere.\n"
                + "E foi um dos grandes estudantes do colégio de Hawkins.\nMas sem muito reconhecimento.\n"
                + "Esta falta de reconhecimento o incentivou a mergulhar mais nos estudos.\n"
                + "Foi quando Darwin conheceu Elisa. Que conquistou pouco a pouco seu coração.\n"
                + "Elisa e sua família estavam envolvidos em alguns problemas com o castelo.\n"
                + "Cabia a Darwin agora ajuda-la ou continuar com seu objetivo principal o conhecimento.\n";

        String primeiraParte = "Coisas";

        String fim = "Fim";

        Historia darwin = new Historia(background, primeiraParte, fim);
        return darwin;
    }

    static Historia CreateHistoriaHenry() {

        String background = "Nascido em 1898, Henry veio de uma família pobre, porém de grande respeito.\n"
                + "A mãe de Henry teve de sair do emprego.\nA família entrava cada vez mais em declínio.\n"
                + "Quando Henry completou 13 anos ele começou a trabalhar com um comerciante.\n"
                + "Mas havia uma forma melhor de ganhar dinheiro... As Competições.\n";

        String primeiraParte = "Coisas";

        String fim = "Fim";

        Historia henry = new Historia(background, primeiraParte, fim);
        return henry;
    }

    static Historia CreateHistoriaLala() {

        String background = "Lala foi uma grande guerreira na batalha de 1890\nque resultou em pilhas imensas de corpos humanos.\n"
                + "Mas foi necessário para que o mundo muda-se e o progresso ocorresse. Acreditam que ela veio de uma pequena vila\n"
                + "oprimida pelo império Pariciotum. Lala se transformou em uma grande guerreira\nque luta pela justiça e equilíbrio de todas as nações.\n"
                + "Começou sua luta como mercenária do império que ela odiava, os Pariciotum.\nEra apenas um meio de descobrir as fraquezas do império e fazer justiça."
                + "Ao descobrir grandes falhas no império Lala as envia para os inimígos, os Reriquié.\nÉ ai que surger a grande batalha.\n";

        String primeiraParte = "Coisas";

        String fim = "Fim";

        Historia lala = new Historia(background, primeiraParte, fim);
        return lala;
    }
    
}
