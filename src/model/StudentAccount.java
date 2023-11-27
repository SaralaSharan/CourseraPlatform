/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class StudentAccount extends UserAccount{
    
    private StudentProfile studentProfile;
    private ArrayList<Course> coursesRegistered;
    private File transcript;

    public StudentAccount(StudentProfile studentProfile, ArrayList<Course> coursesRegistered, File transcript, Profile profile, String un, String pw) {
        super(profile, un, pw);
        this.studentProfile = studentProfile;
        this.coursesRegistered = coursesRegistered;
        this.transcript = transcript;
    }

    public ArrayList<Course> getCoursesRegistered() {
        return coursesRegistered;
    }

    public void setCoursesRegistered(ArrayList<Course> coursesRegistered) {
        this.coursesRegistered = coursesRegistered;
    }

    public File getTranscript() {
        return transcript;
    }

    public void setTranscript(File transcript) {
        this.transcript = transcript;
    }

    public StudentProfile getStudentProfile() {
        return studentProfile;
    }

    public void setStudentProfile(StudentProfile studentProfile) {
        this.studentProfile = studentProfile;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    } 
    
}
