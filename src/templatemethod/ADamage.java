/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package templatemethod;

/**
 *
 * @author joaov
 */
public abstract class ADamage {
    private int dano;
    private boolean especial;

    public ADamage() {
    }
    
    public void montarAtaque(){
        montarDano();
        definirEspecial();
    }
    public abstract void montarDano();
    
    public abstract void definirEspecial();
    
    public void atacar(){
        System.out.println("Você deu um dano de: " + this.dano);
    }
    
    public abstract void aumentarDano();
    
    public void usarEspecial(){
        if(especial){
            System.out.println("Você usou o especial!");return;
        }
        System.out.println("Você não pode usar o especial!");
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    @Override
    public String toString() {
        return "ADamage{" + "dano=" + dano + ", especial=" + especial + '}';
    }
    
    
    
}
