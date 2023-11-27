/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Business;
import model.Person;
import model.StudentProfile;
import model.UserAccount;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author saralask
 */
public class StudentProfileJPanel extends javax.swing.JPanel {

    JPanel CardSequencePanel;
    Business business;
    String studentID;
    /**
     * Creates new form StudentProfileJPanel
     */
    public StudentProfileJPanel(Business bz, JPanel jp, String studentID) {
        initComponents();
        CardSequencePanel = jp;
        this.business = bz;
        this.studentID = studentID;
        lblEnterPassword.setVisible(false);
        txtNewPassword.setVisible(false);
        toggleButton.setVisible(false);
        btnUpdate.setVisible(false);
        populateJPanel();
    }
    
     private void populateJPanel(){
        Person person = business.getStudentDirectory().findStudent(studentID).getPerson();
        txtFirstName.setText(person.getFirstName());
        txtSecondName.setText(person.getLastName());
        txtID.setText(person.getId());
        txtEmailAddress.setText(person.getEmailAddress());
        txtContactNumber.setText(String.valueOf(person.getPhoneNo()));
        txtAddress.setText(person.getAddress());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEnterPassword = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        Back1 = new javax.swing.JButton();
        lblEmailAddress = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        txtContactNumber = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        btnUpdatePassword = new javax.swing.JButton();
        lblNeuID = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();
        lblContactNumber = new javax.swing.JLabel();
        lblSecondName = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnSaveChanges = new javax.swing.JButton();
        txtEmailAddress = new javax.swing.JTextField();
        txtSecondName = new javax.swing.JTextField();
        txtNewPassword = new javax.swing.JPasswordField();
        btnUploadImage = new javax.swing.JButton();
        toggleButton = new javax.swing.JToggleButton();

        setBackground(new java.awt.Color(203, 231, 229));

        lblEnterPassword.setText("ENTER NEW PASSWORD");

        Back1.setBackground(new java.awt.Color(23, 65, 68));
        Back1.setForeground(new java.awt.Color(255, 255, 255));
        Back1.setText("<< Back");
        Back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back1ActionPerformed(evt);
            }
        });

        lblEmailAddress.setText("EMAIL ADDRESS:");

        jTextField1.setBackground(new java.awt.Color(203, 231, 229));
        jTextField1.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 18)); // NOI18N
        jTextField1.setText("WELCOME TO YOUR PROFILE");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Student Personal Profile");

        lblAddress.setText("ADDRESS:");

        btnUpdatePassword.setBackground(new java.awt.Color(204, 204, 204));
        btnUpdatePassword.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        btnUpdatePassword.setForeground(new java.awt.Color(0, 0, 153));
        btnUpdatePassword.setText("Update Password");
        btnUpdatePassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnUpdatePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePasswordActionPerformed(evt);
            }
        });

        lblNeuID.setText("ID:");

        lblFirstName.setText("FIRST NAME:");

        lblImage.setText("   UPLOAD PHOTO");
        lblImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblContactNumber.setText("CONTACT NUMBER:");

        lblSecondName.setText("SECOND NAME:");

        btnUpdate.setBackground(new java.awt.Color(102, 102, 102));
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("VERIFY");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnSaveChanges.setBackground(new java.awt.Color(23, 65, 68));
        btnSaveChanges.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnSaveChanges.setForeground(new java.awt.Color(255, 255, 255));
        btnSaveChanges.setText("Save Changes");
        btnSaveChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveChangesActionPerformed(evt);
            }
        });

        txtNewPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewPasswordActionPerformed(evt);
            }
        });

        btnUploadImage.setBackground(new java.awt.Color(23, 65, 68));
        btnUploadImage.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        btnUploadImage.setForeground(new java.awt.Color(255, 255, 255));
        btnUploadImage.setText("UPLOAD");
        btnUploadImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadImageActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(110, 110, 110)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(173, 173, 173)
                                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(17, 17, 17)
                                        .addComponent(btnUploadImage))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(61, 61, 61)
                                        .addComponent(lblFirstName)
                                        .addGap(62, 62, 62)
                                        .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(lblSecondName)
                                        .addGap(62, 62, 62)
                                        .addComponent(txtSecondName, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblNeuID)
                                            .addComponent(lblEmailAddress)
                                            .addComponent(lblContactNumber))
                                        .addGap(62, 62, 62)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(200, 200, 200)
                                                .addComponent(txtContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(75, 75, 75)
                                                .addComponent(lblAddress)
                                                .addGap(62, 62, 62)
                                                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(200, 200, 200)
                                                .addComponent(btnUpdatePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(lblEnterPassword)
                                                .addGap(50, 50, 50)
                                                .addComponent(txtNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(200, 200, 200)
                                                .addComponent(btnUpdate))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(200, 200, 200)
                                                .addComponent(btnSaveChanges, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(toggleButton))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Back1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 144, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(46, 46, 46)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(btnUploadImage)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFirstName))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblSecondName))
                    .addComponent(txtSecondName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblNeuID))
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblEmailAddress))
                    .addComponent(txtEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContactNumber))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblAddress))
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(btnUpdatePassword)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblEnterPassword))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(toggleButton)))
                .addGap(6, 6, 6)
                .addComponent(btnUpdate)
                .addGap(12, 12, 12)
                .addComponent(btnSaveChanges, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Back1)
                .addGap(70, 70, 70))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back1ActionPerformed
        // TODO add your handling code here:
        CardSequencePanel.remove(this);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_Back1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btnUpdatePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePasswordActionPerformed
        lblEnterPassword.setVisible(true);
        txtNewPassword.setVisible(true);
        toggleButton.setVisible(true);
        btnUpdate.setVisible(true);
    }//GEN-LAST:event_btnUpdatePasswordActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        StudentProfile studentProfile = business.getStudentDirectory().findStudent(studentID);
        String id = txtID.getText();
        
        boolean flag = false;
        
         String passwd = new String(txtNewPassword.getPassword());
                Pattern pattern6 = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$");
                Matcher matcher6 = pattern6.matcher(passwd);
                if(!matcher6.matches())
                {
                    JOptionPane.showMessageDialog(this,"Enter a valid Password!");
                    flag = true;
                    txtNewPassword.setText("");  
                }
//        String newPassword = new String(txtNewPassword.getPassword());
     if(flag==false){
        UserAccount selecteduseraccount = business.getUserAccountDirectory().findUserAccount(id);

        String hashPassword = BCrypt.hashpw(passwd, BCrypt.gensalt());
        boolean isOldPassword=false;

        Person person = studentProfile.getPerson();
        ArrayList<String> passHistory = business.getStudentDirectory().findStudent(id).getPerson().getPasswordHistory();
        System.out.println("PASSWORD WORD: "+passHistory.size());

        for(String pass : passHistory){
            System.out.println("ENTERED");
            if(BCrypt.checkpw(passwd,pass)){
                System.out.println("USING OLD PASSWORD");
                isOldPassword = true;
            }

        }

        System.out.println("PASSWORD HISTORY: "+person.getPasswordHistory());
        if(isOldPassword)
        {
            lblEnterPassword.setVisible(false);
            txtNewPassword.setVisible(false);
            toggleButton.setVisible(false);
            btnUpdate.setVisible(false);
            JOptionPane.showMessageDialog(this, "Cannot use previously used password");

        }
        else if(!isOldPassword){
            lblEnterPassword.setVisible(false);
            txtNewPassword.setVisible(false);
            toggleButton.setVisible(false);
            btnUpdate.setVisible(false);
            person.addNewPassword(hashPassword);
            selecteduseraccount.setPassword(hashPassword);
            System.out.println("NEW PASSWORD: "+hashPassword);
            JOptionPane.showMessageDialog(this, "Password Updated Successfully");
        }

        txtNewPassword.setText("");
     }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveChangesActionPerformed

        StudentProfile studentProfile = business.getStudentDirectory().findStudent(String.valueOf(studentID));
        String id = txtID.getText();
        String oldPassword = business.getUserAccountDirectory().findUserAccount(id).getPassword();
        UserAccount selecteduseraccount = business.getUserAccountDirectory().findUserAccount(String.valueOf(id));
        Person person = studentProfile.getPerson();

        person.setFirstName(txtFirstName.getText());
        person.setLastName(txtSecondName.getText());
        person.setId(txtID.getText());
        person.setEmailAddress(txtEmailAddress.getText());
        person.setPhoneNo(Long.parseLong(txtContactNumber.getText()));
        person.setAddress(txtAddress.getText());

        person.setFirstName(txtFirstName.getText());
        person.setLastName(txtSecondName.getText());
        person.setId(txtID.getText());
        person.setEmailAddress(txtEmailAddress.getText());
        person.setPhoneNo(Long.parseLong(txtContactNumber.getText()));
        person.setAddress(txtAddress.getText());

        if(btnUpdate.hasFocus()){
            String newPassword = new String(txtNewPassword.getPassword());
            String hashPassword = BCrypt.hashpw(newPassword, BCrypt.gensalt());
            boolean isPasswordNew = BCrypt.checkpw(newPassword,oldPassword);
            if(!isPasswordNew) {
                lblEnterPassword.setText("Please dont use your old password");
                lblEnterPassword.setForeground(Color.red);
                txtNewPassword.setText("");
                return;
            }
            person.addNewPassword(hashPassword);
            selecteduseraccount.setPassword(hashPassword);

        }
        JOptionPane.showMessageDialog(this, "Professor Information Updated");
    }//GEN-LAST:event_btnSaveChangesActionPerformed

    private void txtNewPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewPasswordActionPerformed

    private void btnUploadImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadImageActionPerformed

        Person person = business.getStudentDirectory().findStudent(studentID).getPerson();
        
        String id = txtID.getText();
        JFileChooser file=new JFileChooser();
        file.showOpenDialog(null);
        File f = file.getSelectedFile();
        String imageAddress = f.getAbsolutePath();

        person.setImageAddress(imageAddress);
        lblImage.setVisible(true);
        ImageIcon icon = new ImageIcon(imageAddress);
        lblImage.setIcon(icon);
    }//GEN-LAST:event_btnUploadImageActionPerformed

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
        
    }//GEN-LAST:event_toggleButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back1;
    private javax.swing.JButton btnSaveChanges;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdatePassword;
    private javax.swing.JButton btnUploadImage;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblContactNumber;
    private javax.swing.JLabel lblEmailAddress;
    private javax.swing.JLabel lblEnterPassword;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblNeuID;
    private javax.swing.JLabel lblSecondName;
    private javax.swing.JToggleButton toggleButton;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtContactNumber;
    private javax.swing.JTextField txtEmailAddress;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtID;
    private javax.swing.JPasswordField txtNewPassword;
    private javax.swing.JTextField txtSecondName;
    // End of variables declaration//GEN-END:variables
}