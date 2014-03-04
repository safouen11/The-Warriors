/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pi_Dao;

import Pi_entities.Client;
import Pi_entities.Destination;
import Pi_utils.MyConnection;
import com.mysql.jdbc.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dell
 */
public class DestinationDAO {

    /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 

/**
 *
 * @author Naoufel
 */

      public void deleteDest(int id){
        String requete = "delete from destination where IdDest=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Destination supprimée");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
        }
       public void insertDestination(Destination dest){

        String requete = "insert into destination (NomDest,Date,DescriptionDest,VilleDep,VilleAr,BudgetDest,image) values (?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            
            ps.setString(1, dest.getNomDest());
           
            ps.setString(2, dest.getDate());
            ps.setString(3, dest.getDescriptionDest());
            ps.setString(4, dest.getVilleDep());
            ps.setString(5, dest.getVilleAr());
            ps.setString(6, dest.getBudgetDest());
            ps.setString(7, dest.getImage());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
        
        
     } 
      
      
      public List<Destination> DisplayAllDestination (){


        List<Destination> Cl = new ArrayList<Destination>();

        String requete = "select * from Destination ";
        try {
           Statement statement = (Statement) MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            
            while(resultat.next()){
                Destination dest =new Destination();
                dest.setIdDest(resultat.getInt(1));
                dest.setNomDest(resultat.getString(2));
                dest.setDate(resultat.getString(3));
                dest.setDescriptionDest(resultat.getString(4));
                dest.setVilleDep(resultat.getString(5));
                dest.setVilleAr(resultat.getString(6));
                dest.setBudgetDest(resultat.getString(7));
                Cl.add(dest);
            }
            return Cl;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des stocks "+ex.getMessage());
            return null;
        }
        
        
      }
    

}
