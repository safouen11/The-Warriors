/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package voy.esprit.entities;

/**
 *
 * @author Naoufel
 */
public class ResponsableAgence {
    public String NomRes;
    public String PrenomRes;
    public String AdresseAg;
    public String TelAgence;
    public int idRes ;

    public void setIdRes(int idRes) {
        this.idRes = idRes;
    }

    public int getIdRes() {
        return idRes;
    }

    public ResponsableAgence() {
    }

    public String getAdresseAg() {
        return AdresseAg;
    }

    public void setAdresseAg(String AdresseAg) {
        this.AdresseAg = AdresseAg;
    }

    public String getNomRes() {
        return NomRes;
    }

    public void setNomRes(String NomRes) {
        this.NomRes = NomRes;
    }

    public String getPrenomRes() {
        return PrenomRes;
    }

    public void setPrenomRes(String PrenomRes) {
        this.PrenomRes = PrenomRes;
    }

    public String getTelAgence() {
        return TelAgence;
    }

    public void setTelAgence(String TelAgence) {
        this.TelAgence = TelAgence;
    }

  
    
    
}
