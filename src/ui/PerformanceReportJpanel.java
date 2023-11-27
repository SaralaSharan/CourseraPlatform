/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JFrame;
import javax.swing.JPanel;
import model.Business;
import model.Course;

import model.StudentProfile;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

/**
 *
 * @author saralask
 */
public class PerformanceReportJpanel extends javax.swing.JPanel {

    JPanel CardSequencePanel;
    Business business;
    String professorID;
    static String courseID;
    /**
     * Creates new form PerformanceReportJpanel
     */
    public PerformanceReportJpanel(Business bz, JPanel jp, String professorID) {
        initComponents();
        initComponents();
        CardSequencePanel = jp;
        this.business = bz;
        this.professorID = professorID;
        chooseCourse();
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        comboBoxCourse = new javax.swing.JComboBox<>();
        btnGetDetails = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel2.setText("PLEASE CHOOSE THE COURSE TO GET REPORT");

        comboBoxCourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        comboBoxCourse.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                comboBoxCourseInputMethodTextChanged(evt);
            }
        });

        btnGetDetails.setBackground(new java.awt.Color(23, 65, 68));
        btnGetDetails.setForeground(new java.awt.Color(255, 255, 255));
        btnGetDetails.setText("GET DETAILS");
        btnGetDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comboBoxCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGetDetails)))
                .addContainerGap(656, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGetDetails))
                .addContainerGap(588, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxCourseInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_comboBoxCourseInputMethodTextChanged

    }//GEN-LAST:event_comboBoxCourseInputMethodTextChanged

    private void btnGetDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetDetailsActionPerformed
        String selectedCourseID = comboBoxCourse.getSelectedItem().toString();
        System.out.println("SELECTED COURSE ID: "+selectedCourseID);

        for(Course course : business.getCourseDirectory().getCourseList()){
            if(course.getCourseId().equals(selectedCourseID)){
                courseID = course.getCourseId();
            }
        }
        
        Course course = business.getCourseDirectory().searchCourse(courseID);
        
        ArrayList<StudentProfile> list = business.getCourseDirectory().searchCourse(courseID).getStudentsEnrolled();
        
        ArrayList<String> gradesPerCourse = new ArrayList<>();
        
        for(StudentProfile stu : list){
            String grades = stu.getCourseWork().findCourseEnrolled(course).getGradeEarned();
            System.out.println("GRADES: "+grades);
            gradesPerCourse.add(grades);
        }
        
        System.out.println(gradesPerCourse);
        
        
        // Calculate grade counts from the JSON data
        int gradeAplus = 0, gradeAminus = 0,  gradeBplus = 0, gradeBminus = 0, gradeCplus = 0, gradeCminus=0;
        for (String grade : gradesPerCourse) {

            if ("A+".equals(grade)) {
                gradeAplus++;
            } else if ("A-".equals(grade)) {
                gradeAminus++;
            } else if ("B+".equals(grade)) {
                gradeBplus++;
            }else if ("B-".equals(grade)) {
                gradeBminus++;
            }else if ("C+".equals(grade)) {
                gradeCplus++;
            }else if ("C-".equals(grade)) {
                gradeCminus++;
            }
        }


        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("A+", gradeAplus);
        dataset.setValue("A-", gradeAminus);
        dataset.setValue("B+", gradeBplus);
        dataset.setValue("B-", gradeBminus);
        dataset.setValue("C+", gradeCplus);
        dataset.setValue("C-", gradeCminus);

        System.out.println("GRADES: "+dataset);
       JFreeChart chart = ChartFactory.createPieChart(
    "Student Grades Distribution",
    dataset,
    true,   // Include legend
    true,
    false
);

        // Customize the pie chart (if needed)
        PiePlot plot = (PiePlot) chart.getPlot();
        // Customize plot settings here

        // Create a JFrame to display the pie chart
        JFrame frame = new JFrame("Grade Pie Chart");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        // Add the pie chart to the JFrame
        ChartPanel chartPanel = new ChartPanel(chart);
        frame.getContentPane().add(chartPanel);

        // Display the JFrame
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.getContentPane().add(chartPanel);
        frame.setVisible(true);
        
        
    }//GEN-LAST:event_btnGetDetailsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGetDetails;
    private javax.swing.JComboBox<String> comboBoxCourse;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
