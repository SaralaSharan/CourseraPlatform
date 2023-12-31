/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.event.ItemEvent;
import java.util.Arrays;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Activity;
import model.Business;
import model.Person;
import model.ProfessorDirectory;
import model.ProfessorProfile;
import model.UserActivity;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author saralask
 */
public class ManageFacultyJPanel extends javax.swing.JPanel {

    JPanel CardSequencePanel;
    Business business;
    /**
     * Creates new form ManageFacultyJPanel
     */
    public ManageFacultyJPanel(Business bz, JPanel jp) {
        initComponents();
        CardSequencePanel = jp;
        this.business = bz;
        setVisibility(false);
        lblEnterPassword.setVisible(false);
        txtNewPassword.setVisible(false);
        btnUpdate.setVisible(false);
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFaculty = new javax.swing.JTable();
        Back = new javax.swing.JButton();
        txtContactNumber = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        lblContactNumber = new javax.swing.JLabel();
        txtEmailAddress = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        txtProfessorID = new javax.swing.JTextField();
        lblFirstName = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        btnUpdatePassword2 = new javax.swing.JButton();
        lblEmailAddress = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        lblLastName = new javax.swing.JLabel();
        txtNewPassword = new javax.swing.JPasswordField();
        lblStudentID = new javax.swing.JLabel();
        lblEnterPassword = new javax.swing.JLabel();
        btnModify = new javax.swing.JButton();
        toggleButton = new javax.swing.JToggleButton();

        setBackground(new java.awt.Color(203, 231, 229));

        btnSearch.setBackground(new java.awt.Color(23, 65, 68));
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("SEARCH");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tblFaculty.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Professor Name", "Email Address", "Reputative Index"
            }
        ));
        jScrollPane1.setViewportView(tblFaculty);

        Back.setBackground(new java.awt.Color(23, 65, 68));
        Back.setForeground(new java.awt.Color(255, 255, 255));
        Back.setText("<< Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        lblAddress.setText("Address:");

        btnSave.setBackground(new java.awt.Color(23, 65, 68));
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblContactNumber.setText("Contact Number:");

        txtEmailAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailAddressActionPerformed(evt);
            }
        });

        lblFirstName.setText("First Name:");

        btnUpdatePassword2.setBackground(new java.awt.Color(204, 204, 204));
        btnUpdatePassword2.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        btnUpdatePassword2.setForeground(new java.awt.Color(0, 0, 153));
        btnUpdatePassword2.setText("Update Password");
        btnUpdatePassword2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnUpdatePassword2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePassword2ActionPerformed(evt);
            }
        });

        lblEmailAddress.setText("Email Address:");

        btnUpdate.setBackground(new java.awt.Color(102, 102, 102));
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("VERIFY");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        lblLastName.setText("Last Name:");

        txtNewPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewPasswordActionPerformed(evt);
            }
        });

        lblStudentID.setText("Professor ID:");

        lblEnterPassword.setText("Enter New Password:");

        btnModify.setBackground(new java.awt.Color(23, 65, 68));
        btnModify.setForeground(new java.awt.Color(255, 255, 255));
        btnModify.setText("MODIFY");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        toggleButton.setBackground(new java.awt.Color(23, 65, 68));
        toggleButton.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        toggleButton.setForeground(new java.awt.Color(255, 255, 255));
        toggleButton.setText("SHOW");
        toggleButton.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                toggleButtonItemStateChanged(evt);
            }
        });
        toggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnSearch))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(13, 13, 13)
                            .addComponent(Back)
                            .addGap(185, 185, 185)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblFirstName)
                                .addComponent(lblLastName)
                                .addComponent(lblStudentID)
                                .addComponent(lblEmailAddress)
                                .addComponent(lblContactNumber)
                                .addComponent(lblAddress)
                                .addComponent(lblEnterPassword))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnUpdate)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnUpdatePassword2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtAddress)
                                        .addComponent(txtProfessorID, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtLastName, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtEmailAddress, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtContactNumber)
                                        .addComponent(txtNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(toggleButton))
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 980, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Back)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnModify)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtProfessorID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblStudentID))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFirstName)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLastName))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmailAddress))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblContactNumber)
                            .addComponent(txtContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAddress)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdatePassword2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEnterPassword)
                            .addComponent(txtNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(toggleButton))
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnSave)
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

        ProfessorProfile result = business.getProfessorDirectory().findProfessor(txtSearch.getText());
        if(result == null){
            JOptionPane.showMessageDialog(this, "Professor ID you entered does not exist", "Information", JOptionPane.INFORMATION_MESSAGE);
        }else{

            DefaultTableModel model = (DefaultTableModel) tblFaculty.getModel();
            model.setRowCount(0);

            Object[] row = new Object[3];
            row[0] = result;
            row[1] = result.getPerson().getEmailAddress();
            row[3] = result.getReputativeIndex();
            model.addRow(row);

        }

    }//GEN-LAST:event_btnSearchActionPerformed

       private void populateTable() {
        
        ProfessorDirectory professorDirectory = business.getProfessorDirectory();
        DefaultTableModel model = (DefaultTableModel) tblFaculty.getModel();
        model.setRowCount(0);
        
        if(professorDirectory!=null){
            for(ProfessorProfile professor : professorDirectory.getProfessorList()){
            Object[] row = new Object[3];
            row[0] = professor;
            row[1] = professor.getPerson().getEmailAddress();
            row[2] = professor.getReputativeIndex();
            model.addRow(row);
        } 
        }
               
    }
       
    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        CardSequencePanel.remove(this);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_BackActionPerformed

    private void txtNewPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewPasswordActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        String id = txtProfessorID.getText();
        String newPassword = new String(txtNewPassword.getPassword());

        String hashPassword = BCrypt.hashpw(newPassword, BCrypt.gensalt());
        boolean isOldPassword=false;

        Person person  = business.getProfessorDirectory().findProfessor(id).getPerson();
        for(String pass : person.getPasswordHistory()){
            System.out.println("ENTERED");
            if(BCrypt.checkpw(newPassword,pass)){
                System.out.println("USING OLD PASSWORD");
                isOldPassword = true;
            }

        }

        System.out.println("PASSWORD HISTORY: "+person.getPasswordHistory());
        if(isOldPassword)
        {
            lblEnterPassword.setVisible(false);
            txtNewPassword.setVisible(false);
            btnUpdate.setVisible(false);
            JOptionPane.showMessageDialog(this, "Cannot use previously used password");

        }
        else if(!isOldPassword){
            lblEnterPassword.setVisible(false);
            txtNewPassword.setVisible(false);
            btnUpdate.setVisible(false);
            person.addNewPassword(hashPassword);
            System.out.println("NEW PASSWORD: "+hashPassword);
            JOptionPane.showMessageDialog(this, "Password Updated Successfully");
            UserActivity userActitvity = new UserActivity("ADMIN", "ONLINE", Activity.PROFESSOR_PASSWORD_CHANGED, new Date());
            business.getUserActivityDirectory().addUserActivity(userActitvity);
        }

        txtNewPassword.setText("");
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        String professorID = txtProfessorID.getText();
        String firstName = txtFirstName.getText();
        String lastName = txtLastName.getText();
        String emailAddress = txtEmailAddress.getText();
        String contactNumber = txtContactNumber.getText();
        String address = txtAddress.getText();
        String password = txtNewPassword.getPassword().toString();

        ProfessorProfile professorProfile = business.getProfessorDirectory().findProfessor(professorID);
        //            ArrayList<CourseEnrolled> courses = studentProfile.getCourseWork().getCourseEnrolledList();

        Person person = professorProfile.getPerson();
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setEmailAddress(emailAddress);
        person.setPhoneNo(Integer.parseInt(contactNumber));
        person.setAddress(address);
        person.addNewPassword(password);

        JOptionPane.showMessageDialog(this, "Professor Profile Updated");
        UserActivity userActitvity = new UserActivity("ADMIN", "ONLINE", Activity.PROFESSOR_PROFILE_UPDATED, new Date());
            business.getUserActivityDirectory().addUserActivity(userActitvity);

        setVisibility(false);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtEmailAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailAddressActionPerformed

    private void btnUpdatePassword2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePassword2ActionPerformed
        lblEnterPassword.setVisible(true);
        txtNewPassword.setVisible(true);
        btnUpdate.setVisible(true);
    }//GEN-LAST:event_btnUpdatePassword2ActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed

        int selectedRowIndex = tblFaculty.getSelectedRow();
        if(selectedRowIndex >=0){
            ProfessorProfile professor = (ProfessorProfile) tblFaculty.getValueAt(selectedRowIndex, 0);
            setVisibility(true);

            txtProfessorID.setText(professor.getPerson().getId());
            txtFirstName.setText(professor.getPerson().getFirstName());
            txtLastName.setText(professor.getPerson().getLastName());
            txtEmailAddress.setText(professor.getPerson().getEmailAddress());
            txtContactNumber.setText(String.valueOf(professor.getPerson().getPhoneNo()));
            txtAddress.setText(professor.getPerson().getAddress());

        }
    }//GEN-LAST:event_btnModifyActionPerformed

    private void toggleButtonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_toggleButtonItemStateChanged
        int state = evt.getStateChange();
        if(state == ItemEvent.SELECTED){
            txtNewPassword.setEchoChar((char)0);
            toggleButton.setText("HIDE");
        }
        else{
            txtNewPassword.setEchoChar('*');
            toggleButton.setText("SHOW");
        }
    }//GEN-LAST:event_toggleButtonItemStateChanged

    private void toggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toggleButtonActionPerformed

 private void setVisibility(boolean flag){
        lblStudentID.setVisible(flag);
        txtProfessorID.setVisible(flag);
        lblFirstName.setVisible(flag);
        txtFirstName.setVisible(flag);
        lblLastName.setVisible(flag);
        txtLastName.setVisible(flag);
        lblEmailAddress.setVisible(flag);
        txtEmailAddress.setVisible(flag);
        lblContactNumber.setVisible(flag);
        txtContactNumber.setVisible(flag);
        lblAddress.setVisible(flag);
        txtAddress.setVisible(flag);
        btnUpdatePassword2.setVisible(flag);
//        lblEnterPassword.setVisible(flag);
//        txtNewPassword.setVisible(flag);
//        btnUpdate.setVisible(flag);
        btnSave.setVisible(flag);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdatePassword2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblContactNumber;
    private javax.swing.JLabel lblEmailAddress;
    private javax.swing.JLabel lblEnterPassword;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblStudentID;
    private javax.swing.JTable tblFaculty;
    private javax.swing.JToggleButton toggleButton;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtContactNumber;
    private javax.swing.JTextField txtEmailAddress;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JPasswordField txtNewPassword;
    private javax.swing.JTextField txtProfessorID;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
