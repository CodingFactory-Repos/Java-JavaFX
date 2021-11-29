package me.loule.javafx.model;

public class Commode extends Mobilier {
    private int tiroir;
    private int poignes;

    public Commode(String matiere, double largeur, double longueur, double hauteur, double poids, double pieds, String couleur, double prix, int tiroir, int poignes) {
        super(matiere, largeur, longueur, hauteur, poids, pieds, couleur, prix);
        this.tiroir = tiroir;
        this.poignes = poignes;
    }

    public int getTiroir() {
        return tiroir;
    }

    public int getPoignes() {
        return poignes;
    }

    public void setTiroir(int tiroir) {
        this.tiroir = tiroir;
    }

    public void setPoignes(int poignes) {
        this.poignes = poignes;
    }

    public String toString() {
        return "Commode [tiroir=" + tiroir + ", poignes=" + poignes + ", matiere=" + getMatiere() + ", largeur=" + getlargeur() + ", longueur=" + getlongueur() + ", hauteur=" + gethauteur() + ", poids=" + getPoids() + ", pieds=" + getPieds() + ", couleur=" + getCouleur() + ", prix=" + getPrix() + "]";
    }
}
