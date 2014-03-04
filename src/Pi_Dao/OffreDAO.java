/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pi_Dao;

import Pi_entities.Offre;
import Pi_entities.Proposition;
import Pi_utils.MyConnection;
import com.mysql.jdbc.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Naoufel
 */
public class OffreDAO {

   
    
    public List<Offre> DisplayAllOffre (String typeOffre){


        List<Offre> offre = new ArrayList<Offre>();

        String requete = "select * from offre where TypeOffre='"+typeOffre+"'";
        try {
           Statement statement = (Statement) MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            
            while(resultat.next()){
                Offre of =new Offre();
                of.setIdOffre(resultat.getInt(1));
                of.setNomOffre(resultat.getString(2));
                
                of.setDescription(resultat.getString(3));
                of.setHebergement(resultat.getString(4));
                
                of.setTypeOffre(resultat.getString(5));

                offre.add(of);
            }
            return offre;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des stocks "+ex.getMessage());
            return null;
        }
        
        
      }
    
     public List<Offre> DisplayAllOffre (){


        List<Offre> Pr = new ArrayList<Offre>();

        String requete = "select * from offre";
        try {
           Statement statement = (Statement) MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            
            while(resultat.next()){
                Offre of =new Offre();
                of.setIdOffre(resultat.getInt(1));
                of.setNomOffre(resultat.getString(2));
                
                of.setDescription(resultat.getString(3));
                of.setHebergement(resultat.getString(4));
                
                of.setTypeOffre(resultat.getString(5));
                of.setImage(resultat.getString(6));
                
                Pr.add(of);
            }
            return Pr;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des stocks "+ex.getMessage());
            return null;
        }
        
        
      }
    
 public void insertOffre(Offre of){

        String requete = "insert into offre (NomOffre,Description,Hebergement,TypeOffre,image) values (?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, of.getNomOffre());
            
            ps.setString(2, of.getDescription());
            ps.setString(3, of.getHebergement());
            
            ps.setString(4, of.getTypeOffre());
            ps.setString(5, of.getImage());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
        
        
     }

 public void deleteoffre(int id){
        String requete = "delete from offre,programme where IdOffre=?";
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

 
  public List<Proposition> DisplayAllProposition (){


        List<Proposition> Pr = new ArrayList<Proposition>();

        String requete = "select * from offre";
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
   public void deletOffre(int id){
        String requete = "delete from offre where IdOffre=?";
        try {
            com.mysql.jdbc.PreparedStatement ps = (com.mysql.jdbc.PreparedStatement) MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Offre supprimée");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
        }
    public void updateOffre(Proposition off) {
        String requete = "update offre set NomOffre=?,DateDepart=?,Description=?,VilleDepart=?,Budget=? where IdOffre=?";
        try {
            com.mysql.jdbc.PreparedStatement ps = (com.mysql.jdbc.PreparedStatement) MyConnection.getInstance().prepareStatement(requete);
            
            ps.setString(1, off.getNomOffre());
            ps.setString(2, off.getDateOffre());
            ps.setString(3, off.getDescriptionOffre());
            ps.setString(4, off.getVilleDepartOffre());
            ps.setInt(4, off.getBudget());
            ps.setInt(5, off.getId());
            
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour " + ex.getMessage());
        }
        
         
    }
      
      
    

}