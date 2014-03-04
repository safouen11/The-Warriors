/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pi_Controllers;

import Pi_Dao.RespDAO;
import Pi_entities.ResponsableAgence;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Naoufel
 */
public class RespAgenceController extends AbstractTableModel {
      String[] headers={"Id","Nom","Prenom","Adresse","Tel"};
     List<ResponsableAgence> listresp=new ArrayList<ResponsableAgence>();

    public RespAgenceController() {
        RespDAO respDao=new RespDAO();
        listresp=respDao.DisplayAllResp();
        
    }


    public int getRowCount() {

    return listresp.size();

    }

    public int getColumnCount() {

        return headers.length;

    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex)
        {
             case 0:
                return listresp.get(rowIndex).getIdRes();
            case 1:
                return listresp.get(rowIndex).getNomRes();
            case 2:
                return listresp.get(rowIndex).getPrenomRes();
            case 3:
                return listresp.get(rowIndex).getAdresseAg();
            case 4:
                    return listresp.get(rowIndex).getTelAgence();
                    default:
                        return null;

        }


    }
    
    

    public String getColumnName(int column) {
        return headers[column];
    }

    
}
