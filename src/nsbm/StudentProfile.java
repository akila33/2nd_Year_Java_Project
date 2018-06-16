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

public class StudentProfile extends javax.swing.JFrame {

    /**
     * Creates new form StudentProfile
     */
    
    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    
    static String regNo;
    
    public StudentProfile() {
        initComponents();
    }
    
    public StudentProfile(String para) throws SQLException {
        initComponents();
        this.regNo=para;
        conn=MySqlConnect.ConnectDB();
        display();
    }
    
    public void display()
    {
        if(regNo.matches(".*COM.*"))
        {
            if(regNo.matches(".*BSC.*"))
            {
                try{
                    String sql="SELECT * FROM c_bac_student WHERE regNo LIKE '"+regNo+"'";
                    pst=conn.prepareStatement(sql);
                    rs=pst.executeQuery();

                    if(rs.next())
                    {
                        lblregNo.setText(rs.getString("regNo").toString());
                        lblname.setText(rs.getString("fName").toString());
                        lblname.setText(lblname.getText()+" "+rs.getString("lName").toString());
                        lbldob.setText(rs.getString("dob").toString());
                        lbladdress.setText(rs.getString("address").toString());
                        lbltelNo.setText(rs.getString("telNo").toString());
                        lblemail.setText(rs.getString("email").toString());
                        lblintake.setText(rs.getString("intake").toString());
                    }
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
            }
            
            if(regNo.matches(".*MSC.*"))
            {
                try{
                    String sql="SELECT * FROM c_mas_student WHERE regNo LIKE '"+regNo+"'";
                    pst=conn.prepareStatement(sql);
                    rs=pst.executeQuery();

                    if(rs.next())
                    {
                        lblregNo.setText(rs.getString("regNo").toString());
                        lblname.setText(rs.getString("fName").toString());
                        lblname.setText(lblname.getText()+" "+rs.getString("lName").toString());
                        lbldob.setText(rs.getString("dob").toString());
                        lbladdress.setText(rs.getString("address").toString());
                        lbltelNo.setText(rs.getString("telNo").toString());
                        lblemail.setText(rs.getString("email").toString());
                        lblintake.setText(rs.getString("intake").toString());
                    }
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }
        
        if(regNo.matches(".*BUS.*"))
        {
            if(regNo.matches(".*BSC.*"))
            {
                try{
                    String sql="SELECT * FROM b_bac_student WHERE regNo LIKE '"+regNo+"'";
                    pst=conn.prepareStatement(sql);
                    rs=pst.executeQuery();

                    if(rs.next())
                    {
                        lblregNo.setText(rs.getString("regNo").toString());
                        lblname.setText(rs.getString("fName").toString());
                        lblname.setText(lblname.getText()+" "+rs.getString("lName").toString());
                        lbldob.setText(rs.getString("dob").toString());
                        lbladdress.setText(rs.getString("address").toString());
                        lbltelNo.setText(rs.getString("telNo").toString());
                        lblemail.setText(rs.getString("email").toString());
                        lblintake.setText(rs.getString("intake").toString());
                    }
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
            }
            
            if(regNo.matches(".*MSC.*"))
            {
                try{
                    String sql="SELECT * FROM b_mas_student WHERE regNo LIKE '"+regNo+"'";
                    pst=conn.prepareStatement(sql);
                    rs=pst.executeQuery();

                    if(rs.next())
                    {
                        lblregNo.setText(rs.getString("regNo").toString());
                        lblname.setText(rs.getString("fName").toString());
                        lblname.setText(lblname.getText()+" "+rs.getString("lName").toString());
                        lbldob.setText(rs.getString("dob").toString());
                        lbladdress.setText(rs.getString("address").toString());
                        lbltelNo.setText(rs.getString("telNo").toString());
                        lblemail.setText(rs.getString("email").toString());
                        lblintake.setText(rs.getString("intake").toString());
                    }
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }
        
        if(regNo.matches(".*ENG.*"))
        {
            if(regNo.matches(".*BSC.*"))
            {
                try{
                    String sql="SELECT * FROM e_bac_student WHERE regNo LIKE '"+regNo+"'";
                    pst=conn.prepareStatement(sql);
                    rs=pst.executeQuery();

                    if(rs.next())
                    {
                        lblregNo.setText(rs.getString("regNo").toString());
                        lblname.setText(rs.getString("fName").toString());
                        lblname.setText(lblname.getText()+" "+rs.getString("lName").toString());
                        lbldob.setText(rs.getString("dob").toString());
                        lbladdress.setText(rs.getString("address").toString());
                        lbltelNo.setText(rs.getString("telNo").toString());
                        lblemail.setText(rs.getString("email").toString());
                        lblintake.setText(rs.getString("intake").toString());
                    }
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
            }
            
            if(regNo.matches(".*MSC.*"))
            {
                try{
                    String sql="SELECT * FROM e_mas_student WHERE regNo LIKE '"+regNo+"'";
                    pst=conn.prepareStatement(sql);
                    rs=pst.executeQuery();

                    if(rs.next())
                    {
                        lblregNo.setText(rs.getString("regNo").toString());
                        lblname.setText(rs.getString("fName").toString());
                        lblname.setText(lblname.getText()+" "+rs.getString("lName").toString());
                        lbldob.setText(rs.getString("dob").toString());
                        lbladdress.setText(rs.getString("address").toString());
                        lbltelNo.setText(rs.getString("telNo").toString());
                        lblemail.setText(rs.getString("email").toString());
                        lblintake.setText(rs.getString("intake").toString());
                    }
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
            }
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
        jLabel3 = new javax.swing.JLabel();
        lblregNo = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lbldob = new javax.swing.JLabel();
        lbladdress = new javax.swing.JLabel();
        lbltelNo = new javax.swing.JLabel();
        lblemail = new javax.swing.JLabel();
        lblintake = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Student Profile");

        jLabel2.setText("Name:");

        jLabel3.setText("Registration No:");

        jLabel4.setText("Date of birth:");

        jLabel5.setText("Address");

        jLabel6.setText("Tel No:");

        jLabel7.setText("Email:");

        jLabel8.setText("Intake:");

        jButton1.setText("Back");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(74, 74, 74)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblregNo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(lblname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblintake, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblemail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbladdress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbltelNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbldob, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(109, 109, 109))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(54, 54, 54))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblregNo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblname, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(lbldob, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(lbladdress, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(lbltelNo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(lblemail, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(lblintake, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addContainerGap(33, Short.MAX_VALUE))
        );

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
            java.util.logging.Logger.getLogger(StudentProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new StudentProfile(regNo).setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(StudentProfile.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbladdress;
    private javax.swing.JLabel lbldob;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblintake;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblregNo;
    private javax.swing.JLabel lbltelNo;
    // End of variables declaration//GEN-END:variables
}
