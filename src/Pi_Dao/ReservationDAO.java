/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pi_Dao;

import Pi_entities.Reservation;
import Pi_utils.MyConnection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Naoufel
 */
public class ReservationDAO {
     public List<Reservation> DisplayAllReservation(){


        List<Reservation> Pr = new ArrayList<Reservation>();

        String requete = "select * from reservation";
        try {
           Statement statement = (Statement) MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            
            while(resultat.next()){
                Reservation res =new Reservation();
                res.setIdRes(resultat.getInt(1));
                res.setNomOffre(resultat.getString(2));
                res.setIdClient(resultat.getInt(3));
                res.setIdAgence(resultat.getInt(4));
                res.setActive(resultat.getInt(5));

                Pr.add(res);
            }
            return Pr;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des stocks "+ex.getMessage());
            return null;
        }
        
        
      }
    
       public void ConfirmRes(int id){

 
        String requete1= "update reservation set Active=1 where IdReservation=?";
        try {
            
           
            
            PreparedStatement p = (PreparedStatement) MyConnection.getInstance().prepareStatement(requete1);
            p.setInt(1,id);
            p.executeUpdate();
           
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    
        
          }
    
    
}
