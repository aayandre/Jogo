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
    
    public static void basicInfo() {
        Cores.cor("azul");
        System.out.println("3 - Henry:");
        System.out.println("(Características)\n");
        Cores.reset();
    }

    public static int vidaHenry(int perdasGanhos) {
        int hp = 100;
        hp = +perdasGanhos;
        return hp;
    }

    public static void background() {
        System.out.println("- - - Background - - -");
        String inicio = "Nascido em 1898, Henry veio de uma família pobre, porém de grande respeito.\n"
                + "A mãe de Henry teve de sair do emprego.\nA família entrava cada vez mais em declínio.\n"
                + "Quando Henry completou 13 anos ele começou a trabalhar com um comerciante.\n"
                + "Mas havia uma forma melhor de ganhar dinheiro... As Competições.\n";
        //Letras aparecem a cada 50ms.
        for (int i = 0; i < inicio.length(); i++) {
            AlgumasFuncoes.delay(50);
            System.out.print(inicio.charAt(i));
        }

    }

    public static void primeiraParte() {
        
    }

}
