/*
 * André de Amorim Yamamoto
 * aay.andre@outlook.com
 * Turma A
 */
package jogo;

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
    
    static boolean jogoVelha() {
        
        boolean resultado = false;
        return resultado;
    }

}
