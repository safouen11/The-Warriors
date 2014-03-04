/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pi_entities;

/**
 *
 * @author Naoufel
 */
public class Destination {
 
     private int IdDest;

     private String NomDest;
    private String Date;
    private String DescriptionDest;
      private String  VilleDep;
      private String VilleAr;
       private String Image;


    public String getImage() {
        return Image;
    }

    public void setImage(String Image) {
        this.Image = Image;
    }


      private String BudgetDest ;

    public int getIdDest() {
        return IdDest;
    }

    public String getNomDest() {
        return NomDest;
    }

    public String getDate() {
        return Date;
    }

    public String getDescriptionDest() {
        return DescriptionDest;
    }

    public String getVilleDep() {
        return VilleDep;
    }

    public String getVilleAr() {
        return VilleAr;
    }

    public String getBudgetDest() {
        return BudgetDest;
    }

    public void setIdDest(int IdDest) {
        this.IdDest = IdDest;
    }

    public void setNomDest(String NomDest) {
        this.NomDest = NomDest;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public void setDescriptionDest(String DescriptionDest) {
        this.DescriptionDest = DescriptionDest;
    }

    public void setVilleDep(String VilleDep) {
        this.VilleDep = VilleDep;
    }

    public void setVilleAr(String VilleAr) {
        this.VilleAr = VilleAr;
    }

    public void setBudgetDest(String BudgetDest) {
        this.BudgetDest = BudgetDest;
    }

    
      
      
      
}
