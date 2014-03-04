/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Voy.esprit.entities;

/**
 *
 * @author Naoufel
 */
public class Reservation {
    
    private int active;

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }
    private int IdRes;

    public int getIdAgence() {
        return IdAgence;
    }

    public void setIdAgence(int IdAgence) {
        this.IdAgence = IdAgence;
    }

    public int getIdClient() {
        return IdClient;
    }

    public void setIdClient(int IdClient) {
        this.IdClient = IdClient;
    }

    public int getIdRes() {
        return IdRes;
    }

    public void setIdRes(int IdRes) {
        this.IdRes = IdRes;
    }

    public String getNomOffre() {
        return NomOffre;
    }

    public void setNomOffre(String NomOffre) {
        this.NomOffre = NomOffre;
    }
    private String NomOffre;
    private int IdClient;
    private int IdAgence;
    
}
