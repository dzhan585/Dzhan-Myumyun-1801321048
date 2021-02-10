package uni.fmi;

import java.util.*;

/**
 * 
 */
public class Teacher {

    /**
     * Default constructor
     */
    public Teacher() {
    }

    /**
     * 
     */
    private String username;

    /**
     * 
     */
    private String password;

    /**
     * 
     */
    private String email;

    /**
     * 
     */
    public String firstName;

    /**
     * 
     */
    public String lastName;

    /**
     * 
     */
    public Subject subject;

    /**
     * 
     */
    public Journal journal;

	private Set grades;

    /**
     * @return
     */
    public String getUsername() {
      
        return username;
    }

    /**
     * @param username 
     * @return
     */
    public void setUsername(String username) {
       this.username = username;
    }

    /**
     * @return
     */
    public String getPassword() {
      
        return password;
    }

    /**
     * @param password 
     * @return
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return
     */
    public String getEmail() {
        
        return email;
    }

    /**
     * @param email 
     * @return
     */
    public void setEmail(String email) {
      this.email = email;
    }

    /**
     * @return
     */
    public String getFirstName() {
      
        return firstName;
    }

    /**
     * @param firstName 
     * @return
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return
     */
    public String getLastName() {
       
        return lastName;
    }

    /**
     * @param lastName 
     * @return
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return
     */
    public Set getGrades() {
     
        return grades;
    }

    /**
     * @param grades 
     * @return
     */
    public void setGrades(Set<Journal> grades) {
        this.grades = grades;
    }

    /**
     * @param grade 
     * @return
     */
    public void addGrade(Journal grade) {
        this.grades.add(grade);
    }

}