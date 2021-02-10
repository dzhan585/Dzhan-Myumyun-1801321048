package uni.fmi;

import java.util.*;

/**
 * 
 */
public class Student {

    /**
     * Default constructor
     */
    public Student() {
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
    public int classNumber;



    /**
     * 
     */
    public Journal journal;



    /**
     * 
     */
    public Class clas;

    /**
     * 
     */
    public Set<Parent> parents;

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
    public int getClassNumber() {
       
        return classNumber;
    }

    /**
     * @param classNumber 
     * @return
     */
    public void setClassNumber(int classNumber) {
      this.classNumber = classNumber;
    }

}