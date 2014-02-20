/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pi_Gui;

import Pi_Controllers.ClientController;
import Pi_Dao.ClientDAO;
import Pi_entities.Client;

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setText("Telephone");

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        jLabel1.setText("Supprimer un CLient");

        DelCLPr.setEditable(false);

        DelClName.setEditable(false);

        jLabel3.setText("Nom Client");

        JbDelCl.setText("Supprimer Client");
        JbDelCl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbDelClActionPerformed(evt);
            }
        });

        jLabel5.setText("Adresse ");

        DelClTel.setEditable(false);

        JbDelClBack.setText("Annuler");
        JbDelClBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbDelClBackActionPerformed(evt);
            }
        });

        jTCl.setModel(new ClientController());
        jTCl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTClMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTCl);

        jLabel4.setText("Prenom Client");

        DelClAdr.setEditable(false);

        jLabel2.setText("Id Client");

        IdCl.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(DelClTel, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                    .addComponent(DelClName, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                    .addComponent(DelCLPr, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                    .addComponent(DelClAdr, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                    .addComponent(IdCl)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(JbDelCl)
                                .addGap(39, 39, 39)
                                .addComponent(JbDelClBack, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(126, 126, 126)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(IdCl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(DelClName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(DelCLPr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(DelClAdr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(DelClTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JbDelCl)
                            .addComponent(JbDelClBack))))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JbDelClActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbDelClActionPerformed
        // TODO add your handling code here:
           Client CL=new Client();
      int a=Integer.parseInt(IdCl.getText());
      
         ClientDAO respDao =new ClientDAO();
      respDao.deletResp(a);
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
        GestionResponsableAgence G=new GestionResponsableAgence();
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTCl;
    // End of variables declaration//GEN-END:variables
}