/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smsystem;

/**
 *
 * @author User
 */
public class studentProfile extends javax.swing.JFrame {

    /**
     * Creates new form studentProfile
     */
    public studentProfile() {
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

        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        sn = new javax.swing.JTextField();
        sid = new javax.swing.JTextField();
        sdept = new javax.swing.JTextField();
        sfather = new javax.swing.JTextField();
        smother = new javax.swing.JTextField();
        saddress = new javax.swing.JTextField();
        smail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        smail1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 20, 90, 30));

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jTextField1.setText("STUDENT PROFILE ");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name  :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 131, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID : ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 173, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Father's Name: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 267, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Mother's Name:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 319, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Address :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 371, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Department: ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, -1, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Edu Mail: ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 413, -1, 31));
        getContentPane().add(sn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 289, -1));
        getContentPane().add(sid, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 289, -1));
        getContentPane().add(sdept, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 289, -1));
        getContentPane().add(sfather, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 289, -1));
        getContentPane().add(smother, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, 289, -1));

        saddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saddressActionPerformed(evt);
            }
        });
        getContentPane().add(saddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, 290, -1));

        smail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smailActionPerformed(evt);
            }
        });
        getContentPane().add(smail, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, 290, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Semester :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 215, -1, -1));

        smail1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smail1ActionPerformed(evt);
            }
        });
        getContentPane().add(smail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, 290, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smsystem/frontbk1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saddressActionPerformed

    private void smailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_smailActionPerformed

    private void smail1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smail1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_smail1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new StuLogin().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(studentProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField saddress;
    private javax.swing.JTextField sdept;
    private javax.swing.JTextField sfather;
    private javax.swing.JTextField sid;
    private javax.swing.JTextField smail;
    private javax.swing.JTextField smail1;
    private javax.swing.JTextField smother;
    private javax.swing.JTextField sn;
    // End of variables declaration//GEN-END:variables
}
