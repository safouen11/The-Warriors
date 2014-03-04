/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pi_entities;

/**
 *
 * @author moka
 */
public class commentaire {

    
    private int idcommentaire;

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



    private String commentaire;
    private Offre fk_IdOffre ;
    private Client  fk_IdCl ;

   
  

    public int getIdcommentaire() {
        return idcommentaire;
    }

    public void setIdcommentaire(int idcommentaire) {
        this.idcommentaire = idcommentaire;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

}