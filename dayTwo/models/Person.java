package dayTwo.models;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Created by student on 14/02/2017.
 */

//abstract means can't create Person object
public abstract class Person {
    //members: fields, properties, methods, constructors

    //fields
    //Private only available in class
    private int id;
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private int NOT_BORN = 0;

    //properties (getters and setters)
    //if other classes want these members need getter method
    public int getId() { return this.id;}
    public void setId(int id) {this.id = id;}

    //shortcut to get getter and setter Alt+insert
    public String getFirstName() {return firstName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public String getLastName() {return lastName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public LocalDate getDob() {return dob;}
    public void setDob(LocalDate dob) {this.dob = dob;}

    //constructor
    //default constructors are empty- i.e. no values set
    public Person(){}

    //overloaded constructor- constructor with same name but different signature
    public Person(int id, String fn, String ln, LocalDate dob){
        this.id= id;
        this.firstName=fn;
        this.lastName=ln;
        this.dob= dob;
    }

    //overloaded constructor- constructor with same name but different signature- only has dob
    public Person(LocalDate dob){
        this.dob= dob;
    }

    //methods
    public long getAge(){
        if(dob==null) {
            return NOT_BORN;
        }
        //Don't need else statement- because exits after return NOT_BORN
        //To calculate age:
        long years= ChronoUnit.YEARS.between(dob, LocalDate.now());
        return years;

    }

    @Override //Annotation- this method is defined in objects class
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob=" + dob +
                ", NOT_BORN=" + NOT_BORN +
                '}';
    }
}































