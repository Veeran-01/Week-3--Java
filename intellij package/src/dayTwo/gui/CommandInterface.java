package dayTwo.gui;

import dayTwo.models.Employee;
import dayTwo.processor.TaskProcessing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by student on 14/02/2017.
 */
public class CommandInterface {

    static Scanner input = new Scanner(System.in);
    static boolean edit = false;



    public static void display(){
        //temp int data to store users choice
        int choice;
        boolean keeping_running = true;

        //give six options
        while (keeping_running){
            do{
                //Choices
                System.out.println("Welcome to employees awesome program");
                System.out.println("1. List All Employees");
                System.out.println("2. Add New Employee");
                System.out.println("3. Edit an Employee");
                System.out.println("4. Remove an Employee");
                System.out.println("5. Search");
                System.out.println("6. Terminate");
                System.out.print("Please enter an option between 1-6: ");

                //Keep checking choice is one of the available options
                choice = input.nextInt();

            }while (choice < 1 || choice >6);

            switch(choice){

                case 1:
                    TaskProcessing.listAllEmployees();
                    break;
                case 2:
                    System.out.println(TaskProcessing.createNew(inputDetails(null)));
                    break;
                case 3:
                    edit = true;
                    break;
                case 5:
                    System.out.print("Enter the first name to search: ");
                    input.nextLine();
                    System.out.println(TaskProcessing.searchByFirstName(input.nextLine()));
                    break;



                case 6:
                    keeping_running = false;




            }
        }
    }

    //Method to collect data- for edit and add
    static List<String>inputDetails(Employee e){
        //local temp employee string data
        List<String> tempEmployee = new ArrayList<>();
        input.nextLine();
        //collect user input and add to List
        System.out.print("ID: " + (edit ==true ? e.getId() + "\nChange: " : "")); //Using ternary if edit == true display whats before ":" if false display everything after ":"
        tempEmployee.add(input.nextLine());
        System.out.print("First name: " + (edit ==true ? e.getFirstName() + "\nChange: " : ""));
        tempEmployee.add(input.nextLine());
        System.out.print("Last name: " + (edit ==true ? e.getLastName() + "\nChange: " : ""));
        tempEmployee.add(input.nextLine());
        System.out.print("DOB(YYYY/MM/DD): " + (edit ==true ? e.getDob() + "\nChange: " : ""));
        tempEmployee.add(input.nextLine());
        System.out.print("Hire date(YYYY/MM/DD): " + (edit ==true ? e.getHireDate() + "\nChange: " : ""));
        tempEmployee.add(input.nextLine());
        System.out.print("Job role: " + (edit ==true ? e.getJobRole() + "\nChange: " : ""));
        tempEmployee.add(input.nextLine());

        edit= false;
        return tempEmployee;
    }
}
