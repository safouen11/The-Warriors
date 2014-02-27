/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package voy.esprit.DAO;


import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import voy.esprit.entities.Proposition;
import voy.esprit.util.MyConnection;

/**
 *
 * @author Naoufel
 */
public class PropositionDAO {
    public List<Proposition> DisplayAllProposition (){


        List<Proposition> Pr = new ArrayList<Proposition>();

        String requete = "select * from proposition";
        try {
           Statement statement = (Statement) MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            
            while(resultat.next()){
                Proposition pr =new Proposition();
                pr.setId(resultat.getInt(1));
                pr.setNomOffre(resultat.getString(2));
                pr.setDateOffre(resultat.getString(3));
                pr.setDescriptionOffre(resultat.getString(4));
                pr.setVilleDepartOffre(resultat.getString(5));

                Pr.add(pr);
            }
            return Pr;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des stocks "+ex.getMessage());
            return null;
        }
        
        
      }
    
}
