/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package templatemethod;

/**
 *
 * @author joaov
 */
public class Damage02 extends ADamage {
    public Damage02() {
        this.montarDano();
        this.definirEspecial();
    }
    @Override
    public void montarDano() {
        this.setDano(20);
    }

    @Override
    public void definirEspecial() {
        this.setEspecial(true);
    }

    @Override
    public void aumentarDano() {
        this.setDano(this.getDano()+2);
    }
    
}
