/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;


/**
 *
 * @author kal bugrara
 */
public class StudentProfile extends Profile {

    private CourseWork courseWork;
    private int totalGradesEarned;

    public StudentProfile(Person p) {
        super(p);
        this.courseWork = new CourseWork();
        
    }

    @Override
    public String getRole() {
        return "Student";
    }

    public boolean isMatch(String id) {
        return person.getPersonId().equals(id);
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public CourseWork getCourseWork() {
        return courseWork;
    }

    public void setCourseWork(CourseWork courseWork) {
        this.courseWork = courseWork;
    }
   
     public ArrayList<CourseEnrolled> addNewCourseWork(CourseEnrolled courseEnrolled){
         return this.courseWork.addNewCourseWork(courseEnrolled);
         
    }

    @Override
    public String toString() {
        return person.id;
    }  

    public int getTotalGradesEarned() {
        return totalGradesEarned;
    }

    public void setTotalGradesEarned(int totalGradesEarned) {
        this.totalGradesEarned = totalGradesEarned;
    }


}
