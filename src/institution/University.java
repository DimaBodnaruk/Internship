package institution;

import person.Student;

import java.util.ArrayList;


/**
 * The class contains information about the university and a list of students who study at this university.
 */
public class University {
    private String universityName;
    private ArrayList<Student> studentList;

    /**
     * Class constructor
     *
     * @param name university name
     */
    public University(String name) {
        universityName = name;
        studentList = new ArrayList<Student>();
    }

    /**
     * Method returns student number
     *
     * @param name student's name
     * @return student pointer
     */
    private int find(String name) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getStudentName() == name) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Method updates student to university
     *
     * @param student student object
     */
    public void setStudent(Student student) {
        int index = find(student.getStudentName());
        if (index != -1) {
            studentList.set(index, student);
        }
    }

    /**
     * Method returns student class
     *
     * @param index student number
     * @return student object
     */
    public Student getStudent(int index) {
        return studentList.get(index);
    }

    /**
     * The method returns the number of students
     *
     * @return number of students
     */
    public int getStudentsCount() {
        return studentList.size();
    }

    /**
     * Method of adding student to university
     *
     * @param student student object
     */
    public void addStudent(Student student) {
        if (find(student.getStudentName()) == -1) {
            studentList.add(student);
        }
    }

    /**
     * Method return university name
     *
     * @return university name
     */
    public String getUniversityName() {
        return universityName;
    }

    /**
     * Method return avg knowledge level
     *
     * @return avg knowledge level
     */
    public int getAvgKnowledgeLevel() {
        int avg = 0;
        for (int i = 0; i < studentList.size(); i++) {
            avg += studentList.get(i).getStudentKnowledge().getKnowledgeLevel();
        }
        return avg / studentList.size();
    }
}