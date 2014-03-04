/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Voy.esprit.Dao;

import Voy.esprit.entities.Administrateur;
import Voy.esprit.entities.Client;
import Voy.esprit.entities.ResponsableAgence;
import Voy.esprit.utils.MyConnection;
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
      public void deletclient(int id){
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

        String requete = "select * from client";
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
                cl.setEmailClient(resultat.getString(6));

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
        client.setLogin(resultat.getString(9)); 
        
        client.setPassword(resultat.getString(10));
        listeclient.add(client); } return listeclient;
        } 
        catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex); 
        System.out.println("erreur lors du chargement des admin "+ex.getMessage()); return null; 
        } 
    }
       
              public Client findMembreByPseudo(String pseudo) {

        String requete = "select * from client where PseudoFb=?";

        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, pseudo);
            ResultSet resultat = ps.executeQuery();
            
            Client client = new Client();
            while (resultat.next()) {

                client.setIdCl(resultat.getInt(1));
                client.setNomCl(resultat.getString(2));
                client.setPrenomCl(resultat.getString(3));
                client.setAdresseCl(resultat.getString(4));
                client.setDate_Naissance(resultat.getString(5));
                client.setEmailClient(resultat.getString(6));
                client.setTelClient(resultat.getString(7));
                client.setPseudoFb(resultat.getString(8));
                
            }
            return client;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement" + ex.getMessage());
            return null;
        }
    }
    
       public void insertClient(Client cl) {

        String requete = "insert into client (NomClient,PrenomClient,AdresseClient,Date_Naissance,EmailClient,TelClient,PseudoFb,Login,Password)values (?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, cl.getNomCl());
            ps.setString(2, cl.getPrenomCl());
            ps.setString(3, cl.getAdresseCl());
            ps.setString(4, cl.getDate_Naissance());
            ps.setString(5, cl.getEmailClient());
            ps.setString(6, cl.getTelClient());
            ps.setString(7, cl.getPseudoFb());
            ps.setString(8, cl.getLogin());
            ps.setString(9, cl.getPassword());
            
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
        }
}
}
