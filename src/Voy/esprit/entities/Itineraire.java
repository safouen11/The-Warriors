/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Voy.esprit.entities;

/**
 *
 * @author Naoufel
 */
public class Itineraire {
 
    private String NomIt;
    private String DateIt;
    private String Description;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    private String VilleIt;
    private String BudgetIt;
   private String image;
    public String getBudgetIt() {
        return BudgetIt;
    }

    public void setBudgetIt(String BudgetIt) {
        this.BudgetIt = BudgetIt;
    }
    

    public String getNomIt() {
        return NomIt;
    }

    public void setNomIt(String NomIt) {
        this.NomIt = NomIt;
    }

    public void setDateIt(String DateIt) {
        this.DateIt = DateIt;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public void setVilleIt(String VilleIt) {
        this.VilleIt = VilleIt;
    }


    public String getDateIt() {
        return DateIt;
    }

    public String getDescription() {
        return Description;
    }

    public String getVilleIt() {
        return VilleIt;
    }


    
}
