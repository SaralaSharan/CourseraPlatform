/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

 /*
 * WorkAreaJPanel.java
 *
 * Created on May 17, 2020, 8:35:29 AM
 */
package ui;


import javax.swing.JPanel;
import model.Business;
import model.EmployeeProfile;

/**
 *
 * @author kal
 */
public class AdminRoleWorkAreaJPanel extends javax.swing.JPanel {

    javax.swing.JPanel CardSequencePanel;
    Business business;
    EmployeeProfile employeeProfile;

    /**
     * Creates new form UnitRiskWorkArea
     */

    public AdminRoleWorkAreaJPanel(Business b, EmployeeProfile employeeProfile, JPanel clp) {

        business = b;
        this.CardSequencePanel = clp;
        this.employeeProfile = employeeProfile;
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        btnManageFaculty = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        btnAdminProfile = new javax.swing.JButton();
        btnManageStudents = new javax.swing.JButton();
        btnManageCourse = new javax.swing.JButton();

        setBackground(new java.awt.Color(203, 231, 229));
        setForeground(new java.awt.Color(51, 51, 51));

        jButton4.setBackground(new java.awt.Color(23, 65, 68));
        jButton4.setFont(getFont());
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("ADMINISTER USER ACCOUNTS");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.setMaximumSize(new java.awt.Dimension(200, 40));
        jButton4.setMinimumSize(new java.awt.Dimension(20, 23));
        jButton4.setPreferredSize(new java.awt.Dimension(240, 30));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4IdentifyResourceAssetsActionPerformed(evt);
            }
        });

        btnManageFaculty.setBackground(new java.awt.Color(23, 65, 68));
        btnManageFaculty.setFont(getFont());
        btnManageFaculty.setForeground(new java.awt.Color(255, 255, 255));
        btnManageFaculty.setText("MANAGE FACULTY");
        btnManageFaculty.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManageFaculty.setMaximumSize(new java.awt.Dimension(200, 40));
        btnManageFaculty.setMinimumSize(new java.awt.Dimension(20, 20));
        btnManageFaculty.setPreferredSize(new java.awt.Dimension(240, 25));
        btnManageFaculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageFacultyActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(23, 65, 68));
        jButton10.setFont(getFont());
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("REGISTER PERSONS");
        jButton10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton10.setMaximumSize(new java.awt.Dimension(200, 40));
        jButton10.setMinimumSize(new java.awt.Dimension(20, 20));
        jButton10.setPreferredSize(new java.awt.Dimension(240, 25));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        btnAdminProfile.setBackground(new java.awt.Color(23, 65, 68));
        btnAdminProfile.setFont(getFont());
        btnAdminProfile.setForeground(new java.awt.Color(255, 255, 255));
        btnAdminProfile.setText("MY PROFILE");
        btnAdminProfile.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdminProfile.setMaximumSize(new java.awt.Dimension(145, 40));
        btnAdminProfile.setMinimumSize(new java.awt.Dimension(20, 20));
        btnAdminProfile.setPreferredSize(new java.awt.Dimension(240, 25));
        btnAdminProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminProfileIdentifyEventsActionPerformed(evt);
            }
        });

        btnManageStudents.setBackground(new java.awt.Color(23, 65, 68));
        btnManageStudents.setFont(getFont());
        btnManageStudents.setForeground(new java.awt.Color(255, 255, 255));
        btnManageStudents.setText("MANAGE STUDENTS");
        btnManageStudents.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManageStudents.setMaximumSize(new java.awt.Dimension(200, 40));
        btnManageStudents.setMinimumSize(new java.awt.Dimension(20, 20));
        btnManageStudents.setPreferredSize(new java.awt.Dimension(240, 25));
        btnManageStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageStudentsActionPerformed(evt);
            }
        });

        btnManageCourse.setBackground(new java.awt.Color(23, 65, 68));
        btnManageCourse.setFont(getFont());
        btnManageCourse.setForeground(new java.awt.Color(255, 255, 255));
        btnManageCourse.setText("MANAGE COURSE");
        btnManageCourse.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManageCourse.setMaximumSize(new java.awt.Dimension(200, 40));
        btnManageCourse.setMinimumSize(new java.awt.Dimension(20, 20));
        btnManageCourse.setPreferredSize(new java.awt.Dimension(240, 25));
        btnManageCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCourseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnManageFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdminProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnManageCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(596, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAdminProfile, btnManageCourse, btnManageFaculty, btnManageStudents, jButton10, jButton4});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnManageFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdminProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(127, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4IdentifyResourceAssetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4IdentifyResourceAssetsActionPerformed
        // TODO add your handling code here:

        ManageUserAccountsJPanel aos = new ManageUserAccountsJPanel(business, CardSequencePanel,employeeProfile);

        CardSequencePanel.add("ManageVulns", aos);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);

    }//GEN-LAST:event_jButton4IdentifyResourceAssetsActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:

        ManagePersonsJPanel aos = new ManagePersonsJPanel(business, CardSequencePanel);

        CardSequencePanel.add("Manage Persons", aos);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);

    }//GEN-LAST:event_jButton10ActionPerformed

    private void btnManageStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageStudentsActionPerformed
        ManageStudentsJPanel aos = new ManageStudentsJPanel(business, CardSequencePanel);

        CardSequencePanel.add("Manage Persons", aos);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);

    }//GEN-LAST:event_btnManageStudentsActionPerformed

    private void btnAdminProfileIdentifyEventsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminProfileIdentifyEventsActionPerformed

         AdminUserAccount adminUserAccount = new AdminUserAccount(CardSequencePanel, employeeProfile,business);
         CardSequencePanel.add("Admin Profile", adminUserAccount);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);

    }//GEN-LAST:event_btnAdminProfileIdentifyEventsActionPerformed

    private void btnManageFacultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageFacultyActionPerformed

        ManageFacultyJPanel manageFacultyJPanel = new ManageFacultyJPanel(business, CardSequencePanel);

        CardSequencePanel.add("Manage Faculty", manageFacultyJPanel);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_btnManageFacultyActionPerformed

    private void btnManageCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCourseActionPerformed

         ManageCourseJPanel manageCourseJPanel = new ManageCourseJPanel(business, CardSequencePanel);

        CardSequencePanel.add("Manage Course", manageCourseJPanel);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_btnManageCourseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdminProfile;
    private javax.swing.JButton btnManageCourse;
    private javax.swing.JButton btnManageFaculty;
    private javax.swing.JButton btnManageStudents;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton4;
    // End of variables declaration//GEN-END:variables

}