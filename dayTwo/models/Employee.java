package dayTwo.models;

import java.time.LocalDate;

/**
 * Created by student on 14/02/2017.
 */

//Every employee is a person
public class Employee extends Person{
    private LocalDate hireDate;
    private String jobRole;

    //getters and setters Alt+Insert
    public LocalDate getHireDate() {
        return hireDate;
    }
    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }
    public String getJobRole() {
        return jobRole;
    }
    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }


    public Employee(int id, String fn, String ln, LocalDate dob, LocalDate hireDate, String jobRole)
    {
        //Need to create constructor of Person on first line
        super(id, fn, ln, dob);
        this.hireDate = hireDate;
        this.jobRole = jobRole;
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString()+ //to call person as string as well
                "hireDate=" + hireDate +
                ", jobRole='" + jobRole + '\'' +
                '}';
    }
}
