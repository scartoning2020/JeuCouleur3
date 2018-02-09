/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeucouleur3;

import java.awt.Color;

/**
 *
 * @author Loris
 */
public class Joueur {
    private String nom;
    private Color couleurAttribuee;
    private boolean Human;
    
    public Joueur(String nom, boolean Human){
        this.nom = nom;
        this.Human = Human;
    }

    public Joueur(boolean Human) {
        this.Human = Human;
    }
    
    
    public String getNom() {
        return nom;
    }

    public Color getCouleurAttribuee() {
        return couleurAttribuee;
    }

    public void setCouleurAttribuee(Color couleurAttribuee) {
        this.couleurAttribuee = couleurAttribuee;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public boolean isHuman() {
        return Human;
    }

    public void setHuman(boolean isHuman) {
        this.Human = isHuman;
    }
    
    
    
    
}
