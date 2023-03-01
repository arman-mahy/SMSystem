/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smsystem;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.io.BufferedReader;
import java.io.FileReader;
import static java.lang.Integer.parseInt;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class addstudent extends javax.swing.JFrame {

     public addstudent() {
        initComponents();
        fetch();
    }
    
    public void fetch(){
        try{
              Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            java.sql.Connection connection;
            connection = DriverManager
                    .getConnection(
                            "jdbc:sqlserver://localhost:1433;databaseName=SavetheFuture;selectMethod=cursor", "sa", "123456");
            
            //Statement st = connection.createStatement();
            String sql  ="select * from student2";
            java.sql.PreparedStatement pst = connection.prepareStatement(sql);
            ResultSet rs= pst.executeQuery();
            DefaultTableModel tm =(DefaultTableModel)jTable2.getModel();
            tm.setRowCount(0);
            
            while(rs.next()){
                Object o[]={rs.getString("Name"),rs.getInt("ID"),rs.getString("Email"),rs.getString("Mobile")      
                };
                tm.addRow(o);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sname = new javax.swing.JTextField();
        sid = new javax.swing.JTextField();
        semail = new javax.swing.JTextField();
        smobile = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton3_import = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 10, -1, 41));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name  :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID : ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mobile : ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        sname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snameActionPerformed(evt);
            }
        });
        getContentPane().add(sname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 289, -1));
        getContentPane().add(sid, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 289, -1));
        getContentPane().add(semail, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 289, -1));
        getContentPane().add(smobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 289, -1));

        jButton2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 14)); // NOI18N
        jButton2.setText("SUBMIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 610, -1, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Email :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        jTable2.setBackground(new java.awt.Color(229, 231, 168));
        jTable2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTable2.setForeground(new java.awt.Color(255, 0, 0));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "ID", "Email", "Mobile"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 660, 530));

        jButton3_import.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 14)); // NOI18N
        jButton3_import.setText("Import Via Excel File");
        jButton3_import.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3_importActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3_import, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smsystem/frontbk1.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new studentModule().setVisible(true); 
        dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:add student
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try (java.sql.Connection connection = DriverManager
                    .getConnection(
                            "jdbc:sqlserver://localhost:1433;databaseName=SavetheFuture;selectMethod=cursor", "sa", "123456")) {
                String sql = "insert into student2(Name,ID,Email,Mobile) values(?,?,?,?)";
                java.sql.PreparedStatement ptsmt=connection.prepareStatement(sql);
                
                ptsmt.setString(1, sid.getText());
                ptsmt.setString(2, sname.getText());
                ptsmt.setString(3, semail.getText());
                ptsmt.setString(4, smobile.getText());
                
                
                
                ptsmt.executeUpdate();
                
                if(sid.getText().equals("")&& sname.getText().equals("") && semail.getText().equals("") && smobile.getText().equals("") ){
                    
                    //if annnny of 5 field left blank than show massege
                    JOptionPane.showMessageDialog(this, "Please Enter All Data properly!!");
                }
                
                JOptionPane.showMessageDialog(null, "Data Recorded Successfully!!");
            }
        sid.setText("");
        sname.setText("");
        semail.setText("");
        smobile.setText("");
        
        
        fetch();
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:

        DefaultTableModel d = (DefaultTableModel)jTable2.getModel();

        int selectIndex = jTable2.getSelectedRow();
        sid.setText(d.getValueAt(selectIndex, 0).toString());
        sname.setText(d.getValueAt(selectIndex, 1).toString());
        
        semail.setText(d.getValueAt(selectIndex, 2).toString());
        smobile.setText(d.getValueAt(selectIndex, 3).toString());
        

        jButton2.setEnabled(false);

    }//GEN-LAST:event_jTable2MouseClicked

    private void snameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_snameActionPerformed

    private void jButton3_importActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_importActionPerformed
        StudentRetrieveExcel classObj = new StudentRetrieveExcel();
         try {
             classObj.retrieve();
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(addstudent.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(addstudent.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_jButton3_importActionPerformed

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
            java.util.logging.Logger.getLogger(addstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3_import;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField semail;
    private javax.swing.JTextField sid;
    private javax.swing.JTextField smobile;
    private javax.swing.JTextField sname;
    // End of variables declaration//GEN-END:variables
}
