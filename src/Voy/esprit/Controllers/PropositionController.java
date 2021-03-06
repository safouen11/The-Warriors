/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Voy.esprit.Controllers;

import Voy.esprit.Dao.OffreDAO;
import Voy.esprit.Dao.PropositionDAO;
import Voy.esprit.entities.Proposition;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Naoufel
 */
public class PropositionController extends AbstractTableModel {
      String[] headers={"Id","NomOffre","Date","Desc","VilleD","Budget"};
     List<Proposition> listPrp=new ArrayList<Proposition>();
     private String d;
    public PropositionController() {
        PropositionDAO prpDao=new PropositionDAO();
        listPrp=prpDao.DisplayAllProposition();
        
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
                 case 5:
                    return listPrp.get(rowIndex).getBudget();
                    default:
                        return null;

        }


    }
    
    

    public String getColumnName(int column) {
        return headers[column];
    }

    
    
}
