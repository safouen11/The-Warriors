/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Voy.esprit.Gui;

import Voy.esprit.Dao.OffreDAO;
import Voy.esprit.Dao.ProgrammeDAO;
import Voy.esprit.entities.Offre;
import Voy.esprit.entities.Programme;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class AjouterProgramme extends javax.swing.JFrame {

    /**
     * Creates new form AjouterProgramme
     */
    public AjouterProgramme() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jBannuler = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        imagee = new javax.swing.JTextField();
        parcourir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Ajouter Programme"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nom Programme :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 110, 20));

        jLabel2.setText("Date Programme :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 100, 20));

        jLabel3.setText("Ville Départ :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 80, 20));

        jLabel4.setText("Ville Arrivée");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 60, 40));

        jLabel5.setText("Budget :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 60, 30));

        jButton1.setText("Valider");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        jBannuler.setText("Annuler");
        jBannuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBannulerActionPerformed(evt);
            }
        });
        getContentPane().add(jBannuler, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 110, 20));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 110, 20));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 110, 20));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 110, 20));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 110, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel6.setText("Ajouter Programme");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 170, -1));

        jLabel9.setText("inserer votre image :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, -1, 30));

        imagee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageeActionPerformed(evt);
            }
        });
        getContentPane().add(imagee, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 140, -1));

        parcourir.setText("parcourir");
        parcourir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                parcourirMouseClicked(evt);
            }
        });
        parcourir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parcourirActionPerformed(evt);
            }
        });
        getContentPane().add(parcourir, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, -1, -1));

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-637)/2, (screenSize.height-411)/2, 637, 411);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           Offre of=new Offre();
        Programme pr = new Programme();
      
       pr.setNomProg(jTextField1.getText());
       pr.setDateProg(jTextField2.getText());
       pr.setVilleDepProg(jTextField3.getText());
       pr.setVilleArProg(jTextField4.getText());
       pr.setBudgetProg(jTextField5.getText());
        pr.setImage(imagee.getText());
       ProgrammeDAO progDAO = new ProgrammeDAO();
       progDAO.insertProgramme(pr);
                OffreDAO ofDao =new OffreDAO();
      ofDao.insertOffre(of);
       JOptionPane.showMessageDialog(this, "AJout effectué avec succés!");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jBannulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBannulerActionPerformed
       ajouterOffre G=new ajouterOffre();
      G.setVisible(true);
          dispose();
       
    }//GEN-LAST:event_jBannulerActionPerformed

    private void imageeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imageeActionPerformed

    private void parcourirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_parcourirMouseClicked
        JFileChooser fc =new JFileChooser();
        fc.showOpenDialog(this);
        File file=fc.getSelectedFile();
        if (file !=null)
        {
            imagee.setText(file.getPath());         // TODO add your handling code here:
        }
    }//GEN-LAST:event_parcourirMouseClicked

    private void parcourirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parcourirActionPerformed

    }//GEN-LAST:event_parcourirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AjouterProgramme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjouterProgramme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjouterProgramme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjouterProgramme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjouterProgramme().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField imagee;
    private javax.swing.JButton jBannuler;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JButton parcourir;
    // End of variables declaration//GEN-END:variables
}