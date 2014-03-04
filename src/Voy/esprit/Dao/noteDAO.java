/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Voy.esprit.Dao;

import Voy.esprit.entities.commentaire;
import Voy.esprit.entities.note;
import Voy.esprit.utils.MyConnection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author moka
 */
public class noteDAO {
    public void insertnote(note no){

        String requete = "insert into  note (valeurnote,fk_IdOffre,fk_IdCl) values (?,?,?) ";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
              
            ps.setInt(1, no.getValeurnote());
            ps.setInt(2, no.getFk_IdOffre().getIdOffre());
            ps.setInt(3, no.getFk_IdCl().getIdCl());

         
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
        
        
     }
}
