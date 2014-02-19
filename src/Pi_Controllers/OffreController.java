/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pi_Controllers;

import Pi_Dao.ClientDAO;
import Pi_Dao.OffreDAO;
import Pi_entities.Client;
import Pi_entities.Proposition;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Naoufel
 */
public class OffreController extends AbstractTableModel {
     String[] headers={"Id","NomOffre","Date","Desc","VilleD"};
     List<Proposition> listPrp=new ArrayList<Proposition>();

    public OffreController() {
        OffreDAO offreDao=new OffreDAO();
        listPrp=offreDao.DisplayAllProposition();
        
    }


    public int getRowCount() {

    return listPrp.size();

    }

    public int getColumnCount() {

        return headers.length;

    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex)
        {
             case 0:
                return listPrp.get(rowIndex).getId();
            case 1:
                return listPrp.get(rowIndex).getNomOffre();
            case 2:
                return listPrp.get(rowIndex).getDateOffre();
            case 3:
                return listPrp.get(rowIndex).getDescriptionOffre();
            case 4:
                    return listPrp.get(rowIndex).getVilleDepartOffre();
                    default:
                        return null;

        }


    }
    
    

    public String getColumnName(int column) {
        return headers[column];
    }

    
    
}
