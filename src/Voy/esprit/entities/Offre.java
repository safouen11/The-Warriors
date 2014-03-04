/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Voy.esprit.entities;

import java.awt.event.ActionListener;
import java.util.logging.Logger;

/**
 *
 * @author dell
 */
public class Offre {
  
       private int IdOffre;
        private String NomOffre;
        private String DateDepart;
        private String Description;
        private String Hebergement;
        private String VilleDepart;
        private String TypeOffre;
        private String image;

    public void setImage(String image) {
        this.image = image;
    }

    public String getImage() {
        return image;
    }
   

    public int getIdOffre() {
        return IdOffre;
    }

    public String getNomOffre() {
        return NomOffre;
    }

    public String getDateDepart() {
        return DateDepart;
    }

    public String getDescription() {
        return Description;
    }

    public String getHebergement() {
        return Hebergement;
    }

    public String getVilleDepart() {
        return VilleDepart;
    }

    public String getTypeOffre() {
        return TypeOffre;
    }

    public void setIdOffre(int IdOffre) {
        this.IdOffre = IdOffre;
    }

    public void setNomOffre(String NomOffre) {
        this.NomOffre = NomOffre;
    }

    public void setDateDepart(String DateDepart) {
        this.DateDepart = DateDepart;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public void setHebergement(String Hebergement) {
        this.Hebergement = Hebergement;
    }

    public void setVilleDepart(String VilleDepart) {
        this.VilleDepart = VilleDepart;
    }

    public void setTypeOffre(String TypeOffre) {
        this.TypeOffre = TypeOffre;
    }

    
        
        
        
        
        
            }
