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

public class CMasJulyEnroll extends javax.swing.JFrame {

    /**
     * Creates new form CMasJulyEnroll
     */
    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    
    static String fac;
    
    public CMasJulyEnroll() {
        initComponents();
    }
    
    public CMasJulyEnroll(String para){
        initComponents();
        this.fac=para;
        setvalues();
        
        setSize(576,610);
        setResizable(false);
    }
    
    //Allocate subjects for selection
    public void setvalues()
    {
        if(fac=="Computing")
        {
            //Semester 2 subject allocation
            try
            {
                conn=MySqlConnect.ConnectDB();
                String sql="SELECT * FROM c_subject WHERE credits=3 AND cType='Msc' AND category=1 AND semester='Sem2'";
                pst=conn.prepareStatement(sql);
                rs=pst.executeQuery();
                sub21.removeAllItems();
                while(rs.next())
                {
                    sub21.addItem(rs.getString("name"));
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }

            try
            {
                String sql="SELECT * FROM c_subject WHERE credits=3 AND cType='Msc' AND category=2 AND semester='Sem2'";
                pst=conn.prepareStatement(sql);
                rs=pst.executeQuery();
                sub22.removeAllItems();
                while(rs.next())
                {
                    sub22.addItem(rs.getString("name"));
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }

            try
            {
                String sql="SELECT * FROM c_subject WHERE credits=2 AND cType='Msc' AND category=1 AND semester='Sem2'";
                pst=conn.prepareStatement(sql);
                rs=pst.executeQuery();
                sub23.removeAllItems();
                while(rs.next())
                {
                    sub23.addItem(rs.getString("name"));
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }

            try
            {
                String sql="SELECT * FROM c_subject WHERE credits=2 AND cType='Msc' AND category=2 AND semester='Sem2'";
                pst=conn.prepareStatement(sql);
                rs=pst.executeQuery();
                sub24.removeAllItems();
                while(rs.next())
                {
                    sub24.addItem(rs.getString("name"));
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        
        else if(fac=="Business")
        {
            //Semester 2 subject allocation
            try
            {
                conn=MySqlConnect.ConnectDB();
                String sql="SELECT * FROM b_subject WHERE credits=3 AND cType='Msc' AND category=1 AND semester='Sem2'";
                pst=conn.prepareStatement(sql);
                rs=pst.executeQuery();
                sub21.removeAllItems();
                while(rs.next())
                {
                    sub21.addItem(rs.getString("name"));
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }

            try
            {
                String sql="SELECT * FROM b_subject WHERE credits=3 AND cType='Msc' AND category=2 AND semester='Sem2'";
                pst=conn.prepareStatement(sql);
                rs=pst.executeQuery();
                sub22.removeAllItems();
                while(rs.next())
                {
                    sub22.addItem(rs.getString("name"));
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }

            try
            {
                String sql="SELECT * FROM b_subject WHERE credits=2 AND cType='Msc' AND category=1 AND semester='Sem2'";
                pst=conn.prepareStatement(sql);
                rs=pst.executeQuery();
                sub23.removeAllItems();
                while(rs.next())
                {
                    sub23.addItem(rs.getString("name"));
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }

            try
            {
                String sql="SELECT * FROM b_subject WHERE credits=2 AND cType='Msc' AND category=2 AND semester='Sem2'";
                pst=conn.prepareStatement(sql);
                rs=pst.executeQuery();
                sub24.removeAllItems();
                while(rs.next())
                {
                    sub24.addItem(rs.getString("name"));
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        
        //Faculty of Engineering
        else if(fac=="Engineering")
        {
            //Semester 2 subject allocation
            try
            {
                conn=MySqlConnect.ConnectDB();
                String sql="SELECT * FROM e_subject WHERE credits=3 AND cType='Msc' AND category=1 AND semester='Sem2'";
                pst=conn.prepareStatement(sql);
                rs=pst.executeQuery();
                sub21.removeAllItems();
                while(rs.next())
                {
                    sub21.addItem(rs.getString("name"));
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }

            try
            {
                String sql="SELECT * FROM e_subject WHERE credits=3 AND cType='Msc' AND category=2 AND semester='Sem2'";
                pst=conn.prepareStatement(sql);
                rs=pst.executeQuery();
                sub22.removeAllItems();
                while(rs.next())
                {
                    sub22.addItem(rs.getString("name"));
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }

            try
            {
                String sql="SELECT * FROM e_subject WHERE credits=2 AND cType='Msc' AND category=1 AND semester='Sem2'";
                pst=conn.prepareStatement(sql);
                rs=pst.executeQuery();
                sub23.removeAllItems();
                while(rs.next())
                {
                    sub23.addItem(rs.getString("name"));
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }

            try
            {
                String sql="SELECT * FROM e_subject WHERE credits=2 AND cType='Msc' AND category=2 AND semester='Sem2'";
                pst=conn.prepareStatement(sql);
                rs=pst.executeQuery();
                sub24.removeAllItems();
                while(rs.next())
                {
                    sub24.addItem(rs.getString("name"));
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
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
        txtregNo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        sub21 = new javax.swing.JComboBox<>();
        sub22 = new javax.swing.JComboBox<>();
        sub23 = new javax.swing.JComboBox<>();
        sub24 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Enroll Details");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(244, 29, 119, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Registration number:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(83, 94, 129, 17);

        txtregNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtregNo);
        txtregNo.setBounds(290, 91, 147, 23);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Basket subjects:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(83, 138, 100, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Sem 2:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(83, 181, 44, 17);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(409, 457, 75, 25);

        jPanel1.add(sub21);
        sub21.setBounds(83, 226, 28, 20);

        sub22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub22ActionPerformed(evt);
            }
        });
        jPanel1.add(sub22);
        sub22.setBounds(244, 226, 28, 20);

        jPanel1.add(sub23);
        sub23.setBounds(83, 327, 28, 20);

        jPanel1.add(sub24);
        sub24.setBounds(244, 327, 28, 20);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbm/images/wallpaper4.jpg"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 0, 580, 610);

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
            String Sql1="UPDATE c_mas_student SET regNo=? where sID=(SELECT MAX(sID) AS sID FROM c_mas_student)";
        
            try{
                pst=conn.prepareStatement(Sql1);
                pst.setString(1,txtregNo.getText());

                pst.executeUpdate();

            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }

            String[] values={sub21.getSelectedItem().toString(),sub22.getSelectedItem().toString(),
                            sub23.getSelectedItem().toString(),sub24.getSelectedItem().toString()};



            for(int i=0; i<4; i++)
            {    
                String val1=txtregNo.getText().toString();
                String val2=values[i];

                String x="select sID from c_mas_student where regNo='"+val1+"'";
                try {
                    pst=conn.prepareStatement(x);
                } catch (SQLException ex) {
                    Logger.getLogger(CBacFebEnroll.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    rs=pst.executeQuery();
                } catch (SQLException ex) {
                    Logger.getLogger(CBacFebEnroll.class.getName()).log(Level.SEVERE, null, ex);
                }
                int season1 = 0;
                try {
                    if(rs.next())
                        season1 = rs.getInt(1);
                } catch (SQLException ex) {
                    Logger.getLogger(CBacFebEnroll.class.getName()).log(Level.SEVERE, null, ex);
                }

                String y="select id from c_subject where name='"+val2+"'";
                try {
                    pst=conn.prepareStatement(y);
                } catch (SQLException ex) {
                    Logger.getLogger(CBacFebEnroll.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    rs=pst.executeQuery();
                } catch (SQLException ex) {
                    Logger.getLogger(CBacFebEnroll.class.getName()).log(Level.SEVERE, null, ex);
                }
                int season2=0;
                try {
                    if(rs.next())
                        season2 = rs.getInt(1);
                } catch (SQLException ex) {
                    Logger.getLogger(CBacFebEnroll.class.getName()).log(Level.SEVERE, null, ex);
                }


                String Sql2="insert into c_mas_student_subject (sID,id) values("+season1+", "+season2+")";

                try{
                pst=conn.prepareStatement(Sql2);
                pst.executeUpdate();

                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
            }
            PaymentDetails pd=new PaymentDetails();
            pd.setVisible(true);
        }
        
        else if(fac=="Business")
        {
            String Sql1="UPDATE b_mas_student SET regNo=? where sID=(SELECT MAX(sID) AS sID FROM b_mas_student)";
        
            try{
                pst=conn.prepareStatement(Sql1);
                pst.setString(1,txtregNo.getText());

                pst.executeUpdate();

            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }

            String[] values={sub21.getSelectedItem().toString(),sub22.getSelectedItem().toString(),
                            sub23.getSelectedItem().toString(),sub24.getSelectedItem().toString()};



            for(int i=0; i<4; i++)
            {    
                String val1=txtregNo.getText().toString();
                String val2=values[i];

                String x="select sID from b_mas_student where regNo='"+val1+"'";
                try {
                    pst=conn.prepareStatement(x);
                } catch (SQLException ex) {
                    Logger.getLogger(CBacFebEnroll.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    rs=pst.executeQuery();
                } catch (SQLException ex) {
                    Logger.getLogger(CBacFebEnroll.class.getName()).log(Level.SEVERE, null, ex);
                }
                int season1 = 0;
                try {
                    if(rs.next())
                        season1 = rs.getInt(1);
                } catch (SQLException ex) {
                    Logger.getLogger(CBacFebEnroll.class.getName()).log(Level.SEVERE, null, ex);
                }

                String y="select id from b_subject where name='"+val2+"'";
                try {
                    pst=conn.prepareStatement(y);
                } catch (SQLException ex) {
                    Logger.getLogger(CBacFebEnroll.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    rs=pst.executeQuery();
                } catch (SQLException ex) {
                    Logger.getLogger(CBacFebEnroll.class.getName()).log(Level.SEVERE, null, ex);
                }
                int season2=0;
                try {
                    if(rs.next())
                        season2 = rs.getInt(1);
                } catch (SQLException ex) {
                    Logger.getLogger(CBacFebEnroll.class.getName()).log(Level.SEVERE, null, ex);
                }


                String Sql2="insert into b_mas_student_subject (sID,id) values("+season1+", "+season2+")";

                try{
                pst=conn.prepareStatement(Sql2);
                pst.executeUpdate();

                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
            }
            PaymentDetails pd=new PaymentDetails();
            pd.setVisible(true);
        }
        
        else if(fac=="Engineering")
        {
            String Sql1="UPDATE e_mas_student SET regNo=? where sID=(SELECT MAX(sID) AS sID FROM e_mas_student)";
        
            try{
                pst=conn.prepareStatement(Sql1);
                pst.setString(1,txtregNo.getText());

                pst.executeUpdate();

            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }

            String[] values={sub21.getSelectedItem().toString(),sub22.getSelectedItem().toString(),
                            sub23.getSelectedItem().toString(),sub24.getSelectedItem().toString()};



            for(int i=0; i<4; i++)
            {    
                String val1=txtregNo.getText().toString();
                String val2=values[i];

                String x="select sID from e_mas_student where regNo='"+val1+"'";
                try {
                    pst=conn.prepareStatement(x);
                } catch (SQLException ex) {
                    Logger.getLogger(CBacFebEnroll.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    rs=pst.executeQuery();
                } catch (SQLException ex) {
                    Logger.getLogger(CBacFebEnroll.class.getName()).log(Level.SEVERE, null, ex);
                }
                int season1 = 0;
                try {
                    if(rs.next())
                        season1 = rs.getInt(1);
                } catch (SQLException ex) {
                    Logger.getLogger(CBacFebEnroll.class.getName()).log(Level.SEVERE, null, ex);
                }

                String y="select id from e_subject where name='"+val2+"'";
                try {
                    pst=conn.prepareStatement(y);
                } catch (SQLException ex) {
                    Logger.getLogger(CBacFebEnroll.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    rs=pst.executeQuery();
                } catch (SQLException ex) {
                    Logger.getLogger(CBacFebEnroll.class.getName()).log(Level.SEVERE, null, ex);
                }
                int season2=0;
                try {
                    if(rs.next())
                        season2 = rs.getInt(1);
                } catch (SQLException ex) {
                    Logger.getLogger(CBacFebEnroll.class.getName()).log(Level.SEVERE, null, ex);
                }


                String Sql2="insert into e_mas_student_subject (sID,id) values("+season1+", "+season2+")";

                try{
                pst=conn.prepareStatement(Sql2);
                pst.executeUpdate();

                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
            }
            PaymentDetails pd=new PaymentDetails();
            pd.setVisible(true);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void sub22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sub22ActionPerformed

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
            java.util.logging.Logger.getLogger(CMasJulyEnroll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CMasJulyEnroll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CMasJulyEnroll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CMasJulyEnroll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CMasJulyEnroll tst=new CMasJulyEnroll(fac);
                tst.setVisible(true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> sub21;
    private javax.swing.JComboBox<String> sub22;
    private javax.swing.JComboBox<String> sub23;
    private javax.swing.JComboBox<String> sub24;
    private javax.swing.JTextField txtregNo;
    // End of variables declaration//GEN-END:variables
}
