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
                case 2:
                    System.out.println(ContactsTaskProcessing.createNew(inputDetails(null)));
                    break;
                case 3:
                    edit= true;
                    break;
                case 5:
                    System.out.print("Enter first name of contact you're searching: ");
                    input.nextLine();
                    System.out.println(ContactsTaskProcessing.searchByFirstName(input.nextLine()));
                    break;


                case 6:
                    keep_running= false;
            }

        }
    }
    //Method to collect data- for edit and add
    static List<String>inputDetails(Contact c){
        //local temp contacts string data
        List<String> tempContacts = new ArrayList<>();
        input.nextLine();
        //collect user input and add to List
        System.out.print("ID: " + (edit ==true ? c.getId() + "\nChange: " : "")); //Using ternary if edit == true display whats before ":" if false display everything after ":"
        tempContacts.add(input.nextLine());
        System.out.print("Email: " + (edit ==true ? c.getEmail() + "\nChange: " : ""));
        tempContacts.add(input.nextLine());
        System.out.print("Phone Number: " + (edit ==true ? c.getPhoneNumber() + "\nChange: " : ""));
        tempContacts.add(input.nextLine());
        System.out.print("First Name: " + (edit ==true ? c.getPerson().getFirstName() + "\nChange: " : ""));
        tempContacts.add(input.nextLine());
        System.out.print("Last Name: " + (edit ==true ? c.getPerson().getLastName() + "\nChange: " : ""));
        tempContacts.add(input.nextLine());
        System.out.print("Door Number: " + (edit ==true ? c.getAddress().getDoorNumber() + "\nChange: " : ""));
        tempContacts.add(input.nextLine());
        System.out.print("Street name: " + (edit ==true ? c.getAddress().getStreetName() + "\nChange: " : ""));
        tempContacts.add(input.nextLine());
        System.out.print("Postcode: " + (edit ==true ? c.getAddress().getPostCode() + "\nChange: " : ""));
        tempContacts.add(input.nextLine());

        edit= false;
        return tempContacts;
    }
}
