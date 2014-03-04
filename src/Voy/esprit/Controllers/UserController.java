/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Voy.esprit.Controllers;

import Voy.esprit.Dao.ClientDAO;
import Voy.esprit.Dao.RespDAO;
import Voy.esprit.entities.Client;
import Voy.esprit.entities.ResponsableAgence;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Naoufel
 */
public class UserController extends AbstractTableModel {
     String[] headers={"Id","Nom","Prenom","Adresse","email"};
     List<Client> listCl=new ArrayList<Client>();
     List<ResponsableAgence> listResp=new ArrayList<ResponsableAgence>();

    public UserController() {
        ClientDAO clientDao=new ClientDAO();
        listCl=clientDao.DisplayAllClient();
        RespDAO respDao= new RespDAO();
        listResp =respDao.DisplayAllResp();
        
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