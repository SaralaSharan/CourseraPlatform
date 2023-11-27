/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author saralask
 */
public class Course {
    
    private String courseId;
    private String professorId;
    private String courseInstructor;
    private String courseName;
    private int creditsCarried;
    private String coursesDescription;
    private String dayOfTheWeek;
    private String fromTiming;
    private String toTiming;
    private ArrayList<StudentProfile> studentsEnrolled;

    public Course(){
        this.studentsEnrolled = new ArrayList<>();
    }
    public Course(String courseId, String courseName, int creditsCarried) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.creditsCarried = creditsCarried;
        this.studentsEnrolled = new ArrayList<>();
    }
    
    public Course(String courseId, String professorId,String courseName, int creditsCarried, String courseInstructor, String dayOfTheWeek, String fromTiming, String toTiming) {
        this.courseId = courseId;
        this.professorId = professorId;
        this.courseName = courseName;
        this.creditsCarried = creditsCarried;
        this.courseInstructor = courseInstructor;
        this.dayOfTheWeek = dayOfTheWeek;
        this.fromTiming = fromTiming;
        this.toTiming = toTiming;
        this.studentsEnrolled = new ArrayList<StudentProfile>(); 
    }
  
    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getProfessorId() {
        return professorId;
    }

    public void setProfessorId(String professorId) {
        this.professorId = professorId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCoursesDescription() {
        return coursesDescription;
    }

    public void setCoursesDescription(String coursesDescription) {
        this.coursesDescription = coursesDescription;
    }

    public ArrayList<StudentProfile> getStudentsEnrolled() {
        return studentsEnrolled;
    }

    public void setStudentsEnrolled(ArrayList<StudentProfile> studentsEnrolled) {
        this.studentsEnrolled = studentsEnrolled;
    }   

    public int getCreditsCarried() {
        return creditsCarried;
    }

    public void setCreditsCarried(int creditsCarried) {
        this.creditsCarried = creditsCarried;
    }

    public String getCourseInstructor() {
        return courseInstructor;
    }

    public void setCourseInstructor(String courseInstructor) {
        this.courseInstructor = courseInstructor;
    }
    
     public boolean isMatch(String id) {
        if(getCourseId().equals(id)) {
            return true;
        }
        return false;
    }
     
    @Override
    public String toString() {
        return this.courseId;
     }

    public Course(String courseId, String professorId, String courseInstructor, String courseName, int creditsCarried, String coursesDescription, String dayOfTheWeek, String fromTiming, String toTiming, ArrayList<StudentProfile> studentsEnrolled) {
        this.courseId = courseId;
        this.professorId = professorId;
        this.courseInstructor = courseInstructor;
        this.courseName = courseName;
        this.creditsCarried = creditsCarried;
        this.coursesDescription = coursesDescription;
        this.dayOfTheWeek = dayOfTheWeek;
        this.fromTiming = fromTiming;
        this.toTiming = toTiming;
        this.studentsEnrolled = studentsEnrolled;
    }

     
    public String getDayOfTheWeek() {
        return dayOfTheWeek;
    }

    public void setDayOfTheWeek(String dayOfTheWeek) {
        this.dayOfTheWeek = dayOfTheWeek;
    }

    public String getFromTiming() {
        return fromTiming;
    }

    public void setFromTiming(String fromTiming) {
        this.fromTiming = fromTiming;
    }

    public String getToTiming() {
        return toTiming;
    }

    public void setToTiming(String toTiming) {
        this.toTiming = toTiming;
    }
    
    public String getCourseTimings(){
        if(this.getDayOfTheWeek() == null ) return "";
        else return this.getDayOfTheWeek()+ " " + this.getFromTiming() + " to " + this.getToTiming();
    }
    
    public ArrayList<StudentProfile> addNewStudent(StudentProfile studentProfile){
           this.studentsEnrolled.add(studentProfile);
           return this.studentsEnrolled;
      }

}
