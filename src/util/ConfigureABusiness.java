package util;


import java.util.ArrayList;
import java.util.Arrays;
import model.Business;
import model.Course;
import model.CourseDirectory;
import model.CourseEnrolled;
import model.EmployeeDirectory;
import model.EmployeeProfile;
import model.Person;
import model.PersonDirectory;
import model.ProfessorDirectory;
import model.ProfessorProfile;
import model.StudentDirectory;
import model.StudentProfile;
import model.UserAccount;
import model.UserAccountDirectory;
import org.mindrot.jbcrypt.BCrypt;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

*/



/**
 *
 * @author kal bugrara
 */
public class ConfigureABusiness {

    public static Business initialize() {
        
        Business business = new Business("Coursera Platform");
        
        PersonDirectory persons = business.getPersonDirectory();
        Person person0 = persons.addNewPerson("000","Sarala", "Sharan", "saralasharan@gmail.com", 857654517, "1254 Commonwealth ave MA-02134");
        Person person1 = persons.addNewPerson("001","Priya", "Gupta", "priyagupta@gmail.com", 131572688, "2839 Dark Hollow Road Wisconsin 53520");
        Person person2 = persons.addNewPerson("002","Naveen", "Jindal", "naveenjindal@gmail.com", 380488165, "2839 Dark Hollow Road Wisconsin 53520");
        Person person3 = persons.addNewPerson("003","Ram", "Avtar", "ramaavtar@gmail.com", 14128220, "Apt. 753 7276 Heller Place, South Dario, MD 96995-7580");
        Person person4 = persons.addNewPerson("004","Sreenath", "Reddy", "sreenathreddy@gmail.com", 402384421, "26777 Gibson Streets, Sherrellberg, CA 53020-5942");
        Person person5 = persons.addNewPerson("005","Aparna", "Joshi", "aparnajoshi@gmail.com", 194680569, "8383 Catheryn Forest, East Corey, WY 92933-1607");
        Person person6 = persons.addNewPerson("006","Praney", "Choudary", "praneychoudary@gmail.com", 133012716, "Apt. 862 629 Shields Hollow, Lake Maurita, UT 13905");
        Person person7 = persons.addNewPerson("007","Yusuf", "Khan", "yusufkhan@gmail.com", 182508908, "4376 Stehr Ridges, Lake Pok, CA 95987");
        Person person8 = persons.addNewPerson("008","Aparna", "Joshi", "aparnajoshi@gmail.com", 194680569, "8383 Catheryn Forest, East Corey, WY 92933-1607");
        Person person9 = persons.addNewPerson("009","Tina", "Gupta", "tinagupta@gmail.com", 208900387, "914 Marisha Square, Columbusland, PA 81404");
        Person person10 = persons.addNewPerson("0010","Keval", "Dubey", "kevaldubey@gmail.com", 764680569, "Suite 721 876 Bartoletti Ways, Lake Pedrostad, NJ 82780-8992");
       
        Person person11 = persons.addNewPerson("011","Ankitha", "Signh", "snkitasignh@gmail.com", 195680569, "21172 Mamie Burgs, Toriechester, DE 67750");
        Person person12 = persons.addNewPerson("012","Prateek", "Das", "prateekdas@gmail.com", 694687569, "Suite 967 44755 Arthur Glens, Valliemouth, MO 66031");
        Person person13 = persons.addNewPerson("013","Sankit", "jogu", "Sanchijogi@gmail.com", 84680569, "Suite 744 4663 Rippin Fork, Port Desmondland, IN 43264");
        Person person14 = persons.addNewPerson("014","Aparna", "Joshi", "aparnajoshi@gmail.com", 994680869, "30896 Amparo Glens, Marvinmouth, NJ 63533-3639");
        Person person15 = persons.addNewPerson("015","Bhupendra", "Joshi", "bhupendra@gmail.com", 234980569, "2716 Mayert Street, Keelingborough, VT 28566-0568");
        
        Person person16 = persons.addNewPerson("016","Sreeshanth", "Reddy", "sreeshanthreddy@gmail.com", 394980569, "Suite 330 13718 Kutch Camp, West Virgil, NM 69192");
        Person person17 = persons.addNewPerson("017","Raveena", "Parsi", "raveenaparsi@gmail.com", 164680569, "Apt. 542 242 Omar Rue, Marshallbury, HI 93384-9286");
        Person person18 = persons.addNewPerson("018","krishi", "Joshi", "skrijoghi@gmail.com", 298680569, "Suite 186 37137 Adams Canyon, South Alfredland, MD 82733");
        Person person19 = persons.addNewPerson("019","karthik", "Aryan", "karthikaryan@gmail.com", 598680569, "Suite 854 5764 Ebert Way, Latonyafurt, MO 09665");
        Person person20 = persons.addNewPerson("020","Jitendra", "bhati", "jitendrabhati@gmail.com", 694680569, "Suite 205 26490 Hipolito Harbors, Larrymouth, NJ 54124");
        
        Person person21 = persons.addNewPerson("021", "John", "Doe", "johndoe@gmail.com", 694680560, "Suite 101 12345 Elm St, Somewhere, NJ 54120");
        Person person22 = persons.addNewPerson("022", "Jane", "Smith", "janesmith@gmail.com", 694680561, "Suite 102 67890 Maple Ave, Anywhere, NJ 54121");
        Person person23 = persons.addNewPerson("023", "Alice", "Johnson", "alicejohnson@gmail.com", 694680562, "Suite 103 11223 Oak Ln, Hereville, NJ 54122");
        Person person24 = persons.addNewPerson("024", "Bob", "Williams", "bobwilliams@gmail.com", 694680563, "Suite 104 44556 Pine Rd, Thereville, NJ 54123");
        Person person25 = persons.addNewPerson("025", "Charlie", "Brown", "charliebrown@gmail.com", 694680564, "Suite 105 78901 Birch Pl, Everywhere, NJ 54124");
        
        Person person26 = persons.addNewPerson("026", "Lucy", "Van Pelt", "lucyvanpelt@gmail.com", 694680565, "Suite 106 78902 Pine St, Everywhere, NJ 54125");
        Person person27 = persons.addNewPerson("027", "Linus", "Van Pelt", "linusvanpelt@gmail.com", 694680566, "Suite 107 78903 Maple Dr, Everywhere, NJ 54126");
        Person person28 = persons.addNewPerson("028", "Snoopy", "Dog", "snoopydog@gmail.com", 694680567, "Suite 108 78904 Oak Ln, Everywhere, NJ 54127");
        Person person29 = persons.addNewPerson("029", "Woodstock", "Bird", "woodstockbird@gmail.com", 694680568, "Suite 109 78905 Elm Rd, Everywhere, NJ 54128");
        Person person30 = persons.addNewPerson("025", "Charlie", "Brown", "charliebrown@gmail.com", 694680564, "Suite 105 78901 Birch Pl, Everywhere, NJ 54124");


        EmployeeDirectory employees = business.getEmployeeDirectory();
        EmployeeProfile employee = employees.newEmployeeProfile(person0);
        person0.setRole("ADMIN");
        
        ProfessorDirectory professors = business.getProfessorDirectory();
        ProfessorProfile professor1 = professors.newProfessorProfile(person1);
        ProfessorProfile professor2 = professors.newProfessorProfile(person2);
        ProfessorProfile professor3 = professors.newProfessorProfile(person3);
        ProfessorProfile professor4 = professors.newProfessorProfile(person4);
        ProfessorProfile professor5 = professors.newProfessorProfile(person5);
        ProfessorProfile professor6 = professors.newProfessorProfile(person6);
        ProfessorProfile professor7 = professors.newProfessorProfile(person7);
        ProfessorProfile professor8 = professors.newProfessorProfile(person8);
        ProfessorProfile professor9 = professors.newProfessorProfile(person9);
        ProfessorProfile professor10 = professors.newProfessorProfile(person10);
        professor1.setReputativeIndex(8);
        professor2.setReputativeIndex(5);
        professor3.setReputativeIndex(6);
        professor4.setReputativeIndex(7);
        professor5.setReputativeIndex(8);
        professor6.setReputativeIndex(9);
        professor7.setReputativeIndex(10);
        professor8.setReputativeIndex(5);
        professor9.setReputativeIndex(6);
        professor10.setReputativeIndex(7);

        person1.setRole("PROFESSOR");
        person2.setRole("PROFESSOR");
        person3.setRole("PROFESSOR");
        person4.setRole("PROFESSOR");
        person5.setRole("PROFESSOR");
        person6.setRole("PROFESSOR");
        person7.setRole("PROFESSOR");
        person8.setRole("PROFESSOR");
        person9.setRole("PROFESSOR");
        person10.setRole("PROFESSOR");

        
        StudentDirectory students = business.getStudentDirectory();
        StudentProfile studentProfile1 = students.newStudentProfile(person11);
        StudentProfile studentProfile2 =students.newStudentProfile(person12);
        StudentProfile studentProfile3 =students.newStudentProfile(person13);
        StudentProfile studentProfile4 =students.newStudentProfile(person14);
        StudentProfile studentProfile5 =students.newStudentProfile(person15);
        
        StudentProfile studentProfile11 = students.newStudentProfile(person16);
        StudentProfile studentProfile12 = students.newStudentProfile(person17);
        StudentProfile studentProfile13 = students.newStudentProfile(person18);
        StudentProfile studentProfile14 = students.newStudentProfile(person19);
        StudentProfile studentProfile15 = students.newStudentProfile(person20);
        
        StudentProfile studentProfile6 = students.newStudentProfile(person21);
        StudentProfile studentProfile7 = students.newStudentProfile(person22);
        StudentProfile studentProfile8 = students.newStudentProfile(person23);
        StudentProfile studentProfile9 = students.newStudentProfile(person24);
        StudentProfile studentProfile10 = students.newStudentProfile(person25);
        
        StudentProfile studentProfile16 = students.newStudentProfile(person26);
        StudentProfile studentProfile17 = students.newStudentProfile(person27);
        StudentProfile studentProfile18 = students.newStudentProfile(person28);
        StudentProfile studentProfile19 = students.newStudentProfile(person29);
        StudentProfile studentProfile20 = students.newStudentProfile(person30);
        person11.setRole("STUDENT");
        person12.setRole("STUDENT");
        person13.setRole("STUDENT");
        person14.setRole("STUDENT");
        person15.setRole("STUDENT");
        person16.setRole("STUDENT");
        person17.setRole("STUDENT");
        person18.setRole("STUDENT");
        person19.setRole("STUDENT");
        person20.setRole("STUDENT");
        person21.setRole("STUDENT");
        person22.setRole("STUDENT");
        person23.setRole("STUDENT");
        person24.setRole("STUDENT");
        person25.setRole("STUDENT");
        person26.setRole("STUDENT");
        person27.setRole("STUDENT");
        person28.setRole("STUDENT");
        person29.setRole("STUDENT");
        person30.setRole("STUDENT");


        CourseDirectory courseDirectory = business.getCourseDirectory();
        Course course1 = courseDirectory.addNewCourse("INFO5100",person1.getPersonId(), "AED", 4, person1.getFirstName()+" "+person1.getLastName(), "WEDNESDAY", "3:00PM", "6:00PM");
        Course course2 = courseDirectory.addNewCourse("DAMG6210", person2.getPersonId(),"DMDD", 3, person2.getFirstName()+" "+person2.getLastName(), "THURSDAY", "5:00PM", "6:00PM");
        Course course3 = courseDirectory.addNewCourse("ENCP6000", person3.getPersonId(),"ENCP", 3, person3.getFirstName()+" "+person3.getLastName(), "FRIDAY", "2:00PM", "6:00PM");
        Course course4 = courseDirectory.addNewCourse("INFO5101", person4.getPersonId(),"JAVA LAB", 3, person4.getFirstName()+" "+person4.getLastName(), "SATURDAY", "3:00PM", "7:00PM");
        Course course5 = courseDirectory.addNewCourse("INFO5102", person5.getPersonId(),"ADVANCE JAVA", 3, person5.getFirstName()+" "+person5.getLastName(), "SUNDAY", "4:00PM", "8:00PM");
 
        
        studentProfile1.addNewCourseWork(new CourseEnrolled(course1, "A+", "good at programming")); 
        studentProfile2.addNewCourseWork(new CourseEnrolled(course1, "B", "needs improvement on testing"));
        studentProfile3.addNewCourseWork(new CourseEnrolled(course1, "A", "excellent teamwork"));
        ArrayList<StudentProfile> list1 = new ArrayList<>(Arrays.asList(studentProfile1, studentProfile2, studentProfile3));
        course1.setStudentsEnrolled(list1);
        
        studentProfile4.addNewCourseWork(new CourseEnrolled(course2, "B+", "great analytical skills"));
        studentProfile5.addNewCourseWork(new CourseEnrolled(course2, "C", "struggling with concepts"));
        studentProfile6.addNewCourseWork(new CourseEnrolled(course2, "B", "has potential"));
        ArrayList<StudentProfile> list2 = new ArrayList<>(Arrays.asList(studentProfile4, studentProfile5, studentProfile6));
        course2.setStudentsEnrolled(list2);
        
        studentProfile7.addNewCourseWork(new CourseEnrolled(course3, "A-", "demonstrates clear understanding"));
        studentProfile8.addNewCourseWork(new CourseEnrolled(course3, "C+", "needs more focus"));
        studentProfile9.addNewCourseWork(new CourseEnrolled(course3, "B+", "strong analytical skills"));
        ArrayList<StudentProfile> list3 = new ArrayList<>(Arrays.asList(studentProfile7, studentProfile8, studentProfile9));
        course3.setStudentsEnrolled(list3);
        
        
        studentProfile10.addNewCourseWork(new CourseEnrolled(course4, "A", "exemplary performance"));
        studentProfile11.addNewCourseWork(new CourseEnrolled(course4, "B", "good effort"));
        studentProfile12.addNewCourseWork(new CourseEnrolled(course4, "A-", "very knowledgeable"));
        studentProfile13.addNewCourseWork(new CourseEnrolled(course4, "B+", "good grasp of concepts"));
        ArrayList<StudentProfile> list4 = new ArrayList<>(Arrays.asList(studentProfile10, studentProfile11, studentProfile12,studentProfile13));
        course4.setStudentsEnrolled(list4);
        
        studentProfile14.addNewCourseWork(new CourseEnrolled(course5, "C+", "needs more practice"));
        studentProfile15.addNewCourseWork(new CourseEnrolled(course5, "B-", "keep it up"));
        studentProfile16.addNewCourseWork(new CourseEnrolled(course5, "A", "excellent work"));
        studentProfile17.addNewCourseWork(new CourseEnrolled(course5, "B+", "well done"));
        studentProfile18.addNewCourseWork(new CourseEnrolled(course5, "A-", "good understanding"));
        studentProfile19.addNewCourseWork(new CourseEnrolled(course5, "B", "satisfactory performance"));
        studentProfile20.addNewCourseWork(new CourseEnrolled(course5, "A", "exemplary performance"));
        ArrayList<StudentProfile> list5 = new ArrayList<>(Arrays.asList(
                studentProfile14, 
                studentProfile15, 
                studentProfile16,
                studentProfile17,
                studentProfile18,
                studentProfile19,
                studentProfile20));
        course5.setStudentsEnrolled(list5);


        UserAccountDirectory userAccountDirectory = business.getUserAccountDirectory();
        String hashpw = BCrypt.hashpw("LoveYourself12", BCrypt.gensalt());
        UserAccount ua0 = userAccountDirectory.newUserAccount(employee, "sara", hashpw);
        employee.getPerson().addNewPassword(hashpw);
        
       
        String hashpw1 = BCrypt.hashpw("StrangerThings12", BCrypt.gensalt());
        UserAccount ua1 = userAccountDirectory.newUserAccount(studentProfile1, "alpha1", hashpw1);
        studentProfile1.getPerson().addNewPassword(hashpw1);

        String hashpw2 = BCrypt.hashpw("GameOfThrones12", BCrypt.gensalt());
        UserAccount ua2 = userAccountDirectory.newUserAccount(studentProfile2, "bravo2", hashpw2);
        studentProfile2.getPerson().addNewPassword(hashpw2);

        String hashpw3 = BCrypt.hashpw("BreakingBad12", BCrypt.gensalt());
        UserAccount ua3 = userAccountDirectory.newUserAccount(studentProfile3, "charl3", hashpw3);
        studentProfile3.getPerson().addNewPassword(hashpw3);

        String hashpw4 = BCrypt.hashpw("Westworld12", BCrypt.gensalt());
        UserAccount ua4 = userAccountDirectory.newUserAccount(studentProfile4, "delta4", hashpw4);
        studentProfile4.getPerson().addNewPassword(hashpw4);

        String hashpw5 = BCrypt.hashpw("TheOffice12", BCrypt.gensalt());
        UserAccount ua5 = userAccountDirectory.newUserAccount(studentProfile5, "echoo5", hashpw5);
        studentProfile5.getPerson().addNewPassword(hashpw5);

        String hashpw6 = BCrypt.hashpw("Friends12", BCrypt.gensalt());
        UserAccount ua6 = userAccountDirectory.newUserAccount(studentProfile6, "foxtt6", hashpw6);
        studentProfile6.getPerson().addNewPassword(hashpw6);

        String hashpw7 = BCrypt.hashpw("TheCrown12", BCrypt.gensalt());
        UserAccount ua7 = userAccountDirectory.newUserAccount(studentProfile7, "golfa7", hashpw7);
        studentProfile7.getPerson().addNewPassword(hashpw7);

        String hashpw8 = BCrypt.hashpw("TheWitcher12", BCrypt.gensalt());
        UserAccount ua8 = userAccountDirectory.newUserAccount(studentProfile8, "hotel8", hashpw8);
        studentProfile8.getPerson().addNewPassword(hashpw8);

        String hashpw9 = BCrypt.hashpw("BlackMirror12", BCrypt.gensalt());
        UserAccount ua9 = userAccountDirectory.newUserAccount(studentProfile9, "india9", hashpw9);
        studentProfile9.getPerson().addNewPassword(hashpw9);

        String hashpw10 = BCrypt.hashpw("Dexter12", BCrypt.gensalt());
        UserAccount ua10 = userAccountDirectory.newUserAccount(studentProfile10, "julie0", hashpw10);
        studentProfile10.getPerson().addNewPassword(hashpw10);

        String hashpw21 = BCrypt.hashpw("Password34y", BCrypt.gensalt());
        UserAccount ua21 = userAccountDirectory.newUserAccount(professor1, "alphar", hashpw21);
        professor1.getPerson().addNewPassword(hashpw21);

        String hashpw22 = BCrypt.hashpw("Dissertation45p", BCrypt.gensalt());
        UserAccount ua22 = userAccountDirectory.newUserAccount(professor2, "bravon", hashpw22);
        professor2.getPerson().addNewPassword(hashpw22);

        String hashpw23 = BCrypt.hashpw("Examinations56a", BCrypt.gensalt());
        UserAccount ua23 = userAccountDirectory.newUserAccount(professor3, "charlt", hashpw23);
        professor3.getPerson().addNewPassword(hashpw23);

        String hashpw24 = BCrypt.hashpw("Thesis78v", BCrypt.gensalt());
        UserAccount ua24 = userAccountDirectory.newUserAccount(professor4, "deltax", hashpw24);
        professor4.getPerson().addNewPassword(hashpw24);

        String hashpw25 = BCrypt.hashpw("Discussion90b", BCrypt.gensalt());
        UserAccount ua25 = userAccountDirectory.newUserAccount(professor5, "echoos", hashpw25);
        professor5.getPerson().addNewPassword(hashpw25);

        String hashpw26 = BCrypt.hashpw("Lecture12c", BCrypt.gensalt());
        UserAccount ua26 = userAccountDirectory.newUserAccount(professor6, "foxter", hashpw26);
        professor6.getPerson().addNewPassword(hashpw26);

        String hashpw27 = BCrypt.hashpw("Presentation34d", BCrypt.gensalt());
        UserAccount ua27 = userAccountDirectory.newUserAccount(professor7, "golfer", hashpw27);
        professor7.getPerson().addNewPassword(hashpw27);

        String hashpw28 = BCrypt.hashpw("Assignment45f", BCrypt.gensalt());
        UserAccount ua28 = userAccountDirectory.newUserAccount(professor8, "hobbit", hashpw28);
        professor8.getPerson().addNewPassword(hashpw28);

        String hashpw29 = BCrypt.hashpw("Quiz56g", BCrypt.gensalt());
        UserAccount ua29 = userAccountDirectory.newUserAccount(professor9, "indigo", hashpw29);
        professor9.getPerson().addNewPassword(hashpw29);

        String hashpw30 = BCrypt.hashpw("Evaluation78h", BCrypt.gensalt());
        UserAccount ua30 = userAccountDirectory.newUserAccount(professor10, "jungle", hashpw30);
        professor10.getPerson().addNewPassword(hashpw30);

        String hashpw31 = BCrypt.hashpw("Publication34o", BCrypt.gensalt());
        UserAccount ua31 = userAccountDirectory.newUserAccount(professor1, "alphar", hashpw31);
        professor1.getPerson().addNewPassword(hashpw31);

        String hashpw32 = BCrypt.hashpw("Dissertation45p", BCrypt.gensalt());
        UserAccount ua32 = userAccountDirectory.newUserAccount(professor2, "bravon", hashpw32);
        professor2.getPerson().addNewPassword(hashpw32);

        String hashpw33 = BCrypt.hashpw("Examinations56a", BCrypt.gensalt());
        UserAccount ua33 = userAccountDirectory.newUserAccount(professor3, "charlt", hashpw33);
        professor3.getPerson().addNewPassword(hashpw33);

        String hashpw34 = BCrypt.hashpw("Thesis78v", BCrypt.gensalt());
        UserAccount ua34 = userAccountDirectory.newUserAccount(professor4, "deltax", hashpw34);
        professor1.getPerson().addNewPassword(hashpw34);

        String hashpw35 = BCrypt.hashpw("Discussion90b", BCrypt.gensalt());
        UserAccount ua35 = userAccountDirectory.newUserAccount(professor5, "echoos", hashpw35);
        professor5.getPerson().addNewPassword(hashpw35);

        String hashpw36 = BCrypt.hashpw("Lecture12c", BCrypt.gensalt());
        UserAccount ua36 = userAccountDirectory.newUserAccount(professor6, "foxter", hashpw36);
        professor6.getPerson().addNewPassword(hashpw36);

        String hashpw37 = BCrypt.hashpw("Presentation34d", BCrypt.gensalt());
        UserAccount ua37 = userAccountDirectory.newUserAccount(professor7, "golfer", hashpw37);
        professor7.getPerson().addNewPassword(hashpw37);

        String hashpw38 = BCrypt.hashpw("Assignment45f", BCrypt.gensalt());
        UserAccount ua38 = userAccountDirectory.newUserAccount(professor8, "hobbit", hashpw38);
        professor8.getPerson().addNewPassword(hashpw38);

        String hashpw39 = BCrypt.hashpw("Quiz56g", BCrypt.gensalt());
        UserAccount ua39 = userAccountDirectory.newUserAccount(professor9, "indigo", hashpw39);
        professor9.getPerson().addNewPassword(hashpw39);

        String hashpw40 = BCrypt.hashpw("Evaluation78h", BCrypt.gensalt());
        UserAccount ua40 = userAccountDirectory.newUserAccount(professor10, "jungle", hashpw40);
        professor10.getPerson().addNewPassword(hashpw40);

        return business;
        
    }

}

