/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package templatemethod;

/**
 *
 * @author joaov
 */
public class Life01 extends ALife {

    public Life01() {
        montarLife();
    }

    
    @Override
    public void receberDano() {
        this.setVida(this.getVida()-2);
    }

    @Override
    public void definirVida() {
        this.setVida(10);
    }

    @Override
    public void definirDefesa() {
        this.setDefesa(5);
    }

    
    
    
}
