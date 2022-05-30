/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package templatemethod;

/**
 *
 * @author joaov
 */
public class Damage01 extends ADamage {

    public Damage01() {
        this.montarDano();
        this.definirEspecial();
    }

    
    @Override
    public void aumentarDano() {
        this.setDano(this.getDano() + 1);
    }

    @Override
    public void montarDano() {
        this.setDano(10);
    }

    @Override
    public void definirEspecial() {
        this.setEspecial(false);
    }
    
    
    
}
