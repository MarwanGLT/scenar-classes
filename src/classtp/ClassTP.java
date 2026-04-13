/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classtp;

/**
 *
 * @author marwan
 */
public class ClassTP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Pneu p1 = new Pneu(205, 55, 16, "été");
    Voiture v1 = new Voiture("Peugeot", "208", 2021, 14500, p1);

v1.afficherDescription();

}

    }
