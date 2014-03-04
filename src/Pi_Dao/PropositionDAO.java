/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pi_Dao;

import Pi_Gui.Authentification;
import Pi_entities.Proposition;
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
public class PropositionDAO {
     public void ConfirmProp(Proposition P ,int id){

 
        String requete = "insert into offre (NomOffre,DateDepart,Description,VilleDepart,IdResp,Budget) values (?,?,?,?,?,?)";
        String requete1= "update proposition set Adopter=1 where IdProposition=?";
        try {
             Authentification b=new Authentification();

           
            
            PreparedStatement ps = (PreparedStatement) MyConnection.getInstance().prepareStatement(requete);
            PreparedStatement p = (PreparedStatement) MyConnection.getInstance().prepareStatement(requete1);
            p.setInt(1,id);
            p.executeUpdate();
            ps.setString(1, P.getNomOffre());
            ps.setString(2, P.getDateOffre());
            ps.setString(3, P.getDescriptionOffre());
            ps.setString(4, P.getVilleDepartOffre());
            ps.setInt(5, b.getA());
            ps.setInt(6, P.getBudget());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    
        
     }
    public List<Proposition> DisplayAllProposition (){


        List<Proposition> Pr = new ArrayList<Proposition>();

        String requete = "select * from proposition where Adopter=0";
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
                pr.setBudget(resultat.getInt(10));

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
