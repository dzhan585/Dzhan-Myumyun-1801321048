package uni.fmi;

import java.util.*;

/**
 * 
 */
public class Parent {

    /**
     * Default constructor
     */
    public Parent() {
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
    public Set<Student> students;

    /**
     * 
     */
    public Journal journal;

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

}