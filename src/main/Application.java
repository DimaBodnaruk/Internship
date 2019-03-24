package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {

        // create universities, adding students to university
        ArrayList<University> universities = new GetData().load();

        // create internship
        Internship internship = new Internship("Interlink");
        // add to internship students
        internship.setStudents(universities);

        // print list of students who was successful enrolled to internship
        System.out.println("List of internship's students:");
        System.out.println(internship.getStudents());
    }
}
