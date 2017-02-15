package AddressBookProgram;

import dayTwo.models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by student on 14/02/2017.
 */
public class ContactInterface {

    static Scanner input = new Scanner(System.in);
    static boolean edit = false;

    public static void display(){

        int choice;
        boolean keep_running = true;

        //Infinite loop will keep running until user chooses option 6
        while(keep_running)
        {
            do {
                System.out.println("Welcome to your Address book here are your options:");
                System.out.println("1. List all contacts");
                System.out.println("2. Add a new contact");
                System.out.println("3. Edit a contact");
                System.out.println("4. Remove a contact");
                System.out.println("5. Search a contact");
                System.out.println("6. Terminate");
                System.out.print("Please enter an option 1-6 : ");

                //Get user input
                choice= input.nextInt();

            }while(choice <1 || choice > 6);

            switch (choice){
                case 1:
                    //Method for displaying all contacts is in ContactsTaskProcessing
                    ContactsTaskProcessing.listAllContacts();
                    break;


                case 6:
                    keep_running= false;
            }

        }
    }
 /*   static List<String> inputDetails(Employee e){
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
        return tempEmployee;*/
}
