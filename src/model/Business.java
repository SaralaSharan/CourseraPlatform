package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author kal bugrara
 */
public class Business {

    String name;
    PersonDirectory persondirectory; //all people profiles regardless of the role
    StudentDirectory studentDirectory;
    ProfessorDirectory professorDirectory;
    EmployeeDirectory employeedirectory;
    CourseDirectory courseDirectory;
    UserAccountDirectory useraccountdirectory;
    UserActivityDirectory userActivityDirectory;


    public Business(String n) {
        name = n;
        persondirectory = new PersonDirectory();
        employeedirectory = new EmployeeDirectory(this);
        professorDirectory = new ProfessorDirectory();
        studentDirectory = new StudentDirectory();
        useraccountdirectory = new UserAccountDirectory();
        courseDirectory = new CourseDirectory();
        userActivityDirectory = new UserActivityDirectory();
    }

    public PersonDirectory getPersonDirectory() {
        return persondirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return useraccountdirectory;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeedirectory;
    }

    public StudentDirectory getStudentDirectory() {
        return studentDirectory;
    }

    public ProfessorDirectory getProfessorDirectory() {
        return professorDirectory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PersonDirectory getPersondirectory() {
        return persondirectory;
    }

    public void setPersondirectory(PersonDirectory persondirectory) {
        this.persondirectory = persondirectory;
    }

    public EmployeeDirectory getEmployeedirectory() {
        return employeedirectory;
    }

    public void setEmployeedirectory(EmployeeDirectory employeedirectory) {
        this.employeedirectory = employeedirectory;
    }

    public CourseDirectory getCourseDirectory() {
        return courseDirectory;
    }

    public void setCourseDirectory(CourseDirectory courseDirectory) {
        this.courseDirectory = courseDirectory;
    }

    public UserAccountDirectory getUseraccountdirectory() {
        return useraccountdirectory;
    }

    public void setUseraccountdirectory(UserAccountDirectory useraccountdirectory) {
        this.useraccountdirectory = useraccountdirectory;
    }

    public UserActivityDirectory getUserActivityDirectory() {
        return userActivityDirectory;
    }

    public void setUserActivityDirectory(UserActivityDirectory userActivityDirectory) {
        this.userActivityDirectory = userActivityDirectory;
    }
    
}
