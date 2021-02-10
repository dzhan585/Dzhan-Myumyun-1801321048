package uni.fmi;


import java.util.*;

/**
 * 
 */
public class Journal {

    /**
     * Default constructor
     */
    public Journal() {
    }

    /**
     * 
     */
    public int grade;

    /**
     * 
     */
    public Set<Teacher> teachers;



    /**
     * 
     */
    public Set<Student> students;

    /**
     * 
     */
    public Set<Parent> parents;

    /**
     * 
     */
    public Set<Subject> subjects;

    /**
     * @return
     */
    public int getGrade() {
     
        return grade;
    }

    /**
     * @param grade 
     * @return
     */
    public void setGrade(int grade) {
      this.grade=grade;
    }

}