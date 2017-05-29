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
public class CaracterManager {

    public static Caracter findCaracterById(int idCaracter, Caracter[] caracteres) {

        for (Caracter caractere : caracteres) {
            if (idCaracter == caractere.Id) {
                return caractere;
            }
        }

        return null;
    }

    static Caracter[] createCaracteres() {

        Caracter bartolomeu = new Caracter(1, "Bartolomeu", 100);
        bartolomeu.Historia = HistoriaManager.CreateHistoriaBartolomeu();

        Caracter darwin = new Caracter(2, "Darwin", 100);
        darwin.Historia = HistoriaManager.CreateHistoriaDarwin();

        Caracter henry = new Caracter(3, "Henry", 100);
        henry.Historia = HistoriaManager.CreateHistoriaHenry();

        Caracter lala = new Caracter(4, "Lala", 100);
        henry.Historia = HistoriaManager.CreateHistoriaLala();
        
        Caracter[] caracteres = {bartolomeu, darwin, henry, lala};

        return caracteres;
    }

    static void printCaracteres(Caracter[] caracteres) {
        System.out.println("| - - - - Personagens - - - - |");
        for (Caracter caractere : caracteres) {
            /*Id do personagem/caractere de acordo com a posição do for no array
            chamado caracteres.
            */
            System.out.print(caractere.Id + " - ");
            //Nome do mesmo.
            System.out.print(caractere.Name);
            //E Vida atribuida ao mesmo.
            System.out.println(" HP: " + caractere.Vida);
        }
    }

}
