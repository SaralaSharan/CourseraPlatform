 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author kal bugrara
 */
public class Person {

    String id;
    private String FirstName;
    private String LastName;
    private String emailAddress;
    private long phoneNo;
    private String Address;
    private String imageAddress;
    private String role;
    private ArrayList<String> passwordHistory;

    public Person(String id) {

        this.id = id;
        this.passwordHistory=new ArrayList<>();
    }

    public Person(String id, String FirstName, String LastName, String emailAddress, long phoneNo, String Address) {
        this.id = id;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.emailAddress = emailAddress;
        this.phoneNo = phoneNo;
        this.Address = Address;
        this.passwordHistory=new ArrayList<>();
    }

    public Person() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getImageAddress() {
        return imageAddress;
    }

    public void setImageAddress(String imageAddress) {
        this.imageAddress = imageAddress;
    }

    public ArrayList<String> getPasswordHistory() {
        return passwordHistory;
    }

    public void setPasswordHistory(ArrayList<String> passwordHistory) {
        this.passwordHistory = passwordHistory;
    } 
   
    public boolean addNewPassword(String newPassword){
        return this.passwordHistory.add(newPassword);
    }

    public String getPersonId() {
        return id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    } 

    public boolean isMatch(String id) {
        if (getPersonId().equals(id)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return getPersonId();
    }
}
