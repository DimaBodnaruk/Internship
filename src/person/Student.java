package person;

import person.consciousness.Knowledge;

/**
 * The class contains information about the student.
 */
public class Student {
    private String studentName;
    private Knowledge studentKnowledge;

    /**
     * Class constructor
     *
     * @param name student name
     */
    public Student(String name) {
        studentName = name;
    }

    /**
     * Class constructor
     *
     * @param name      student name
     * @param knowledge level of knowledge
     */
    public Student(String name, int knowledge) {
        studentName = name;
        studentKnowledge = new Knowledge(knowledge);
    }

    /**
     * Method set student knowledge
     *
     * @param knowledge knowledge level object
     */
    public void setKnowledge(Knowledge knowledge) {
        studentKnowledge = knowledge;
    }

    /**
     * Method returns student name
     *
     * @return student name
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * Method returns student knowledge
     *
     * @return knowledge level object
     */
    public Knowledge getStudentKnowledge() {
        try {
            studentKnowledge.getKnowledgeLevel();
            return studentKnowledge;
        } catch (NullPointerException e) {
            studentKnowledge = new Knowledge(0);
            return studentKnowledge;
        }
    }
}