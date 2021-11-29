package me.loule.javafx.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import me.loule.javafx.model.Fauteil;
import me.loule.javafx.model.Mobilier;

public class MainController implements Initializable {

    @FXML
    private Button btnValider;

    @FXML
    private TextField textFieldCouleur;

    @FXML
    private TextField textFieldHauteur;

    @FXML
    private TextField textFieldLargeur;

    @FXML
    private TextField textFieldLongueur;

    @FXML
    private TextField textFieldMatiere;

    @FXML
    private TextField textFieldPieds;

    @FXML
    private TextField textFieldPlaces;

    @FXML
    private TextField textFieldPoids;

    @FXML
    private TextField textFieldPrix;

    @FXML
    private Text textResult;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        btnValider.setOnMouseClicked(arg0 -> {
            String couleur = textFieldCouleur.getText();
            double largeur = Double.parseDouble(textFieldLargeur.getText());
            double longueur = Double.parseDouble(textFieldLongueur.getText());
            double hauteur = Double.parseDouble(textFieldHauteur.getText());
            double poids = Double.parseDouble(textFieldPoids.getText());
            double pieds = Double.parseDouble(textFieldPieds.getText());
            String matiere = textFieldMatiere.getText();
            double prix = Double.parseDouble(textFieldPrix.getText());
            int places = Integer.parseInt(textFieldPlaces.getText());

            Mobilier fauteil = new Fauteil(matiere, largeur, longueur, hauteur, poids, pieds, couleur, prix, places);
            textResult.setText(fauteil.toString());
        });
    }
}
