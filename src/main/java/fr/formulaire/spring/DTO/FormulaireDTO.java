package fr.formulaire.spring.DTO;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class FormulaireDTO {
    
    @NotNull
    @Size(min=2, max=50)
    private String nom;
    
    @NotNull
    @Size(min=2, max=50)
    private String prenom;

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    

}
