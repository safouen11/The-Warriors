/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Voy.esprit.Controllers;

import Voy.esprit.Dao.ReservationDAO;
import Voy.esprit.entities.Reservation;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Naoufel
 */
public class ReservationController extends AbstractTableModel {
    
     String[] headers={"IdRes","Nom offre","IdClient","IdAgence"};
     List<Reservation> listres=new ArrayList<Reservation>();

    public ReservationController() {
        ReservationDAO reserDao=new ReservationDAO();
        listres=reserDao.DisplayAllReservation();
        
    }


    public int getRowCount() {

    return listres.size();

    }

    public int getColumnCount() {

        return headers.length;

    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex)
        {
             case 0:
                return listres.get(rowIndex).getIdRes();
            case 1:
                return listres.get(rowIndex).getNomOffre();
            case 2:
                return listres.get(rowIndex).getIdClient();
            case 3:
                return listres.get(rowIndex).getIdAgence();
            
                    default:
                        return null;

        }


    }
    
    

    public String getColumnName(int column) {
        return headers[column];
    }

    
    
}
