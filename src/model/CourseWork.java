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
public class CourseWork {
    
    private ArrayList<CourseEnrolled> courseEnrolledList;

    
    public CourseWork(ArrayList<CourseEnrolled> courseEnrolledList) {
        this.courseEnrolledList = courseEnrolledList;
    }

    public CourseWork() {
        courseEnrolledList = new ArrayList<>();
    }

    public ArrayList<CourseEnrolled> getCourseEnrolledList() {
        return courseEnrolledList;
    }

    public void setCourseEnrolledList(ArrayList<CourseEnrolled> courseEnrolledList) {
        this.courseEnrolledList = courseEnrolledList;
    }
    
    public void newCourseEnrolled(CourseEnrolled courseEnrolled){
        courseEnrolledList.add(courseEnrolled);
    }
    
     public ArrayList<CourseEnrolled> addNewCourseWork(CourseEnrolled courseEnrolled){
         this.courseEnrolledList.add(courseEnrolled);
         return this.courseEnrolledList;
    }

    public CourseEnrolled findCourseEnrolled(Course course){
        
        System.out.println(this.courseEnrolledList);
        for(CourseEnrolled courseEnrolled : this.courseEnrolledList){
            System.out.println("ENROLLED COURSE: "+courseEnrolled.getCourse().getCourseId());
            System.out.println("REQUESTED COURSE: "+course.getCourseId());
            if(courseEnrolled.getCourse().getCourseId().equals(course.getCourseId()))
                return courseEnrolled;
        }
        return null;
    }

}
