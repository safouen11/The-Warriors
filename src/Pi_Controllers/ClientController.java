/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pi_Controllers;

import Pi_Dao.ClientDAO;
import Pi_entities.Client;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Naoufel
 */
public class ClientController extends AbstractTableModel {
     String[] headers={"Id","Nom","Prenom","Adresse","email"};
     List<Client> listCl=new ArrayList<Client>();

    public ClientController() {
        ClientDAO clientDao=new ClientDAO();
        listCl=clientDao.DisplayAllClient();
        
    }


    public int getRowCount() {

    return listCl.size();

    }

    public int getColumnCount() {

        return headers.length;

    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex)
        {
             case 0:
                return listCl.get(rowIndex).getIdCl();
            case 1:
                return listCl.get(rowIndex).getNomCl();
            case 2:
                return listCl.get(rowIndex).getPrenomCl();
            case 3:
                return listCl.get(rowIndex).getAdresseCl();
            case 4:
                    return listCl.get(rowIndex).getEmailClient();
                    default:
                        return null;

        }


    }
    
    

    public String getColumnName(int column) {
        return headers[column];
    }

    
}
