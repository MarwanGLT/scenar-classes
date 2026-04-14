package classtp;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marwan
 */
public class Voiture {
    String marque;
    String modele;
    int annee;
    double prix;
    Pneu pneu;

public void afficherDescription() {
    System.out.println("Marque : " + marque);
    System.out.println("Modèle : " + modele);
    System.out.println("Année : " + annee);
    System.out.println("Prix : " + prix + " €");
    System.out.println("Age : " + calculAge());
}


    public Voiture(String marque, String modele, int annee, double prix, Pneu pneu) {
    this.marque = marque;
    this.modele = modele;
    this.annee = annee;
    this.prix = prix;
    this.pneu = pneu;
    }
    

        public void appliquerReduction(double pourcentage){
        prix = prix*pourcentage;
        System.out.println("Le prix après réduction est de : "+prix);
}
        
    public int calculAge(){
        int Age = 2026 - annee;
        return(Age);
    }


}
