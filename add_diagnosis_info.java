/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_management;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import java.time.format.DateTimeFormatter;  
import java.time.*;

/**
 *
 * @author User
 */
public class add_diagnosis_info extends javax.swing.JFrame {
    public int flag=0;
    /**
     * Creates new form add_diagnosis_info
     */
    public add_diagnosis_info() {
        initComponents();
        type_of_ward.setVisible(false);
        type_of_ward_combobox.setVisible(false);
        jLabel7.setVisible(false);
        jTextArea1.setVisible(false);
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
        patient = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Patient_Table = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        symptoms = new javax.swing.JTextField();
        diagnosis = new javax.swing.JTextField();
        medicines = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        type_of_ward = new javax.swing.JLabel();
        ward_required_or_not = new javax.swing.JCheckBox();
        type_of_ward_combobox = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(480, 150));
        setMinimumSize(new java.awt.Dimension(780, 500));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Patient ID:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, 30));

        patient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientActionPerformed(evt);
            }
        });
        getContentPane().add(patient, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 190, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_management/search.png"))); // NOI18N
        jButton1.setText("Search");
        jButton1.setToolTipText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, -1, 30));

        Patient_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Patient_Table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 780, 50));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setText("Symptoms:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setText("Diagnosis:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setText("Medicines:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        symptoms.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        symptoms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                symptomsActionPerformed(evt);
            }
        });
        getContentPane().add(symptoms, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 240, -1));

        diagnosis.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        getContentPane().add(diagnosis, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 240, -1));

        medicines.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        getContentPane().add(medicines, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 239, 480, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Ward Required:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, -1, -1));

        type_of_ward.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        type_of_ward.setText("Type Of Ward:");
        getContentPane().add(type_of_ward, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, -1, -1));

        ward_required_or_not.setText("Yes");
        ward_required_or_not.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ward_required_or_notActionPerformed(evt);
            }
        });
        getContentPane().add(ward_required_or_not, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, -1, -1));

        type_of_ward_combobox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        type_of_ward_combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Suite", "Deluxe", "Special Room", "Semi-Private", "General Ward" }));
        type_of_ward_combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                type_of_ward_comboboxActionPerformed(evt);
            }
        });
        getContentPane().add(type_of_ward_combobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, -1, 30));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_management/save-icon--1.png"))); // NOI18N
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_management/Close.png"))); // NOI18N
        jButton3.setText("Close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Patient Basic Details:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 720, 100));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Instruction to Nurse:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_management/search.png"))); // NOI18N
        jButton4.setText("Check Pharmacy Stock");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 239, -1, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_management/Webp.net-resizeimage (4).jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void patientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_patientActionPerformed

    private void symptomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_symptomsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_symptomsActionPerformed

    private void type_of_ward_comboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_type_of_ward_comboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_type_of_ward_comboboxActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void ward_required_or_notActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ward_required_or_notActionPerformed
        // TODO add your handling code here:
        if(ward_required_or_not.isSelected()){
            type_of_ward.setVisible(true);
            type_of_ward_combobox.setVisible(true);
            jLabel7.setVisible(true);
            jTextArea1.setVisible(true);
        }
        else{
            //invert the case to back old state
            type_of_ward.setVisible(false);
            type_of_ward_combobox.setVisible(false);
            jLabel7.setVisible(false);
            jTextArea1.setVisible(false);
        }
    }//GEN-LAST:event_ward_required_or_notActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String ID=patient.getText();
        try {
            Connection conn=Get_Connection.connect_to_database();
            Statement st=conn.createStatement();
            System.out.println("Patient_ID:"+ID);
            String query="select * from patient where PatientID='"+ID+"'";
            ResultSet rs=st.executeQuery(query);
           
    
            if(!rs.isBeforeFirst()){
                JOptionPane.showMessageDialog(null,"Patient Record Not Found!!");
            }
            else{
                 JOptionPane.showMessageDialog(null,"Patient Record Found Successfully!!");
                 patient.setEditable(false);
                 flag=1;
                 Patient_Table.setModel(DbUtils.resultSetToTableModel(rs));
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddNewPatientRecord.class.getName()).log(Level.SEVERE, null, ex);
         
        } catch (SQLException ex) {
            Logger.getLogger(AddNewPatientRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(flag==1){
            String PatientID=patient.getText();
            String symptoms=this.symptoms.getText();
            String diagnosis=this.diagnosis.getText();
            String medicines=this.medicines.getText();
            String option;
            String type;
            String instruction_to_nurse;
            String status;
            DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime now=LocalDateTime.now();
            dtf.format(now);
            if(ward_required_or_not.isSelected()){
                option="YES";
                type=(String) type_of_ward_combobox.getSelectedItem();
                instruction_to_nurse=jTextArea1.getText();
                status="On Progress";
                try{
                    Connection conn= Get_Connection.connect_to_database();
                    Statement st=conn.createStatement();
                    String query="insert into treatment values('"+PatientID+"','"+now+"','"+symptoms+"','"+diagnosis+"','"+instruction_to_nurse+"','"+type+"','"+status+"')";
                    st.executeUpdate(query);
                
                    JOptionPane.showMessageDialog(null,"Treatment details updated successfully!");
                }
                catch(Exception e){
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null,"Error!!");
                }
            }
            
            else{
                option="NO";
                type="";
                status="";
            }
            
            try {
                Connection conn= Get_Connection.connect_to_database();
                Statement st=conn.createStatement();
                String query="insert into patient_history values('"+PatientID+"','"+now+"','"+symptoms+"','"+diagnosis+"','"+medicines+"','"+option+"')";
                st.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null,"Patient history details updated successfully!");
                  
            } catch (Exception e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null,"Error!");
            }
             
             
            setVisible(false);
            new add_diagnosis_info().setVisible(true);
            
        }
        else{
            JOptionPane.showMessageDialog(null,"PatientID field is empty!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String medicine_name=JOptionPane.showInputDialog("Medicine Name:");
         try {
                Connection conn= Get_Connection.connect_to_database();
                Statement st=conn.createStatement();
                String query="select * from medicine where medicine_name='"+medicine_name+"' ";
                ResultSet rs=st.executeQuery(query);
                 if(!rs.isBeforeFirst()){
                        JOptionPane.showMessageDialog(null,"Medicine Not Available!!");
                 }
                 else{
                     //check if quantity>0 && time<expiry_date
                     DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");  
                     LocalDateTime now = LocalDateTime.now();  
                     System.out.println(dtf.format(now));
                     rs.next();
                     String quantity=rs.getString("quantity");
                     int quantity_format=Integer.parseInt(quantity);
                     String expiry_date=rs.getString("expiry_date");
                     
                     LocalDateTime expiry_date_format = LocalDateTime.parse(expiry_date, dtf);
                    
                     if( expiry_date_format.isAfter(now) && quantity_format>0){
                         JOptionPane.showMessageDialog(null,"Medicine Available");
                     }
                     else{
                         JOptionPane.showMessageDialog(null,"Medicine Not Available");
                     }
                 }
                 
        } 
         catch(Exception e){
             e.printStackTrace();
             JOptionPane.showMessageDialog(null,"Error!");
         }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(add_diagnosis_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add_diagnosis_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add_diagnosis_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add_diagnosis_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_diagnosis_info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Patient_Table;
    private javax.swing.JTextField diagnosis;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField medicines;
    private javax.swing.JTextField patient;
    private javax.swing.JTextField symptoms;
    private javax.swing.JLabel type_of_ward;
    private javax.swing.JComboBox<String> type_of_ward_combobox;
    private javax.swing.JCheckBox ward_required_or_not;
    // End of variables declaration//GEN-END:variables
}
