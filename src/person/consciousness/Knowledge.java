package person.consciousness;

/**
 * The class contains information about the level of knowledge (student)
 */
public class Knowledge {
    private int knowledgeLevel;

    /**
     * Class constructor
     * @param level level of knowledge
     */
    public Knowledge(int level) {
        knowledgeLevel=level;
    }

    /**
     * The method returns the level of knowledge
     * @return level of knowledge
     */
    public int getKnowledgeLevel (){
        return knowledgeLevel;
    }
}