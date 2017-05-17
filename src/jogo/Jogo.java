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
        System.out.println("Personagens: ");
        
        Cores.cor("verde");
        System.out.println("Darwin:");
        System.out.println("(Características)\n");
        
        Cores.cor("azul");
        System.out.println("Henry:");
        System.out.println("(Características)\n");
        
        Cores.cor("vermelho");
        System.out.println("Lala:");
        System.out.println("(Características)\n");

        System.out.println("Selecione um personagem: ");
        String personagem = ler.next();

        //Encontrando o personagem e validando-o
        while (!"darwin".equalsIgnoreCase(personagem.replaceAll(" ", ""))
                && !"henry".equalsIgnoreCase(personagem.replaceAll(" ", ""))
                && !"lala".equalsIgnoreCase(personagem.replaceAll(" ", ""))) {
            
            //Revalidação do personagem
            System.out.println("Escolha um dos personagens.");
            personagem = ler.next();
        }//Encontrando o personagem e validando-o -- FIM
        
        //Checando qual será o personagem/história usada
        switch(personagem.toLowerCase()) {
            case "darwin":
                //Colocarei a classe da história do personagem
            case "henry":
                //Colocarei a classe da história do personagem
            case"lala":
                //Colocarei a classe da história do personagem
                
        }//Checando qual será o personagem/história usada -- FIM
        
        
    }
}
