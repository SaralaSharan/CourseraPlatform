/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author saralask
 */
public class UserActivityDirectory {
    ArrayList<UserActivity> userActivity;

    public UserActivityDirectory(ArrayList<UserActivity> userActivity) {
        this.userActivity = userActivity;
    }

    public UserActivityDirectory() {
        this.userActivity = new ArrayList<>();
    }
    
    public void addUserActivity(UserActivity userActivity){
        this.userActivity.add(userActivity);
    }

    public ArrayList<UserActivity> getUserActivity() {
        return userActivity;
    }

    public void setUserActivity(ArrayList<UserActivity> userActivity) {
        this.userActivity = userActivity;
    }

}
