/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package templatemethod;

/**
 *
 * @author joaov
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Character p1 = new Character(new Life01(),new Damage01());
        System.out.println(p1.toString());
        p1.getDano().aumentarDano();
        System.out.println(p1.toString());
        Character p2 = new Character(new Life02(),new Damage02());
        System.out.println(p2.toString());
        
        
    }
    
}
