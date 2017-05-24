/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

/**
 *
 * @author andre.ayamamoto
 */
public class Henry {

    public static void background() {
        System.out.println("- - - Background - - -");
        String historia = "Nascido em 1898, Henry veio de uma família pobre, porém de grande respeito.\n"
                + "A mãe de Henry teve de sair do emprego e a família entrava cada vez mais em declínio.\n"
                + "Quando Henry completou 13 anos ele começou a trabalhar com um comerciante.\n";
        for (int i = 0; i <= historia.length(); i++) {
            delay(5000);
            System.out.println(historia.charAt(i));
            System.out.flush();
        }

    }

    public static void delay(int num) {
        try {
            Thread.sleep(num);
        } catch (InterruptedException ex) {
        }
    }

}
