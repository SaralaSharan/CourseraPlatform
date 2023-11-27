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
public class ProfessorProfile extends Profile{

    private ArrayList<Course> coursesOffered;
    private int reputativeIndex;
    
    
    public ProfessorProfile(Person p) {
        super(p);
    }

    @Override
    public String getRole() {
        return "Professor";
    } 

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public ArrayList<Course> getCoursesOffered() {
        return coursesOffered;
    }

    public void setCoursesOffered(ArrayList<Course> coursesOffered) {
        this.coursesOffered = coursesOffered;
    }

    public int getReputativeIndex() {
        return reputativeIndex;
    }

    public void setReputativeIndex(int reputativeIndex) {
        this.reputativeIndex = reputativeIndex;
    }

    @Override
    public String toString() {
        return person.getFirstName()+" "+person.getLastName();
    }

    @Override
    public boolean isMatch(String id) {
        return super.isMatch(id); 
    }
    
    

}
