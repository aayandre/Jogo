/*
 * André de Amorim Yamamoto
 * aay.andre@outlook.com
 * Turma A
 */
package jogo;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author andré.yamamoto <aayandre94@gmail.com>
 */
public class AlgumasFuncoes {

    static Scanner ler = new Scanner(System.in);

    static String entradaDeDadosTXT() {

        String texto = ler.next();

        return texto;

    }

    static int entradaDeDadosINT() {

        int num = ler.nextInt();

        return num;
    }

    static void pressioneParaContinuar() {
        System.out.println("\n| - - - Pressione Enter para continuar - - - |");
        try {
            System.in.read();
        } catch (IOException e) {
        }
    }

    //Funções para gerar um delay. Thread: seria o processo -- .sleep: seria a função utilizada nos processos.
    static void delay(int num) {
        try {
            Thread.sleep(num);
        } catch (InterruptedException e) {

        }
    }

}
