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

        /*Criação de personagens/caracters.
        O array, do Tipo Caracter. com o nome de caracteres recebe os
        personagens/caracteres que estão criados dentro da classe(?)
        CaracterManager.
         */
        Caracter[] caracteres = CaracterManager.createCaracteres();

        /*Mostra os personagens. 
        No CaracterManager existe uma função de exibir/imprimir os caracteres
        chamada printCaracteres. Só para aparecer as características principais
        de cada um e o usuario escolher com qual jogará.
         */
        CaracterManager.printCaracteres(caracteres);

        //Escolha do personagem. 
        System.out.print("Escolha o personagem(número): ");
        int idCaracter = AlgumasFuncoes.entradaDeDadosINT();

        //Valida a entrada com o personagem escolhido
        Caracter escolhido = CaracterManager.findCaracterById(idCaracter, caracteres);

        if (escolhido == null) {
            System.out.println("Personagem Inválido");
        } else {
            escolhido.Played = true;
            AlgumasFuncoes.printWithDelay(escolhido, 30);
        

        AlgumasFuncoes.pressioneParaContinuar();
        
        System.out.println(escolhido.Historia.PrimeiraParte);
        }

//        System.out.println("NOME DO JOGO");
//
//        //Escolha de Personagem
//        int numSelecionado = SelecaoDePersonagens.opcoesPrimeiraVez();
//
//        //Valida o personagem selecionado
//        ValidacaoDePersonagens.selecao(numSelecionado);
//
//        //Guarda os personagens já jogados
//        SelecaoDePersonagens.jaJogados(numSelecionado);
//
//        //Entra na história
//        Historias.primeiraSelecao(numSelecionado);
//
//        //Quando a primeira história acabar. Mostrar histórias restantes ou fechar/acabar o jogo
    }
}
