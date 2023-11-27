package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author saralask
 */
public class ProfessorAccount extends UserAccount {
    
    private ProfessorProfile professorProfile;

    public ProfessorAccount(ProfessorProfile professorProfile, Profile profile, String un, String pw) {
        super(profile, un, pw);
        this.professorProfile = professorProfile;
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

    public ProfessorProfile getProfessorProfile() {
        return professorProfile;
    }

    public void setProfessorProfile(ProfessorProfile professorProfile) {
        this.professorProfile = professorProfile;
    }
    
}
