/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.sql.*;
import javax.swing.*;
import java.awt.Color;
import dao.ConnectionProvider.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JTable;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDateTime;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.util.Calendar;

/**
 *
 * @author Suyash Pardhiye
 */
public class UpdateMedicine extends javax.swing.JFrame {
    
    public String numberPattern = "^[0-9]*$";

    /**
     * Creates new form UpdateMedicine
     */
    public UpdateMedicine() {
        initComponents();
        setLocationRelativeTo(null);
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
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtMedicineId = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCompanyname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtAddQuantity = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPricePerUnit = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Update Medicine ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 6, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(818, 6, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 60, 838, 10));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Medicine ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 81, -1, -1));

        txtMedicineId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtMedicineId, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 78, 300, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 76, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Name ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 149, -1, -1));

        txtName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 183, 300, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Company Name ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 237, -1, -1));

        txtCompanyname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtCompanyname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 277, 300, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Quantity");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 333, -1, -1));

        txtQuantity.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 367, 300, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Add Quantity");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 421, -1, -1));

        txtAddQuantity.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtAddQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 418, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Price Per Unit ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 149, -1, -1));

        txtPricePerUnit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtPricePerUnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPricePerUnitActionPerformed(evt);
            }
        });
        getContentPane().add(txtPricePerUnit, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 183, 300, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        jButton3.setText("Update ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 232, -1, -1));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 15, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/all_pages_background.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int checkMedicineExist = 0; 
        String uniqueId = txtMedicineId.getText();
        if (uniqueId.equals("")){
            JOptionPane.showMessageDialog(null, "Medicine Id Field is required.");
            
        }
        else{
            try{
            Connection con=dao.ConnectionProvider.main();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select *from medicine where uniqueId like '"+uniqueId+"%'");
            while(rs.next()){
                txtMedicineId.setEditable(false);
                txtName.setText(rs.getString("name"));
                txtCompanyname.setText(rs.getString("companyName"));
                txtQuantity.setText(rs.getString("quantity"));
                txtPricePerUnit.setText(rs.getString("price"));
                txtQuantity.setEditable(false);
                checkMedicineExist = 1; 
            
            }
            }
            catch(Exception e) { 
                JOptionPane.showMessageDialog(null, e);
            }
            if (checkMedicineExist == 0){
                JOptionPane.showMessageDialog(null, "Medicine Id does Not Exist.");
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtPricePerUnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPricePerUnitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPricePerUnitActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String uniqueId = txtMedicineId.getText();
        String name = txtName.getText();
        String comapanyName = txtCompanyname.getText();
        String quantity = txtQuantity.getText();
        String price = txtPricePerUnit.getText();
        String addQuantity = txtAddQuantity.getText();
        
        int totalQuantity = 0;
        if (addQuantity.equals("")){
        totalQuanity = Integer.parseInt(quantity) + Integer.parseInt(addQuantity);
        
        }
        if (uniqueId.equals("")){
        JOptionPane.showMessageDialog(null, "Medicine Id Field is required.");
        }else if(name.equals("")){
         JOptionPane.showMessageDialog(null, "Name Field is required.");
        }else if(companyName.equals("")){
        JOptionPane.showMessageDialog(null, "Comapany Name Field is required.");
        }else if(!addQuantity.matches(numberPattern)){
        JOptionPane.showMessageDialog(null, "Add Quantity Field is invalid.");
        }else if(price.equals("")){
        JOptionPane.showMessageDialog(null, "Add Quantity Field is invalid.");
        }else if(!price.matches(numberPattern)){
        JOptionPane.showMessageDialog(null, "Price Per Unit Field is invalid.");
        }else{
       try {
          Connection con=dao.ConnectionProvider.main();
          PreparedStatement ps = con.prepareStatement("update medicine set name=?,companyName=?,quantity=?,price=? where uniqueId=?");
          ps.setString(1, name);
          ps.setString(2, companyName);
          ps.setString(3, totalQuantity);
          ps.setString(4, price);
          ps.setString(5, Integer.parseInt(uniqueId));
          ps.executeUpdate();
          JOptionPane.showMessageDialog(null, "Medicine Updated Successfully ");
          


          
           // Statement st=con.createStatement();
           // ResultSet rs=st.executeQuery("select *from medicine where uniqueId like '"+uniqueId+"%'");
            while(rs.next())
          }
        catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                        }
}
        
}          
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
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
            java.util.logging.Logger.getLogger(UpdateMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateMedicine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtAddQuantity;
    private javax.swing.JTextField txtCompanyname;
    private javax.swing.JTextField txtMedicineId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPricePerUnit;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}
