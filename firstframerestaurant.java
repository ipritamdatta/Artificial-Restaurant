
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Desktop;
import java.io.IOException;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pritam
 */
public class firstframerestaurant extends javax.swing.JFrame {

    /**
     * Creates new form firstframerestaurant
     */
    public firstframerestaurant() {
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

        jPanel1 = new javax.swing.JPanel();
        jLbrestauranttitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jComboBox_first_choose_option = new javax.swing.JComboBox<>();
        jBexit_1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLbfirstlabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(700, 500));
        jPanel1.setLayout(null);

        jLbrestauranttitle.setFont(new java.awt.Font("Vijaya", 1, 70)); // NOI18N
        jLbrestauranttitle.setForeground(new java.awt.Color(255, 255, 255));
        jLbrestauranttitle.setText("Restaurant De Dhaka");
        jPanel1.add(jLbrestauranttitle);
        jLbrestauranttitle.setBounds(150, 30, 510, 130);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setText("Welcome");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(320, 140, 130, 30);

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 255, 153));
        jLabel3.setText("Option");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(410, 240, 120, 30);

        jButton3.setBackground(new java.awt.Color(51, 102, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("f");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(20, 20, 40, 40);

        jComboBox_first_choose_option.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CHOOSE OPTION", "MENU FINDER", "BROWSE LOCATION BY FOOD TYPE", "NEAR LANDMARKS" }));
        jComboBox_first_choose_option.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_first_choose_optionActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox_first_choose_option);
        jComboBox_first_choose_option.setBounds(410, 280, 240, 40);

        jBexit_1.setBackground(new java.awt.Color(153, 153, 255));
        jBexit_1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBexit_1.setForeground(new java.awt.Color(51, 51, 255));
        jBexit_1.setText("EXIT");
        jBexit_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBexit_1ActionPerformed(evt);
            }
        });
        jPanel1.add(jBexit_1);
        jBexit_1.setBounds(650, 410, 90, 30);

        jButton1.setBackground(new java.awt.Color(153, 204, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 102, 255));
        jButton1.setText("About us");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(40, 410, 100, 40);

        jButton2.setBackground(new java.awt.Color(255, 204, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 51, 51));
        jButton2.setText("Contact");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(40, 340, 100, 40);

        jLbfirstlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delicious-mexican-food-recipes-12.jpg"))); // NOI18N
        jLbfirstlabel.setPreferredSize(new java.awt.Dimension(700, 310));
        jPanel1.add(jLbfirstlabel);
        jLbfirstlabel.setBounds(0, 0, 780, 460);

        jPanel2.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/9aec53a02be059b10f9c7f114625236a.jpg"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(-810, 0, 930, 460);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(660, 0, 120, 460);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 783, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private JFrame frame;
    private void jBexit_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBexit_1ActionPerformed
        frame = new JFrame("exit");
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Restaurant De Dhaka",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jBexit_1ActionPerformed

    private void jComboBox_first_choose_optionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_first_choose_optionActionPerformed
        if((jComboBox_first_choose_option.getSelectedItem().equals("MENU FINDER")))
        {
            get_info_from_database gifd = new get_info_from_database();
            gifd.setVisible(true);
            dispose();
        }
        if((jComboBox_first_choose_option.getSelectedItem().equals("BROWSE LOCATION BY FOOD TYPE")))
        {
            browse_location_by_food_type bdcbft = new browse_location_by_food_type();
            bdcbft.setVisible(true);
            dispose();
        }
        if((jComboBox_first_choose_option.getSelectedItem().equals("NEAR LANDMARKS")))
        {
            near_landmarks nl = new near_landmarks();
            nl.setVisible(true);
            dispose();
        }
        
        if((jComboBox_first_choose_option.getSelectedItem().equals("CHOOSE OPTION")))
        {
            JOptionPane.showMessageDialog(null,"SELECT A VALID OPTION");
        }
    }//GEN-LAST:event_jComboBox_first_choose_optionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Aboutussection aus = new Aboutussection();
        aus.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Contact c = new Contact();
        c.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            String url="https://www.facebook.com/pritamdatta.shuvo";
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (IOException ex) {
            Logger.getLogger(Aboutussection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(firstframerestaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(firstframerestaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(firstframerestaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(firstframerestaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new firstframerestaurant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBexit_1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox_first_choose_option;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLbfirstlabel;
    private javax.swing.JLabel jLbrestauranttitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}