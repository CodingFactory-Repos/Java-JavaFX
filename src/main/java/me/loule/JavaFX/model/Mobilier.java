package me.loule.javafx.model;

public class Mobilier {
    private String matiere;
    private double largeur;
    private double longueur;
    private double hauteur;
    private double poids;
    private double pieds;
    private String couleur;
    private double prix;

    public Mobilier(String matiere, double largeur, double longueur, double hauteur, double poids, double pieds, String couleur, double prix) {
        this.matiere = matiere;
        this.largeur = largeur;
        this.longueur = longueur;
        this.hauteur = hauteur;
        this.poids = poids;
        this.pieds = pieds;
        this.couleur = couleur;
        this.prix = prix;
    }

    public String getMatiere() {
        return matiere;
    }

    public double getlargeur() {
        return largeur;
    }

    public double getlongueur() {
        return longueur;
    }

    public double gethauteur() {
        return hauteur;
    }

    public double getPoids() {
        return poids;
    }

    public double getPieds() {
        return pieds;
    }

    public String getCouleur() {
        return couleur;
    }

    public double getPrix() {
        return prix;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    public void setlargeur(double largeur) {
        this.largeur = largeur;
    }

    public void setlongueur(double longueur) {
        this.longueur = longueur;
    }

    public void sethauteur(double hauteur) {
        this.hauteur = hauteur;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public void setPieds(double pieds) {
        this.pieds = pieds;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String toString() {
        return "Mobilier [matiere=" + matiere + ", largeur=" + largeur + ", longueur=" + longueur + ", hauteur=" + hauteur + ", poids=" + poids + ", pieds=" + pieds + ", couleur=" + couleur + ", prix=" + prix + "]";
    }
}
