/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Voy.esprit.entities;

/**
 *
 * @author Naoufel
 */
public class Programme {
  private int IdProg;

  private String NomProg;
    private String DateProg;
       private String Image;

    public String getImage() {
        return Image;
    }

    public void setImage(String Image) {
        this.Image = Image;
    }

 


    private String VilleDepProg;
      private String  VilleArProg;
      private String BudgetProg;

    public int getIdProg() {
        return IdProg;
    }

    public String getNomProg() {
        return NomProg;
    }

    public String getDateProg() {
        return DateProg;
    }

    public String getVilleDepProg() {
        return VilleDepProg;
    }

    public String getVilleArProg() {
        return VilleArProg;
    }

    public String getBudgetProg() {
        return BudgetProg;
    }

    public void setIdProg(int IdProg) {
        this.IdProg = IdProg;
    }

    public void setNomProg(String NomProg) {
        this.NomProg = NomProg;
    }

    public void setDateProg(String DateProg) {
        this.DateProg = DateProg;
    }

    public void setVilleDepProg(String VilleDepProg) {
        this.VilleDepProg = VilleDepProg;
    }

    public void setVilleArProg(String VilleArProg) {
        this.VilleArProg = VilleArProg;
    }

    public void setBudgetProg(String BudgetProg) {
        this.BudgetProg = BudgetProg;
    }

   
  
    
    
}
