package institution.interlink;

import institution.University;
import person.Student;

import java.util.ArrayList;

/**
 * The class contains information about internship and internship admission logic.
 */
public class Internship {
    private String internshipName;
    private ArrayList<Student> students;

    /**
     * Class constructor
     *
     * @param name internship name
     */
    public Internship(String name) {
        internshipName = name;
        students = new ArrayList<Student>();
    }

    /**
     * Method adds student
     *
     * @param student student object
     */
    public void setStudent(Student student) {
        students.add(student);
    }

    /**
     * Method adds students from the university.
     *
     * @param university university object
     */
    public void setStudents(University university) {
        int avg = university.getAvgKnowledgeLevel();
        for (int i = 0; i < university.getStudentsCount(); i++) {
            if (university.getStudent(i).getStudentKnowledge().getKnowledgeLevel() >= avg) {
                setStudent(university.getStudent(i));
            }
        }
    }

    /**
     * Method adds students from the universities.
     *
     * @param universities list of objects university
     */
    public void setStudents(ArrayList<University> universities) {
        for (int u = 0; u < universities.size(); u++) {
            setStudents(universities.get(u));
        }
    }

    /**
     * Method returns a list of students
     *
     * @return list of students
     */
    public String getStudents() {
        String ret = "";
        for (int i = 0; i < students.size(); i++) {
            ret = ret.concat(students.get(i).getStudentName()).concat("\n");
        }
        return ret;
    }
}