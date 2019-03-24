package main;

import institution.University;
import person.Student;

import java.util.ArrayList;

/**
 * Class contains data loading logic
 */
public class GetData {
    /**
     * The method returns a list of universities
     *
     * @return list of universities
     */
    public ArrayList<University> load() {
        ArrayList<University> universities = new ArrayList<University>();

        // Creating university
        University university = new University("CH.U.I.");
        // Adding/creating students to university
        university.addStudent(new Student("Andrew Kostenko", 5));
        university.addStudent(new Student("Julia Veselkina", 4));
        university.addStudent(new Student("Maria Perechrest", 3));
        // Adding university to the list
        universities.add(university);

        // Creating university
        university = new University("NUNG");
        // Adding/creating students to university
        university.addStudent(new Student("Bryan Kantor", 75));
        university.addStudent(new Student("Tashia Welty", 94));
        university.addStudent(new Student("Edmundo Nicastro", 85));
        university.addStudent(new Student("Kelsi Berrier", 95));
        university.addStudent(new Student("Cesar Dungy", 68));
        university.addStudent(new Student("Renate Belvins", 77));
        // Adding university to the list
        universities.add(university);

        return universities;
    }
}