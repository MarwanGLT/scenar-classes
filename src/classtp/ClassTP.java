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
        
        Voiture v1 = new Voiture();
        v1.marque = "Peugeot";
        v1.modele = "208";
        v1.annee = 2021;
        v1.prix = 14500;

        System.out.println("Voiture 1 : " + v1.marque + " " + v1.modele + " " + v1.annee + " " + v1.prix + "€");

        Voiture v2 = new Voiture();
        v2.marque = "Toyota";
        v2.modele = "Yaris";
        v2.annee = 2015;
        v2.prix = 9800;
        
        System.out.println("Voiture 2 : " + v2.marque + " " + v2.modele + " " + v2.annee + " " + v2.prix + "€");

        Voiture v3 = new Voiture();
        v3.marque = "Renault";
        v3.modele = "Clio";
        v3.annee = 2000;
        v3.prix = 3500;
        
        System.out.println("Voiture 3 : " + v3.marque + " " + v3.modele + " " + v3.annee + " " + v3.prix + "€");
}

    }
    
    
}
