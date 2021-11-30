package me.loule.javafx.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import me.loule.javafx.model.Commode;
import me.loule.javafx.model.Fauteuil;
import me.loule.javafx.model.Mobilier;
import me.loule.javafx.model.Personne;

public class MainController implements Initializable {

    @FXML
    private Button btnCommodeValider;

    @FXML
    private Button btnFauteuilValider;

    @FXML
    private Button btnPersonneValider;

    @FXML
    private TextField textFieldAdresse;

    @FXML
    private TextField textFieldAge;

    @FXML
    private TextField textFieldCouleur;

    @FXML
    private TextField textFieldDateNaissance;

    @FXML
    private TextField textFieldEmail;

    @FXML
    private TextField textFieldHauteur;

    @FXML
    private TextField textFieldLargeur;

    @FXML
    private TextField textFieldLieuNaissance;

    @FXML
    private TextField textFieldLongueur;

    @FXML
    private TextField textFieldMatiere;

    @FXML
    private TextField textFieldNationalite;

    @FXML
    private TextField textFieldNom;

    @FXML
    private TextField textFieldPieds;

    @FXML
    private TextField textFieldPlaces;

    @FXML
    private TextField textFieldPoids;

    @FXML
    private TextField textFieldPoignes;

    @FXML
    private TextField textFieldPrenom;

    @FXML
    private TextField textFieldPrix;

    @FXML
    private TextField textFieldProfession;

    @FXML
    private TextField textFieldSexe;

    @FXML
    private TextField textFieldTelephone;

    @FXML
    private TextField textFieldTiroir;

    @FXML
    private Text textResult;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        btnFauteuilValider.setOnMouseClicked(arg0 -> {
            String couleur = textFieldCouleur.getText();
            double largeur = Double.parseDouble(textFieldLargeur.getText());
            double longueur = Double.parseDouble(textFieldLongueur.getText());
            double hauteur = Double.parseDouble(textFieldHauteur.getText());
            double poids = Double.parseDouble(textFieldPoids.getText());
            double pieds = Double.parseDouble(textFieldPieds.getText());
            String matiere = textFieldMatiere.getText();
            double prix = Double.parseDouble(textFieldPrix.getText());
            int places = Integer.parseInt(textFieldPlaces.getText());

            Mobilier Fauteuil = new Fauteuil(matiere, largeur, longueur, hauteur, poids, pieds, couleur, prix, places);
            textResult.setText(Fauteuil.toString());
        });

        btnCommodeValider.setOnMouseClicked(arg0 -> {
            String couleur = textFieldCouleur.getText();
            double largeur = Double.parseDouble(textFieldLargeur.getText());
            double longueur = Double.parseDouble(textFieldLongueur.getText());
            double hauteur = Double.parseDouble(textFieldHauteur.getText());
            double poids = Double.parseDouble(textFieldPoids.getText());
            double pieds = Double.parseDouble(textFieldPieds.getText());
            String matiere = textFieldMatiere.getText();
            double prix = Double.parseDouble(textFieldPrix.getText());
            int tiroir = Integer.parseInt(textFieldTiroir.getText());
            int poignes = Integer.parseInt(textFieldPoignes.getText());

            Mobilier Commode = new Commode(matiere, largeur, longueur, hauteur, poids, pieds, couleur, prix, tiroir, poignes);
            textResult.setText(Commode.toString());
        });

        btnPersonneValider.setOnMouseClicked(arg0 -> {
            String nom = textFieldNom.getText();
            String prenom = textFieldPrenom.getText();
            String adresse = textFieldAdresse.getText();
            int telephone = Integer.parseInt(textFieldTelephone.getText());
            String email = textFieldEmail.getText();
            String profession = textFieldProfession.getText();
            String dateNaissance = textFieldDateNaissance.getText();
            String lieuNaissance = textFieldLieuNaissance.getText();
            String nationalite = textFieldNationalite.getText();
            String sexe = textFieldSexe.getText();
            int age = Integer.parseInt(textFieldAge.getText());

            Personne personne = new Personne(nom, prenom, adresse, telephone, email, profession, dateNaissance, lieuNaissance, nationalite, sexe, age);
            textResult.setText(personne.toString());
        });
    }
}
