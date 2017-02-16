package dayTwo.processor;

import dayTwo.database.ConnectDb;
import dayTwo.database.OperateDb;
import dayTwo.models.Employee;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import static dayTwo.models.GeneratedEmployees.employees;

/**
 * Created by student on 14/02/2017.
 */
public class TaskProcessing {
    private static OperateDb db;

    public static void setUpDb(){
        try {
            ConnectDb connectDb = new ConnectDb();  //connection object
            db = new OperateDb(connectDb.getCon());
            //db.createEmployeeTable();   //once created can check in command line by show tables to see if employees is there  (commented it out because dont need it once youve ran it once
            //object to manipulate database based on connection
        }catch(Exception e){
            System.out.println("Error connecting to database: " + e);
        }
    }


    //Method for listing all
    public static void listAllEmployees() throws SQLException{
        //clear collection
        employees.clear();
        employees = db.queryAll();
        for(Employee e : employees) {
            System.out.println(e);
        }

    }

    //Method to add New employee
    public static String createNew(List<String> data){
        try{
        //need to split date into three values
        String[] dob = data.get(3).split("/");
        String[] hd = data.get(4).split("/");

        Employee temp = new Employee(
                0, //ID- because auto increment
                data.get(1), //First Name
                data.get(2),
                LocalDate.of(Integer.parseInt(dob[0]), //year
                             Integer.parseInt(dob[1]), //month
                             Integer.parseInt(dob[2])), //day
                LocalDate.of(Integer.parseInt(hd[0]),
                             Integer.parseInt(hd[1]), //hire date
                             Integer.parseInt(hd[2])),
                data.get(5)
                );

            //add to database
        db.addEmployee(temp);
            return "Successfully created: " + temp.getFirstName();
    }catch (Exception e){
            return "Failure caused by: " + e;
        }
    }

    //method to search and display employee with index
    public static String searchByFirstName(String fn) throws SQLException{
        //clear collection
        employees.clear();
        employees = db.queryByFirstName(fn);
        String result = "";

        for(int i=0; i<employees.size(); i++)
                result += String.format("{%s} %s", i, employees.get(i).toString())  + "\n" ; //string.format is to use place holders (%s)

        if(result !="")
            return result;
        return "NOT FOUND!";}

        //Don't need this with database
        /*for(int i=0; i<employees.size(); i++) {
            //compare- to items in employee
            if (employees.get(i).getFirstName().equalsIgnoreCase(fn)) {
                result += String.format("{%s} %s", i, employees.get(i).toString())  + "\n" ; //string.format is to use place holders (%s)
            }
        }
        if(result !="") {
            return result;*/

    //method to remove Employee- will invoke after searching
    public static String removeEmployee(int index){
        try{
            employees.remove(index);
            return "Successfully removed";
        }catch (Exception e){
            return "Failure caused by: " + e;
        }
    }

    //Method to edit- using data collected in command interface
    public static String editEmployee(int index, List<String> data){
        try{
            String[] dob = data.get(3).split("/");
            String[] hd = data.get(4).split("/");

            if(!("".equals(data.get(0)))) //If the field is NOT empty then set to new if not leave
                employees.get(index).setId(Integer.parseInt(data.get(0))); //set ID number
            if(!("".equals(data.get(1)))) //First Name
                employees.get(index).setFirstName(data.get(1));
            if(!("".equals(data.get(2))))
                employees.get(index).setFirstName(data.get(2));
            if(!("".equals(data.get(3))))
                employees.get(index).setDob(
                        LocalDate.of(Integer.parseInt(dob[0]), //year
                                Integer.parseInt(dob[1]), //month
                                Integer.parseInt(dob[2])) //day
                );
            if(!("".equals(data.get(4))))
                employees.get(index).setHireDate(
                        LocalDate.of(Integer.parseInt(hd[0]),
                        Integer.parseInt(hd[1]), //hire date
                        Integer.parseInt(hd[2]))
                );
            if(!("".equals(data.get(5))))
                employees.get(index).setJobRole(data.get(5));
            return "SUCCESS!";
        }catch (Exception e){
            return "Failure caused by: " + e;
        }
    }



    }





