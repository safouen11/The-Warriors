/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pi_entities;

/**
 *
 * @author moka
 */
public class note {

    public int getIdnote() {
        return idnote;
    }

    public void setIdnote(int idnote) {
        this.idnote = idnote;
    }

    public int getValeurnote() {
        return valeurnote;
    }

    public void setValeurnote(int valeurnote) {
        this.valeurnote = valeurnote;
    }


  private  int idnote ;
private  int valeurnote;
  private  Offre  fk_IdOffre ;
    private Client   fk_IdCl ;

    public Offre getFk_IdOffre() {
        return fk_IdOffre;
    }

    public void setFk_IdOffre(Offre fk_IdOffre) {
        this.fk_IdOffre = fk_IdOffre;
    }

    public Client getFk_IdCl() {
        return fk_IdCl;
    }

    public void setFk_IdCl(Client fk_IdCl) {
        this.fk_IdCl = fk_IdCl;
    }



}
