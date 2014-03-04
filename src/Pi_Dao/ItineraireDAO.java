/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pi_Dao;

import Pi_entities.Itineraire;
import Pi_utils.MyConnection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author dell
 */
public class ItineraireDAO {
 
    
    
     public void insertItineraire(Itineraire it){

        String requete = "insert into  itenairaire (NomIt,DateIt,Description,VilleIt,BudgetIt,image) values (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, it.getNomIt());
            ps.setString(2, it.getDateIt());
            ps.setString(3, it.getDescription());
            ps.setString(4, it.getVilleIt());
            ps.setString(5, it.getBudgetIt());
           ps.setString(6, it.getImage());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
        
        
     } 
}
