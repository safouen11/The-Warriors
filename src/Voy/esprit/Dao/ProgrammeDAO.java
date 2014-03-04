/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Voy.esprit.Dao;


import Voy.esprit.entities.Programme;
import Voy.esprit.utils.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dell
 */
public class ProgrammeDAO {
   
    
     public void deleteProg(int id){
       
         String requete = "delete from programme where IdProg=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Programme supprimée");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
        }
        public void insertProgramme(Programme prg){

        String requete = "insert into programme (NomProg,DateProg,VilleDepProg,VilleArProg,BudgetProg,image) values (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
             
            ps.setString(1, prg.getNomProg());
            ps.setString(2, prg.getDateProg());
            ps.setString(3, prg.getVilleDepProg());
            ps.setString(4, prg.getVilleArProg());
            ps.setString(5, prg.getBudgetProg());
            ps.setString(6, prg.getImage());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
         //ex.printStackTrace();
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
        
        
     } 
      
      public List<Programme> DisplayAllProgramme (){


        List<Programme> Cl = new ArrayList<Programme>();

        String requete = "select * from Destination ";
        try {
           Statement statement = (Statement) MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            
            while(resultat.next()){
                Programme prg =new Programme();
                prg.setIdProg(resultat.getInt(1));
                prg.setNomProg(resultat.getString(2));
                prg.setDateProg(resultat.getString(3));
                
                prg.setVilleDepProg(resultat.getString(4));
                prg.setVilleArProg(resultat.getString(5));
                prg.setBudgetProg(resultat.getString(6));
                Cl.add(prg);
            }
            return Cl;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des stocks "+ex.getMessage());
            return null;
        }
        
        
      }
}
