/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Voy.esprit.Gui;

import Voy.esprit.Controllers.ClientController;
import Voy.esprit.Dao.ClientDAO;
import Voy.esprit.entities.Client;

/**
 *
 * @author Naoufel
 */
public class SuppressionClient extends javax.swing.JFrame {

    /**
     * Creates new form SuppressionClient
     */
    public SuppressionClient() {
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

        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        DelCLPr = new javax.swing.JTextField();
        DelClName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JbDelCl = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        DelClTel = new javax.swing.JTextField();
        JbDelClBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTCl = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        DelClAdr = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        IdCl = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("Telephone");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        jLabel1.setText("Supprimer un CLient");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 269, -1));

        DelCLPr.setEditable(false);
        getContentPane().add(DelCLPr, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 120, -1));

        DelClName.setEditable(false);
        getContentPane().add(DelClName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 120, -1));

        jLabel3.setText("Nom Client");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 78, -1));

        JbDelCl.setText("Supprimer Client");
        JbDelCl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbDelClActionPerformed(evt);
            }
        });
        getContentPane().add(JbDelCl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 233, 120, 30));

        jLabel5.setText("Adresse ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        DelClTel.setEditable(false);
        getContentPane().add(DelClTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 120, -1));

        JbDelClBack.setText("Annuler");
        JbDelClBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbDelClBackActionPerformed(evt);
            }
        });
        getContentPane().add(JbDelClBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 233, 100, 30));

        jTCl.setModel(new ClientController());
        jTCl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTClMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTCl);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 310, 230));

        jLabel4.setText("Prenom Client");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 110, -1));

        DelClAdr.setEditable(false);
        getContentPane().add(DelClAdr, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 120, -1));

        jLabel2.setText("Id Client");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        IdCl.setEditable(false);
        getContentPane().add(IdCl, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 120, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PI_Icone/bkg-3.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JbDelClActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbDelClActionPerformed
        // TODO add your handling code here:
           Client CL=new Client();
      int a=Integer.parseInt(IdCl.getText());
      
         ClientDAO respDao =new ClientDAO();
      respDao.deletclient(a);
      jTCl = new javax.swing.JTable();

jTCl.setModel(new ClientController());

jTCl.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        jTable1MouseClicked(evt);
    }
});

jScrollPane1.setViewportView(jTCl);
    }                                       

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
         int row = jTCl.getSelectedRow();
        Object idcl = jTCl.getValueAt(row, 0);
        Object a = jTCl.getValueAt(row, 1);
        Object b = jTCl.getValueAt(row, 2);
        Object c = jTCl.getValueAt(row, 3);
        Object d = jTCl.getValueAt(row, 4); 
       
        
        
            
           
           DelClName.setText(""+a);
           DelCLPr.setText(""+b);
           DelClAdr.setText(""+c);
           DelClTel.setText(""+d);
           IdCl.setText(""+idcl);
           
           
    }//GEN-LAST:event_JbDelClActionPerformed

    private void jTClMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTClMouseClicked
        // TODO add your handling code here:
         int row = jTCl.getSelectedRow();
        Object idcl = jTCl.getValueAt(row, 0);
        Object a = jTCl.getValueAt(row, 1);
        Object b = jTCl.getValueAt(row, 2);
        Object c = jTCl.getValueAt(row, 3);
        Object d = jTCl.getValueAt(row, 4); 
       
        
        
            
           
           DelClName.setText(""+a);
           DelCLPr.setText(""+b);
           DelClAdr.setText(""+c);
           DelClTel.setText(""+d);
           IdCl.setText(""+idcl);
           
           
    }//GEN-LAST:event_jTClMouseClicked

    private void JbDelClBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbDelClBackActionPerformed
        // TODO add your handling code here:
         homeadmin G=new homeadmin();
        G.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_JbDelClBackActionPerformed

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
            java.util.logging.Logger.getLogger(SuppressionClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuppressionClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuppressionClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuppressionClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new SuppressionClient().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DelCLPr;
    private javax.swing.JTextField DelClAdr;
    private javax.swing.JTextField DelClName;
    private javax.swing.JTextField DelClTel;
    private javax.swing.JTextField IdCl;
    private javax.swing.JButton JbDelCl;
    private javax.swing.JButton JbDelClBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTCl;
    // End of variables declaration//GEN-END:variables
}
