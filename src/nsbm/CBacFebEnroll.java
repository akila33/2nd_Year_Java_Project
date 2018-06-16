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
//import java.lang.NullPointerException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class CBacFebEnroll extends javax.swing.JFrame {

    /**
     * Creates new form CBacFebEnroll
     */
    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    
    static String fac;
    
    public CBacFebEnroll() {
        initComponents();
        
    }

    public CBacFebEnroll(String para){
        initComponents();
        this.fac=para;
        setvalues();
        
    }    
    
    //Allocate subjects for selection
    private void setvalues()
    {
        //sub11.addItem("Web".toString());
        
        if(fac=="Computing")
        {
            //Semester 1 subject allocation
        
            try
            {
                conn=MySqlConnect.ConnectDB();
                //System.out.println("yellow");
                String sql="SELECT * FROM c_subject WHERE credits=3 AND cType='Bsc' AND category=1 AND semester='Sem1'";
                pst=conn.prepareStatement(sql);
                rs=pst.executeQuery();
                sub11.removeAllItems();
                while(rs.next())
                {
                    sub11.addItem(rs.getString("name"));
                    
                    //System.out.println(sql);
                }
                //rs.close();
                //pst.close();
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }

            try
            {
                //System.out.println("yellow");
                String sql="SELECT * FROM c_subject WHERE credits=3 AND cType='Bsc' AND category=2 AND semester='Sem1'";
                
                pst=conn.prepareStatement(sql);
                rs=pst.executeQuery();
                sub12.removeAllItems();
                while(rs.next())
                {
                    sub12.addItem(rs.getString("name"));
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }

            try
            {
                String sql="SELECT * FROM c_subject WHERE credits=2 AND cType='Bsc' AND category=1 AND semester='Sem1'";
                pst=conn.prepareStatement(sql);
                rs=pst.executeQuery();
                sub13.removeAllItems();
                while(rs.next())
                {
                    sub13.addItem(rs.getString("name"));
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }

            try
            {
                String sql="SELECT * FROM c_subject WHERE credits=2 AND cType='Bsc' AND category=2 AND semester='Sem1'";
                pst=conn.prepareStatement(sql);
                rs=pst.executeQuery();
                sub14.removeAllItems();
                while(rs.next())
                {
                    sub14.addItem(rs.getString("name"));
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }

            //Semester 2 subject allocation
            try
            {
                String sql="SELECT * FROM c_subject WHERE credits=3 AND cType='Bsc' AND category=1 AND semester='Sem2'";
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
                String sql="SELECT * FROM c_subject WHERE credits=3 AND cType='Bsc' AND category=2 AND semester='Sem2'";
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
                String sql="SELECT * FROM c_subject WHERE credits=2 AND cType='Bsc' AND category=1 AND semester='Sem2'";
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
                String sql="SELECT * FROM c_subject WHERE credits=2 AND cType='Bsc' AND category=2 AND semester='Sem2'";
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
        
        if(fac=="Business")
        {
            //Semester 1 subject allocation
            try
            {
                String sql="SELECT * FROM b_subject WHERE credits=3 AND cType='Bsc' AND category=1 AND semester='Sem1'";
                pst=conn.prepareStatement(sql);
                rs=pst.executeQuery();
                sub11.removeAllItems();
                while(rs.next())
                {
                    sub11.addItem(rs.getString("name"));
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }

            try
            {
                String sql="SELECT * FROM b_subject WHERE credits=3 AND cType='Bsc' AND category=2 AND semester='Sem1'";
                pst=conn.prepareStatement(sql);
                rs=pst.executeQuery();
                sub12.removeAllItems();
                while(rs.next())
                {
                    sub12.addItem(rs.getString("name"));
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }

            try
            {
                String sql="SELECT * FROM b_subject WHERE credits=2 AND cType='Bsc' AND category=1 AND semester='Sem1'";
                pst=conn.prepareStatement(sql);
                rs=pst.executeQuery();
                sub13.removeAllItems();
                while(rs.next())
                {
                    sub13.addItem(rs.getString("name"));
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }

            try
            {
                String sql="SELECT * FROM b_subject WHERE credits=2 AND cType='Bsc' AND category=2 AND semester='Sem1'";
                pst=conn.prepareStatement(sql);
                rs=pst.executeQuery();
                sub14.removeAllItems();
                while(rs.next())
                {
                    sub14.addItem(rs.getString("name"));
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }

            //Semester 2 subject allocation
            try
            {
                String sql="SELECT * FROM b_subject WHERE credits=3 AND cType='Bsc' AND category=1 AND semester='Sem2'";
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
                String sql="SELECT * FROM b_subject WHERE credits=3 AND cType='Bsc' AND category=2 AND semester='Sem2'";
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
                String sql="SELECT * FROM b_subject WHERE credits=2 AND cType='Bsc' AND category=1 AND semester='Sem2'";
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
                String sql="SELECT * FROM b_subject WHERE credits=2 AND cType='Bsc' AND category=2 AND semester='Sem2'";
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
            //Semester 1 subject allocation
            try
            {
                String sql="SELECT * FROM e_subject WHERE credits=3 AND cType='Bsc' AND category=1 AND semester='Sem1'";
                pst=conn.prepareStatement(sql);
                rs=pst.executeQuery();
                sub11.removeAllItems();
                while(rs.next())
                {
                    sub11.addItem(rs.getString("name"));
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }

            try
            {
                String sql="SELECT * FROM e_subject WHERE credits=3 AND cType='Bsc' AND category=2 AND semester='Sem1'";
                pst=conn.prepareStatement(sql);
                rs=pst.executeQuery();
                sub12.removeAllItems();
                while(rs.next())
                {
                    sub12.addItem(rs.getString("name"));
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }

            try
            {
                String sql="SELECT * FROM e_subject WHERE credits=2 AND cType='Bsc' AND category=1 AND semester='Sem1'";
                pst=conn.prepareStatement(sql);
                rs=pst.executeQuery();
                sub13.removeAllItems();
                while(rs.next())
                {
                    sub13.addItem(rs.getString("name"));
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }

            try
            {
                String sql="SELECT * FROM e_subject WHERE credits=2 AND cType='Bsc' AND category=2 AND semester='Sem1'";
                pst=conn.prepareStatement(sql);
                rs=pst.executeQuery();
                sub14.removeAllItems();
                while(rs.next())
                {
                    sub14.addItem(rs.getString("name"));
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }

            //Semester 2 subject allocation
            try
            {
                String sql="SELECT * FROM e_subject WHERE credits=3 AND cType='Bsc' AND category=1 AND semester='Sem2'";
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
                String sql="SELECT * FROM e_subject WHERE credits=3 AND cType='Bsc' AND category=2 AND semester='Sem2'";
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
                String sql="SELECT * FROM e_subject WHERE credits=2 AND cType='Bsc' AND category=1 AND semester='Sem2'";
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
                String sql="SELECT * FROM e_subject WHERE credits=2 AND cType='Bsc' AND category=2 AND semester='Sem2'";
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
        jLabel5 = new javax.swing.JLabel();
        sub11 = new javax.swing.JComboBox<>();
        sub12 = new javax.swing.JComboBox<>();
        sub21 = new javax.swing.JComboBox<>();
        sub22 = new javax.swing.JComboBox<>();
        sub13 = new javax.swing.JComboBox<>();
        sub14 = new javax.swing.JComboBox<>();
        sub23 = new javax.swing.JComboBox<>();
        sub24 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Enroll Details");

        jLabel2.setText("Registration number:");

        txtregNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtregNoActionPerformed(evt);
            }
        });

        jLabel3.setText("Basket Subjects:");

        jLabel4.setText("Sem 1:");

        jLabel5.setText("Sem 2:");

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sub11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sub13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 408, Short.MAX_VALUE)
                                .addComponent(sub22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sub24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(231, 231, 231)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(33, 33, 33))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(78, 78, 78)
                                    .addComponent(txtregNo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(sub14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sub12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(114, 114, 114)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(sub21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sub23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(56, 56, 56))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtregNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sub11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sub12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sub21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sub22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sub23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sub24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sub14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sub13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtregNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtregNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtregNoActionPerformed

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
            String Sql1="UPDATE c_bac_student SET regNo=? where sID=(Select max(sID) as sID from c_bac_student)";
        
            try{
                pst=conn.prepareStatement(Sql1);
                pst.setString(1,txtregNo.getText());

                pst.executeUpdate();
    
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }

            String[] values={sub11.getSelectedItem().toString(),sub12.getSelectedItem().toString(),
                            sub13.getSelectedItem().toString(),sub14.getSelectedItem().toString(),
                            sub21.getSelectedItem().toString(),sub22.getSelectedItem().toString(),
                            sub23.getSelectedItem().toString(),sub24.getSelectedItem().toString()};

            for(int i=0; i<8; i++)
            {
                String val1=txtregNo.getText().toString();
                String val2=values[i];

                String x="select sID from c_bac_student where regNo='"+val1+"'";
                try {
                    pst=conn.prepareStatement(x);
                } catch (SQLException ex) {
                    Logger.getLogger(CBacFebEnroll.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    //pst.setString(1,txtregNo.getText());
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
                    //pst.setString(1,txtregNo.getText());
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


                String Sql2="insert into c_bac_student_subject (sID,id) values("+season1+", "+season2+")";
                
                try{
                pst=conn.prepareStatement(Sql2);
                //pst.setString(1,txtregNo.getText());
                //pst.setString(2,rs.getString(1));

                //rs=pst.executeQuery();
                pst.executeUpdate();

                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
            }
            PaymentDetails pd=new PaymentDetails(values,fac);
            pd.setVisible(true);
        }
        
        else if(fac=="Business")
        {
            String Sql1="UPDATE b_bac_student SET regNo=? where sID=(Select max(sID) as sID from b_bac_student)";
        
            try{
                pst=conn.prepareStatement(Sql1);
                pst.setString(1,txtregNo.getText());

                pst.executeUpdate();
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }

            String[] values={sub11.getSelectedItem().toString(),sub12.getSelectedItem().toString(),
                            sub13.getSelectedItem().toString(),sub14.getSelectedItem().toString(),
                            sub21.getSelectedItem().toString(),sub22.getSelectedItem().toString(),
                            sub23.getSelectedItem().toString(),sub24.getSelectedItem().toString()};

            for(int i=0; i<8; i++)
            {

                String val1=txtregNo.getText().toString();
                String val2=values[i];

                String x="select sID from b_bac_student where regNo='"+val1+"'";
                try {
                    pst=conn.prepareStatement(x);
                } catch (SQLException ex) {
                    Logger.getLogger(CBacFebEnroll.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    //pst.setString(1,txtregNo.getText());
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
                    //pst.setString(1,txtregNo.getText());
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

                String Sql2="insert into b_bac_student_subject (sID,id) values("+season1+", "+season2+")";
    
                try{
                pst=conn.prepareStatement(Sql2);
                pst.executeUpdate();

                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
            }
            PaymentDetails pd=new PaymentDetails(values,fac);
            pd.setVisible(true);
        }
        
        else if(fac=="Engineering")
        {
            String Sql1="UPDATE e_bac_student SET regNo=? where sID=(Select max(sID) as sID from e_bac_student)";
        
            try{
                pst=conn.prepareStatement(Sql1);
                pst.setString(1,txtregNo.getText());

                pst.executeUpdate();
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }

            String[] values={sub11.getSelectedItem().toString(),sub12.getSelectedItem().toString(),
                            sub13.getSelectedItem().toString(),sub14.getSelectedItem().toString(),
                            sub21.getSelectedItem().toString(),sub22.getSelectedItem().toString(),
                            sub23.getSelectedItem().toString(),sub24.getSelectedItem().toString()};



            for(int i=0; i<8; i++)
            {

                String val1=txtregNo.getText().toString();
                String val2=values[i];

                String x="select sID from e_bac_student where regNo='"+val1+"'";
                try {
                    pst=conn.prepareStatement(x);
                } catch (SQLException ex) {
                    Logger.getLogger(CBacFebEnroll.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    //pst.setString(1,txtregNo.getText());
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
                    //pst.setString(1,txtregNo.getText());
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


                String Sql2="insert into e_bac_student_subject (sID,id) values("+season1+", "+season2+")";
    
                try{
                pst=conn.prepareStatement(Sql2);
                pst.executeUpdate();

                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
            }
            PaymentDetails pd=new PaymentDetails(values,fac);
            pd.setVisible(true);
        }
        
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
            java.util.logging.Logger.getLogger(CBacFebEnroll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CBacFebEnroll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CBacFebEnroll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CBacFebEnroll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        
        //CBacFebEnroll tfm = new CBacFebEnroll(fac);
        //tfm.setvalues();
        //String s = null;
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CBacFebEnroll tst=new CBacFebEnroll(fac);
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
    private javax.swing.JComboBox<String> sub11;
    private javax.swing.JComboBox<String> sub12;
    private javax.swing.JComboBox<String> sub13;
    private javax.swing.JComboBox<String> sub14;
    private javax.swing.JComboBox<String> sub21;
    private javax.swing.JComboBox<String> sub22;
    private javax.swing.JComboBox<String> sub23;
    private javax.swing.JComboBox<String> sub24;
    private javax.swing.JTextField txtregNo;
    // End of variables declaration//GEN-END:variables
}
