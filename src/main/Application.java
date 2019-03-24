package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;

public class Application {
    public static void main(String[] args) {

        // create university
        University university = new University("CH.U.I.");
        // adding/creating students to university
        university.addStudent(new Student("Andrew Kostenko",5));
        university.addStudent(new Student("Julia Veselkina",4));
        university.addStudent(new Student("Maria Perechrest",3));

        // create internship
        Internship internship = new Internship("Interlink");
        // add to internship students
        internship.setStudents(university);

        // print list of students who was successful enrolled to internship
        System.out.println("List of internship's students:");
        System.out.println(internship.getStudents());
    }
}
