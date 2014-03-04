/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pi_Controllers;

import Pi_Dao.ClientDAO;
import Pi_Dao.OffreDAO;
import Pi_entities.Client;
import Pi_entities.Offre;
import Pi_entities.Proposition;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Naoufel
 */
public class OffreController extends AbstractTableModel {
     String[] headers={"Id","NomOffre","Date","Desc","VilleD","hebergement","type offre","image"};
     List<Offre> listof=new ArrayList<Offre>();
     private String d;
    public OffreController() {
        OffreDAO offreDao=new OffreDAO();
        listof=offreDao.DisplayAllOffre();
        
    }

    public OffreController(String d) {
        this.d = d;
        OffreDAO offreDao=new OffreDAO();
        listof =offreDao.DisplayAllOffre(d);
    }


    public int getRowCount() {

    return listof.size();

    }

    public int getColumnCount() {

        return headers.length;

    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex)
        {
             case 0:
                return listof.get(rowIndex).getIdOffre();
            case 1:
                return listof.get(rowIndex).getNomOffre();
           
            case 2:
                return listof.get(rowIndex).getDescription();
            case 3:
                    return listof.get(rowIndex).getHebergement();
                
                     case 4:
                    return listof.get(rowIndex).getTypeOffre();
                   
                     case 5:
                         return listof.get(rowIndex).getImage();
                     
                     
                     default:
                        return null;

        }


    }
    
    

    public String getColumnName(int column) {
        return headers[column];
    }

    
    
}
