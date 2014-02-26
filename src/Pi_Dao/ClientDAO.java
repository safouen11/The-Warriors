/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pi_Dao;

import Pi_entities.Administrateur;
import Pi_entities.Client;
import Pi_entities.ResponsableAgence;
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

        String requete = "select * from Client";
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
        public List<Client> DisplayAllclient (){
        List<Client> listeclient = new ArrayList<Client>(); 
        String requete = "select * from client";
        try {
            Statement statement = (Statement) MyConnection.getInstance().createStatement();
        ResultSet resultat = statement.executeQuery(requete);
        while(resultat.next())
        { 
            Client client =new Client(); 
        client.setLogin(resultat.getString(7)); 
        
        client.setPassword(resultat.getString(8));
        listeclient.add(client); } return listeclient;
        } 
        catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex); 
        System.out.println("erreur lors du chargement des admin "+ex.getMessage()); return null; 
        } 
    }
       
       
}
