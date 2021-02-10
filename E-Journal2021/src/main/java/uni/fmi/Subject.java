package uni.fmi;

import java.util.*;

/**
 * 
 */
public class Subject {

    /**
     * Default constructor
     */
    public Subject() {
    }

    /**
     * 
     */
    public String name;

    /**
     * 
     */
    public Set<Teacher> teachers;

    /**
     * 
     */
    public Journal journal;

    /**
     * @return
     */
    public String getName() {
        
        return name;
    }

    /**
     * @param name 
     * @return
     */
    public void setName(String name) {
       this.name = name;
    }

}