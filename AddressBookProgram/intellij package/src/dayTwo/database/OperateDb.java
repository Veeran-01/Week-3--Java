package dayTwo.database;

import dayTwo.models.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;

/**
 * Created by student on 16/02/2017.
 */
public class OperateDb {        //All queries are here
    private Connection con;

    public OperateDb(Connection con){       //keeping this class independent of connection - i.e pass any connection
        this.con = con;
    }

    public void createEmployeeTable() throws SQLException{
        Statement statement = con.createStatement();

        //create table
        statement.executeUpdate(
                //sql query- everything in uppercase is NOT case sensitive
                "CREATE TABLE employee (" +
                        "id INTEGER NOT NULL AUTO_INCREMENT KEY,"+
                        "first_name VARCHAR(50) NOT NULL,"+
                        "last_name VARCHAR(100) NOT NULL, "+
                        "dob DATE NOT NULL,"+
                        "hire_date DATE NOT NULL,"+
                        "job_role VARCHAR(50) NOT NULL)"
        );
    }

    public List<Employee> queryAll() throws SQLException{
        return query("SELECT * FROM employee");     //table 'employee' created above
    }

    public List<Employee> queryByFirstName(String fn) throws SQLException{
        return query("SELECT * FROM employee WHERE first_name ='" + fn +"'");
    }

    public List<Employee> query(String query) throws SQLException{
        Statement statement = con.createStatement();        //query

        //Reference to the result objects returned from queries
        ResultSet rs;

        Employee temp; //represents each row retrieved from the result
        List<Employee> tempEmployees = new ArrayList<>();       //local temporary list of employees retrieved

        //****get the result from DB
        rs= statement.executeQuery(query);

        ///retrieve...from result set object
        while(rs.next()) {      //as long as there is a next line!
            temp = new Employee(
                    rs.getInt(1),       //'1' is column number in table i.e ID column
                    rs.getString(2),    //first name
                    rs.getString(3),    //last name
                    rs.getDate(4).toLocalDate(),    //dob
                    rs.getDate(5).toLocalDate(),    //hire date
                    rs.getString(6));               //job role

            //add to our temp collection
            tempEmployees.add(temp);
        }
            return  tempEmployees;
        }


        //to create new

    public void addEmployee(Employee temp) throws SQLException{
        PreparedStatement statement = con.prepareStatement(
            "INSERT INTO employee" +
                    "(first_name, last_name, dob, hire_date, job_role)"+
                    "VALUES(?,?, ?, ?, ?)");

        //don't need id because auto _increment
        statement.setString(1, temp.getFirstName());        //first question mark
        statement.setString(2, temp.getLastName());
        statement.setDate(3, Date.valueOf(temp.getDob()));
        statement.setDate(4, Date.valueOf(temp.getHireDate()));
        statement.setString(5, temp.getJobRole());

        //send to the db to create a new record
        statement.executeUpdate();
        statement.close();

    }

    }



