/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Activity;
import model.Business;
import model.Course;
import model.CourseDirectory;
import model.UserActivity;

/**
 *
 * @author saralask
 */
public class ManageCourseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageCourse
     */
    JPanel CardSequencePanel;
    Business business;
    
     public ManageCourseJPanel(Business bz, JPanel jp) {
        CardSequencePanel = jp;
        this.business = bz;
        initComponents();
        populateTable();
        lblCourseID.setVisible(false);
        txtCourseID.setVisible(false);
        lblCourseName.setVisible(false);
        txtCourseName.setVisible(false);
        lblCreditsCarried.setVisible(false);
        txtCreditsCarried.setVisible(false);
        btnSave.setVisible(false);
        btnUpdate.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCourse = new javax.swing.JTable();
        btnInsert = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        lblCourseID = new javax.swing.JLabel();
        lblCourseName = new javax.swing.JLabel();
        lblCreditsCarried = new javax.swing.JLabel();
        txtCourseID = new javax.swing.JTextField();
        txtCourseName = new javax.swing.JTextField();
        txtCreditsCarried = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        Back = new javax.swing.JButton();

        setBackground(new java.awt.Color(203, 231, 229));

        tblCourse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Course ID", "Course Name", "Course Description", "Instructor ", "Number of Students Registered"
            }
        ));
        jScrollPane1.setViewportView(tblCourse);

        btnInsert.setBackground(new java.awt.Color(23, 65, 68));
        btnInsert.setForeground(new java.awt.Color(255, 255, 255));
        btnInsert.setText("INSERT");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(23, 65, 68));
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnModify.setBackground(new java.awt.Color(23, 65, 68));
        btnModify.setForeground(new java.awt.Color(255, 255, 255));
        btnModify.setText("MODIFY");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(23, 65, 68));
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("SEARCH");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        lblCourseID.setText("Course ID:");

        lblCourseName.setText("Course Name:");

        lblCreditsCarried.setText("Credits Carried:");

        txtCreditsCarried.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCreditsCarriedActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(23, 65, 68));
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(23, 65, 68));
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        Back.setBackground(new java.awt.Color(23, 65, 68));
        Back.setForeground(new java.awt.Color(255, 255, 255));
        Back.setText("<< Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 817, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSearch)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(214, 214, 214)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblCourseName)
                                    .addComponent(lblCourseID)
                                    .addComponent(lblCreditsCarried)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Back)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtCourseID, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCreditsCarried, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnInsert)
                            .addComponent(btnDelete)
                            .addComponent(btnModify))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCourseID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCourseID))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCourseName))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCreditsCarried, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCreditsCarried))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate)
                        .addContainerGap(54, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Back)
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        
        lblCourseID.setVisible(true);
        txtCourseID.setVisible(true);
        lblCourseName.setVisible(true);
        txtCourseName.setVisible(true);
        lblCreditsCarried.setVisible(true);
        txtCreditsCarried.setVisible(true);
        btnSave.setVisible(true);   
  
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        int selectedRowIndex = tblCourse.getSelectedRow();

        CourseDirectory courseDirectory = business.getCourseDirectory();
 
        if(selectedRowIndex >=0){
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "Would you like to delete the Course from catalog?", "Warning", dialogButton);
            if(dialogResult == JOptionPane.YES_OPTION){
                Course course = (Course) tblCourse.getValueAt(selectedRowIndex, 0);
                courseDirectory.deleteCourse(course);
                populateTable();
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Please select a row from table first", "Warning", JOptionPane.WARNING_MESSAGE);
        }
   
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        
        int selectedRowIndex = tblCourse.getSelectedRow();
         if(selectedRowIndex >=0){
          Course oldCourse = (Course) tblCourse.getValueAt(selectedRowIndex, 0);
          
        lblCourseID.setVisible(true);
        txtCourseID.setVisible(true);
        lblCourseName.setVisible(true);
        txtCourseName.setVisible(true);
        lblCreditsCarried.setVisible(true);
        txtCreditsCarried.setVisible(true);
        btnUpdate.setVisible(true);  
        
        txtCourseID.setText(oldCourse.getCourseId());
        txtCourseName.setText(oldCourse.getCourseName());
        txtCreditsCarried.setText(String.valueOf(oldCourse.getCreditsCarried()));
        
        
       
      }
   
    }//GEN-LAST:event_btnModifyActionPerformed

    private void txtCreditsCarriedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCreditsCarriedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCreditsCarriedActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String courseID = txtCourseID.getText();
        String courseName = txtCourseName.getText();
        int creditsCarried = Integer.parseInt(txtCreditsCarried.getText());
        
        CourseDirectory courseDirectory = business.getCourseDirectory();
        Course course = courseDirectory.newCourse(courseID, courseName, creditsCarried);
        
        System.out.println("MANAGE COURSE : "+course);
        
        JOptionPane.showMessageDialog(this, "New Course Added");
        UserActivity userActitvity = new UserActivity("admin", "ONLINE", Activity.COURSE_CREATED, new Date());
        business.getUserActivityDirectory().addUserActivity(userActitvity);

        txtCourseID.setText("");
        txtCourseName.setText("");
        txtCreditsCarried.setText("");
        
        lblCourseID.setVisible(false);
        txtCourseID.setVisible(false);
        lblCourseName.setVisible(false);
        txtCourseName.setVisible(false);
        lblCreditsCarried.setVisible(false);
        txtCreditsCarried.setVisible(false);
        btnSave.setVisible(false);
        
        System.out.println("COURSE : "+course);
        populateTable();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        
       
          
          
        Course result = business.getCourseDirectory().searchCourse(txtSearch.getText());
       if(result == null){
           JOptionPane.showMessageDialog(this, "Course number you entered does not exist", "Information", JOptionPane.INFORMATION_MESSAGE);
       }else{
         
          DefaultTableModel model = (DefaultTableModel) tblCourse.getModel();
          model.setRowCount(0);
          
          Object[] row = new Object[4];
          row[0] = result;
          row[1] = result.getCourseName();
          row[2] = result.getCoursesDescription();
          row[3] = result.getCourseInstructor();
          row[4] = result.getStudentsEnrolled().size();
          model.addRow(row);
          
       }
         
 
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        
         int selectedRowIndex = tblCourse.getSelectedRow();
         if(selectedRowIndex >=0){
          Course oldCourse = (Course) tblCourse.getValueAt(selectedRowIndex, 0);
          
        String courseID = txtCourseID.getText();
        String courseName = txtCourseName.getText();
        int creditsCarried = Integer.parseInt(txtCreditsCarried.getText());
        
        CourseDirectory courseDirectory = business.getCourseDirectory();
        Course updatedCourse = new Course(courseID, courseName, creditsCarried);
        courseDirectory.updateCourse(oldCourse, updatedCourse);
        
        JOptionPane.showMessageDialog(this, "Course Updated");
        
        txtCourseID.setText("");
        txtCourseName.setText("");
        txtCreditsCarried.setText("");
        
        
        lblCourseID.setVisible(false);
        txtCourseID.setVisible(false);
        lblCourseName.setVisible(false);
        txtCourseName.setVisible(false);
        lblCreditsCarried.setVisible(false);
        txtCreditsCarried.setVisible(false);
        btnUpdate.setVisible(false);
        
        
         }
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        CardSequencePanel.remove(this);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_BackActionPerformed

     private void populateTable() {
        
        CourseDirectory courseDirectory = business.getCourseDirectory();
        DefaultTableModel model = (DefaultTableModel) tblCourse.getModel();
        model.setRowCount(0);
        
        if(courseDirectory!=null){
            for(Course course : courseDirectory.getCourseList()){
            Object[] row = new Object[5];
            row[0] = course;
            row[1] = course.getCourseName();
            row[2] = course.getCoursesDescription();
            row[3] = course.getCourseInstructor();
            row[4] = course.getStudentsEnrolled().size();
            model.addRow(row);
        } 
        }
               
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCourseID;
    private javax.swing.JLabel lblCourseName;
    private javax.swing.JLabel lblCreditsCarried;
    private javax.swing.JTable tblCourse;
    private javax.swing.JTextField txtCourseID;
    private javax.swing.JTextField txtCourseName;
    private javax.swing.JTextField txtCreditsCarried;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}