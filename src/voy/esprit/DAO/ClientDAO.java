/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package voy.esprit.DAO;

import com.mysql.jdbc.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import voy.esprit.entities.Client;
import voy.esprit.util.MyConnection;

/**
 *
 * @author Naoufel
 */
public class ClientDAO {
      public void deletResp(int id){
        String requete = "delete from Client where IdCl=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Client supprimée");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
        }
       public List<Client> DisplayAllClient (){


        List<Client> Cl = new ArrayList<Client>();

        String requete = "select * from Client ";
        try {
           Statement statement = (Statement) MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            
            while(resultat.next()){
                Client cl =new Client();
                cl.setIdCl(resultat.getInt(1));
                cl.setNomCl(resultat.getString(2));
                cl.setPrenomCl(resultat.getString(3));
                cl.setAdresseCl(resultat.getString(4));
                cl.setEmailClient(resultat.getString(5));

                Cl.add(cl);
            }
            return Cl;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des stocks "+ex.getMessage());
            return null;
        }
        
        
      }
    
}
