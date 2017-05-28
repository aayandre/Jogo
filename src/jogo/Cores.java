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
public class Cores {

    public static void reset() {
        System.out.printf("\u001b[0m");
    }

    public static void negrito(boolean ligado) {
        if (ligado) {
            System.out.printf("\u001b[1m");
        } else {
            System.out.printf("\u001b[22m");
        }
    }

    public static void cor(String cor) {
        int valor = 0;

        switch (cor.toLowerCase()) {
            case "preto":
            case "preta":
                valor = 30;
                break;
            case "vermelho":
                valor = 31;
                break;
            case "verde":
                valor = 32;
                break;
            case "amarelo":
                valor = 33;
                break;
            case "azul":
                valor = 34;
                break;
            case "magenta":
                valor = 35;
                break;
            case "ciano":
                valor = 36;
                break;
            case "branco":
            case "branca":
                valor = 37;
                break;
        }

        System.out.printf("\u001b[%dm", valor);
    }

    public static void fundo(String cor) {
        int valor = 0;

        switch (cor.toLowerCase()) {
            case "preto":
            case "preta":
                valor = 40;
                break;
            case "vermelho":
                valor = 41;
                break;
            case "verde":
                valor = 42;
                break;
            case "amarelo":
                valor = 43;
                break;
            case "azul":
                valor = 44;
                break;
            case "magenta":
                valor = 45;
                break;
            case "ciano":
                valor = 46;
                break;
            case "branco":
            case "branca":
                valor = 47;
                break;
        }

        System.out.printf("\u001b[%dm", valor);
    }

}
