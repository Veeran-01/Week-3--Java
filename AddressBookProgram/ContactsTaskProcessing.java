package AddressBookProgram;

import java.util.Scanner;

import static AddressBookProgram.GenerateContact.contacts;

/**
 * Created by student on 14/02/2017.
 */
public class ContactsTaskProcessing {

    static Scanner input = new Scanner(System.in);

    public static void listAllContacts(){
        for(Contact c : contacts)
        {
            System.out.println(c);
        }
    }

    public static void addNewContact(){

    }

}
