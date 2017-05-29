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
public class Caracter {

    public boolean Played = false;

    public String Name;
    
    public Historia Historia;
    
    public int Vida;
    
    public int Id;
    
    public Caracter(int num, String name, int vida) {
        this.Name = name;
        this.Vida = vida;
        this.Id = num;
    }
    
    public void TomarDano(int dano) {
        this.Vida -= dano;
    }
    
}
