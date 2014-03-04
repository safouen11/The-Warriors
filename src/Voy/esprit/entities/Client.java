/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Voy.esprit.entities;

/**
 *
 * @author Naoufel
 */
public class Client {
    private int idCl ;
    private String NomCl;
    private String PrenomCl;
    private String AdresseCl;
     private String Date_Naissance;
    private String emailClient;
    private String TelClient;

    public String getTelClient() {
        return TelClient;
    }

    public void setTelClient(String TelClient) {
        this.TelClient = TelClient;
    }

    public String getDate_Naissance() {
        return Date_Naissance;
    }

    public void setDate_Naissance(String Date_Naissance) {
        this.Date_Naissance = Date_Naissance;
    }

    public String getPseudoFb() {
        return pseudoFb;
    }

    public void setPseudoFb(String pseudoFb) {
        this.pseudoFb = pseudoFb;
    }
    private String pseudoFb;
    private String Login ;
    private String Password;

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    public String getAdresseCl() {
        return AdresseCl;
    }

    public void setAdresseCl(String AdresseCl) {
        this.AdresseCl = AdresseCl;
    }

    public String getNomCl() {
        return NomCl;
    }

    public void setNomCl(String NomCl) {
        this.NomCl = NomCl;
    }

    public String getPrenomCl() {
        return PrenomCl;
    }

    public void setPrenomCl(String PrenomCl) {
        this.PrenomCl = PrenomCl;
    }

    public String getEmailClient() {
        return emailClient;
    }

    public void setEmailClient(String emailClient) {
        this.emailClient = emailClient;
    }

    public int getIdCl() {
        return idCl;
    }

    public void setIdCl(int idCl) {
        this.idCl = idCl;
    }
    
    
    
}
