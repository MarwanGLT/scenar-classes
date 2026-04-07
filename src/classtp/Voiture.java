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

    public Voiture(String marque, String modele, int annee, double prix, Pneu pneu) {
    this.marque = marque;
    this.modele = modele;
    this.annee = annee;
    this.prix = prix;
    this.pneu = pneu;
    }


}
