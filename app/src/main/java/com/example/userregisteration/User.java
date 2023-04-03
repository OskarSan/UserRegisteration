package com.example.userregisteration;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;

public class User implements Serializable {
    protected String firstName;
    protected String lastName;
    protected String email;
    protected String degreeProgram;

    protected ArrayList<String> examinations;

    protected int image;


    public User(String firstName, String lastName, String email, String degreeProgram, ArrayList examinations){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.degreeProgram = degreeProgram;
        this.examinations = examinations;

    }


    public static Comparator<User> userNameComparator = new Comparator<User>() {
        @Override
        public int compare(User p1, User p2) {
            return p1.getWholeName().compareTo(p2.getWholeName());
        }
    };


    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getEmail(){
        return email;
    }
    public String getDegreeProgram(){
        return degreeProgram;
    }
    public String getWholeName() { return firstName + lastName; }
    public int getImage() {
        return image;
    }

    public ArrayList<String> getExaminations() { return examinations; }
}
