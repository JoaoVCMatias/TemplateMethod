/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package templatemethod;

/**
 *
 * @author joaov
 */
public abstract class ALife {
    private int vida;
    private int defesa;

    public ALife() {
    }
    public void montarLife(){
        definirVida();
        definirDefesa();
    }
    
    public abstract void definirVida();
    
    public abstract void definirDefesa();
    
    public abstract void receberDano();
    
    public void reveberCura(){
        this.vida+=1;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    @Override
    public String toString() {
        return "Status vida: {" + "vida=" + vida + ", defesa=" + defesa + '}';
    }
    
    
    
    
    
    
    
}
