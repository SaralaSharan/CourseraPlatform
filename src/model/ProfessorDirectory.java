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
public class ProfessorDirectory {
    ArrayList<ProfessorProfile> professorList;
    
    
    public ProfessorDirectory() {

     professorList = new ArrayList();

    }
    
    public ProfessorProfile newProfessorProfile(Person p) {

        ProfessorProfile sp = new ProfessorProfile(p);
        professorList.add(sp);
        return sp;
    }

    public ProfessorProfile findProfessor(String id) {

        for (ProfessorProfile sp : professorList) {

            if (sp.isMatch(id)) {
                return sp;
            }
        }
            return null; //not found after going through the whole list
         }

    public ArrayList<ProfessorProfile> getProfessorList() {
        return professorList;
    }

    public void setProfessorList(ArrayList<ProfessorProfile> professorList) {
        this.professorList = professorList;
    }
    
    
    
}
