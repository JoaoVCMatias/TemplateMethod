/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package templatemethod;

/**
 *
 * @author joaov
 */
public class Character {
    private ALife vida;
    private ADamage dano;

    public Character(ALife vida, ADamage dano) {
        this.vida = vida;
        this.dano = dano;
    }

    public ALife getVida() {
        return vida;
    }

    public ADamage getDano() {
        return dano;
    }

    @Override
    public String toString() {
        return "Character{" + vida.toString() + ", dano=" + dano.toString() + '}';
    }
    
    

}
