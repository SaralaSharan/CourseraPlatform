/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Business;
import model.Course;
import model.CourseEnrolled;
import model.StudentProfile;

/**
 *
 * @author saralask
 */
public class ManageStudentsByProfessorJPanel extends javax.swing.JPanel {

    JPanel CardSequencePanel;
    Business business;
    String professorID;
    static String courseID;
    
    /**
     * Creates new form ManageStudentsByProfessorJPanel
     */
    public ManageStudentsByProfessorJPanel(Business bz, JPanel jp, String professorID) {
        CardSequencePanel = jp;
        this.business = bz;
        this.professorID = professorID;
        initComponents();
        chooseCourse();
        setVisibility(false);
    }
    
    private void setVisibility(boolean flag){
        lblStudentID.setVisible(flag);
        txtStudentID.setVisible(flag);
        lblFirstName.setVisible(flag);
        txtFirstName.setVisible(flag);
        lblLastName.setVisible(flag);
        txtLastName.setVisible(flag);
        lblEmailAddress.setVisible(flag);
        txtEmailAddress.setVisible(flag);
        lblContactNumber.setVisible(flag);
        txtContactNumber.setVisible(flag);
        lblGrades.setVisible(flag);
        comboBoxGrade.setVisible(flag);
        lblRemarks.setVisible(flag);
        txtAreaRemarks.setVisible(flag);
        btnSave.setVisible(flag);
        jScrollPane2.setVisible(flag);
    }
    
    
    private void chooseCourse(){
        
        ArrayList<Course> courseList = business.getCourseDirectory().getCourseList();

        System.out.println("MANAGE STUDENTS: "+courseList);
        System.out.println("PROFESSORID: "+professorID);
        
        ArrayList<Course> coursesOfferredByProfessor = new ArrayList<>();
        
        for(Course course : courseList){
            System.out.println("COURSE.GETPROGFRESSORID: "+ course.getProfessorId());
            if(professorID.equals(course.getProfessorId())){
                coursesOfferredByProfessor.add(course);
            }
        }
        
        System.out.println("Course offered by the professor : "+coursesOfferredByProfessor);
        
        for(Course course : coursesOfferredByProfessor){
            comboBoxCourse.addItem(course.getCourseId());
        }
        
        String id = comboBoxCourse.getSelectedItem().toString();
        if(!id.equalsIgnoreCase("select")){
             courseID = id;
        }
    }
    
    
     private void populateTable(Course course) {
         
         
         System.out.println("POPULATE TABLE: "+course);
        ArrayList<StudentProfile> students = new ArrayList<>();
        
        students = course.getStudentsEnrolled();
        System.out.println("STUDENTS ENROLLED: "+students);
       
        DefaultTableModel model = (DefaultTableModel) tblStudentProfile.getModel();
        model.setRowCount(0);
        
        if(students!=null){
            for(StudentProfile stud : students){
            Object[] row = new Object[4];
            row[0] = stud;
            row[1] = stud.getPerson().getFirstName()+" "+stud.getPerson().getLastName();
            row[2] = stud.getPerson().getEmailAddress();
            if(stud.getCourseWork().findCourseEnrolled(course).getGradeEarned()!=null){
                row[3] = stud.getCourseWork().findCourseEnrolled(course).getGradeEarned();
            }else row[3] = "";
            model.addRow(row);
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

        jLabel1 = new javax.swing.JLabel();
        txtStudentID = new javax.swing.JTextField();
        lblFirstName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        btnGrade = new javax.swing.JButton();
        txtEmailAddress = new javax.swing.JTextField();
        lblContactNumber = new javax.swing.JLabel();
        txtContactNumber = new javax.swing.JTextField();
        lblStudentID = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblEmailAddress = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudentProfile = new javax.swing.JTable();
        lblGrades = new javax.swing.JLabel();
        comboBoxGrade = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaRemarks = new javax.swing.JTextArea();
        lblRemarks = new javax.swing.JLabel();
        comboBoxCourse = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btnGetDetails = new javax.swing.JButton();
        Back = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setBackground(new java.awt.Color(203, 231, 229));

        txtStudentID.setEditable(false);

        lblFirstName.setText("FIRST NAME:");

        txtLastName.setEditable(false);

        txtFirstName.setEditable(false);

        btnGrade.setBackground(new java.awt.Color(23, 65, 68));
        btnGrade.setForeground(new java.awt.Color(255, 255, 255));
        btnGrade.setText("GRADE");
        btnGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGradeActionPerformed(evt);
            }
        });

        txtEmailAddress.setEditable(false);
        txtEmailAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailAddressActionPerformed(evt);
            }
        });

        lblContactNumber.setText("CONTACT NUMBER:");

        txtContactNumber.setEditable(false);

        lblStudentID.setText("STUDENT ID:");

        lblLastName.setText("LAST NAME:");

        lblEmailAddress.setText("EMAIL ADDRESS:");

        tblStudentProfile.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Student ID", "Full Name", "Email Address", "Grades"
            }
        ));
        jScrollPane1.setViewportView(tblStudentProfile);

        lblGrades.setText("GRADE:");

        comboBoxGrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<NIL>", "A+ ", "A-  ", "B+ ", "B-", "C+", "C-" }));

        btnSave.setBackground(new java.awt.Color(23, 65, 68));
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        txtAreaRemarks.setColumns(20);
        txtAreaRemarks.setRows(5);
        jScrollPane2.setViewportView(txtAreaRemarks);

        lblRemarks.setText("REMARKS:");

        comboBoxCourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        comboBoxCourse.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                comboBoxCourseInputMethodTextChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel2.setText("PLEASE CHOOSE THE COURSE TO GRADE");

        btnGetDetails.setBackground(new java.awt.Color(23, 65, 68));
        btnGetDetails.setForeground(new java.awt.Color(255, 255, 255));
        btnGetDetails.setText("GET DETAILS");
        btnGetDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetDetailsActionPerformed(evt);
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
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 906, Short.MAX_VALUE)
                                .addComponent(btnGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(comboBoxCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnGetDetails)))
                                .addGap(0, 669, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(274, 274, 274)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblFirstName)
                                    .addComponent(lblLastName)
                                    .addComponent(lblStudentID)
                                    .addComponent(lblEmailAddress)
                                    .addComponent(lblContactNumber)
                                    .addComponent(lblGrades)
                                    .addComponent(lblRemarks)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Back)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLastName)
                            .addComponent(txtEmailAddress)
                            .addComponent(txtContactNumber)
                            .addComponent(txtFirstName)
                            .addComponent(txtStudentID, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                            .addComponent(comboBoxGrade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSave)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtContactNumber, txtEmailAddress, txtFirstName, txtLastName, txtStudentID});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGetDetails))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGrade)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblStudentID)
                    .addComponent(txtStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGrades)
                    .addComponent(comboBoxGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblRemarks)
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSave)
                            .addComponent(Back)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGradeActionPerformed

        int selectedRowIndex = tblStudentProfile.getSelectedRow();
        if(selectedRowIndex >=0){
            StudentProfile student = (StudentProfile) tblStudentProfile.getValueAt(selectedRowIndex, 0);
            setVisibility(true);

            txtStudentID.setText(student.getPerson().getId());
            txtFirstName.setText(student.getPerson().getFirstName());
            txtLastName.setText(student.getPerson().getLastName());
            txtEmailAddress.setText(student.getPerson().getEmailAddress());
            txtContactNumber.setText(String.valueOf(student.getPerson().getPhoneNo()));

        }
        
        
    }//GEN-LAST:event_btnGradeActionPerformed

    private void txtEmailAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailAddressActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        
//        ArrayList<Course> courseList = business.getCourseDirectory().getCourseList();
//        
//        ArrayList<StudentProfile> students = new ArrayList<>();      
//        for(Course course : courseList){
//            if(course.getCourseId().equals(courseID)){
//                students = course.getStudentsEnrolled();
//            }
//        } 
        
        String gradesEarned = comboBoxGrade.getSelectedItem().toString();
        String remarks = txtAreaRemarks.getText();
        String studentID = txtStudentID.getText();
        Course course = business.getCourseDirectory().searchCourse(courseID);
        
        
        StudentProfile studentProfile = business.getStudentDirectory().findStudent(studentID);
        System.out.println("STUDENT PROFILE: "+studentProfile);
        System.out.println("COURSE: "+course);
        CourseEnrolled courseEnrolled = studentProfile.getCourseWork().findCourseEnrolled(course);
                //findCourseEnrolled(course);
//        System.out.println("COURSE DIRECTORY "+ );
        
        
        courseEnrolled.setGradeEarned(gradesEarned);
        courseEnrolled.setRemarks(remarks);
        JOptionPane.showMessageDialog(this, "Grading complete!");
        populateTable(course);
        System.out.println("COURSE: "+course);
        setVisibility(false);
        
        txtStudentID.setText("");
        txtFirstName.setText("");
        txtLastName.setText("");
        txtEmailAddress.setText("");
        txtContactNumber.setText("");
    }//GEN-LAST:event_btnSaveActionPerformed

    private void comboBoxCourseInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_comboBoxCourseInputMethodTextChanged

    }//GEN-LAST:event_comboBoxCourseInputMethodTextChanged

    private void btnGetDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetDetailsActionPerformed
         String selectedCourseID = comboBoxCourse.getSelectedItem().toString();
         System.out.println("SELECTED COURSE ID: "+selectedCourseID);
//         Course selectedCourse = business.getCourseDirectory().searchCourse(selectedCourseID);
         
         for(Course course : business.getCourseDirectory().getCourseList()){
             if(course.getCourseId().equals(selectedCourseID)){
                 System.out.println("LOOP COURSE ID: "+course.getCourseId());
                 populateTable(course);
                 courseID = course.getCourseId();
                 return;
             }
         }

    }//GEN-LAST:event_btnGetDetailsActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        CardSequencePanel.remove(this);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_BackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton btnGetDetails;
    private javax.swing.JButton btnGrade;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> comboBoxCourse;
    private javax.swing.JComboBox<String> comboBoxGrade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblContactNumber;
    private javax.swing.JLabel lblEmailAddress;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblGrades;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblRemarks;
    private javax.swing.JLabel lblStudentID;
    private javax.swing.JTable tblStudentProfile;
    private javax.swing.JTextArea txtAreaRemarks;
    private javax.swing.JTextField txtContactNumber;
    private javax.swing.JTextField txtEmailAddress;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtStudentID;
    // End of variables declaration//GEN-END:variables
}
