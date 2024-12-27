/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.form;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kk
 */

public class StudentForm extends javax.swing.JFrame {

    /**
     * Creates new form StudentForm
     */
    public StudentForm() {
        initComponents();
        populateStudents();
        clear();
    }
    private String selectedStudentId;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        genderCb = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        dateOfBirthTxt = new javax.swing.JTextField();
        phoneNoTxt = new javax.swing.JTextField();
        emailTxt = new javax.swing.JTextField();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputTbl = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel3.setBackground(new java.awt.Color(153, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Student Enrollment System");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(267, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, -1));

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 950, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 950, 50));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 2), "Student Enrollment", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(0, 153, 153))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Date of Birth");

        nameTxt.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        nameTxt.setForeground(new java.awt.Color(0, 153, 153));

        genderCb.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        genderCb.setForeground(new java.awt.Color(0, 153, 153));
        genderCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        genderCb.setSelectedIndex(-1);
        genderCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderCbActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("Name");

        jLabel5.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("Gender");

        jLabel7.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("Phone No");

        jLabel8.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 153));
        jLabel8.setText("Email");

        dateOfBirthTxt.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        dateOfBirthTxt.setForeground(new java.awt.Color(0, 153, 153));

        phoneNoTxt.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        phoneNoTxt.setForeground(new java.awt.Color(0, 153, 153));

        emailTxt.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        emailTxt.setForeground(new java.awt.Color(0, 153, 153));

        updateBtn.setBackground(new java.awt.Color(0, 153, 153));
        updateBtn.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateBtn.setText("Update");
        updateBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(0, 153, 153));
        deleteBtn.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtn.setText("Delete");
        deleteBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        clearBtn.setBackground(new java.awt.Color(0, 153, 153));
        clearBtn.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        clearBtn.setForeground(new java.awt.Color(255, 255, 255));
        clearBtn.setText("Clear");
        clearBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        addBtn.setBackground(new java.awt.Color(0, 153, 153));
        addBtn.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        addBtn.setForeground(new java.awt.Color(255, 255, 255));
        addBtn.setText("Add");
        addBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateOfBirthTxt)
                            .addComponent(nameTxt)
                            .addComponent(genderCb, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailTxt)
                            .addComponent(phoneNoTxt))))
                .addGap(35, 35, 35))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel4))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateOfBirthTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(45, 45, 45)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 450, 380));

        outputTbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));
        outputTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Name", "Date of Birth", "Gender", "Email", "Phone No "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        outputTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                outputTblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(outputTbl);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 460, 370));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void genderCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderCbActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
                                                
    String url = "jdbc:ucanaccess://C:/Users/kk/Documents/oopLabDB.accdb";
    String query = "UPDATE Enrollment SET DateOfBirth = ?, Gender = ?, Email = ?, Name = ? , PhoneNo = ? WHERE StudentId = ?";
    
    try (Connection connection = DriverManager.getConnection(url); 
         PreparedStatement preparedStatement = connection.prepareStatement(query)) {

        String name = nameTxt.getText();
        String dateOfBirth = dateOfBirthTxt.getText();  // As a string
        String gender = (String) genderCb.getSelectedItem();
        String email = emailTxt.getText();
        String phoneNo = phoneNoTxt.getText();

        preparedStatement.setString(1, dateOfBirth);  // Date as String
        preparedStatement.setString(2, gender);       // Gender as String
        preparedStatement.setString(3, email);        // Email as String
        preparedStatement.setString(4, name);         // Name as String
        preparedStatement.setString(5, phoneNo);      // Phone No as String (if StudentId is phone number)
        preparedStatement.setString(6, selectedStudentId);      // Phone No as String (if StudentId is phone number)

        int rowsAffected = preparedStatement.executeUpdate();
        if (rowsAffected > 0) {
            populateStudents();  // Correct method call
            JOptionPane.showMessageDialog(this, "Student updated successfully!");
        } else {
            JOptionPane.showMessageDialog(this, "No record found to update!");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }


    }//GEN-LAST:event_updateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
                                                
    String url = "jdbc:ucanaccess://C:/Users/kk/Documents/oopLabDB.accdb";
    String query = "DELETE FROM Enrollment WHERE StudentId = ?";
    
    try (Connection connection = DriverManager.getConnection(url); 
         PreparedStatement preparedStatement = connection.prepareStatement(query)) {


        preparedStatement.setString(1, selectedStudentId);  // Set StudentId to delete

        int rowsAffected = preparedStatement.executeUpdate();
        if (rowsAffected > 0) {
            populateStudents();  // Refresh the table or list
            JOptionPane.showMessageDialog(this, "Student deleted successfully!");
        } else {
            JOptionPane.showMessageDialog(this, "No record found to delete!");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }


    }//GEN-LAST:event_deleteBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        clear();
        JOptionPane.showMessageDialog(this, "Fields cleared successfully!");

    }//GEN-LAST:event_clearBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
                                        
    String url = "jdbc:ucanaccess://C:/Users/kk/Documents/oopLabDB.accdb";
    String query = "INSERT INTO Enrollment (DateOfBirth, Gender, Email, Name, PhoneNo) VALUES (?, ?, ?, ?, ?)";
    
    try (Connection connection = DriverManager.getConnection(url); 
         PreparedStatement preparedStatement = connection.prepareStatement(query)) {

        String name = nameTxt.getText();
        String dateOfBirth = dateOfBirthTxt.getText();  // As a string
        String gender = (String) genderCb.getSelectedItem();
        String email = emailTxt.getText();
        String phoneNo = phoneNoTxt.getText();

        preparedStatement.setString(1, dateOfBirth);  // Date as String
        preparedStatement.setString(2, gender);       // Gender as String
        preparedStatement.setString(3, email);        // Email as String
        preparedStatement.setString(4, name);         // Name as String
        preparedStatement.setString(5, phoneNo);      // StudentId as String (if StudentId is phone number)

        int rowsAffected = preparedStatement.executeUpdate();
        if (rowsAffected > 0) {
            populateStudents();  // Refresh the table or list
            JOptionPane.showMessageDialog(this, "Student added successfully!");
        } else {
            JOptionPane.showMessageDialog(this, "Failed to add the student!");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }
    }//GEN-LAST:event_addBtnActionPerformed

    private void outputTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_outputTblMouseClicked
                                     
    DefaultTableModel model = (DefaultTableModel) outputTbl.getModel();
    int index = outputTbl.getSelectedRow();
    
    if (index == -1) {
        JOptionPane.showMessageDialog(this, "Please select a valid row!");
        return;
    }

    // Retrieve values from the selected row
    selectedStudentId = model.getValueAt(index, 0).toString();
    String name = model.getValueAt(index, 1).toString();
    String dateOfBirth = model.getValueAt(index, 2).toString();
    String gender = model.getValueAt(index, 3).toString();
    String email = model.getValueAt(index, 4).toString();
    String phoneNo = model.getValueAt(index, 5).toString();
    
    // Set the retrieved values to the respective input fields
    nameTxt.setText(name);
    dateOfBirthTxt.setText(dateOfBirth);
    genderCb.setSelectedItem(gender);
    emailTxt.setText(email);
    phoneNoTxt.setText(phoneNo);

    }//GEN-LAST:event_outputTblMouseClicked

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
        java.util.logging.Logger.getLogger(StudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(StudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(StudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(StudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new StudentForm().setVisible(true);
        }
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JTextField dateOfBirthTxt;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JComboBox<String> genderCb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTable outputTbl;
    private javax.swing.JTextField phoneNoTxt;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables


    private void populateStudents() {
        String query = "SELECT * FROM Enrollment";
        String url = "jdbc:ucanaccess://C:/Users/kk/Documents/oopLabDB.accdb";

        DefaultTableModel model = (DefaultTableModel) outputTbl.getModel();
        model.setRowCount(0);
        try (Connection conn = DriverManager.getConnection(url); PreparedStatement pst = conn.prepareStatement(query); 
                ResultSet resultSet = pst.executeQuery()) {

            while (resultSet.next()) {
                int id = resultSet.getInt("StudentId");
                String name = resultSet.getString("Name");
                String dateOfBirth = resultSet.getString("DateOfBirth");
                String  gender = resultSet.getString("Gender");
                String  email = resultSet.getString("Email");
                int  phoneNo = resultSet.getInt("PhoneNo");

                model.addRow(new Object[]{id, name, dateOfBirth, gender, email, phoneNo});
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
    }
}
private void clear() {
    nameTxt.setText("");
    dateOfBirthTxt.setText("");
    genderCb.setSelectedIndex(0);
    emailTxt.setText("");
    phoneNoTxt.setText("");
}

}



