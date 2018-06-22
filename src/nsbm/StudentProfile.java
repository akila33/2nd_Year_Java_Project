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
        
        setSize(576,610);
        setResizable(false);
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
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Student Profile");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(191, 32, 103, 17);

        jLabel2.setText("Name:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(73, 127, 31, 14);

        jLabel3.setText("Registration No:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(73, 87, 78, 14);
        jPanel1.add(lblregNo);
        lblregNo.setBounds(225, 87, 125, 14);
        jPanel1.add(lblname);
        lblname.setBounds(225, 127, 125, 14);

        jLabel4.setText("Date of birth:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(73, 168, 65, 14);

        jLabel5.setText("Address");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(73, 200, 39, 14);

        jLabel6.setText("Tel No:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(73, 232, 34, 14);

        jLabel7.setText("Email:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(73, 264, 28, 14);

        jLabel8.setText("Intake:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(73, 296, 35, 14);

        jButton1.setText("Back");
        jPanel1.add(jButton1);
        jButton1.setBounds(350, 340, 55, 23);
        jPanel1.add(lbldob);
        lbldob.setBounds(225, 168, 125, 14);
        jPanel1.add(lbladdress);
        lbladdress.setBounds(225, 200, 125, 14);
        jPanel1.add(lbltelNo);
        lbltelNo.setBounds(225, 232, 125, 14);
        jPanel1.add(lblemail);
        lblemail.setBounds(225, 264, 125, 14);
        jPanel1.add(lblintake);
        lblintake.setBounds(225, 296, 125, 14);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbm/images/background1.jpg"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(0, 0, 580, 610);

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
    private javax.swing.JLabel jLabel9;
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
