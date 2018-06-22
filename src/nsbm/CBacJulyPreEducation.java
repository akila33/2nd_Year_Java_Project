/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nsbm;

/**
 *
 * @author Rangoda
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class CBacJulyPreEducation extends javax.swing.JFrame {

    /**
     * Creates new form CBacJulyPreEducation
     */
    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    
    String fac;
    
    public CBacJulyPreEducation() {
        initComponents();
    }
    
    public CBacJulyPreEducation(String para){
        initComponents();
        this.fac=para;
        
        setSize(576,610);
        setResizable(false);
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
        jLabel9 = new javax.swing.JLabel();
        txtscore = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtresult = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtrank = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Rank:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(70, 330, 60, 17);
        jPanel1.add(txtscore);
        txtscore.setBounds(220, 260, 117, 20);

        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(420, 460, 55, 23);

        txtresult.setColumns(20);
        txtresult.setRows(5);
        jScrollPane1.setViewportView(txtresult);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(220, 110, 166, 96);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Previous Education");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(156, 31, 173, 22);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("A/L results:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(70, 120, 90, 17);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Z score:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(70, 260, 70, 17);

        txtrank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrankActionPerformed(evt);
            }
        });
        jPanel1.add(txtrank);
        txtrank.setBounds(220, 330, 115, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbm/images/background1.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 580, 610);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            conn=MySqlConnect.ConnectDB();
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(fac=="Computing")
        {
            String Sql="UPDATE c_bac_student SET alResult=? , zScore=? , rank=? WHERE sID=(Select max(sID) as sID from c_bac_student)";
            try{
                pst=conn.prepareStatement(Sql);
                pst.setString(1,txtresult.getText());
                pst.setString(2,txtscore.getText());
                pst.setString(3,txtrank.getText());
                pst.executeUpdate();
                if(true){
                    CBacJulyEnroll cbje=new CBacJulyEnroll();
                    cbje.setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Invalid username or password","Access Denied", JOptionPane.ERROR_MESSAGE);
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
        
        else if(fac=="Business")
        {
            String Sql="UPDATE b_bac_student SET alResult=? , zScore=? , rank=? WHERE sID=(Select max(sID) as sID from b_bac_student)";
            try{
                pst=conn.prepareStatement(Sql);
                pst.setString(1,txtresult.getText());
                pst.setString(2,txtscore.getText());
                pst.setString(3,txtrank.getText());
                pst.executeUpdate();
                if(true){
                    CBacJulyEnroll cbje=new CBacJulyEnroll();
                    cbje.setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Invalid username or password","Access Denied", JOptionPane.ERROR_MESSAGE);
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
        
        else if(fac=="Enginnering")
        {
            String Sql="UPDATE e_bac_student SET alResult=? , zScore=? , rank=? WHERE sID=(Select max(sID) as sID from e_bac_student)";
            try{
                pst=conn.prepareStatement(Sql);
                pst.setString(1,txtresult.getText());
                pst.setString(2,txtscore.getText());
                pst.setString(3,txtrank.getText());
                pst.executeUpdate();
                if(true){
                    CBacJulyEnroll cbje=new CBacJulyEnroll();
                    cbje.setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Invalid username or password","Access Denied", JOptionPane.ERROR_MESSAGE);
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtrankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrankActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrankActionPerformed

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
            java.util.logging.Logger.getLogger(CBacJulyPreEducation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CBacJulyPreEducation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CBacJulyPreEducation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CBacJulyPreEducation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CBacJulyPreEducation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtrank;
    private javax.swing.JTextArea txtresult;
    private javax.swing.JTextField txtscore;
    // End of variables declaration//GEN-END:variables
}
