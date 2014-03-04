/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Voy.esprit.Dao;

import Voy.esprit.entities.Client;
import Voy.esprit.entities.Offre;
import Voy.esprit.entities.commentaire;
import Voy.esprit.utils.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author moka
 */
public class commentaireDAO {
     public void insertCommentaire(commentaire com ){

        String requete = "insert into  commentaireoffre (commentaire,fk_IdOffre,fk_IdCl) values (?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
              
            ps.setString(1, com.getCommentaire());
            ps.setInt(2, com.getFk_IdOffre().getIdOffre());
            ps.setInt(3, com.getFk_IdCl().getIdCl());


   
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
        
        
     }

    }







