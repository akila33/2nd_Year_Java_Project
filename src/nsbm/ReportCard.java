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
import net.proteanit.sql.DbUtils;

public class ReportCard extends javax.swing.JFrame {

    /**
     * Creates new form ReportCard
     */
    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    
    static String regNo;
    
    public ReportCard() {
        initComponents();
    }
    
    public ReportCard(String para) throws SQLException {
        initComponents();
        this.regNo=para;
        conn=MySqlConnect.ConnectDB();
        display();

        
        setSize(576,610);
        setResizable(false);
        
        jButton2.setOpaque(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setBorderPainted(false);
    }
    
    public void display()
    {
        //listsubjects.setOpaque(false);
        listsubjects.setBorder(null);
        try
        {
            lblregNo.setText(regNo);
            String Sql1="SELECT * FROM student_assignment WHERE regNo LIKE '"+regNo+"'";
            pst=conn.prepareStatement(Sql1);
            rs=pst.executeQuery();

//                    while(rs.next())
//                    {
//                        lblregNo.setText(rs.getString("regNo").toString());
//                        lbl1.setText(rs.getString("fName").toString());
//                        lbl2.setText(rs.getString("dob").toString());
//                        lbl3.setText(rs.getString("address").toString());
//                        //lbl4.setText(rs.getString("telNo").toString());
//                        //lbl5.setText(rs.getString("email").toString());
//                        //lbl6.setText(rs.getString("intake").toString());
//                    }

            DefaultListModel dlm1=new DefaultListModel();
            DefaultListModel dlm2=new DefaultListModel();
            while(rs.next())
            {
                //opt=opt+values[i]+"\n";
                //txtsubjects.setText(opt);
                dlm1.addElement(rs.getString("subject"));
                listsubjects.setModel(dlm1);
                
                
            }
            
            double assTotal;
            double examTotal;
            double Total;
            String grade;
            //double assCount=0.0;

            String sql1="SELECT * FROM student_assignment WHERE regNo LIKE '"+regNo+"'";

            pst=conn.prepareStatement(sql1);
            rs=pst.executeQuery();

            while(rs.next())
            {
                assTotal=0.0;
                examTotal=0.0;
                assTotal=rs.getDouble("ass1Mark")+rs.getDouble("ass1Mark")+rs.getDouble("ass1Mark");
                examTotal=rs.getDouble("examMark");
                assTotal=assTotal/3.0;
                assTotal=assTotal/2.0;
                examTotal=examTotal/2.0;

                Total=assTotal+examTotal;

                if(Total>75)
                    grade="A";
                else if(Total>65)
                    grade="B";
                else if(Total>50)
                    grade="C";
                else
                    grade="D";

                dlm2.addElement(grade);
                listmarks.setModel(dlm2);
                //assCount++;
            }
            
            
            
            
            
            
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblregNo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listsubjects = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listmarks = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Student Report Card");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(237, 20, 200, 60);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Registration No:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(90, 131, 110, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Results:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(90, 202, 60, 17);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Exit");
        jPanel1.add(jButton1);
        jButton1.setBounds(454, 535, 67, 25);

        lblregNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(lblregNo);
        lblregNo.setBounds(250, 131, 154, 14);
        jPanel1.add(jLabel5);
        jLabel5.setBounds(368, 370, 0, 0);

        jScrollPane1.setViewportView(listsubjects);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(250, 237, 114, 211);

        jScrollPane2.setViewportView(listmarks);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(388, 237, 57, 211);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Subject:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(250, 202, 60, 17);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Grade:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(388, 202, 50, 17);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbm/images/back.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(10, 11, 57, 33);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbm/images/wallpaper4.jpg"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 580, 610);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        StudentManagement sm=new StudentManagement();
        sm.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ReportCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ReportCard(regNo).setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ReportCard.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblregNo;
    private javax.swing.JList<String> listmarks;
    private javax.swing.JList<String> listsubjects;
    // End of variables declaration//GEN-END:variables
}
