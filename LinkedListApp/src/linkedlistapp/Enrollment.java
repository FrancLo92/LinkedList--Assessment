/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistapp;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author HP Mini
 */
public class Enrollment {   
    
    public int EnrollmentID;
    private Date DateEnrolled;
    private String Semester;
    private String Grade;
    private Course Course;
    
//    public Enrollment(int enrollmentID, Date dateEnrolled, String grade, String semester, Course course){
//        this.EnrollmentID = enrollmentID;
//        this.DateEnrolled = dateEnrolled;
//        this.Grade = grade;
//        this.Semester = semester;      
//        this.Course = course;
//    }

       
    // I used the ID as the equals criteria because its value is a unique identifier
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Enrollment other = (Enrollment) obj;
        if (!Objects.equals(this.EnrollmentID, other.EnrollmentID)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + this.EnrollmentID;
        return hash;
    }
    
    //all args constructor
    public Enrollment(int enrollmentID, Date dateEnrolled, String grade, String semester){
        this.EnrollmentID = enrollmentID;
        this.DateEnrolled = dateEnrolled;
        this.Grade = grade;
        this.Semester = semester; 
    }
    
    // no args constructor
    public Enrollment(){
        this(0, new Date(), "", "");  
    }
    

    @Override
    public String toString() {
        return "Enrollment{" + "EnrollmentID=" + EnrollmentID + ", DateEnrolled=" + DateEnrolled +", Grade=" + Grade + ", Semester=" + Semester ;
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String Grade) {
        this.Grade = Grade;
    }

    //getters & setters
    public Course getCourse() {
        return Course;
    }

    public void setCourse(Course Course) {
        this.Course = Course;
    }
    
     public int getEnrollmentID() {
        return EnrollmentID;
    }

    public void setEnrollmentID(int EnrollmentID) {
        this.EnrollmentID = EnrollmentID;
    }

    public Date getDateEnrolled() {
        return DateEnrolled;
    }

    public void setDateEnrolled(Date DateEnrolled) {
        this.DateEnrolled = DateEnrolled;
    }

    public String getSemester() {
        return Semester;
    }

    public void setSemester(String Semester) {
        this.Semester = Semester;
    }
    
}
