/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pi_Dao;

import Pi_entities.Administrateur;
import Pi_utils.MyConnection;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Naoufel
 */
public class AdministrateurDAO {
    public List<Administrateur> DisplayAlladmin (){
        List<Administrateur> listeadmin = new ArrayList<Administrateur>(); 
        String requete = "select * from administrateur";
        try {
            Statement statement = (Statement) MyConnection.getInstance() .createStatement();
        ResultSet resultat = statement.executeQuery(requete);
        while(resultat.next())
        { 
            Administrateur admin =new Administrateur(); 
        admin.setLogin(resultat.getString(1)); 
        
        admin.setPassword(resultat.getString(2));
        listeadmin.add(admin); } return listeadmin;
        } 
        catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex); 
        System.out.println("erreur lors du chargement des admin "+ex.getMessage()); return null; 
        } 
    }
    
    
}
