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
public class Jogo {

    public static void main(String[] args) {

        System.out.println("NOME DO JOGO");

        //Escolha de Personagem
        int numSelecionado = SelecaoDePersonagens.opcoes();

        //Valida e entra na história do personagem selecionado
        ValidacaoDePersonagens.selecao(numSelecionado);
        AlgumasFuncoes.pressioneParaContinuar();

    }
}
