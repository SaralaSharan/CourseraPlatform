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
public class CourseDirectory {
    
    ArrayList<Course> courseList;
    
    
    public CourseDirectory() {

     courseList = new ArrayList();

    }
    
    public Course newCourse(String courseId, String courseName, int creditsCarried) {

        Course course = new Course(courseId,courseName,creditsCarried);
        courseList.add(course);
        return course;
    }
    
    public Course addNewCourse(String courseId,String professorId, String courseName, int creditsCarried, String courseInstructor, String dayOfTheWeek, String fromTiming, String toTiming) {

        Course course = new Course(courseId,professorId,courseName,creditsCarried,courseInstructor,dayOfTheWeek,fromTiming,toTiming);
        courseList.add(course);
        return course;
    }

    public Course findStudent(String id) {

        for (Course course : courseList) {

            if(course.isMatch(id)) {
                return course;
            }
        }
            return null; //not found after going through the whole list
         }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }
    
     public void deleteCourse(Course course){
        courseList.remove(course);
    }
     
     public void updateCourse(Course oldCourse, Course updatedCourse){
         int index = courseList.indexOf(oldCourse);
         courseList.set(index, updatedCourse);
     }
     
      public Course searchCourse(String courseID){
        for(Course course : courseList){
            if(course.getCourseId().equals(courseID)){
                return course;
            }
        }
        return null;
        
    }
      
      public Course findCourseByProfessorID(String id){
          for(Course course : courseList){
              String professorId = course.getProfessorId();
              if(professorId.equals(id))
                  return course;
          }
          return null;
      }
      
     

}
