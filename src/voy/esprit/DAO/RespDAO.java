/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package voy.esprit.DAO;

import voy.esprit.entities.ResponsableAgence;

import com.mysql.jdbc.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import voy.esprit.util.MyConnection;

/**
 *
 * @author Naoufel
 */
public class RespDAO {
     public void insertResp(ResponsableAgence ResA){

        String requete = "insert into responsableagence (NomRes,PrenomRes,AdresseAgence,TelAgence) values (?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, ResA.getNomRes());
            ps.setString(2, ResA.getPrenomRes());
            ps.setString(3, ResA.getAdresseAg());
            ps.setString(4, ResA.getTelAgence());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
        
        
     }
      public List<ResponsableAgence> DisplayAllResp (){


        List<ResponsableAgence> respAg = new ArrayList<ResponsableAgence>();

        String requete = "select * from responsableagence";
        try {
           Statement statement = (Statement) MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            
            while(resultat.next()){
                ResponsableAgence resp =new ResponsableAgence();
                resp.setIdRes(resultat.getInt(1));
                resp.setNomRes(resultat.getString(2));
                resp.setPrenomRes(resultat.getString(3));
                resp.setAdresseAg(resultat.getString(4));
                resp.setTelAgence(resultat.getString(5));

                respAg.add(resp);
            }
            return respAg;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des stocks "+ex.getMessage());
            return null;
        }
        
        
      }
       public void updateResp(ResponsableAgence res) {
        String requete = "update responsableagence set NomRes=?,PrenomRes=?,AdresseAgence=?,TelAgence=? where idRes=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            
            ps.setString(1, res.getNomRes());
            ps.setString(2, res.getPrenomRes());
            ps.setString(3, res.getAdresseAg());
            ps.setString(4, res.getTelAgence());
            ps.setInt(5, res.getIdRes());
            
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour " + ex.getMessage());
        }
        
         
    }
        public void deletResp(int id){
        String requete = "delete from responsableagence where IdRes=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Responsable supprimée");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
        }
}


       
        
    
    

