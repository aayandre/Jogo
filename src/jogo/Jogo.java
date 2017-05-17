/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

import java.util.Scanner;

/**
 *
 * @author andre.ayamamoto
 */
public class Jogo {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        //Entrada
        Cores.cor("vermelho");
        System.out.println("Personagens: \nDarwin:\n(Características)\n\nHenry:\n(Características)\n\nLala:\n(Características)\n\n");
        //Adicionar cor aos nomes----------------------

        System.out.println("Selecione um personagem: ");
        String personagem = ler.next();

        //Encontrando o personagem e validando-o
        while (!"darwin".equalsIgnoreCase(personagem.replaceAll(" ", ""))
                && !"henry".equalsIgnoreCase(personagem.replaceAll(" ", ""))
                && !"lala".equalsIgnoreCase(personagem.replaceAll(" ", ""))) {
            
            //Revalidação do personagem
            System.out.println("Escolha um dos personagens.");
            personagem = ler.next();
        }//Encontrando o personagem e validando-o FIM
        
        //Checando qual será o personagem/história usada
        //if()
    }
}
