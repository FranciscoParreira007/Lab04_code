
import java.io.*;
import java.util.*;

/**
 * 
 */
public abstract class Person {

    /**
     * Default constructor
     */
    public Person() {
    }

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
    public int socialSecurityNum;

    /**
     * @param firstName 
     * @param lastName 
     * @param socialSecurityNum
     */
    public Person(String firstName, String lastName, int socialSecurityNum) {
        // TODO implement here
    }

    /**
     * @return
     */
    public String getFirstName() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public String getLastName() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public int getSocialSecurityNum() {
        // TODO implement here
        return 0;
    }

}