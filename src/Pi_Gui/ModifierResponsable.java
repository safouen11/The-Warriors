/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pi_Gui;
import Pi_Controllers.RespAgenceController;
import Pi_Dao.RespDAO;
import Pi_entities.ResponsableAgence;
import Pi_utils.*;
import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * @author Naoufel
 */

public class ModifierResponsable extends javax.swing.JFrame {

    /**
     * Creates new form ModifierResponsable
     */
    public ModifierResponsable() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JbModifAgAnnul = new javax.swing.JButton();
        ModifAgAdr = new javax.swing.JTextField();
        ModifResAgNam = new javax.swing.JTextField();
        ModifResAgPr = new javax.swing.JTextField();
        JbModifAg = new javax.swing.JButton();
        ModifAgtel = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        IdRes = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JbModifAgAnnul.setText("Annuler");
        JbModifAgAnnul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbModifAgAnnulActionPerformed(evt);
            }
        });
        getContentPane().add(JbModifAgAnnul, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 96, -1));
        getContentPane().add(ModifAgAdr, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 83, -1));
        getContentPane().add(ModifResAgNam, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 83, -1));
        getContentPane().add(ModifResAgPr, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 83, -1));

        JbModifAg.setText("Modifier Agence");
        JbModifAg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbModifAgActionPerformed(evt);
            }
        });
        getContentPane().add(JbModifAg, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 282, -1, -1));
        getContentPane().add(ModifAgtel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 83, -1));

        jLabel6.setText("Telephone Agence");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 247, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        jLabel1.setText("Modifier une  Agence");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 269, -1));

        jLabel5.setText("Adresse Agence");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 209, 124, -1));

        jLabel3.setText("Nom Responsable Agence");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 133, -1, -1));

        jLabel4.setText("Prenom Responsable Agence");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 171, 110, -1));

        jTable1.setModel(new RespAgenceController());
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 119, 282, 186));

        jLabel2.setText("Id Responsable");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        IdRes.setEditable(false);
        IdRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdResActionPerformed(evt);
            }
        });
        getContentPane().add(IdRes, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 83, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PI_Icone/bkg-3_1.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JbModifAgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbModifAgActionPerformed
        // TODO add your handling code here:
        ResponsableAgence Resp=new ResponsableAgence();
        int a;
        a = Integer.parseInt(IdRes.getText()) ; 
      Resp.setIdRes(a);  
      Resp.setNomRes(ModifResAgNam.getText());
      Resp.setPrenomRes(ModifResAgPr.getText());
      Resp.setAdresseAg(ModifAgAdr.getText());
      Resp.setTelAgence(ModifAgtel.getText());
      
      RespDAO respDao =new RespDAO();
      respDao.updateResp(Resp);
      JOptionPane.showMessageDialog(this, "Mis A jour effectué avec succés!");
      ModifResAgNam.setText("");
      ModifResAgPr.setText("");
      ModifAgAdr.setText("");
      ModifAgtel.setText("");
      IdRes.setText("");
      jTable1 = new javax.swing.JTable();

        jTable1.setModel(new RespAgenceController());

        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });

        jScrollPane2.setViewportView(jTable1);

    }//GEN-LAST:event_JbModifAgActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        Object idrespo = jTable1.getValueAt(row, 0);
        Object a = jTable1.getValueAt(row, 1);
        Object b = jTable1.getValueAt(row, 2);
        Object c = jTable1.getValueAt(row, 3);
        Object d = jTable1.getValueAt(row, 4); 
       
        
        
            
           
           ModifResAgNam.setText(""+a);
           ModifResAgPr.setText(""+b);
           ModifAgAdr.setText(""+c);
           ModifAgtel.setText(""+d);
           IdRes.setText(""+idrespo);
           
           
        
            
    }//GEN-LAST:event_jTable1MouseClicked

    private void IdResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdResActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdResActionPerformed

    private void JbModifAgAnnulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbModifAgAnnulActionPerformed
        // TODO add your handling code here:
         homeadmin G=new homeadmin();
        G.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_JbModifAgAnnulActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ModifierResponsable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifierResponsable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifierResponsable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifierResponsable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ModifierResponsable().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IdRes;
    private javax.swing.JButton JbModifAg;
    private javax.swing.JButton JbModifAgAnnul;
    private javax.swing.JTextField ModifAgAdr;
    private javax.swing.JTextField ModifAgtel;
    private javax.swing.JTextField ModifResAgNam;
    private javax.swing.JTextField ModifResAgPr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
